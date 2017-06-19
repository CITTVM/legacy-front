package Application;
// Generated Jun 19, 2017 11:42:59 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Boletin generated by hbm2java
 */
public class Boletin  implements java.io.Serializable {


     private Integer idBoletin;
     private String titulo;
     private String descripcion;
     private Date fecha;
     private boolean estado;

    public Boletin() {
    }

    public Boletin(String titulo, String descripcion, Date fecha, boolean estado) {
       this.titulo = titulo;
       this.descripcion = descripcion;
       this.fecha = fecha;
       this.estado = estado;
    }
   
    public Integer getIdBoletin() {
        return this.idBoletin;
    }
    
    public void setIdBoletin(Integer idBoletin) {
        this.idBoletin = idBoletin;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
    public boolean isEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }




}

