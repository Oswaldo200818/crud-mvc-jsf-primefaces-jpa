package service;

import dato.UserDao;
import entidad.Users;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class ServiceDaoImpl implements ServiceDao{
   
    
    EntityManager em;
    @Inject
    UserDao userDao;
    @Override
    public List<Users> listarUsuario() {
        return userDao.listUserAll();
    }

    @Override
    public Users listarUsuarioPorId(Users users) {
        return userDao.listUserById(users);
    }

    @Override
    public void insertarUsuario(Users users) {
        userDao.insertUser(users);
    }

    @Override
    public void actualizarUsuario(Users users) {
        userDao.updateUser(users);
    }

    @Override
    public void eliminarUsuario(Users users) {
        userDao.deleteUser(users);
    }
}
