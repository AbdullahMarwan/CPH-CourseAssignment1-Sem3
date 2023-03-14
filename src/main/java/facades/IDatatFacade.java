package facades;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public interface IDatatFacade<T> {
    T create(T t);

    T getById(T t);

    List<T> getAll();

    T update(T t) throws EntityNotFoundException;

    T delete(int id) throws EntityNotFoundException;
}
