package com.dodolu.sofacore.service;


import com.dodolu.sofacore.facade.SampleService;

public class SampleServiceImpl implements SampleService {

    @Override
    public String message() {
        System.out.println("------");
        return "Hello, Service slitecore";
    }
}
