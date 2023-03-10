package Buoi7_sang_1;

import Bai61.SinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list {
    public static void main(String[] args) {
        //tao mot arraylist luu tru thong tin cac ban sinh vien?
        // chua biet so luong cu the, co the them nhieu
        List<Student> arrayList =new ArrayList<>();
        // them 1 ban sinh vien
        Student s1=new Student(1,"dong");
        arrayList.add(s1);

        Student s2=new Student(2,"dong2");
        arrayList.add(s2);

        Student s3=new Student(6,"dong3");
        arrayList.add(s3);

        Student s4=new Student(4,"dong4");
        arrayList.add(s4);

        System.out.printf("co %d ban sinh vien trong danh sach\n",arrayList.size());
        System.out.println(arrayList);

        //thay doi ten cua student 2
        Student s=arrayList.get(1);
        s.setName("sinh vien2");
        System.out.println(arrayList);

        // thay the phan tu tai vi tri index =1;
        Student s5=new Student(5,"hahaha");
        arrayList.set(1,s5);
        System.out.println(arrayList);

        // xao phan tu trong arrayList
        arrayList.remove(0);
        System.out.println(arrayList);

        // xoa phan tu theo object
        arrayList.remove(s5);
        System.out.println(arrayList);

        // sap xep
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
