package dato;

import entidad.Users;
import java.util.List;

public interface UserDao {
    
    public List<Users> listUserAll();
    
    public Users listUserById(Users users);
    
    public void insertUser(Users users);
    
    public void updateUser(Users users);
    
    public void deleteUser(Users users);
    
}
