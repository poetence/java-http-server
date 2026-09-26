package com.poetence;
import java.net.ServerSocket;
import java.net.Socket;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{
            final ServerSocket server = new ServerSocket(8080);
            System.out.println("Listening for connection on port 8080 ....");
            while (true){
                final Socket client = server.accept();
            }

    }
}