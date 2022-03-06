package model;

import java.util.ArrayList;
import java.util.Date;

public class Client {

	private String user;
	private String password;
	private int total;
	private ArrayList<Transaction> transactions;
	
	public Client(String user, String password) {
		this.user = user;
		this.password = password;
		total = 0;
		transactions = new ArrayList<Transaction>();
	}
		
	public String getUser() {
		return user;
	}



	public void setUser(String user) {
		this.user = user;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public int getTotal() {
		return total;
	}



	public void setTotal(int total) {
		this.total = total;
	}



	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}



	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}

	public void addTransaction( int movement) {
		Transaction t = new Transaction(movement);
		transactions.add(t);
	}
	
	public void changeTotal() {
		for(int i = 0; i < transactions.size();i++) {
			total += transactions.get(i).getMovement();
		}
	}
}