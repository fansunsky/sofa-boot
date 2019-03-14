package com.dodolu.sofa.endpoint.facade;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/webapi/test")
@Consumes("application/json;charset=UTF-8")
@Produces("application/json;charset=UTF-8")
public interface TestFacade {

    @GET
    public String test();
}
