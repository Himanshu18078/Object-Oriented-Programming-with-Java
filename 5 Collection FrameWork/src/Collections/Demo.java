package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
    static void main() {
        Collection <Integer>c = new ArrayList<>();
        //add() -> to add element in the collection
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        //size() -> to get the size of the collection
        System.out.printf("Size of the collection is : %d \n",c.size());

        //contains() ->to check weather an element exists or not
        System.out.printf("4 in the collection : %s\n",c.contains(4));
        System.out.printf("5 in the collection : %s\n",c.contains(5));

        //toArray() -> object (this give the array of object of element we have in the collection)
        System.out.println("toArray() of the object");
        Object[] objects = c.toArray();
        for(Object obj : objects){
            System.out.print(obj + " ");
        }
        System.out.println();
        //toArray() -> object (this give the array of element of our type we have in the collection)
        Integer[] arr = c.toArray(new Integer[0]);
        for(Integer ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
