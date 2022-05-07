package org.jboss.resteasy.example.sub;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("q")
public class CC8 {

   @Path("found")
   @GET
   public String found() {
      return "found";
   }
}
