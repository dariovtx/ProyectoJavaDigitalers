package com.educacionit.entidades;

import com.educacionit.exepciones.ExepcionPatrones;
import com.educacionit.interfaces.Patrones;

/**
 * comentario de documentación
 * @author DarioVictor
 *
 */
public class Usuario {
	private String correo;
	private String clave;
	private Boolean activo;
	public Usuario() {
		
	}
	
	public Usuario(String correo, String clave, Boolean activo) throws ExepcionPatrones {
		super();
		//Para no generar de nuevo las condiciones usamos los metodos set de correo y clave
		setCorreo(correo);
		setClave(clave);
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Usuario [" + correo + ", " + clave + ", " + activo + "]";
	}

	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) throws ExepcionPatrones {
		if(!Patrones.esCorreo(correo)) {
			throw new ExepcionPatrones(1);
		}
		this.correo = correo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) throws ExepcionPatrones {
		if(!Patrones.esClave(clave)) {
			throw new ExepcionPatrones(2);
		}
		this.clave = clave;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	
	
}
