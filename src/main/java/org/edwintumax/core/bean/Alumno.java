package org.edwintumax.core.bean;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name="alumno")
@NamedQueries(
   {
    @NamedQuery(name="Alumno.findAll",query="select a from Alumno a"),
    @NamedQuery(name="Alumno.findByCarne",query="select a from Alumno a where a.carne = :carne")
   }
)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Alumno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo_alumno")
    private Long codigoAlumno;
    @Column(name="apellidos")
    private String apellidos;
    @Column(name="nombres")
    private String nombres;
    @Column(name="fecha_nacimiento")
    private Date fechaNacimiento;
    @Column(name="carne")
    private String carne;

    public Alumno() {
    }

    public Alumno(Long codigoAlumno, String apellidos, String nombres, Date fechaNacimiento, String carne) {
        this.codigoAlumno = codigoAlumno;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.carne = carne;
    }

    public Long getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(Long codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }
    
}
