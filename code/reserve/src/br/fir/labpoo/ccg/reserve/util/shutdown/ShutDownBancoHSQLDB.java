package br.fir.labpoo.ccg.reserve.util.shutdown;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ShutDownBancoHSQLDB {

	/**
	 * Script que realiza um ShutDown em todas as instancias do banco HSQLDB
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Class.forName("org.hsqldb.jdbcDriver");
		System.out.println("Procurando instancias do banco de dados...");
		Properties pro = new Properties();
		pro.load(new FileInputStream("server.properties"));
		boolean tentarProxBDIndex = true;
		for (int i = 0; tentarProxBDIndex; i++) {
			String nomeBD = pro.getProperty("server.dbname." + i);
			if (nomeBD != null) {
				System.out
						.println(i
								+ " . Fechando instancia do banco de dados = "
								+ nomeBD);
				Connection con = DriverManager.getConnection(
						"jdbc:hsqldb:hsql://localhost/" + nomeBD, "sa", "");
				con.createStatement().executeUpdate("SHUTDOWN");
				con.close();
			} else {
				tentarProxBDIndex = false;
			}
		}
	}

}
