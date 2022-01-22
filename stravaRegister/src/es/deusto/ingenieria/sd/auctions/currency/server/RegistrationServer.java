package es.deusto.ingenieria.sd.auctions.currency.server;

import java.rmi.Naming;

import es.deusto.ingenieria.sd.auctions.currency.remote.RegistrationGoogleService;
import es.deusto.ingenieria.sd.auctions.currency.remote.IRegistrationGoogle;

public class RegistrationServer {

	public static void main(String[] args) {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}

		String name = "//" + args[0] + ":" + args[1] + "/" + args[2];		
		
		try {
			IRegistrationGoogle remoteObject = RegistrationGoogleService.getInstance();			
			Naming.rebind(name, remoteObject);
			System.out.println(" * Google Server '" + name + "' started!!");
		} catch (Exception ex) {
			System.out.println(" # Google Server: " + ex.getMessage());
			ex.printStackTrace();
		}

	}
}