package com.dodolu.sofa.endpoint.impl;

import com.dodolu.sofa.endpoint.facade.TestFacade;

public class TestServiceImpl implements TestFacade {
    @Override
    public String test() {
        return "test";
    }
}
