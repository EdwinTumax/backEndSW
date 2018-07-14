package org.edwintumax.core.service;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.jws.WebService;
import org.edwintumax.core.bean.Alumno;
import org.edwintumax.core.eis.AlumnoDao;
@Stateless
@WebService(endpointInterface="org.edwintumax.core.service.AlumnoServiceWS")
public class AlumnoServiceWSImpl implements AlumnoServiceWS {
    @Resource
    private SessionContext contexto;
    @EJB
    private AlumnoDao alumnoDao;
    @Override
    public List<Alumno> listarAlumnos() {
        return alumnoDao.findAllAlumno();
    }
    @Override
    public Alumno encontrarAlumnoPorId(Long codigoAlumno) {
        return alumnoDao.findAlumnoById(codigoAlumno);
    }
    @Override
    public List<Alumno> encontrarAlumnoPorCarne(String carne) {
        return alumnoDao.findAlumnoByCarne(carne);
    }
    @Override
    public void registrarAlumno(Alumno alumno) {
        alumnoDao.saveAlumno(alumno);
    }
    @Override
    public void eliminarAlumno(Alumno alumno) {
        alumnoDao.deleteAlumno(alumno);
    }
    @Override
    public void modificarAlumno(Alumno alumno) {
        alumnoDao.updateAlumno(alumno);
    }
}