package com.educacionit.interfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public interface Fechas {
	String FECHA_SQL= "yyyy-MM-dd";
	String FECHA_USUARIO = "dd/MM/yyyy";
	
	/**
	 * Recibe un objeto java.util.Date y retorna un String con formato dd/MM/yyyy
	 * @param fecha
	 * @return String
	 */
	static String getFechaAString(Date fecha) {
		return new SimpleDateFormat(FECHA_USUARIO).format(fecha);
	}
	
	/**
	 * Recibe un String con formato yyyy-MM-dd y retorna un objeto de tipo date con formato dd/MM/yyyy
	 * @param fecha
	 * @return java.util.Date
	 */	
	static Date getStringAFecha(String fecha) throws ParseException {
		return new SimpleDateFormat(FECHA_USUARIO).parse(fecha);
	}
	
	/**
	 * Recibe un objeto java.util.Date y retorna un String con formato yyyy-MM-dd
	 * @param fecha
	 * @return String
	 */
	static String getFechaSQLAString(Date fecha) {
		return new SimpleDateFormat(FECHA_SQL).format(fecha);
	}
	/**
	 * Recibe un String con formato yyyy-MM-dd y retorna un objeto de tipo date con formato dd/MM/yyyy
	 * @param fecha
	 * @return java.util.Date
	 */
	static Date getStringAFechaSQL(String fecha) throws ParseException {
		return new SimpleDateFormat(FECHA_SQL).parse(fecha);
	}
	
	
}
