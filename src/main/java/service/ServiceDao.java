package service;

import entidad.Users;
import java.util.List;
import javax.ejb.Local;

@Local
public interface ServiceDao {
   
    public List<Users> listarUsuario();
    
    public Users listarUsuarioPorId(Users users);
    
    public void insertarUsuario(Users users);
    
    public void actualizarUsuario(Users users);
    
    public void eliminarUsuario(Users users);
    
    
    
}
