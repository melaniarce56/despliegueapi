/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiauniad3.melaniearce.controller;

import guiauniad3.melaniearce.model.Estudiante;
import guiauniad3.melaniearce.service.EstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@RestController
 @RequestMapping("/api/estudiante")
public class EstudianteController {
    @Autowired
    EstudianteService service;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Estudiante>> listar() {
       
        return new ResponseEntity<>(service.findByAll(), HttpStatus.OK);
    }
    
     @PostMapping("/crear")
    public ResponseEntity<Estudiante> crear(@RequestBody Estudiante c) {
        return new ResponseEntity<>(service.save(c), HttpStatus.CREATED);
    }
    
     @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Estudiante> eliminar(@PathVariable Long id) {
       service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
     @GetMapping("/buscar/{id}")
    public ResponseEntity< Estudiante >buscar(@PathVariable Long id) {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Estudiante> actualizar(@PathVariable Long id, @RequestBody Estudiante u) {
        Estudiante est = buscarestudiante(id);
        if (est == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        } else {
            try {
                est.setNombre(u.getNombre());
                est.setCorreo_electrónico(u.getCorreo_electrónico());
                est.setNúmero_de_estudiante(u.getNúmero_de_estudiante());
                est.setCursoLista(u.getCursoLista());
                est.setGpa(u.getGpa());
               
                
                return new ResponseEntity<>(service.save(u), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
           
        }

    }
    
    
    
      public Estudiante buscarestudiante(@PathVariable Long id) {
        return service.findById(id);
    }
}
