package Application;
// Generated Jun 19, 2017 11:42:59 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Workshop generated by hbm2java
 */
public class Workshop  implements java.io.Serializable {


     private Integer idWorkshop;
     private String nombre;
     private String descripcion;
     private Date fecha;
     private int cupos;
     private boolean estado;
     private String nombreInstructor;

    public Workshop() {
    }

	
    public Workshop(String nombre, Date fecha, int cupos, boolean estado, String nombreInstructor) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.cupos = cupos;
        this.estado = estado;
        this.nombreInstructor = nombreInstructor;
    }
    public Workshop(String nombre, String descripcion, Date fecha, int cupos, boolean estado, String nombreInstructor) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.fecha = fecha;
       this.cupos = cupos;
       this.estado = estado;
       this.nombreInstructor = nombreInstructor;
    }
   
    public Integer getIdWorkshop() {
        return this.idWorkshop;
    }
    
    public void setIdWorkshop(Integer idWorkshop) {
        this.idWorkshop = idWorkshop;
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
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getCupos() {
        return this.cupos;
    }
    
    public void setCupos(int cupos) {
        this.cupos = cupos;
    }
    public boolean isEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public String getNombreInstructor() {
        return this.nombreInstructor;
    }
    
    public void setNombreInstructor(String nombreInstructor) {
        this.nombreInstructor = nombreInstructor;
    }




}


