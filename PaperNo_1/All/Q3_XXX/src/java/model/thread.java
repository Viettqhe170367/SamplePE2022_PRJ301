/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tranq
 */
public class thread {

    private int tid;
    private String tcontent;

    public thread() {
    }

    public thread(int tid, String tcontent) {
	this.tid = tid;
	this.tcontent = tcontent;
    }

    public int getTid() {
	return tid;
    }

    public void setTid(int tid) {
	this.tid = tid;
    }

    public String getTcontent() {
	return tcontent;
    }

    public void setTcontent(String tcontent) {
	this.tcontent = tcontent;
    }

}
