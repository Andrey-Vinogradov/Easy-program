public class Main {
    public static void main(String[] args) {
        Vegetables number = new Vegetables();
        Vegetables name = new Vegetables();
        Vegetables words = new Vegetables();

        System.out.print(number.randomNumber(15) + " " + name.randomName() + words.lastWords());
        System.out.println();
        System.out.print(number.randomNumber(15) + " " + name.randomName() + words.lastWords());
        System.out.println();
        System.out.print(number.randomNumber(15) + " " + name.randomName() + words.lastWords());

    }
}
