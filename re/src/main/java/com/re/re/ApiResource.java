package com.re.re;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//import javax.xml.bind.annotation.*;

@Path("API")
public class ApiResource {
    @GET
    @Path("a")
    @Produces(MediaType.TEXT_PLAIN)
 public String getApi() {
	 return "Json";
 }
    @GET
    @Path("a1")
    @Produces(MediaType.TEXT_PLAIN)
 public String getApi1() {
	 return "Json1";
 }
}
