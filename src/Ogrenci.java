import java.util.Arrays;
import java.util.Scanner;
public class Ogrenci {

    public static void main(String[] args) {
        int AnkaraUni = 2, istanbulüni = 2, izmirüni = 2;
        int z = 0;



        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç kişi tercih yapacak:");
        int n = scan.nextInt();

        String[] isim = new String[n];
        String[] isim1 = new String[n];

        int[] puan = new int[n];
        int[] puan1 = new int[n];

        Scanner input = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("İsminizi giriniz:");
            isim[i] = input.nextLine();
            System.out.print(isim[i] + "  " + "Puanınınızı girermisiniz=");
            puan[i] = scan1.nextInt();

        }


        System.arraycopy(puan, 0, puan1, 0, n);
        Arrays.sort(puan);


        System.out.println(Arrays.toString(isim));
        System.out.println(Arrays.toString(puan1));
        System.out.println("Puanların Sıralanmıs hali :" + Arrays.toString(puan));


        for (int a = 0; a < n; a++) {

            int index = Arrays.binarySearch(puan, puan1[a]);
            // System.out.println(index);
            isim1[index] = isim[a];
        }
        System.out.println("İsimlerin sıralanmış hali :" + Arrays.toString(isim1));


        Scanner input1 = new Scanner(System.in);
        do {
        for (int k = 0; k < n; k++) {
            System.out.println(isim1[k] + " " + "tercihinizi giriniz");
            System.out.println("1-Ankara üni"+" "+"kalan kontenjan"+AnkaraUni);
            System.out.println("2-İstanbul üni"+" "+"kalan kontenjan"+istanbulüni);
            System.out.println("3-İzmir üni"+" "+"kalan kontenjan"+izmirüni);
            System.out.println("4-tercih yapmak istemiyorum");



                 z = input1.nextInt();
                switch (z) {
                    case 1:
                        if (AnkaraUni > 0) {
                            System.out.println("Sayın" + isim1[k] + "Ankara üniyi kazandınız");
                            AnkaraUni--;

                        } else System.out.println("tekrar tercih yapınız");
                        break;
                    case 2:
                        if (istanbulüni > 0) {
                            System.out.println("Sayın" + isim1[k] + "İstanbul üniyi kazandınız");
                            istanbulüni--;
                        } else System.out.println("tekrar tercih yapınız");
                        break;
                    case 3:
                        if (izmirüni > 0) {
                            System.out.println("Sayın" + isim1[k] + "İzmir üniyi kazandınız");
                            izmirüni--;


                        } else System.out.println("tekrar tercih yapınız");
                        break;


                }
            }


            }
        while (z !=4);
        System.out.println("seneye görüşürüz");
        }
    }













