public class Main {
    public static void main(String[] args) {
        /*İki sayı birbirinin kendisi hariç bölenleri 
        toplamına eşitse bu sayılara arkadaş sayılar denir.
        
        Örneğin 220 ve 284 sayıları bir çift arkadaş sayıdır.
        Çünkü 220 sayısının kendisi hariç pozitif bölenleri 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 ve 110’dur.
        Bu sayıların toplamı (1+2+4+5+10+11+20+22+44+55+110) ise 284’e eşittir.
        Aynı şekilde 284 sayısının kendisi hariç pozitif bölenleri 1, 2, 4, 71 ve 142’dir.
        Bu sayıların toplamı ise 220’e eşittir.*/
        int sayi1=221;
        int sayi2=284;
        int sayac1=0;
        int sayac2=0;
        
        for(int i=1;i<sayi1;i++){
            if(sayi1%i==0){
                sayac1=sayac1+i;
            }
        }
        
        for(int j=1;j<sayi2;j++){
            if(sayi2%j==0){
                sayac2=sayac2+j;
            }
        }
        if(sayi1==sayac2 && sayi2==sayac1){
            System.out.println(sayi1+" ve "+sayi2+" sayilari arkadas sayidir.");
        }
        else System.out.println(sayi1+" ve "+sayi2+" sayilari arkadas sayi degildir.");
    }
}
