package com.educacionit.entidades;
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
	
	public Usuario(String correo, String clave, Boolean activo) {
		super();
		this.correo = correo;
		this.clave = clave;
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Usuario [" + correo + ", " + clave + ", " + activo + "]";
	}

	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	
	
}
