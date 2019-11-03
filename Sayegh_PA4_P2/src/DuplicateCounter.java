import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {
    private Map<String, Integer> wordCounter;

    public DuplicateCounter(){

        wordCounter = new HashMap<String, Integer>();

    }

    public void count(String dataFile){

        Scanner scnr = null;
        try{
            scnr = new Scanner(new File(dataFile));
        }catch (FileNotFoundException error){
            System.out.println(error);
        }
        scnr.useDelimiter("([.,!?:;'\"-]|[0-9]|\\s)+");
        while(scnr.hasNext()){
            String word = scnr.next();
            Integer count = wordCounter.get(word);
            if(count == null){
                count = 1;
            }
            else{
                count = count + 1;
            }
            wordCounter.put(word, count);
        }
        scnr.close();

    }

    public void write(String outputFile){
    try {
        PrintWriter output = new PrintWriter(new File(outputFile));
        for (String S : wordCounter.keySet()) {
            output.println(S + " " + wordCounter.get(S));
        }
        output.close();
    }catch (FileNotFoundException error){
        System.out.println(error);
    }

    }



}
