package com.example.demo;

import com.iszo.example.demo.ObjectFactory;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;


@Component
public class Main extends RouteBuilder {

    public static JaxbDataFormat jaxbFormat(Class<?> clazz) {
        try {
            return new JaxbDataFormat(JAXBContext.newInstance(clazz));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void configure() throws Exception {
        from("file:/Users/iszo/Desktop/ttttttt/From")
            .routeId("bookstore")
            .unmarshal(jaxbFormat(ObjectFactory.class))
            .transform(method(JsonToXmlTransformation.class))
            .marshal(jaxbFormat(ObjectFactory.class))
            .to("file:/Users/iszo/Desktop/ttttttt/To?fileName=book.xml");
    }
}
