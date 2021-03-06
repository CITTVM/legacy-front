package cl.model.pojos;
// Generated 19-06-2017 18:14:24 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * InscripcionesWorkshop generated by hbm2java
 */
public class InscripcionesWorkshop  implements java.io.Serializable {


     private Integer idInscripcion;
     private Date fecha;
     private boolean estado;
     private String rutAsistente;
     private String nombreAsistente;
     private String apellidosAsistente;
     private int idWorkshop;

    public InscripcionesWorkshop() {
    }

    public InscripcionesWorkshop(Date fecha, boolean estado, String rutAsistente, String nombreAsistente, String apellidosAsistente, int idWorkshop) {
       this.fecha = fecha;
       this.estado = estado;
       this.rutAsistente = rutAsistente;
       this.nombreAsistente = nombreAsistente;
       this.apellidosAsistente = apellidosAsistente;
       this.idWorkshop = idWorkshop;
    }
   
    public Integer getIdInscripcion() {
        return this.idInscripcion;
    }
    
    public void setIdInscripcion(Integer idInscripcion) {
        this.idInscripcion = idInscripcion;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public boolean isEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public String getRutAsistente() {
        return this.rutAsistente;
    }
    
    public void setRutAsistente(String rutAsistente) {
        this.rutAsistente = rutAsistente;
    }
    public String getNombreAsistente() {
        return this.nombreAsistente;
    }
    
    public void setNombreAsistente(String nombreAsistente) {
        this.nombreAsistente = nombreAsistente;
    }
    public String getApellidosAsistente() {
        return this.apellidosAsistente;
    }
    
    public void setApellidosAsistente(String apellidosAsistente) {
        this.apellidosAsistente = apellidosAsistente;
    }
    public int getIdWorkshop() {
        return this.idWorkshop;
    }
    
    public void setIdWorkshop(int idWorkshop) {
        this.idWorkshop = idWorkshop;
    }




}


