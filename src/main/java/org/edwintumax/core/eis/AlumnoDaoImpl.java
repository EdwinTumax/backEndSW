package org.edwintumax.core.eis;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.edwintumax.core.bean.Alumno;
@Stateless
public class AlumnoDaoImpl implements AlumnoDao {
    @PersistenceContext(unitName="AlumnoPU")
    private EntityManager em;    
    @Override
    public List<Alumno> findAllAlumno() {
        return em.createNamedQuery("Alumno.findAll").getResultList();
    }
    @Override
    public List<Alumno> findAlumnoByCarne(String carne) {
        return em.createNamedQuery("Alumno.findByCarne").setParameter("carne",carne).getResultList();
    }
    
    @Override
    public Alumno findAlumnoById(Long codigoAlumno) {
        return em.find(Alumno.class,codigoAlumno);
    }

    @Override
    public void saveAlumno(Alumno alumno) {
        em.persist(alumno);
    }

    @Override
    public void updateAlumno(Alumno alumno) {
        em.merge(alumno);
    }

    @Override
    public void deleteAlumno(Alumno alumno) {
        alumno = em.getReference(Alumno.class,alumno.getCodigoAlumno());
        em.remove(alumno);
    }
    
}
