package com.rest.jersey;

import java.util.Map;
import java.util.TreeMap;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONObject;


@Path("/orders")
public class WarehouseService {
	
	public static Map<String, String> orders = new TreeMap<String, String>();
	
	JSONObject oders_json = new JSONObject(orders);
	
	@Path("/{order}")
	@PUT
	@Produces("text/html")
	public String create(@PathParam("order") String order, @QueryParam("product") String product) {
		orders.put(order,product);
		return "Order Created #" + order;
	}
	@Path("/{order}")
	   @GET
	   @Produces("text/html")
	   public String find(@PathParam("order") String order) {
			if (orders.containsKey(order))
				return "<h2>Order #" + order + "</h2><p>Product: " + orders.get(order);

	      throw new WebApplicationException(Response.Status.NOT_FOUND);
	   }

	   @Path("/list")
	   @GET
	   @Produces("text/html")
	   public String list() {
		   // Response with list of orders.
		   String header = "<h2>All Orders</h2>\n";
		   header += "<ul>";
		   for (Map.Entry<String, String> order : orders.entrySet())
			   header += "\n<li>#" + order.getKey() + " for " + order.getValue() + "</li>";

		   header += "\n</ul>";

		   return header;
	   }

}
