package Application;
// Generated Jun 19, 2017 11:42:59 AM by Hibernate Tools 4.3.1



/**
 * Carrera generated by hbm2java
 */
public class Carrera  implements java.io.Serializable {


     private Integer idCarrera;
     private String nombre;
     private String escuela;

    public Carrera() {
    }

    public Carrera(String nombre, String escuela) {
       this.nombre = nombre;
       this.escuela = escuela;
    }
   
    public Integer getIdCarrera() {
        return this.idCarrera;
    }
    
    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEscuela() {
        return this.escuela;
    }
    
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }




}


