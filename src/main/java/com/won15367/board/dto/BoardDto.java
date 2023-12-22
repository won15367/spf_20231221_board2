package com.won15367.board.dto;

import java.sql.Timestamp;

public class BoardDto {
	
	private int bunm;
	private String bname;
	private String btitle;
	private String bcontent;
	private int bhit;
	private int bgroup;
	private int bstep;
	private int bindent;
	private Timestamp bdate;
	
	public BoardDto(int bunm, String bname, String btitle, String bcontent, int bhit, int bgroup, int bstep,
			int bindent, Timestamp bdate) {
		super();
		this.bunm = bunm;
		this.bname = bname;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bhit = bhit;
		this.bgroup = bgroup;
		this.bstep = bstep;
		this.bindent = bindent;
		this.bdate = bdate;
	}

	public BoardDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBunm() {
		return bunm;
	}

	public void setBunm(int bunm) {
		this.bunm = bunm;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public int getBhit() {
		return bhit;
	}

	public void setBhit(int bhit) {
		this.bhit = bhit;
	}

	public int getBgroup() {
		return bgroup;
	}

	public void setBgroup(int bgroup) {
		this.bgroup = bgroup;
	}

	public int getBstep() {
		return bstep;
	}

	public void setBstep(int bstep) {
		this.bstep = bstep;
	}

	public int getBindent() {
		return bindent;
	}

	public void setBindent(int bindent) {
		this.bindent = bindent;
	}

	public Timestamp getBdate() {
		return bdate;
	}

	public void setBdate(Timestamp bdate) {
		this.bdate = bdate;
	}
	
	
	

}
