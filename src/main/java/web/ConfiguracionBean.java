package web;

import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;

//este import hacerlo manualmente
import static javax.faces.annotation.FacesConfig.Version.JSF_2_3;
//solo en glassfish 5.0 versiones posteriores no se va a necesitar
@FacesConfig(
        version =JSF_2_3
)
@RequestScoped
public class ConfiguracionBean {
    
}
