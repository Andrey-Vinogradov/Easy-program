import java.util.Random;
public class Vegetables {
    public static int num; //объявление глобальной переменной, доступной всему приложению
    public static String n;//объявление глобальной переменной,

    //  public String randomName;

    public static int  randomNumber (int r){
        Random rnd = new Random();
        int x = rnd.nextInt(r) + 1;
        return x;
    }

    public static String randomName () {
        String[] arr = new String[]{"огур","огур", "огур", "огур", "огур", "огур", "огур", "огур"};
        //String[] arr = new String[]{"огур","помидор", "капуст", "морковь", "редис", "горох", "свекла", "баклажан"};
        int i = randomNumber(arr.length);
        n=arr[i];
        return n;

    }
    public static String lastWords () {
        String w = null;
        String str = "огур";
        if (num == 1 && n.equals(str))
            w = "ец есть в магазине!";
        if ((num == 2 || num == 3 || num == 4) && n.equals(str))
            w = "ца есть в магазине!";
        if (num >= 5 && n.equals(str))
            w = "цов есть в магазине!";

        return w;
    }
}