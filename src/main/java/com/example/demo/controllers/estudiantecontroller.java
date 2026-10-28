package com.example.demo.controllers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.modelos.estudiante;

@Controller
public class estudiantecontroller {
    private static Map<String,estudiante> estudiantes = new HashMap<>();
    static {
        estudiante estudiante1 = new estudiante("pepe","ramirez", 30, "sis9875376" ,"sistemas");
        estudiante estudiante2 = new estudiante("perales","ramiro", 35, "med75464756" ,"medicina");
        estudiante estudiante3 = new estudiante("pablo","ronald", 39, "io8379535" ,"gastronomia");
        estudiantes.put(estudiante1.getCodigo(),estudiante1);
        estudiantes.put(estudiante2.getCodigo(),estudiante2);
        estudiantes.put(estudiante3.getCodigo(),estudiante3);
    }
    @GetMapping ("/estudiantes")
    public ResponseEntity<Object> getEstudiantes(){
        return new ResponseEntity<>(estudiantes.values(),HttpStatus.OK);
    }
    @PostMapping ("/estudiantes")
    public ResponseEntity<Object> registrarestudiantes(@RequestBody estudiante est){
        estudiantes.put(est.getCodigo(),est);
        return new ResponseEntity<>("el estudiatense creobien" +est.getCodigo(),HttpStatus.OK);
    }

}
