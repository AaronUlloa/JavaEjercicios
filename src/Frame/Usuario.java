package Frame;

import java.util.Vector;

/**
 *
 * @author Pastor Erwin
 */
public class Usuario {
    private String name;
    private String password;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private String fecha;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public static int verificarUsuarioNuevo(String usuario){
        Vector lista = mostrar();
        Usuario obj;
        for (int i = 0 ; i < lista.size() ; i++) {
            obj = (Usuario)lista.elementAt(i);
            if (obj.getName().equalsIgnoreCase(usuario)){
                return i;
            }
        }
        return -1;
    }
    
    public static int verificarLogin(String usuario, String password){
        Vector lista = mostrar();
        Usuario obj;
        
        for (int i = 0 ; i < lista.size() ; i++){
            obj = (Usuario)lista.elementAt(i);
            if (obj.getName().equalsIgnoreCase(usuario) && obj.getPassword().equalsIgnoreCase(password)){
                return i;
            }
        }
        return -1;
    }
    
    public static Vector mostrar (){
        return ListaUsuario.mostrar();
    }
    
}
