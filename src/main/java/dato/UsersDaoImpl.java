package dato;

import entidad.Users;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/*Notación para utilizar EJB*/
@Stateless
public class UsersDaoImpl implements UserDao {

    @PersistenceContext(unitName = "userPU")
    EntityManager em;

    @Override
    public List<Users> listUserAll() {
        return em.createNamedQuery("Users.findAll").getResultList();
    }

    @Override
    public Users listUserById(Users users) {
        return em.find(Users.class, users.getIdUsers());
    }

    @Override
    public void insertUser(Users users) {
        em.persist(users);
    }

    @Override
    public void updateUser(Users users) {
        em.merge(users);
    }

    @Override
    public void deleteUser(Users users) {
        em.remove(em.merge(users));
    }

}
