import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {

        //ArrayList<String> arraylist = new ArrayList<String>();  //  1

        /* ArrayList üzerine CTRL basılı iken tıkladığımızda implement ve extends edilme yollarından yola çıkarak, her bir
           classın içerisine CTRL ile girerek sonunda Iterable interface'ine ulaşıyoruz. Bu şekilde interfacelerin hiyerarşisini
           gözlemleyebiliyoruz.
           Bu hiyerarşi şu şekilde;

           ArrayList.java < List.java < Collection.java < Iterable.java

          */  //  2

        // Şimdi üst satırlardaki ArrayList'i onu kapsayan List.javadan obje olarak türetmeyi deneyelim.  //  3

        List<String> list = new ArrayList<String>();  //  4

        //ArrayList'e Eleman Ekleme  //  5
        list.add("Java");
        list.add("Pyton");
        list.add("C++");
        //ArrayListteki Elemana Erişme  //  6
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        //System.out.println(list.get(4));  //  4. indeks olmadığı için java IndexOutOfBoundsException hatası verdi.  //  7

        // Listemizi ilk olarak for döngüsü ile bastırıyoruz.  //  8
        System.out.println("************************************************");
        for (int i = 0 ; i < list.size() ; i++ ) {

            System.out.println(list.get(i));

        }
        System.out.println("************************************************");

        // Şimdi de foreach döngüsü ile daha kolay bir şekilde bastıralım.  //  9
        for(String s : list ) {

            System.out.println(s);

        }
        System.out.println("************************************************");

        // Şimdi de list içerisindeki bir indeksi silmeyi hatırlayalım.  //  10

        list.remove(1);  //  11

        // Ve indeksi sildikten sonra tekrar ekrana listenin yeni halini yazdıralım  //  12


        for(String s : list ) {  //  13

            System.out.println(s);

        }
        System.out.println("************************************************");




    }

}
