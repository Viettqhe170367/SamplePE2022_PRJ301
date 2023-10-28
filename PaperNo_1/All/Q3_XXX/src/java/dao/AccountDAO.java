/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dal.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Account;

/**
 *
 * @author tranq
 */
public class AccountDAO extends DBContext {

    public Account get(String username, String password) {
	try {
	    PreparedStatement ps = connection.prepareStatement("select * from Account where userid = ? and password = ?");
	    ps.setString(1, username);
	    ps.setString(2, password);
	    ResultSet rs = ps.executeQuery();
	    while (rs.next()) {
		return new Account(
			rs.getString(1),
			rs.getString(2),
			rs.getString(3)
		);
	    }
	} catch (SQLException e) {
	    System.out.println(e);
	}
	return null;
    }

    public static void main(String[] args) {
	System.out.println(new AccountDAO().get("", ""));
    }
}
