package org.edwintumax.core.eis;
import java.util.List;
import org.edwintumax.core.bean.Alumno;
public interface AlumnoDao {
    public List<Alumno> findAllAlumno();
    public Alumno findAlumnoById(Long codigoAlumno);
    public List<Alumno> findAlumnoByCarne(String carne);
    public void saveAlumno(Alumno alumno);
    public void updateAlumno(Alumno alumno);
    public void deleteAlumno(Alumno alumno);
}
