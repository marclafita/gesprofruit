package com.gesprofruit.api;

import java.io.IOException;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Session;

import com.gesprofruit.api.data.Usuari;
import com.gesprofruit.api.util.HibernateUtil;

@Path("/login")
public class Login {
	
	
	
	@POST
	@Path("/afegirusuari")
	public Response addUsuari(@FormParam("nom_usuari") String nom_usuari,
			@FormParam("correu_electronic") String correu_electronic,
			@FormParam("contrasenya") String contrasenya){
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Usuari usuari_login = new Usuari();
		
		usuari_login.setNom_usuari(nom_usuari);
		usuari_login.setCorreu_electronic(correu_electronic);
		usuari_login.setContrasenya(contrasenya);
		usuari_login.setUltima_conexio(new Date());
		
		session.save(usuari_login);
		session.getTransaction().commit();
		
		String output = "Usuari afegit correctament";
		
		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/usuari")
	public Response getUsuari() throws JsonGenerationException, JsonMappingException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		Usuari usuari_login = new Usuari();
		
		usuari_login.setId_usuari(1);
		usuari_login.setNom_usuari("Marc");
		usuari_login.setCorreu_electronic("marclafita@gmail.com");
		
		String output = mapper.writeValueAsString(usuari_login);
		
		return Response.status(200).entity(output).build();
	}
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Hello User: " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
	
}
