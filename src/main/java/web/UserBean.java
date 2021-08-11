package web;

import entidad.Users;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.RowEditEvent;
import service.ServiceDao;

@Named("userBean")
@RequestScoped
public class UserBean {
    
    @Inject
    private ServiceDao serviceDao;
    private Users usersSelect;
    private Users users;
    
    List<Users> listadoUsuario;
    
    @PostConstruct
    public void init(){
        listadoUsuario = serviceDao.listarUsuario();
        usersSelect = new Users();
        users = new Users();
    }
    
    public void editListener(RowEditEvent event){
        Users users = (Users) event.getObject();
        serviceDao.actualizarUsuario(users);
    }
    
    public Users getUsersSelect() {
        return usersSelect;
    }

    public void setUsersSelect(Users usersSelect) {
        this.usersSelect = usersSelect;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public List<Users> getListadoUsuario() {
        return listadoUsuario;
    }

    public void setListadoUsuario(List<Users> listadoUsuario) {
        this.listadoUsuario = listadoUsuario;
    }
    public void addUser(){
        this.serviceDao.insertarUsuario(usersSelect);
        this.listadoUsuario.add(usersSelect);
        this.usersSelect = null;
    }
    public void removeUser(){
        this.serviceDao.eliminarUsuario(usersSelect);
        this.listadoUsuario.remove(this.usersSelect);
        this.usersSelect = null;
    }
    public void restartUserSelect(){
        this.usersSelect = new Users();
    }
    
}
