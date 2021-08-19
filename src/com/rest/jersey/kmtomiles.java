package com.rest.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/kmtomiles")
public class kmtomiles {
	// Accepts argument and return JSON Response.

	@Path("{km}")
	@GET
	@Produces("application/json")
	public String convertKMtoM(@PathParam("km") Double km) {

		Double mile = 1.60934;
		Double kilometers = km;
		Double miles = km / mile;
		return "{\"kilometers\":" + kilometers +","+"\"miles\":" + miles + "}";

		}
	}

