package ru.kpfu.itis.textsimilarity;

import java.util.*;

public class CosTextAnalyzer implements TextAnalyzer{
    @Override
    public double analyze(TextProvider te1, TextProvider te2) {
        List<String> list1 = tokenize(te1.getText());
        List<String> list2 = tokenize(te1.getText());
        HashSet<String> set = new HashSet<>();
        set.addAll(list1);
        set.addAll(list2);
        return cosineSimilarity(list1, list2, set);
    }

    private List<String> tokenize(String text) {
        text = text.replace(",", "");
        String[] words = text.split(" ");
        List<String> uniqueWords = new ArrayList<>();
        for (String word : words) {
            word = word.toLowerCase();
            if (!uniqueWords.contains(word))
                uniqueWords.add(word);
        }
        return uniqueWords;
    }

    private double cosineSimilarity(List<String> l1, List<String> l2, HashSet<String> set){
        HashMap<String,Integer> mapOne = new HashMap<>();
        HashMap<String,Integer> mapTwo = new HashMap<>();
        for (String str:l1){
            if (set.contains(str)){
                if (mapOne.containsKey(str)){
                    mapOne.put(str, (mapOne.get(str) + 1));
                } else {
                    mapOne.put(str, 1);
                }
            }
        }

        for (String str:l2){
            if (set.contains(str)){
                if (mapTwo.containsKey(str)){
                    mapTwo.put(str, (mapOne.get(str) + 1));
                } else {
                    mapTwo.put(str, 1);
                }
            }
        }

        ArrayList<Integer> vector1 = new ArrayList<>();
        for (Map.Entry<String, Integer> value: mapOne.entrySet()){
            vector1.add(value.getValue());
        }
        ArrayList<Integer> vector2 = new ArrayList<>();
        for (Map.Entry<String, Integer> value: mapTwo.entrySet()){
            vector2.add(value.getValue());
        }

        if (vector1.size() > vector2.size()) {
            while (vector1.size() > vector2.size()){
                vector2.add(0);
            }
        } else {
            while (vector1.size() < vector2.size()){
                vector1.add(0);
            }
        }

        double numerator = 0.0;
        double Asum = 0.0;
        double Bsum = 0.0;

        for (int i = 0; i < vector1.size(); i++) {
            for (int j = 0; j < vector2.size(); j++) {
                numerator += vector1.get(i) * vector2.get(j);
            }
            Asum += Math.pow(vector1.get(i),2);
            Bsum += Math.pow(vector2.get(i),2);
        }

        return numerator/(Math.sqrt(Asum) * Math.sqrt(Bsum));
    }
}
