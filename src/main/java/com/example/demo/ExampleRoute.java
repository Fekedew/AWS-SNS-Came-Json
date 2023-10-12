package com.example.demo;

import com.example.demo.json.Response;
import com.iszo.example.demo.ObjectFactory;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;


@Component
public class ExampleRoute extends RouteBuilder {

    public static JaxbDataFormat jaxbFormat(Class<?> clazz) {
        try {
            return new JaxbDataFormat(JAXBContext.newInstance(clazz));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void configure() throws Exception {
//
//        from("direct:activeMq")
//                .log("we receive from the endpoint fekedew: ${body}")
//                .to("file:/Users/iszo/Desktop/ttttttt/To?fileName=data.json")
//                .log("the file is saved");

        from("direct:transfromToXml")
            .routeId("bookstore")
            .log("Body: ${body}")
            .unmarshal().json(JsonLibrary.Jackson, Response.class)
            .transform(method(JsonToXmlTransformation.class))
            .marshal(jaxbFormat(ObjectFactory.class))
            .log("Body: ${body}")
            .to("file:/Users/iszo/Desktop/ttttttt/To?fileName=book.xml");
    }
}
