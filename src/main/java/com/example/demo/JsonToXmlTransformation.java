package com.example.demo;

import com.example.demo.purchase.PurcahseResponse;
import com.iszo.example.demo.Envelope;
import com.iszo.example.demo.ObjectFactory;

public class JsonToXmlTransformation {
    ObjectFactory o = new ObjectFactory();

    public Envelope transform(PurcahseResponse response){
        Envelope envelope = o.createEnvelope();

        envelope.setMsgID("PO");
        envelope.setTosys(response.getData().getPurchaseOrder().getHeader().getReceivingLocation());
        Envelope.Record.Field field = o.createEnvelopeRecordField();
        field.setFormat("an18");
        field.setName("PO");
        field.setValue(response.getData().getPurchaseOrder().getHeader().getOrderNumber().substring(0, 10));

        Envelope.Record record = o.createEnvelopeRecord();
        record.setId((short) 210);
        record.getField().add(field);

        envelope.getRecord().add(record);

        return envelope;
    }
}
