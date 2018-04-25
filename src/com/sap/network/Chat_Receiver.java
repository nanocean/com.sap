package com.sap.network;

import java.io.DataInputStream;
import java.net.Socket;

public class Chat_Receiver implements Runnable {

  Socket socket;
  DataInputStream in;
  String name;
  Chat_User user = new Chat_User();

  public Chat_Receiver(Chat_User user,Socket socket) throws Exception
  {
      this.user = user;
      this.socket = socket;
      //������ Client�κ��� �����͸� �о���̱� ���� DataInputStream ����
      in = new DataInputStream(socket.getInputStream());
      //���� ����ڷκ��� �г����� �о����
      this.name = in.readUTF();
      //����� �߰����ݴϴ�.
      user.AddClient(name, socket);
  }

  public void run()
  {
      try
      {
          //Receiver�� ����ڷκ��� �Ѿ���� �����͸� �о�� ä�ù濡 �ִ� ����ڵ鿡�� �����ϴ� ���� �ݺ��մϴ�.
          while(true)
          {
              String msg = in.readUTF();
              user.sendMsg(msg , name);
          }
      }catch(Exception e) {
          //Exception�� �߻��ߴٴ� �� ����ڰ� ������ �����ٴ� �ǹ��Դϴ�. ä�ù濡�� ����ڸ� �����մϴ�.
//          System.out.println(this.name + " disconnect");
          user.RemoveClient(this.name);
      }        
  }

}
