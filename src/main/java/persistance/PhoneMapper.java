package persistance;

import entities.Phone;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PhoneMapper {



    static void saveNewPhone(Phone phone) {
        Logger.getLogger("web").log(Level.INFO, "");

        PersistenceManager persistenceManager = new PersistenceManager("pu");

        persistenceManager.entityTransaction().begin();

        persistenceManager.getEntityManager().persist((phone));
        persistenceManager.entityTransaction().commit();
    }
}
