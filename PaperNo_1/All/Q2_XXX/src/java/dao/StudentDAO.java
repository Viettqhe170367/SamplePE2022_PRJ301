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
import model.Student;

/**
 *
 * @author tranq
 */
public class StudentDAO extends DBContext {

    public List<Student> search(String name) {
	List<Student> result = new ArrayList<>();
	try {
	    PreparedStatement ps = connection.prepareStatement("select * from Student WHERE name like ?");
	    ps.setString(1, "%" + name + "%");
	    ResultSet rs = ps.executeQuery();
	    while (rs.next()) {
		Student student = new Student(
			rs.getInt(1),
			rs.getString(2),
			rs.getBoolean(3),
			rs.getDate(4)
		);
		result.add(student);
	    }
	    return result;
	} catch (SQLException e) {
	    System.out.println(e);
	}
	return null;
    }
}
