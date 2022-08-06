package dictionary;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SaveableDictionary dictionary = new SaveableDictionary("wordle.txt");
//        SaveableDictionary dictionary = new SaveableDictionary("words.txt");

//        boolean loaded = dictionary.load();
//        if (loaded) {
//            System.out.println("loaded successfully");
//        }
        dictionary.load();

//        dictionary.delete("below");
        dictionary.add("tieokone","computer");
        dictionary.delete("below");

        // use the dictionary

//        dictionary.add("ack","syn");
//        dictionary.add("boof","pack");
//        dictionary.add("pack","boof");

        System.out.println(dictionary);
//        boolean saved = dictionary.save();
//        if (saved) {
//            System.out.println("saved successfully");
//        }
        dictionary.save();
        System.out.println(dictionary.translate(("tieokone")));
    }
}
