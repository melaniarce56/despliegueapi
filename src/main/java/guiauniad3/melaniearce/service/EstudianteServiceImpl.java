/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiauniad3.melaniearce.service;

import guiauniad3.melaniearce.model.Estudiante;
import guiauniad3.melaniearce.repository.estudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class EstudianteServiceImpl extends GenericServiceImpl<Estudiante, Long> implements EstudianteService{
    @Autowired
    estudianteRepository estudianterepository;

    @Override
    public CrudRepository<Estudiante, Long> getDao() {
        return estudianterepository;
    }
}
