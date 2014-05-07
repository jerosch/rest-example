package com.opitzconsulting.sandbox.ros.rest.client;

import java.net.URI;

import com.opitzconsulting.sandbox.ros.rest.RestService;
import com.opitzconsulting.sandbox.ros.rest.ValueObject;
import org.jboss.resteasy.client.ClientRequestFactory;
import org.junit.Test;

public class RestClientIT {

    @Test
    public void callRest() throws Exception {
        ClientRequestFactory crf = new ClientRequestFactory(
                new URI("http://localhost:8080/rest-example-webapp-1.0-SNAPSHOT/rest"));
        RestService service = crf.createProxy(RestService.class);
        ValueObject object = service.getObjectById(1);
        System.out.println(object);
    }

}

