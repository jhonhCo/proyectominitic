package com.co.udea.mintic.proyecto.proyecto.controller;

import com.co.udea.mintic.proyecto.proyecto.domain.Persona;
import com.co.udea.mintic.proyecto.proyecto.services.ServiceProgramaAcademico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 6. creamos una clase llamada ControllerProgramaAcademico donde se envia los datos al navegador
// 7.  creamos una metodo callServicePrograma para llamar al servicio por medio de una instanciacion
// 8. el metodo  callServicePrograma va a utilizar a ServiceProgramaAcademico y a su ves ServiceProgramaAcademico
// utiliza datos de persona que se encuentra en domain
// 9. llamo a services pero como necesito datos de persona tengo que instanciarlo
// 10. cargamos los datos de persona atraves de los set nombre, apellido
// 11. para poder mostrar o pintar datos en un navegador se debe marcar con la siguiente notacion @GetMapping
// el cual recibe parametros el path =" ruta por la cual se va a ingresar" y produces = "tipo de salida" puede se html txt e 90% son json
// 12. revisamos el programa con el martillo en la parte superior derecha y luego nos vamo a  proyectoAplicaion y de damos run
// 13. copiamos esta direccion y ya nos debe mostrar la salida que se cargo en services  http://localhost:8080/Users/harcr/Documents/proyectoIj/proyecto

@RestController// Nos da la posibilidad de lanzarlo a un navegador web

public class ControllerProgramaAcademico {
    @Autowired // Sirve para simplificar el new la instanciacion
    ServiceProgramaAcademico serviceProgramaAcademico; // de est forma se instancia se reemplaza el new
    @GetMapping (path = "/Users/harcr/Documents/proyectoIj/proyecto",produces = "application/json")

    public String callServicePrograma(){
     Persona objPersona = new Persona();

     objPersona.setNombre("caro"); // cargo el nombre de persona
     objPersona.setApellido("Romero");// cargo el apellido
     objPersona.setEdad(34); // cargamos la edad.

       return  serviceProgramaAcademico.inscribirAlumno(objPersona);   // llamamos el metodo inscribir alumno, como persona no  hace
                                                               // parte de services lo tengo que intanciar para porderlo utiliza
    }

}
