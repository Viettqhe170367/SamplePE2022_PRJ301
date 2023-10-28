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
import model.Comment;

/**
 *
 * @author tranq
 */
public class CommentDAO extends DBContext {

    public List<Comment> getBytid(int tid) {
	List<Comment> result = new ArrayList<>();
	try {
	    PreparedStatement ps = connection.prepareStatement("select c.cid, c.ctitle, a.displayname, c.tid from Comment c left join Account a\n"
		    + "on c.userid = a.userid\n"
		    + " where tid = ?");
	    ps.setInt(1, tid);
	    ResultSet rs = ps.executeQuery();
	    while (rs.next()) {
		Comment address = new Comment(
			rs.getInt(1),
			rs.getString(2),
			rs.getString(3),
			rs.getInt(4)
		);
		result.add(address);
	    }
	    return result;
	} catch (SQLException e) {
	    System.out.println(e);
	}
	return null;
    }

    public void add(String ctitle, String userid, int tid) {
	try {
	    PreparedStatement ps = connection.prepareStatement(" insert into Comment(ctitle, userid, tid) values(?, ?, ?)");
	    ps.setString(1, ctitle);
	    ps.setString(2, userid);
	    ps.setInt(3, tid);
	    ps.executeUpdate();
	} catch (SQLException err) {
	    System.out.println(err);
	}
    }
}
