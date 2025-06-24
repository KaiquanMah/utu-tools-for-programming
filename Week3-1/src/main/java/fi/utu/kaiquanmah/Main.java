package fi.utu.kaiquanmah;

/**
 * Hello world!
 */


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        //base
        System.out.println("Hello World!");

        /////////////////////////////////////////////////////////////////
        // practice for week 3 https://gitlab.utu.fi/tools-for-programming/week-3/-/blob/main/dependencies.md?ref_type=heads
        /////////////////////////////////////////////////////////////////
        Person p = new Person("Eric",18);
    
        //create a Json (Google Json) parser
        Gson g = new GsonBuilder().setPrettyPrinting().create();
    
        //convert the object to a string
        String s = g.toJson(p);
    

        System.out.println(s);
    
        // Equivalent Json-formatted text
        String person = "{\"name\":\"Eric\",\"age\":18}";
    
        // convert the text to a Person object.
        Person x = g.fromJson(person, Person.class);
    
        System.out.println(x);
        /////////////////////////////////////////////////////////////////





    }
}
