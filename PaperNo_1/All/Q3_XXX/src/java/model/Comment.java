/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tranq
 */
public class Comment {

    private int cid;
    private String ctitle;
    private String user;
    private int tid;

    public Comment() {
    }

    public Comment(int cid, String ctitle, String user, int tid) {
	this.cid = cid;
	this.ctitle = ctitle;
	this.user = user;
	this.tid = tid;
    }

    public int getCid() {
	return cid;
    }

    public void setCid(int cid) {
	this.cid = cid;
    }

    public String getCtitle() {
	return ctitle;
    }

    public void setCtitle(String ctitle) {
	this.ctitle = ctitle;
    }

    public String getUser() {
	return user;
    }

    public void setUser(String user) {
	this.user = user;
    }

    public int getTid() {
	return tid;
    }

    public void setTid(int tid) {
	this.tid = tid;
    }

}
