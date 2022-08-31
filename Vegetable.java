import java.util.Random;

public class Vegetable {

    public int getRandomNumber(int r) {
        Random rnd = new Random();
        int num = rnd.nextInt(r) + 1;
        return num;
    }

    public String getRandomName(int num) {
        String[] arr = new String[]{"огур", "помидор", "капуст", "морков", "огур", "капуст", "огур", "морков"};

        int i = new Random().nextInt(arr.length);
        String veg = arr[i];

        return num + " " + veg;
    }

    public void getLastWords(String randomName) {
        String[] s = randomName.split(" ");
        String veg = s[1];
        int num = Integer.valueOf(s[0]);
        String result = "";
        String str = "огур";
        if (veg.equals(str) && num == 1) {
            result = "ец есть в магазине! ";
        }
        if (veg.equals(str) && (num == 2 || num == 3 || num == 4)) {
            result = "ца есть в магазине! ";
        }
        if (veg.equals(str) && num >= 5) {
            result = "цов есть в магазине! ";
        }
        str = "помидор";
        if (veg.equals(str) && num == 1) {
            result = " есть в магазине! ";
        }
        if (veg.equals(str) && (num == 2 || num == 3 || num == 4)) {
            result = "ы есть в магазине! ";
        }
        if (veg.equals(str) && num >= 5) {
            result = "ов есть в магазине! ";
        }
        str = "капуст";
        if ((veg.equals(str)) && (num == 1)) {
            result = "а есть в магазине! ";
        }
        if ((veg.equals(str)) && (num == 2 || num == 3 || num == 4)) {
            result = "ы есть в магазине! ";
        }
        if ((veg.equals(str)) && (num >= 5)) {
            result = " есть в магазине! ";
        }
        str = "морков";
        if ((veg.equals(str)) && (num == 1)) {
            result = "ь есть в магазине! ";
        }
        if ((veg.equals(str)) && (num == 2 || num == 3 || num == 4)) {
            result = "и есть в магазине! ";
        }
        if ((veg.equals(str)) && (num >= 5)) {
            result = "ей есть в магазине! ";
        }
        System.out.println(randomName + result);
    }
}