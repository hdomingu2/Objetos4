/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author hdomingu2
 */
public class Password {
    
    private int longitud;
    private String contrasena;
    
    public Password(int longitud,String contrasena ){
        this.longitud=longitud;
        this.contrasena=contrasena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasenia) {
        this.contrasena = contrasenia;
    }
    public Password cambiar(){
        int l;
        String clave;
        Password nueva;
        
         l = this.getLongitud();
        clave = this.getContrasena();
        
        nueva = new Password(l,clave);
        return nueva;
    }
   
    public Password ver(){
        Password aux;
       String clave;
       int longi;
       clave=this.getContrasena();
       longi=this.getLongitud();
       aux=new Password(longi,clave);
       return aux;
    }
    
     public String fuerte(){
       String aux;
        
        if (this.getLongitud()>=6) {
         aux="La Contraseña Es Muy Fuerte";
        }else{
            aux="La Contraseña Es Muy Debil";
        }
        
        return aux;
    }
}
