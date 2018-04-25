package com.sap.network;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class Chat_User {
  
  HashMap<String, DataOutputStream> userMap = new HashMap<String, DataOutputStream>();
  
  public synchronized void AddClient(String name,Socket socket)            //ä�ù� ����� �߰� ��
  {                                                                        //ä�ù濡 �����ִ� ����ڿ��� ���� �ҽ��� �˸��ϴ�.
      try {
          sendMsg(name+" �����ϼ̽��ϴ�.","Server");
          userMap.put(name, new DataOutputStream(socket.getOutputStream()));
          System.out.println("ä�� ���� �ο� : "+ userMap.size());
      }catch(Exception e){
          e.printStackTrace();
      }

  }
  
  public synchronized void RemoveClient(String name)  //ä�ù� ����� ���� �� ä�ù濡 �����ϴ� Client���� ���� �ҽ��� �˸�
  {
      try {
          userMap.remove(name);
          sendMsg(name + " �����ϼ̽��ϴ�.", "Server");
          System.out.println("ä�� ���� �ο� : "+userMap.size());
      }catch(Exception e) {
        e.printStackTrace();
      }
  }

  public synchronized void sendMsg(String msg, String name) throws Exception //ä�ù濡 �ִ� ����ڿ��� �޼����� ����
  {
      Iterator iterator = userMap.keySet().iterator();
      
      System.out.println("==sendMsg==");
      
      while(iterator.hasNext())
      {
          String clientname = (String)iterator.next();
          userMap.get(clientname).writeUTF(name + ":" + msg);
      }
  }
}
