package Socket_Chat_DaTienTrinh;


import Socket_Chat_DaTienTrinh.Thread_ReadData;
import Socket_Chat_DaTienTrinh.Thread_WriteData;

import java.io.*;
        import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            // Tạo ra server socket
            ServerSocket Server = new ServerSocket(25000);
            System.out.println("Server đang chạy tại port: 25000");

            while (true) {
                Socket socket = Server.accept();
                System.out.println("Chấp nhận kết nối từ client");
                Thread_ReadData tr = new Thread_ReadData(socket, "Client");
                Thread_WriteData tw = new Thread_WriteData(socket, "Client");

                tr.start();
                tw.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}