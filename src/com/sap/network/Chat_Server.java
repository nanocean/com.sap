package com.sap.network;

import java.net.ServerSocket;
import java.net.Socket;

public class Chat_Server {

  public static void main(String arg[])
  {
      Socket socket = null;                    //������ Client�� ����ϱ� ���� Socket
      Chat_User user = new Chat_User();                    //ä�ù濡 ������ �ִ� Client ���� ��ü
      ServerSocket server_socket=null;              //Client ������ �ޱ� ���� ServerSocket
      
      int count = 0;                            
      Thread thread[]= new Thread[10];             //�����ϴ� ������ Client�κ��� �����͸� �о���̰� ����������
      
      try {
          server_socket = new ServerSocket(12345);
          //Server�� ���ξ������ �Լ��ؼ� ������� ������ ����
          while(true)
          {
              socket = server_socket.accept();
              //���� �� ����ڿ� ��� �� �� �ִ� socket�� ������ Receiver �����带 ���� �� ����.
              thread[count] = new Thread(new Chat_Receiver(user,socket));
              thread[count].start();
              count++;
          }
      }catch(Exception e) {
        e.printStackTrace();
      };
  }

}
