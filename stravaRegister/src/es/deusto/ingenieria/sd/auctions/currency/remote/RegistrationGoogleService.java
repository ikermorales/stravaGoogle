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

import es.deusto.ingenieria.sd.auctions.server.data.dto.EntrenamientoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.TipoUsuarioDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.UserDTO;

public class RegistrationGoogleService extends UnicastRemoteObject implements IRegistrationGoogle {
	private static final long serialVersionUID = 1L;

	
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
	public String getUsuarioGoogle(String nickName) {
		HashMap<String, String> hashGoogle = new HashMap();
		
		
	}

	
}