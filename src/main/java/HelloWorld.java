import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {


        System.out.println("Hello World");

        System.out.println("Wpisz wartosc kodu kreskowego.");
        System.out.println("Jesli wpiszesz END, to zakupy zostana zakonczone.");

        Scanner scanner = new Scanner(System.in);

        String input;

        ArrayList<product> lp = new ArrayList<>();

        product p1 = new product("Olowek",1.0,"7801");
        lp.add(p1);
        product p2 = new product("Dlugopis",0.8,"1234");
        lp.add(p2);
        product p3 = new product("Zeszyt",1.3,"9876");
        lp.add(p3);
        product p4 = new product("Linijka",0.75,"5555");
        lp.add(p4);

        ArrayList<product> paragon = new ArrayList<>();

        do{
            input = scanner.nextLine();
            if(!znajdz(lp, input, paragon))
            {
                System.out.println("Produkt nieznaleziony");
            }
            else
            {
                System.out.println("Produkt dodany do paragonu");
            }
        }while(!input.equals("END"));

        double suma = 0;

        System.out.println("Zakupy zakonczone. Oto paragon:");
        for(int i = 0;i<paragon.size();i++)
        {
            System.out.println((i+1)+". "+paragon.get(i).getName()+", "+paragon.get(i).getCost());
            suma+=paragon.get(i).getCost();
        }
        System.out.println("Laczna cena:"+suma);

    }

    public static boolean znajdz(ArrayList <product> p, String input,ArrayList <product> out){
        for(int i = 0;i<p.size();i++)
        {
            if(input.equals(p.get(i).getBarcode())) {
                out.add(p.get(i));
                return true;}
        }
        return false;
    }
}