package kh.com.a.model;
import java.io.Serializable;

///* 관리자 사원 등록 테이블 생성 */
//
//DROP TABLE ADMIN
//CASCADE CONSTRAINT;
//
//DROP SEQUENCE ADMIN_SEQ;
//
//CREATE TABLE ADMIN(
//   SEQ NUMBER(10) PRIMARY KEY,
//   ID VARCHAR2(20) UNIQUE,
//   PASSWORD VARCHAR2(20) NOT NULL,
//   NAME VARCHAR2(20) NOT NULL,
//   PHONE VARCHAR2(20) NOT NULL,
//   STORE_SEQ NUMBER(10) NOT NULL,
//   DEL NUMBER(1) NOT NULL
//)
//
//CREATE SEQUENCE ADMIN_SEQ
//START WITH 1
//INCREMENT BY 1;
//
//
//INSERT INTO ADMIN(SEQ, ID, PASSWORD, NAME, PHONE, STORE_SEQ, DEL)
//VALUES ( ADMIN_SEQ.NEXTVAL,'admin', 'admin', 'admin', '111-1111-1111', 1, 0 )
//


public class Bb_AdminDto implements Serializable{

	private int seq;
	private String id;
	private String password;
	private String name;
	private String phone_number;
	private int store_seq;
	private int del;
	
	public Bb_AdminDto(int seq, String id, String password, String name, String phone_number, int store_seq, int del) {
		super();
		this.seq = seq;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone_number = phone_number;
		this.store_seq = store_seq;
		this.del = del;
	}
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public int getStore_seq() {
		return store_seq;
	}
	public void setStore_seq(int store_seq) {
		this.store_seq = store_seq;
	}
	public int getDel() {
		return del;
	}
	public void setDel(int del) {
		this.del = del;
	}
	@Override
	public String toString() {
		return "Bb_AdminDto [seq=" + seq + ", id=" + id + ", password=" + password + ", name=" + name
				+ ", phone_number=" + phone_number + ", store_seq=" + store_seq + ", del=" + del + "]";
	}
	

	
}
