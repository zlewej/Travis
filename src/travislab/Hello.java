/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travislab;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author JuliusGarma
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        // Lists
        List<String> str = new ArrayList();
        List<Integer> num = new ArrayList();
        
        // String Predicate
        Predicate<String> v = i -> (i == "Bacon");
        Predicate<String> v1 = i -> (i == "LOML");
        Predicate<String> v2 = i -> (i == "Messi");
        
        // Integer Predicate
        Predicate<Integer> n = i -> (i == 0);
        Predicate<Integer> n1 = i -> (i == 7);
        Predicate<Integer> n2 = i -> (i == 24);
        
        // elements added to the String List
        str.add("Bacon");
        str.add("Lettuce");
        str.add("Cheese");
        str.add("LOML");
        
         // elements added to list
        for(int i = 0; i< 10; i++)
        {
            num.add(i);
        }
        
        // initializing String linearSearch Function 
        int x = linearSearch(str, v);
        int y = linearSearch(str, v1);
        int z = linearSearch(str, v2);
        
        // initializing integer linearSearch Function 
        int a = linearSearch(num, n);
        int b = linearSearch(num, n1);
        int c = linearSearch(num, n2);
        
        System.out.println("Bacon = " + x + " LOML = " + y + " Messi = " + z);
        System.out.println("Index 0 = " + a + " Index 7 = " + b + " Index 24 = " + c);
        
    }
    
    public static <T> int linearSearch(List<T> list, Predicate<T> check)
    {
        
        for(int i = 0; i < list.size(); i++)
        {
            if(check.test(list.get(i)))
                return i;
        }
        return -1;
    }
    
}
