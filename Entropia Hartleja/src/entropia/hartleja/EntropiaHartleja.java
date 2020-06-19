package entropia.hartleja;

public class EntropiaHartleja {

    public static double log2(double N) { //Obliczanie logarytmu stopnia drugiego
        double wynik = (double) (Math.log(N) / Math.log(2));

        return wynik;
    }

    public static void main(String[] args) {

        String dane = "koeniecwykladu";
        System.out.println("Hasło = " + "'" + dane + "'");
        int n = dane.length();
        System.out.println("Ilość znaków: " + n);
        double entropia;
        entropia = log2(n);
        entropia *= 10;
        entropia = Math.round(entropia);
        entropia /= 10;
        System.out.println("Entropia przed zaokrągleniem: " + log2(n));
        System.out.println("Entropia po zaokrągleniu: " + entropia);
        //Obliczanie ilości informacji
        double Ik = n * entropia;
        Ik *= 10;
        Ik = Math.round(Ik);
        Ik /= 10;
        System.out.println("Ilość informacji = " + Ik);
        System.out.print("Jakość hasła: ");
        if (Ik >= 56) {
            System.out.println("Mocne hasło");
        } else if (Ik < 56 && Ik >= 40) {
            System.out.println("Srednie hasło");
        } else if (Ik < 40) {
            System.out.println("Słabe hasło");
        }
    }

}
