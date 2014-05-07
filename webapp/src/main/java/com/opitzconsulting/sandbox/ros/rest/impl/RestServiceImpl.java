package com.opitzconsulting.sandbox.ros.rest.impl;

import com.opitzconsulting.sandbox.ros.rest.RestService;
import com.opitzconsulting.sandbox.ros.rest.ValueObject;

import java.util.Arrays;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/object")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public class RestServiceImpl implements RestService {

    @GET
    @Path("/{id:[0-9]+}")
    @Override
    public ValueObject getObjectById(@PathParam("id") long id) {
        ValueObject object = new ValueObject(id);
        object.setFoo("Foo");
        object.setBar(4711);
        object.setList(Arrays.asList("a", "b", "c"));
        object.setWhen(new Date());
        return object;
    }

    @PUT
    @Path("/")
    @Override
    public ValueObject updateObject(ValueObject object) {
        System.out.printf("Updating Object %s", object);
        return object;
    }

    @POST
    @Path("/")
    @Override
    public ValueObject createObject(ValueObject object) {
        System.out.printf("Creating Object %s", object);
        return object;
    }

    @DELETE
    @Path("/{id:[0-9]+}")
    @Override
    public void removeObject(@PathParam("id") long id) {
        System.out.printf("Removing Object with id %s", id);
    }

}
