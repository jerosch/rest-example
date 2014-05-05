package com.opitzconsulting.sandbox.ros.rest.impl;

import com.opitzconsulting.sandbox.ros.rest.RestService;
import com.opitzconsulting.sandbox.ros.rest.ValueObject;

import java.util.Arrays;
import java.util.Date;

public class RestServiceImpl implements RestService {

    @Override
    public ValueObject getObjectById(long id) {
        ValueObject object = new ValueObject(id);
        object.setFoo("Foo");
        object.setBar(4711);
        object.setList(Arrays.asList("a", "b", "c"));
        object.setWhen(new Date());
        return object;
    }

    @Override
    public void updateObject(ValueObject object) {
        System.out.printf("Updating Object %s", object);
    }

    @Override
    public void createObject(ValueObject object) {
        System.out.printf("Creating Object %s", object);
    }

    @Override
    public void removeObject(long id) {
        System.out.printf("Removing Object with id %s", id);
    }

}
