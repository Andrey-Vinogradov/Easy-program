public class Main {
    public static void main(String[] args) {
        Vegetables number = new Vegetables();
        Vegetables name = new Vegetables();
        Vegetables words = new Vegetables();

        int r = 15;
        int num = number.randomNumber(r);
        System.out.println(num + " " + name.randomName() + words.lastWords());

    }


    /*   static Vegetables vegetables = new Vegetables();*/
}
