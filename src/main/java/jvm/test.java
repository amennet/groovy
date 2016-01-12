package jvm;

/**
 * Created by ZhangGe on 1/7/2016.
 */
public class test {

    static {
        i = 100;
    }

    public static int i = 1;

    public static void main(String[] args) {
        System.out.println(test.i);
    }

}
