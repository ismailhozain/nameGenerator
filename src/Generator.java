import java.util.*;
import java.io.*;


public class Generator {
    private static String[] beginning;
    private static String[] middle;
    private static String[] end;

    public Generator() throws Exception {
        beginning = new String[] {"b", "d", "f", "g", "h", "k", "l", "m", "n", "s", "t", "v", "z"};
        middle = new String[] {"abt", "ikir", "mik", "zam", "nair"};
        end = new String[] {"ia", "ios", "idel", "ian", "iri", "i", "o", "ene", "erti", "on", "im", "adel", "ingo", "ica", "us"};
        loadData();
    }
    private void loadData() throws Exception {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("input.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
                System.out.println(records);
            }
        }


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