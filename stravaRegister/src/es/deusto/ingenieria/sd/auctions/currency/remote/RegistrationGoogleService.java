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

	
	//Attribute for the Singleton pattern
	public static RegistrationGoogleService instance;
			
	private RegistrationGoogleService() throws RemoteException {
		super();
//		getConversionRates();
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
		hashGoogle.put("billlie@gmail.com", "eleven");
		hashGoogle.put("astro@gmail.com", "nauta");
		hashGoogle.put("euwnoo@gmail.com", "1");
		hashGoogle.put("rosalia@gmail.com", "rosalia");
		hashGoogle.put("gorka@gmail.com", "gorka");
		
		if(hashGoogle.containsKey(email)) {
			if(hashGoogle.get(email).matches(contrasenya)) {
				return true;
			}
		}
		
		return false;
	}

	
}