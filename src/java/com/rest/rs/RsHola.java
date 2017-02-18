package com.rest.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("hola")
public class RsHola {

    //Por parametro
    @GET
    @Path("saludar/{nombre}")
    @Produces(MediaType.TEXT_PLAIN)
    public String saludar(@PathParam("nombre") String nombre) {
        return "Hola " + nombre;
    }

    //Por query
    @GET
    @Path("saludarPorQuery")
    @Produces(MediaType.TEXT_PLAIN)
    public String saludarPorQuery(@QueryParam("nombre") String nombre) {
        return "Hola " + nombre;
    }
}
