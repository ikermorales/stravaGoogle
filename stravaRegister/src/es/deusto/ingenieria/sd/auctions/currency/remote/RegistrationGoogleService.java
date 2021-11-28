package es.deusto.ingenieria.sd.auctions.currency.remote;

import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public class RegistrationGoogleService extends UnicastRemoteObject implements IRegistrationGoogle {
	private static final long serialVersionUID = 1L;
	private HashMap<String, String> hashGoogle = new HashMap<>();	
	private static RegistrationGoogleService instance;
			
	private RegistrationGoogleService() throws RemoteException {
		super();
	}	
	
	public static RegistrationGoogleService getInstance() {
		if (instance == null) {
			try {
				instance = new RegistrationGoogleService();
			} catch(Exception ex) {
				System.err.println("  # Error initializing service(): " + ex.getMessage());
			}
		}
		
		return instance;
	}

	@Override
	public boolean checkCuentaGmail(String email, String contrasenya) {
		this.getInstance();
		hashGoogle.put("billlie@gmail.com", "eleven");
		
		if(hashGoogle.containsKey(email)) {
			if(hashGoogle.get(email).matches(contrasenya)) {
				return true;
			}
		}
		return false;
	}

	
}