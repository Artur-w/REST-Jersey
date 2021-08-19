package com.rest.jersey;

// import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
// import javax.ws.rs.core.Response;
// import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

// Requesting JSON resource
public class SimpleClient {
	public static void main(String[] args) {
        String uri = "http://localhost:8080/RESTJersey/rest/helloworld/";
        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);
        WebTarget target = client.target(uri);

        String response = target.request()
                    .accept(MediaType.APPLICATION_JSON)
                    .get(String.class);

        System.out.println(response);

    }

}