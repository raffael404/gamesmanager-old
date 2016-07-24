package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Register;
import exception.CommunicationFailureException;

public class Database {
	private Connection connection;
	
	public Database(String serverName, String databaseName, String userName, String password) throws CommunicationFailureException {
		connection = getMySQLConnection(serverName, databaseName, userName, password);
		try {
			Statement st = connection.createStatement();
			st.executeUpdate("create table if not exists registros(data date, "
							+ "inicio varchar(5), fim varchar(5), tv tinyint unsigned, "
							+ "pago boolean, valor decimal(4,2) unsigned);");
		} catch (SQLException e) {
			throw new CommunicationFailureException("Erro durante a criacao da tabela de registros!");
		}
	}
	
	private Connection getMySQLConnection(String serverName, String databaseName, String userName, String password) throws CommunicationFailureException{
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://" + serverName + "/" + databaseName, userName, password);
			return connection;
		} catch (ClassNotFoundException e) {
			throw new CommunicationFailureException("Driver nao encontrado!");
		} catch (SQLException e) {
			throw new CommunicationFailureException("Erro de conexao com o Banco de Dados " + databaseName + "!");
		}
	}
	
	public void insertRegister(Register register) throws CommunicationFailureException{
		try {
			Statement st = connection.createStatement();
			st.executeUpdate("insert into registros values(STR_TO_DATE('" + register.getDate() + "', '%d/%m/%Y'), '"
								+ register.getStartTime() + "', '" + register.getFinishTime() + "', "
								+ register.getTv() + ", " + register.isPaid() + ", " + register.getValue() + ");");
			st.close();
		} catch (SQLException e) {
			throw new CommunicationFailureException("Erro ao inserir dados no Banco!");
		}
	}
	
	public List<Register> getRegistersByDate(String startDate, String endDate) throws CommunicationFailureException{
		try {
			Statement st = connection.createStatement();
			List<Register> registers = new ArrayList<Register>();
			ResultSet rs = st.executeQuery("select * from registros where data between "
											+ "STR_TO_DATE('" + startDate + "', '%d/%m/%Y') and "
											+ "STR_TO_DATE('" + endDate + "', '%d/%m/%Y') order by data desc;");
			while (rs.next()) {
				Register register = new Register(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getBoolean(5), rs.getFloat(6));
				registers.add(register);						
			}
			st.close();
			return registers;
		} catch (SQLException e) {
			throw new CommunicationFailureException("Erro de conexao com o Banco de Dados!");
		}
	}
	
	public List<Register> getRegistersByCurrentDate() throws CommunicationFailureException{
		try {
			Statement st = connection.createStatement();
			List<Register> registers = new ArrayList<Register>();
			ResultSet rs = st.executeQuery("select * from registros where data = CURDATE();");
			while (rs.next()) {
				Register register = new Register(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getBoolean(5), rs.getFloat(6));
				registers.add(register);						
			}
			st.close();
			return registers;
		} catch (SQLException e) {
			throw new CommunicationFailureException("Erro de conexao com o Banco de Dados!");
		}
	}
	
}
