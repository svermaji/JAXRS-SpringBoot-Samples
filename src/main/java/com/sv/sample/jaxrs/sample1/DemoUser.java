package com.sv.sample.jaxrs.sample1;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by shaiverm on 22-Oct-2017
 */
@Path("/demo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface DemoUser {

    @GET
    @Path("/user")
    @Produces(MediaType.APPLICATION_JSON)
    User getUser();
}
