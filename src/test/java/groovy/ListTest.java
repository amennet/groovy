package groovy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ZhangGe on 1/25/2016.
 */
public class ListTest {

    @Test
    public void addList(){
        List list = new ArrayList<>();
        list.add("a");
        list.add(0, "b");
        System.out.println(list);
    }

    @Test
    public void Map(){
        Map a = new HashMap();
        a.put(null, null);
        a.putAll(null);


    }



}
