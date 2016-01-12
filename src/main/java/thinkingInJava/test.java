package thinkingInJava;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by ZhangGe on 1/4/2016.
 */
public class test {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("localhost");
        System.out.println(byName);

    }
}
