import java.net.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import tcpclient.TCPClient;
 public class TCPAsk {
    public static void main( String[] args) throws InterruptedException {
        for(int i =0; i<=100 ; i++){ 
			System.out.print(i + '%');
			TimeUnit.MILLISECONDS.sleep(40);
			System.out.print("\b\b\b");
			System.out.print("\b");
		}
    }
}

