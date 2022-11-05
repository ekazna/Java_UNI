import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String text = "Ivan Ivanovich Lapkin, an attractively looking young man, and" +
                "Anna Semyonovna Zamblitskaya, a pretty young girl with a turned" +
                "up nose, went down the steep bank of the river and sat on a bench." +
                "The bench stood very close to the water between the thick young" +
                "willows. What a wonderful place! You are sitting here, hiding from" +
                "the whole world, and only fish and spiders, running around the" +
                "water, quick as lightening, can see you." +
                "The young people were armed with fishing rods, nets, tins of" +
                "worms and other fishing tackle. After sitting down they immediately" +
                "started fishing." +
                "“I am glad that we are finally alone,” Lapkin started looking" +
                "around. “I have a lot to tell you, Anna Semyonovna. Quite a lot." +
                "When I saw you for the first time… a fish is biting… I realized then" +
                "my purpose for living, I realized where my idol is, and to whom I" +
                "have to devote my honest, working life. Oh! A large fish is biting." +
                "Seeing you, I loved for the first time and loved passionately! Wait" +
                "to tug your line! Let it bite! Do tell me, my dear, I beg you, could" +
                "I hope for – not for the same from you, no, no, I don’t deserve it." +
                "I can’t even dare dream about it! Could I hope for … Pull! Now!”" +
                "Anna Semyonovna raised her hand with the rod, tugged and" +
                "screamed aloud. A little silver-green fish flashed in the air.";
        text = text.replaceAll("\\p{P}", " ");
        List<String> myList = new ArrayList<String>(Arrays.asList(text.split(" ")));
        HashMap<String, Integer> dictionary = new HashMap<>();
        for (String str : myList) {
            if (dictionary.containsKey(str)){
                dictionary.put(str, dictionary.get(str) + 1);
            } else {
                dictionary.put(str, 1);
            }
        }
        if (dictionary.containsKey("")){
            dictionary.remove("");
        }
        System.out.println(dictionary.toString());




    }
}

