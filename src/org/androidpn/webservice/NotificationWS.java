package org.androidpn.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface NotificationWS {

	@WebMethod
	public void sendBroadcast(@WebParam(name="apiKey")  String apiKey, @WebParam(name="title") String title, @WebParam(name="message")  String message,
			 @WebParam(name="uri")    String uri) ;
	@WebMethod
	public void sendNotifcationToUser(@WebParam(name="apiKey")  String apiKey,@WebParam(name="username")  String username ,@WebParam(name="title") String title, @WebParam(name="message")  String message,
			 @WebParam(name="uri")    String uri);

}
