package Buoi7_sang_1;

import java.util.ArrayList;
import java.util.Collection;

public class main {
    public static void main(String[] args) {
        // collection
        Collection<String > stringCollection=new ArrayList<>();
        // them mot string
        stringCollection.add("doan dong");
        stringCollection.add("xin chao");
        //in ra collection
        System.out.println(stringCollection);
        //thay doimot gia tri phan tu thepo index

        stringCollection.remove("xin chao");
        System.out.println(stringCollection);
        // lay ra kich thuoc cua collection
        System.out.println(stringCollection.size());


    }
}
