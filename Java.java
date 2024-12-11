import java.util.ArrayList;
import java.util.List;

public class Java {
    private int number = 100;

    public int getNumber() {
        return this.number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    //評価シート、バックエンド、No10のコード
    Java(){
        System.out.println("クラスを設計図とするなら、コンストラクタは規格値");
    }

    public static void main(String[] args) {
        
        //評価シート、バックエンド、No３のコード
        if(new Java().number == 100) {
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
