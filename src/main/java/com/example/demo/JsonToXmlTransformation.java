package com.example.demo;

import com.example.demo.json.Response;
import com.iszo.example.demo.Library;
import com.iszo.example.demo.ObjectFactory;

public class JsonToXmlTransformation {
    ObjectFactory o = new ObjectFactory();

    public Library transform(Response response){
        Library library = o.createLibrary();

        Library.Book book = new Library.Book();
        book.setAuthor(response.getMessage());
        book.setTitle("BookTitle - test");
        library.getBook().add(book);

        return library;
    }
}
