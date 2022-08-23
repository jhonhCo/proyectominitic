package com.co.udea.mintic.proyecto.proyecto.services;

import com.co.udea.mintic.proyecto.proyecto.domain.Persona;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

//nota:
//1 creamos un  objeto en domain con nombre apellido edad etc
//2.luego creamos una clase que se llama programaAcademico  para comenzar a trabajar  con el objeto persona
//3. luego  creamos una variable para el nombre del programaAcadémico
//4. Creamos un método llamado inscribir con los datos del modelo retorna la variable inscripción
//5. Vamos a controller para hacer el puente entre la vista y services



@Service //  se le entregan datos para que el service los procese.
public class ServiceProgramaAcademico {

    @Getter // me trae los Getter
    @Setter // me trae los Setter
    private String nombrePrograma; // tenemos  varios programas academicos y al cual le damos un nombre

    public String inscribirAlumno(Persona alumno){ // se crea esta metodo para inscribir

        String inscripcion = "El alumno"+alumno.getNombre()+""+alumno.getApellido()+"con"+alumno.getEdad()+"años, quedo inscrito en el programa" ;

      return inscripcion;
    }



}
