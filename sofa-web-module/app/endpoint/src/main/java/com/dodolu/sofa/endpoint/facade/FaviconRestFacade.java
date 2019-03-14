package com.dodolu.sofa.endpoint.facade;

import com.dodolu.sofa.endpoint.exception.CommonException;
import com.dodolu.sofa.endpoint.constants.RestConstants;

import javax.ws.rs.*;

/**
 * rest interface
 * <p>
 * to fix the favicon not found bug
 * <p/>
 * Created by luoguimu on 17/08/11.
 */
@Path("/favicon.ico")
@Consumes(RestConstants.DEFAULT_CONTENT_TYPE)
@Produces(RestConstants.DEFAULT_CONTENT_TYPE)
public interface FaviconRestFacade {

    @GET
    public String faviconIco() throws CommonException;
}
