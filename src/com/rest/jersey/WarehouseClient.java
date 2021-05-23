package com.rest.jersey;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;


import org.glassfish.jersey.client.ClientConfig;

public class WarehouseClient {
	public static void main(String[] args) {
        String uri = "http://localhost:8080/RESTJersey/rest/orders/list";
        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);
        WebTarget target = client.target(uri); 
        String response = target.request(MediaType.TEXT_HTML).get(String.class);
         
        System.out.println(response);
 
    }

}




