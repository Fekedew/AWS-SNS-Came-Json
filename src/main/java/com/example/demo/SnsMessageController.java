package com.example.demo;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SnsMessageController {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private CamelContext camelContext;


    @PostMapping("/sns-endpoint")
    @ResponseStatus(HttpStatus.OK)
    public void receiveSnsMessage(@RequestBody String body) throws JsonProcessingException {
        JsonNode snsData = objectMapper.readTree(body);

        // Extract the "Message" field
        String message = snsData.get("Message").asText();

        ProducerTemplate producerTemplate = camelContext.createProducerTemplate();
        producerTemplate.sendBody("direct:transfromToXml", message);
    }

}