/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dal.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.thread;

/**
 *
 * @author tranq
 */
public class ThreadDAO extends DBContext {

    public List<thread> getAll() {
	List<thread> result = new ArrayList<>();
	try {
	    PreparedStatement ps = connection.prepareStatement("select * from Thread");
	    ResultSet rs = ps.executeQuery();
	    while (rs.next()) {
		thread th = new thread(
			rs.getInt(1),
			rs.getString(2)
		);
		result.add(th);
	    }
	    return result;
	} catch (SQLException e) {
	    System.out.println(e);
	}
	return null;
    }
}
