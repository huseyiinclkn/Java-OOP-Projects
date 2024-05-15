import java.util.*;

public class Main {

    public static void main(String[] args) {

        Generic<Integer> generic = new Generic<>();
        generic.addList(20000);
        generic.addList(30000);
        generic.addList(40000);
        generic.addList(50000);
        generic.addList(60000);

        Generic<String> generic2 = new Generic<>();
        generic2.addList("hello");
        generic2.addList("world");
        generic2.addList("Hüseyin");
        generic2.addList("Hasan");

        generic.getList().forEach(gez->System.out.println(gez));
        generic2.getList().forEach(gez->System.out.println(gez));


    }
    }