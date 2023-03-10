package Bai61;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DanhSachSinhVien dssv=new DanhSachSinhVien();
        int luaChon=0;
        do{

            System.out.println("********************************************* MENU ***********************************************");
            System.out.println("Vui lòng lựa chọn chức  năng ");
            System.out.println("1. Thêm sinh viên vào danh sách \n" +
                    "2. In danh sách sinh viên ra màn hình\n" +
                    "3. Kiểm tra danh sách sinh viên có rỗng hay không\n" +
                    "4. Lây ra so luong sinh viên trong danh sách\n" +
                    "5. Làm rỗng danh sách sinh viên\n" +
                    "6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dưựa trên mã sinh viên\n" +
                    "7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên\n" +
                    "8. Tìm kiếm tất cả các sinh viên dựa trên tên được nhập từ bàn phím\n" +
                    "9. Xuất sinh viên có điểm từ cao đến thấp\n" +
                    "0.Thoát chương trình\n"
                    );
            System.out.print("Mời nhập lựa chọn:");
            luaChon =sc.nextInt();
            sc.nextLine();
            if(luaChon==1)
            {
                System.out.print("Nhập mã sinh viên:");String maSinhVien=sc.nextLine();
                System.out.print("\nNhập họ và tên sinh viên:");String hoTen=sc.nextLine();
                System.out.print("\nNhập năm sinh:");int namSinh=sc.nextInt();
                System.out.print("\nNhập đểm trung bình:");float diemTrungBinh=sc.nextFloat();
                SinhVien sv=new SinhVien(maSinhVien,hoTen,namSinh,diemTrungBinh);
                dssv.themSinhVien(sv);
            } else
            if(luaChon==2)
            {
                dssv.inDanhSachSinhVien();
            } else
            if(luaChon==3)
            {
                if(dssv.kiemTraDanhSachRong()==true)
                    System.out.println("Danh sách sinh viên rỗng");

                else System.out.println("danh sách sinh viên không rỗng va có phần tử.");
            } else
            if(luaChon==4)
            {
                System.out.print("Số lượng sinh viên trong danh sách la:"+dssv.layRaSoluongSinhVienTrongDanhSach()+"\n");

            } else
            if(luaChon==5)
            {
                System.out.println(" Đã làm rỗng danh sách sinh viên");
                dssv.lamRongDanhSachSinhVien();
            } else
                if(luaChon==6)
            {
                System.out.println("nhap ma sinh vien:");String maSinhVien=sc.nextLine();
                SinhVien sv=new SinhVien(maSinhVien);
                System.out.println("kiem tra sinh vien co trong danh sach:"+dssv.kiemTraSinhVienCoTonTaiHayKhong(sv));
            } else
            if(luaChon==7)
            {
                System.out.println("nhap ma sinh vien:");String maSinhVien=sc.nextLine();
                SinhVien sv=new SinhVien(maSinhVien);
                System.out.println("Xoa sinh vien trong danh sach:"+dssv.xoaSV(sv));

            } else
            if(luaChon==8)
            {
                System.out.println("nhap ho va ten:");String hoVaten =sc.nextLine();
                System.out.println("ket qua tim kiem:");
                dssv.timSinhVien(hoVaten);
            } else
            if(luaChon==9)
            {
                dssv.sapXepSinhVienGiamDan();
                dssv.inDanhSachSinhVien();
            }


        }
        while(luaChon!=0);
    }
}
