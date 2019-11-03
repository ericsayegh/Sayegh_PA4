public class Application {

    public static void main(String[] args){

        String inputFile = "problem2.txt";
        String outputFile = "unique_word_counts.txt";
        DuplicateCounter ct = new DuplicateCounter();

        ct.count(inputFile);
        ct.write(outputFile);


    }


}
