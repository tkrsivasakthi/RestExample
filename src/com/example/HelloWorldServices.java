package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/customer")
public class HelloWorldServices {
// first commit
	@GET
	@Produces("text/html")
	public Response getLocalCustomer()
	{
		String output=" hello, This is local. get customer";
		return Response.status(200).entity(output).build();
		
	}
	
	@GET
	@Path("/list")
	@Produces("text/html")
	public Response getCustomerList()
	{
		String str= "Hello, customer details from list";
		return Response.status(200).entity(str).build();
		
	}
	
	@GET
	@Path("/add/{a}/{b}")
	@Produces("text/html")
	public String addText(@PathParam("a") double a,@PathParam("b") double b)
	{
		return (a+b) + "";
		
	}
	
}
