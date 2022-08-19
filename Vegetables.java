import java.util.Random;
public class Vegetables {
    static int num;  //num - число (количество) овощей
    static String n; //n - название офоща из массива

    //  public String randomName;

    public int  randomNumber (int r){
        Random rnd = new Random();
        num = rnd.nextInt(r) + 1;
        return num;
    }

    public String randomName () {
        String[] arr = new String[]{"огур","помидор", "капуст", "морков", "огур", "капуст", "огур", "морков"};
        //String[] arr = new String[]{"огур","помидор", "капуст", "морков", "редис", "горох", "свекла", "баклажан"};
        int i = randomNumber(arr.length);
        n = arr[i];
        return n;
    }
    public String lastWords () {
        String w = null;
        String str = "огур";
        if (n.equals(str) && num == 1) {w= "ец есть в магазине! ";}
        if (n.equals(str) && (num == 2 || num == 3 || num == 4)) {w= "ца есть в магазине! ";}
        if (n.equals(str) && num >= 5) {w= "цов есть в магазине! ";}
        str = "помидор";
        if (n.equals(str) && num == 1) {w= " есть в магазине! ";}
        if (n.equals(str) && (num == 2 || num == 3 || num == 4)) {w= "ы есть в магазине! ";}
        if (n.equals(str) && num >= 5) {w= "ов есть в магазине! ";}
        str = "капуст";
        if ((n.equals(str)) && (num == 1)) {w= "а есть в магазине! ";}
        if ((n.equals(str)) && (num == 2 || num == 3 || num == 4)) {w= "ы есть в магазине! ";}
        if ((n.equals(str)) && (num >= 5)) {w= " есть в магазине! ";}
        str = "морков";
        if ((n.equals(str)) && (num == 1)) {w= "ь есть в магазине! ";}
        if ((n.equals(str)) && (num == 2 || num == 3 || num == 4)) {w= "и есть в магазине! ";}
        if ((n.equals(str)) && (num >= 5)) {w= "ей есть в магазине! ";}
        //num = 0;
        return w;
    }
}