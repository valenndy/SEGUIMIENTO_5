package model;

import java.util.Date;

public class Transaction {

	private Date dateTransaction;
	private int movement;
	private String action;
	
	public Transaction(int movement) {
		dateTransaction = new Date();
		this.movement = movement;
		action = null;
	}

	public Date getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

	public int getMovement() {
		return movement;
	}

	public void setMovement(int movement) {
		this.movement = movement;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	
}
