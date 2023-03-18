package persistance;

import entities.Phone;
import org.eclipse.persistence.exceptions.DatabaseException;

import java.util.List;

public class PhoneFacade {

    public static void saveNewPhone(Phone phone) throws DatabaseException {
        PhoneMapper.saveNewPhone(phone);
    }
}
