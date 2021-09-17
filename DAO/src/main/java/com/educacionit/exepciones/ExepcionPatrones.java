package com.educacionit.exepciones;

public class ExepcionPatrones extends Exception {

	private static final long serialVersionUID = 1L;
	private int codigo;
	
	public ExepcionPatrones (int codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String getMessage() {

		switch(codigo) {
		case 1:
			return "No es un correo Electronico Valido";
		case 2:
			return "La contraseña debe tener entre 8 y 16 caracteres, al menos un dígito, al menos una minúscula y al menos una mayúscula. NO puede tener otros símbolos.";
		default:
			return "Error en los Patrones";
		
		}
	}
}
