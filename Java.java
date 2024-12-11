import java.util.ArrayList;
import java.util.List;

public class Java {
    public static int number = 100;

    public static void main(String[] args) {
        
        //評価シート、バックエンド、No３のコード
        if(number == 100) {
            System.out.println("100");
        }

        //評価シート、バックエンド、No4のコード
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //評価シート、バックエンド、No5のコード
        List<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("cat");
        animals.remove(0);
        System.out.println(animals);
    }

    //評価シート、バックエンド、No6のコード
    public static void hello() {
        System.out.println("hello");
    }
}
