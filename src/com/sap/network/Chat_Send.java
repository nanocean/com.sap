package com.sap.network;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chat_Send implements Runnable {

  DataOutputStream out;
  BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
  
  public Chat_Send(DataOutputStream out) {
    this.out = out;
  }

  public void run() {
    // TODO Auto-generated method stub
    try {
      
      while (true) {
        String msg = in2.readLine();
        out.writeUTF(msg);
      }
      
    } catch (IOException e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }

}
