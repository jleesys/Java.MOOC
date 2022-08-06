package dictionary;

import java.io.File;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.PrintWriter;

public class SaveableDictionary {

    private FileWriter writer;
    // list of words, for matching prior to writing to file
    // checks using a buffer of words gathered/inputting during a single session
    private Map<String, String> wordMap;
    private String fileName;

    public SaveableDictionary() throws IOException {
        this.wordMap = new HashMap<>();
    }

    public SaveableDictionary(String file) throws IOException {
        this.fileName = file;
        this.wordMap = new HashMap<>();
    }

    public void add(String words, String translation) throws IOException {
        String checker = words.toLowerCase().trim();
        String checker2 = translation.toLowerCase().trim();
        if (checkFile(words)) {
            wordMap.putIfAbsent(checker, checker2);
        }
    }

    public void delete(String word) {
        for (String key : this.wordMap.keySet()) {
            if (key.equals(word)) {
                this.wordMap.remove(key);
                return;
            } else if (this.wordMap.get(key).equals(word)) {
                this.wordMap.remove(key);
                return;
            }
        }
        return;
    }

    public String translate(String word) {
        for (String key : this.wordMap.keySet()) {
            if (key.equals(word)) {
                return this.wordMap.get(key);
            } else if (this.wordMap.get(key).equals(word)) {
                return key;
            }
        }
        return null;
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(this.fileName))) {
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                String[] pieces = row.split(":");
                for (String string : pieces) {
                    string = string.toLowerCase().trim();
                }
                this.wordMap.putIfAbsent(pieces[0],pieces[1]);
                }
            return true;
        } catch (Exception e) {
            System.out.println("error reading file");
        }
        return false;
    }

    public boolean save() {//throws IOException {
        File yourFile = new File(this.fileName);
        try {
            if (!yourFile.isFile()) {//(!yourFile.exists()) {
                yourFile.createNewFile();
            }
            this.writer = new FileWriter(this.fileName, false);
            for (String key : this.wordMap.keySet()) {
                this.writer.write(key + ":" + this.wordMap.get(key) + "\n");
            }
            this.writer.close();
            return true;
        } catch (Exception e) {
            System.out.println("error writing to file");
            return false;
        }
    }

    public boolean checkFile(String input) {
        for (String key : this.wordMap.keySet()) {
            if (key.equals(input) || this.wordMap.get(key).equals(input)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return this.wordMap.toString();
    }
}
