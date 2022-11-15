package podstawy;

public class StringiDemo {
    public static void main(String[] args) {
        String name = "Eustazy";

        int dlugosc;
        dlugosc = name.length();

        char inicjal = name.charAt(4);

        String male, duze;

        male = name.toLowerCase();

        duze = name.toUpperCase();

        System.out.println(dlugosc +" " + inicjal +", " + male + ", " +
                duze);

    }
}
