package com.gesprofruit.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/login")
public class Login {

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Hello : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
	
}
