package com.sap.network;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Chat_Client {
  public static void main(String[] arg)
  {
      Socket socket = null;            //Server�� ����ϱ� ���� Socket
      DataInputStream in = null;        //Server�κ��� �����͸� �о���̱� ���� �Է½�Ʈ��
      BufferedReader in2 = null;        //Ű����κ��� �о���̱� ���� �Է½�Ʈ��
      DataOutputStream out = null;    //������ ������������ ��Ʈ��
      
      try {

          socket = new Socket("192.168.0.25", 12345);    //������ ����
          
          in = new DataInputStream(socket.getInputStream());            //�����κ��� ������ �о���̱� ���� ��Ʈ�� ����
          in2 = new BufferedReader(new InputStreamReader(System.in)); //ä���� ���� ����� Ű����κ��� ������ �о���̱� ���� ��Ʈ�� ����
          out = new DataOutputStream(socket.getOutputStream());        //ä�� ������ ������ �����ϱ� ���� ��� ��Ʈ��
          
          //ä�ÿ� ��� �� �г����� �Է¹���
          System.out.print("�г����� �Է����ּ��� : ");
          String data = in2.readLine();  
          
          //������ �г����� ����
          out.writeUTF(data);
          //����ڰ� ä�� ������ �Է� �� ������ �����ϱ� ���� ������ ���� �� ����
          Thread th = new Thread(new Chat_Send(out));
          th.start();
      }catch(IOException e) {
        e.printStackTrace();
      }
      
      try {
          //Ŭ���̾�Ʈ�� ���� ������� �����κ��� ������ �о���̴� �͸� �ݺ�.
          while(true)
          {
              String str2 = in.readUTF();        
          }
      }catch(IOException e) {
        e.printStackTrace();
      }
  }
}
