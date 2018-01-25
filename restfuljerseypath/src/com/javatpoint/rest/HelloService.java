package com.javatpoint.rest;
import javax.ws.rs.HEAD;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
@Path("/hello")
public class HelloService{
 	
	@HEAD
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 		String output = "Jersey GET say : " + msg;
 		return Response.status(200).entity(output).build();
 	}
// 	@HEAD
//	@Path("/{param}")
// 	@Produces(MediaType.TEXT_PLAIN)
//	public Response getMsg1(@PathParam("param") String msg) {
// 		String output = "Jersey say : " + msg;
// 		return Response.status(201).entity(output).build();
// 	}
}