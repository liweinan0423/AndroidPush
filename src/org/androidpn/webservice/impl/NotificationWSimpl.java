package org.androidpn.webservice.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.androidpn.server.util.Config;
import org.androidpn.server.xmpp.push.NotificationManager;
import org.androidpn.webservice.NotificationWS;

@WebService(endpointInterface="org.androidpn.webservice.NotificationWS",serviceName="NotificationWS")
public class NotificationWSimpl implements NotificationWS {
	
	private NotificationManager notificationManager = null;

	
	public NotificationWSimpl(){
		
		notificationManager = new NotificationManager();
	}


	@Override
	@WebMethod
	public void sendBroadcast(@WebParam(name = "apiKey") String apiKey,
			@WebParam(name = "title") String title,
			@WebParam(name = "message") String message,
			@WebParam(name = "uri") String uri) {
		// TODO Auto-generated method stub
	       apiKey = Config.getString("apiKey", "");
		notificationManager.sendBroadcast(apiKey, title, message, uri);
	}


	@Override
	@WebMethod
	public void sendNotifcationToUser(@WebParam(name = "apiKey") String apiKey,
			@WebParam(name = "username") String username,
			@WebParam(name = "title") String title,
			@WebParam(name = "message") String message,
			@WebParam(name = "uri") String uri) {
		// TODO Auto-generated method stub
		apiKey = Config.getString("apiKey", "");
		notificationManager.sendNotifcationToUser(apiKey, username, title, message, uri);
	}



	

}
