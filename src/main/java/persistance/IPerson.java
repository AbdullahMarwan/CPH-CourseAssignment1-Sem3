package facades;

import dtos.PersonDTO;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public interface IPerson {
    PersonDTO create(PersonDTO p);

    PersonDTO getById(int id) throws EntityNotFoundException, InstantiationException, IllegalAccessException;

    List<PersonDTO> getAll();

    PersonDTO update(PersonDTO p) throws EntityNotFoundException;

    PersonDTO delete(int id) throws EntityNotFoundException, InstantiationException, IllegalAccessException;
}
