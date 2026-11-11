public class arrayLearning {
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        float sumNilai=0;
        float avgNilai=0;
        System.out.println("Masukkan ukuran array");
        int size = scanner.nextInt();
        int[] num = new int[size];

        System.out.println("Masukkan angka sebanyak " + size + " kali");
        for (int i=0; i<num.length; i++){
            num[i] = scanner.nextInt();
        }

        for (int i=0;i<num.length; i++){
            sumNilai = sumNilai + num[i];
        }
        avgNilai = sumNilai / size;
        System.out.println("Jumlah seluruh nilai elemen array: "+sumNilai);
        System.out.println("Rata-rata nilai elemen dalam array: " +avgNilai);
        System.out.print("Elemen-elemen array: ");
        for (int i=0; i<num.length;i++){
            int data=num[i];
            System.out.print(data);
        }
        scanner.close();
    }
}
  