package com.educacionit.interfaces;

import java.sql.Connection;

public interface ConexionMariaDB {
	default Connection getConexion() {
		Connection conexion = null;
		
		return conexion;
	}
}
