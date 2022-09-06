/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package guiauniad3.melaniearce.repository;

import guiauniad3.melaniearce.model.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Usuario
 */
public interface estudianteRepository extends MongoRepository<Estudiante, Long> {
    
}
