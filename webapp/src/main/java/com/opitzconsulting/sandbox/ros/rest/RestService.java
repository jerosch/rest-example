package com.opitzconsulting.sandbox.ros.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/object")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public interface RestService {

    @GET
    @Path("/{id:[0-9]+}")
    ValueObject getObjectById(@PathParam("id") long id);

    @POST
    @Path("/")
    void updateObject(ValueObject object);

    @PUT
    @Path("/")
    void createObject(ValueObject object);

    @DELETE
    @Path("/{id:[0-9]+}")
    void removeObject(@PathParam("id") long id);

}
