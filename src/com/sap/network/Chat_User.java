package com.sap.network;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class Chat_User {
  
  HashMap<String, DataOutputStream> userMap = new HashMap<String, DataOutputStream>();
  
  public synchronized void AddClient(String name,Socket socket)            //채팅방 사용자 추가 및
  {                                                                        //채팅방에 남아있는 사용자에게 접속 소식을 알립니다.
      try {
          sendMsg(name+" 입장하셨습니다.","Server");
          userMap.put(name, new DataOutputStream(socket.getOutputStream()));
          System.out.println("채팅 참여 인원 : "+ userMap.size());
      }catch(Exception e){
          e.printStackTrace();
      }

  }
  
  public synchronized void RemoveClient(String name)  //채팅방 사용자 제거 및 채팅방에 존재하는 Client에게 퇴장 소식을 알림
  {
      try {
          userMap.remove(name);
          sendMsg(name + " 퇴장하셨습니다.", "Server");
          System.out.println("채팅 참여 인원 : "+userMap.size());
      }catch(Exception e) {
        e.printStackTrace();
      }
  }

  public synchronized void sendMsg(String msg, String name) throws Exception //채팅방에 있는 사용자에게 메세지를 전송
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
