public class LuasBangunDatar {
    public static int hitungLuasPersegiPanjang(int panjang, int lebar){
       int luas;
       luas = panjang * lebar;
       return luas; 
    }
    public static void tampilkanOutput(String namaObjek, int panjang, int lebar, int luas){
        String str="";
        str=str+"Luas "+namaObjek;
        str=str+" dengan panjang "+panjang;
        str=str+" dan lebar "+lebar;
        str=str+" adalah "+ luas;
        System.out.println(str);
    }
    public static void main (String[] args){
        int panjang1=20;
        int lebar1=4;
        int panjang2=30;
        int lebar2=3;
        int luas=hitungLuasPersegiPanjang(panjang1, lebar1);
        tampilkanOutput("Persegi Panjang 1", panjang1,lebar1,luas);
        luas=hitungLuasPersegiPanjang(panjang2, lebar2);
        tampilkanOutput("Persegi Panjang 2", panjang2,lebar2,luas);
        
    }

}