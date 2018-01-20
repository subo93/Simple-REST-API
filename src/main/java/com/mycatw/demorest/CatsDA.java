package com.mycatw.demorest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.sql.*;

public class CatsDA {

	List<Cat> cc;

	Connection con = null;

	public CatsDA() {
		String url = "jdbc:mysql://localhost:3306/restdb";
		String username = "root";
		String password = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Workin db!");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error in MySql connnection!!");
		}
	}

	/*
	 * public CatsDA() { cc = new ArrayList<>();
	 * 
	 * Cat c1 = new Cat(); c1.setName("aa"); c1.setPoints(11);
	 * 
	 * Cat c2 = new Cat(); c2.setName("bb"); c2.setPoints(12);
	 * 
	 * cc.add(c1); cc.add(c2); List<Cat> cats = Arrays.asList(c1, c2);
	 * 
	 * }
	 */

	public List<Cat> getCats() {

		// can use hibernate for this
		List<Cat> ca = new ArrayList<>();
		String sql = "select * from cat";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Cat a = new Cat();
				a.setName(rs.getString(1));
				a.setPoints(rs.getInt(2));

				ca.add(a);
			}
			System.out.println("querry part works!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error in querry part!!!");
		}

		return ca;
	}

	public Cat getCat(int id) {

		/*
		 * for (Cat c : cc) { if (c.getId() == id) return c; } return new Cat();
		 */
		String sql1 = "select * from cat where point="+id;
		Cat a = new Cat();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql1);
			if (rs.next()) {

				a.setName(rs.getString(1));
				a.setPoints(rs.getInt(2));

				// cc.add(a);
			}
			System.out.println("querry part works!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error in querry part!!!");
		}
		return a;

	}

	public void create(Cat c3) {
		// TODO Auto-generated method stub
		//cc.add(c3);
		String sql="insert into cat values(?,?)";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			//ResultSet rs = st.executeQuery(sql);
			st.setString(1, c3.getName());
			st.setInt(2, c3.getPoints());
			st.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error in querry part!!!");
		}
	}

	/*
	 * public Cat getCat1(String a) { // TODO Auto-generated method stub
	 * 
	 * Cat c4 = null; return c4; }
	 */

}
