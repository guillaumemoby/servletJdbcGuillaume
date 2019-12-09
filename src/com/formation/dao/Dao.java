package com.formation.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.formation.model.Client;

public class Dao implements Idao {

	@Override
	public void save(Client client) {
		PreparedStatement st = null;
		Connection cn = null;
		String nom = client.getNom();
		String prenom = client.getPrenom();
		int age = client.getAge();

		try {

			cn = connecter();

			String sql = "INSERT INTO client (nom, prenom, age) VALUES(?, ?, ?)";

			st = cn.prepareStatement(sql);
			st.setString(1, nom);
			st.setString(2, prenom);
			st.setInt(3, age);
			st.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Client findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public Connection connecter() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost/vente";
		String login = "root";
		String passwd = "";

		Class.forName("com.mysql.jdbc.Driver");
		Connection cn = DriverManager.getConnection(url, login, passwd);
		return cn;

	}
	
	public static void main(String[] args) {
		Client vincent = new Client();
		vincent.setAge(52);
		vincent.setPrenom("Vincent");
		vincent.setNom("Machin");

		
		Client c = new Client("Truc", "Kalhed", 17);
		
		Idao dao = new Dao();
		dao.save(vincent);
		dao.save(c);
		
		
	}
}
