package com.rest.jersey;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/milestokm")
public class milestokm {
	
	public Double kilometer;
	@Path("{m}")
	@GET
	@Produces("application/json")
	public String convertKMtoM(@PathParam("m") Double m) {
 
		Double kilometer = 1.60934;
		Double miles = m * kilometer;
		return "{\"miles\":" + m + ","+"\"kilometers\":" + miles + "}";
		}
	
	@Path("{m}")
	
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public Double putIntoFunc(@PathParam("m") Double m, @PathParam("n") Double n) {
		kilometer = m;
		return kilometer;
	}
		
		
}

