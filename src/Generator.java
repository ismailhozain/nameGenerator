
public class Generator {
    private static String[] beginning;
    private static String[] middle;
    private static String[] end;

    public Generator() {
        beginning = new String[] {"b", "d", "f", "g", "h", "k", "l", "m", "n", "s", "t", "v", "z"};
        middle = new String[] {"abt", "ikir", "mik", "zam", "nair"};
        end = new String[] {"ia", "ios", "idel", "ian", "iri", "i", "o", "ene", "erti", "on", "im", "adel", "ingo", "ica", "us"};

    }

    public static String generateName() {
        int b = (int) (Math.random() * beginning.length);
        int m = (int) (Math.random() * middle.length);
        int e = (int) (Math.random() * end.length);

        return beginning[b] + middle[m] + end[e];
    }
    public String toString() {
        for(int i =0; i <=50; i++) {
            System.out.println(generateName());
        }
        return "";
    }
}