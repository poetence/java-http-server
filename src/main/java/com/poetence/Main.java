package com.poetence;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.BufferedReader;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{
            final ServerSocket server = new ServerSocket(8080);
            System.out.println("Listening for connection on port 8080 ....");
            while (true){
                //Reads and accepts HTTP requests on port 8080 on localhost.
                final Socket clientSocket = server.accept();
                //Reading the HTTP request from the browser and displaying it.
                InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
                BufferedReader reader = new BufferedReader(isr);
                String line = reader.readLine();
                while (!line.isEmpty()){
                    System.out.println(line);
                    line = reader.readLine();
                }
            }

    }
}