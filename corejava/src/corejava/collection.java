package corejava;

import java.util.ArrayList;

public class collection {
      public static void main(String[] args) {
            ArrayList<String> name = new ArrayList<String>();
            name.add("pranit");
            name.add("pratik");
            name.add("shubham");
            name.add("hritik");
            System.out.println(name);
            name.add("yash");
            System.out.println(name);
            name.add(2,"niket");
            System.out.println(name);
            name.set(0, "onkar");
            System.out.println(name);
            System.out.println(name.get(2));
            name.clear();
            System.out.println(name);
}
}
