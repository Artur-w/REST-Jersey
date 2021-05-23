package com.rest.jersey;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;


import org.glassfish.jersey.client.ClientConfig;

public class ConverterClient {
	public static void main(String[] args) {
        String uri = "http://localhost:8080/RESTJersey/rest/kmtomiles/50";
        String urim = "http://localhost:8080/RESTJersey/rest/milestokm/50";
        
        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);
        WebTarget target = client.target(uri);
         
        String response = target.request()
                    .accept(MediaType.APPLICATION_JSON)
                    .get(String.class);
         
        System.out.println(response);
        
        
        WebTarget targetm = client.target(urim);
        
        String responsem = targetm.request()
                    .accept(MediaType.APPLICATION_JSON)
                    .get(String.class);
         
        System.out.println(responsem);
 
        
    }

}



//public static void main(String[] args) {
//    ClientConfig config = new ClientConfig();
//
//    Client client = ClientBuilder.newClient(config);
//
//    WebTarget target = client.target(getBaseURI());
//
//    String response = target.path("rest").
//                        path("kmtomiles").
//                        request().
//                        accept(MediaType.TEXT_PLAIN).
//                        get(Response.class)
//                        .toString();
//
//
//    String plainAnswer =
//            target.path("rest").path("kmtomiles").request().accept(MediaType.TEXT_PLAIN).get(String.class);
//    String xmlAnswer =
//            target.path("rest").path("kmtomiles").request().accept(MediaType.TEXT_XML).get(String.class);
//    String htmlAnswer=
//            target.path("rest").path("kmtomiles").request().accept(MediaType.TEXT_HTML).get(String.class);
//
//    System.out.println(response);
//    System.out.println(plainAnswer);
//    System.out.println(xmlAnswer);
//    System.out.println(htmlAnswer);
//}
//
//private static URI getBaseURI() {
//    return UriBuilder.fromUri("http://localhost:8080/com.rest.jersey").build();
//}