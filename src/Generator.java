import java.util.*;
import java.io.*;


public class Generator {
    private static List <String> beginning;
    private static List <String> middle;
    private static List <String> end;

    public Generator() throws Exception {
        loadData();
    }
    private void loadData() throws Exception {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("input.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));

            }
            beginning = records.get(0);
            middle = records.get(1);
            end = records.get(2);
        }


    }
    public static String generateName() {
        int b = (int) (Math.random() * beginning.size());
        int m = (int) (Math.random() * middle.size());
        int e = (int) (Math.random() * end.size());

        return beginning.get(b) + middle.get(m) + end.get(e);
    }
    public void outputToCSV() throws Exception {
        FileWriter csvWriter = new FileWriter("output.csv");
        for(int i =0; i <=1000; i++) {
            for(int j =0; j < 20; j++) {
                csvWriter.append(generateName() + ",");
            }
            csvWriter.append("\n\n");
        }
        csvWriter.close();
    }
}