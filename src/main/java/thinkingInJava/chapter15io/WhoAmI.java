package thinkingInJava.chapter15io;

import java.net.InetAddress;

/**
 * Created by ZhangGe on 1/4/2016.
 */
public class WhoAmI {
    public static void main(String[] args) throws Exception {
        InetAddress a = InetAddress.getByName(null);
        System.out.println(a);
    }
}