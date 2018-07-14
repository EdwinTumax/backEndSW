package org.edwintumax.core.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import org.edwintumax.core.bean.Alumno;
@WebService
public interface AlumnoServiceWS {
    @WebMethod    
    public List<Alumno> listarAlumnos();
    @WebMethod
    public Alumno encontrarAlumnoPorId(Long codigoAlumno);
    @WebMethod
    public List<Alumno> encontrarAlumnoPorCarne(String carne);
    @WebMethod
    public void registrarAlumno(Alumno alumno);
    @WebMethod
    public void eliminarAlumno(Alumno alumno);
    @WebMethod
    public void modificarAlumno(Alumno alumno);
}
