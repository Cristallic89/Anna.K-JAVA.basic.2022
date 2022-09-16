package week7;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    public void add(String word, String translation){
        this.dictionary.put(word, translation);
    }

    public String translate(String word){
        if(this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        }
        return null;
    }

    public int amountOfWords(){
        return this.dictionary.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> transList = new ArrayList<String>();
        for (String key: this.dictionary.keySet()) {
            String value = this.dictionary.get(key);
            String pair = key + " = " + value;
            transList.add(pair);
        }
        return transList;
    }
}