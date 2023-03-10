package Bai61;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach=new ArrayList<SinhVien>();
    }


    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }
    //1 theemsinh viên vào danh sách
    public  void themSinhVien(SinhVien sv)
    {
        this.danhSach.add(sv);
    }
    //2. in danh sách sinh viên ra màn hình.
    public void inDanhSachSinhVien()
    {
        for (SinhVien sinhVien: danhSach) {
            System.out.println(sinhVien);
        }
    }
    //3. Kiểm tra dánh sách sinh viên có rỗng hay không.
    public boolean kiemTraDanhSachRong()
    {
        return this.danhSach.isEmpty();
    }

    //4. lay ra so luong sinh vioen trong danh sach
    public  int layRaSoluongSinhVienTrongDanhSach()
    {
        return  this.danhSach.size();
    }
    //5 lam rong ds sinh vien
    public void lamRongDanhSachSinhVien()
    {
        this.danhSach.removeAll(danhSach);
    }
    // 6. kiem tra sinh vien co ton tai trong danh sach hay khong
    public boolean kiemTraSinhVienCoTonTaiHayKhong(SinhVien sv)
    {
        return this.danhSach.contains(sv);
    }
    // 7 xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien
    public boolean xoaSV(SinhVien sv)
    {
        return this.danhSach.remove(sv);
    }
    //8. tim kiem tat ca sinh vien dua tren ten nhap tu ban phim

    public  void timSinhVien(String ten)
    {
        for (SinhVien sinhVien: danhSach) {
            if(sinhVien.getHoVaten().indexOf(ten)>=0)
            {
                System.out.println(sinhVien);
            }
        }
    }
    //9 xuat ra ds sinh vien co diem tu thap den cao
    public  void sapXepSinhVienGiamDan()
    {
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getDiemTrungBinh()<o2.getDiemTrungBinh())
                    return  1;
                else  if (o1.getDiemTrungBinh()>o2.getDiemTrungBinh())
                    return -1;
                else return 0;
            }
        });
    }
}
