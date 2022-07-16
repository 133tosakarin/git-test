package com.dengchao.service.impl;

import com.dengchao.service.BookService;
import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void check() {
        System.out.println("hello BookService");
    }

    public static void main(String[] args) {
        System.out.println("hello git");
    }
}
