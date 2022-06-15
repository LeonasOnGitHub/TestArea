package tcp;

import java.io.IOException;
import java.util.Scanner;

public class Start {
    private static boolean isServer;

    public static void main(String[] args) {
        if(args.length > 0){
            isServer=true;
        }
        TCPconectin conect = new TCPconectin(isServer);
        try {
            conect.run();
        } catch (IOException e) {
            System.out.println("Da ist wohl etwas schief gelaufen");
            e.printStackTrace();
        }
    }
    public Start(boolean isServer){
        this.isServer = isServer;
    }
}
