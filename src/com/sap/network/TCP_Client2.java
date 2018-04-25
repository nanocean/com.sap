package com.sap.network;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP_Client2 {

  public static void main(String[] args) throws Exception {
    // TODO Auto-generated method stub

    InetAddress ip = InetAddress.getByName("192.168.0.25");
    int port = 12345;
    Socket socket = new Socket(ip, port);
    OutputStream out1 = socket.getOutputStream();
    
    PrintWriter out2 = new PrintWriter(out1);
    out2.println("hello network!");
    out2.flush();
    out2.close();
    socket.close();
    
    
  }

}
