package com.educacionit.entidades;

import java.util.Date;
import java.util.Objects;

public class Alumno {
	private Documento documento;
	private String descripcion;
	private Date fecha_nacimiento;
	private Boolean activo;
	
	public Alumno() {
		super();
	}

	public Alumno(Documento documento, String descripcion, Date fecha_nacimiento, Boolean activo) {
		super();
		this.documento = documento;
		this.descripcion = descripcion;
		this.fecha_nacimiento = fecha_nacimiento;
		this.activo = activo;
	}
	

	@Override
	public String toString() {
		return "Alumno [" + documento + ", " + descripcion + ", "
				+ fecha_nacimiento + ", " + activo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(documento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(documento, other.documento);
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	
	
	
	
}
