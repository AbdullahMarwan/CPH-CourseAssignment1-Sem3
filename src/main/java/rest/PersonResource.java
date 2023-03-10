    package rest;

import dtos.PersonDTO;
import persistance.PersonFacadeOld;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

    //Todo Remove or change relevant parts before ACTUAL use
@Path("/person")
public class PersonResource {
    private final PersonFacadeOld personsFacade;

    public PersonResource() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        personsFacade = new PersonsFacade(emf);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<PersonDTO> getAllPersons() {
        return personsFacade.getAllPersons();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public PersonDTO getPersonById(@PathParam("id") int id) {
        return personsFacade.getById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public PersonDTO createPerson(PersonDTO person) {
        return personsFacade.create(person);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public PersonDTO updatePerson(@PathParam("id") int id, PersonDTO person) {
        return personsFacade.updatePerson(id, person);
    }
}
