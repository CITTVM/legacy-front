package Application;
// Generated Jun 19, 2017 11:42:59 AM by Hibernate Tools 4.3.1



/**
 * Track generated by hbm2java
 */
public class Track  implements java.io.Serializable {


     private Integer idTrack;
     private String nombre;
     private String descripcion;
     private int idLider;

    public Track() {
    }

    public Track(String nombre, String descripcion, int idLider) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.idLider = idLider;
    }
   
    public Integer getIdTrack() {
        return this.idTrack;
    }
    
    public void setIdTrack(Integer idTrack) {
        this.idTrack = idTrack;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getIdLider() {
        return this.idLider;
    }
    
    public void setIdLider(int idLider) {
        this.idLider = idLider;
    }




}


