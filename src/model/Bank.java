package model;

import java.util.ArrayList;

public class Bank {
	
	private ArrayList<Client> clients;
	
	public Bank() {
		clients = new ArrayList<Client>();
	}
	
	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	public void addClient(String user, String password) {
		Client c =  new Client(user, password);
		for(int i = 0; i < clients.size(); i++ ) {
			if(!c.getUser().equalsIgnoreCase(clients.get(i).getUser())) {
				clients.add(c);
			}else {
				
			}
		}
	}

	
}
