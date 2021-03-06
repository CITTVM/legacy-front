package Application;
// Generated Jun 19, 2017 11:42:59 AM by Hibernate Tools 4.3.1



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idUsuario;
     private String rut;
     private String nombre;
     private String apellidoPaterno;
     private String apellidoMaterno;
     private int idCuenta;
     private int idCarrera;
     private int idTrack;

    public Usuario() {
    }

    public Usuario(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, int idCuenta, int idCarrera, int idTrack) {
       this.rut = rut;
       this.nombre = nombre;
       this.apellidoPaterno = apellidoPaterno;
       this.apellidoMaterno = apellidoMaterno;
       this.idCuenta = idCuenta;
       this.idCarrera = idCarrera;
       this.idTrack = idTrack;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getRut() {
        return this.rut;
    }
    
    public void setRut(String rut) {
        this.rut = rut;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }
    
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }
    
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public int getIdCuenta() {
        return this.idCuenta;
    }
    
    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }
    public int getIdCarrera() {
        return this.idCarrera;
    }
    
    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }
    public int getIdTrack() {
        return this.idTrack;
    }
    
    public void setIdTrack(int idTrack) {
        this.idTrack = idTrack;
    }




}


