package com.sap.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Server2 {

  public static void main(String[] args) throws Exception {
    // TODO Auto-generated method stub

    int port = 12345;
    ServerSocket server = new ServerSocket(port);
    System.out.println("���� �غ� �Ϸ�");
    Socket socket = server.accept();
    InputStreamReader isr = new InputStreamReader(socket.getInputStream());
    BufferedReader in1 = new BufferedReader(isr);
    
    String str = in1.readLine();
    System.out.println("Ŭ���̾�Ʈ�κ��� ���� �޼���: " + str);
    
    in1.close();
    socket.close();
    
    
  }

}
