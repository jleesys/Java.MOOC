// defunct class that combined the writing to file and adding functions together.
// idk if i need this or not. keeping just in case.

//package dictionary;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Locale;
//import java.util.Scanner;
//import java.nio.file.Paths;
//import java.io.PrintWriter;
//
//public class SaveableDictionary {
//
//    FileWriter writer;
//     list of words, for matching prior to writing to file
//     checks using a buffer of words gathered/inputting during a single session
//    private List<String> list;
//
//    public SaveableDictionary() throws IOException{
//        this.writer = new PrintWriter("words.txt");
//        this.writer = new FileWriter("words.txt",true);
//        this.list = new ArrayList();
//    }
//
//
//    public void add(String words, String translation) throws IOException {
//        String checker = words.toLowerCase().trim();
//         returns to main method if the entered word has already been entered this session
//        if (this.list.contains(checker)) {
//            System.out.println("Word already entered this session. Returning");
//            return;
//        }
//        try {
//             IF and only if the word isnt present in the file, write the word and translation to the file
//             then add the word to the session list for verification later on. This is mostly because the file
//             wont have anything in it until the end of the program .close() method
//            if (checkFile(checker)) {
//                writer.write(words + "," + translation + "\n");
//                this.list.add(checker);
//            }
//        } catch (Exception e) {
//            System.out.println(e.getStackTrace());
//        }
//    }
//
//    public String translate(String word) {
//        try (Scanner scanner = new Scanner(Paths.get("words.txt"))) {
//            while (scanner.hasNextLine()) {
//                String row = scanner.nextLine();
//                String[] pieces = row.split(",");
//                if (pieces[0].equals(word)) {
//                    return pieces[1];
//                }
//                if (pieces[1].equals(word)) {
//                    return pieces[0];
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("Error reading file");
//        }
//        return null;
//    }
//
//    public boolean checkFile(String input) {
//        try (Scanner scanner = new Scanner(Paths.get("words.txt"))) {
//            while (scanner.hasNextLine()) {
//                String row = scanner.nextLine();
//                String[] pieces = row.split(",");
//               System.out.println("The array split of file line: " + pieces[0] + " " + pieces[1]);
//                if (pieces[0].equals(input)) {
//                  System.out.println(pieces[0] + " is equal to input " + input + "?\n" + pieces[0].equals(input));
//                  System.out.println("Word is already in the file. Returning.");
//                    return false;
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("Error reading file");
//        }
//        return true;
//    }
//
//}
//