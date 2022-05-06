package echo01;

import java.net.*;
import java.io.*;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.0.5", 10001)); //ip는 문자열
		
		System.out.println("<서버 시작>");
		System.out.println("==================================================");
		System.out.println("[연결을 기다리고 있습니다.]");
		
		Socket socket = serverSocket.accept();
		System.out.println("[클라이언트가 연결 되었습니다.]");
		
		
		//메세지 받기용 스트림
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
			
		//메세지 보내기용 스트링
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		while(true) {
			String msg = br.readLine();
			
			if (msg == null) {
				System.out.println("");
				break;
			}
			
			System.out.println("받은메세지: " + msg);
			
			//메세지 보내기
			bw.write(msg);
			bw.newLine();
			bw.flush();
		}

		
		System.out.println("==================================================");
		System.out.println("<서버 종료>");
		
		
		br.close();
		bw.close();
		socket.close();
		serverSocket.close();
	}
}
