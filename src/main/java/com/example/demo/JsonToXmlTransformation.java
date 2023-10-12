package com.example.demo;

import com.iszo.example.demo.Library;
import com.iszo.example.demo.ObjectFactory;

public class JsonToXmlTransformation {
    ObjectFactory o = new ObjectFactory();

    public Library transform(Library library){
        library.getBook().get(0).setAuthor("New author name");
        return library;
    }
}
