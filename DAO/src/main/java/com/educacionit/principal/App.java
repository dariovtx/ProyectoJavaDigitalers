package com.educacionit.principal;

import java.text.ParseException;

import com.educacionit.entidades.Alumno;
import com.educacionit.entidades.Documento;
import com.educacionit.entidades.Usuario;
import com.educacionit.exepciones.ExepcionPatrones;
import com.educacionit.implementaciones.mariadb.AlumnoImplementacion;
import com.educacionit.implementaciones.mariadb.UsuarioImplementacion;
import com.educacionit.interfaces.Fechas;

public class App {
	public static void main(String[] args) throws ParseException {
	/*	AlumnoImplementacion impl= new AlumnoImplementacion();
		for(Alumno alumno : impl.listar() ) {
			System.out.println(alumno);
		}
		
		Alumno alumno1 = new Alumno();
		alumno1.setDocumento(new Documento("DNI","09"));
		alumno1.setDescripcion("Ernesto Rodrígues");
		alumno1.setFecha_nacimiento(Fechas.getStringAFecha("16/08/1990"));
		alumno1.setActivo(true);
		impl.guardar(alumno1);
		*/
		
		try {
			Usuario usuario1 = new Usuario("user3@gmail.com","User3abcd",true);
			UsuarioImplementacion impl = new UsuarioImplementacion();
			impl.guardar(usuario1);
			for (Usuario usuario : impl.listar()) {
				System.out.println(usuario);
			}
			
		} catch (ExepcionPatrones e) {
			e.printStackTrace();
		}
	}
}
