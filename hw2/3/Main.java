import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Main {

    public static Collection<?> noDuplicates(Collection<Object> x) {
        HashSet<?> a = new HashSet<Object>(x);
        x.clear();
        x.addAll(a);
        return x;
    }
    public static void main(String[] args) {
        ArrayList<Object> array1 = new ArrayList<>();
        array1.add("abc");
        array1.add("abc");
        array1.add("abc");
        array1.add("DEF");
        array1.add("DEF");
        array1.add("DEF");
        noDuplicates(array1);

        System.out.println(array1.toString());


    }


}

