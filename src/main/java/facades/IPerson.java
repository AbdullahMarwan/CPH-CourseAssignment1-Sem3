package facades;

import dtos.PersonDTO;

import java.util.List;

public interface IPerson {
    PersonDTO create(PersonDTO p);

    PersonDTO getById(int id);

    List<PersonDTO> getAll();

    PersonDTO update(PersonDTO p);

    PersonDTO delete(int id);
}
