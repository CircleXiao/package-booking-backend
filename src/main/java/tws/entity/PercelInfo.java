package tws.entity;

import java.io.Serializable;

public class PercelInfo implements Serializable {
	
	private int id;
	private String waybillNum;
	private String username;
	private String telphone;
	private String state;
	private String appointmentTime;
	private String weight;
	
	public PercelInfo() {
		
	}
	
	public PercelInfo(int id, String waybillNum, String username, String telphone, String state, String appointmentTime,
			String weight) {
		this.id = id;
		this.waybillNum = waybillNum;
		this.username = username;
		this.telphone = telphone;
		this.state = state;
		this.appointmentTime = appointmentTime;
		this.weight = weight;
	}



	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getWaybillNum() {
		return waybillNum;
	}
	
	public void setWaybillNum(String waybillNum) {
		this.waybillNum = waybillNum;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getTelphone() {
		return telphone;
	}
	
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getAppointmentTime() {
		return appointmentTime;
	}
	
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	
	public String getWeight() {
		return weight;
	}
	
	public void setWeight(String weight) {
		this.weight = weight;
	}

}
