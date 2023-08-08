import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

       List<String> name= Arrays.asList("APPLE","BANANA","CHERRY");
        List<Integer> ASList= Arrays.asList(3,4,3,7,9,8,4);
        ASList.sort(Comparator.naturalOrder());
        System.out.println("after sorting"+ASList);

        name.stream().map(s->s.substring(0).charAt(0)=='A').forEach(t-> System.out.println(t));
        PrintNumber p= n-> System.out.println("The square of the number is "+n*n);
        p.print(5);

        List<String> LName= Arrays.asList("watch","bike","clock");
        LName.stream().map(s->s.toUpperCase().toString()).forEach((t-> System.out.println("\n"+t)));


        List<String> LongString= Arrays.asList("aaaaa","bb","fffffffdddd");
        System.out.println(LongString.stream().max(Comparator.comparingInt(String::length)));
    }

    }

    interface PrintNumber
    {
        public void print(int num);
    }
