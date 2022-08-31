public class Main {
    //    public static void main(String[] args) {
    //        Vegetable number = new Vegetable();
    //        Vegetable name = new Vegetable();
    //        Vegetable words = new Vegetable();
    //
    //        System.out.print(number.getRandomNumber(15) + " " + name.randomName() + words.lastWords());
    //        System.out.println();
    //        System.out.print(number.getRandomNumber(15) + " " + name.randomName() + words.lastWords());
    //        System.out.println();
    //        System.out.print(number.getRandomNumber(15) + " " + name.randomName() + words.lastWords());
    //
    //    }

    public static void main(String[] args) {
        Vegetable vegetable = new Vegetable();

        for (int i = 0; i < 20; i++) {
            vegetable.getLastWords(vegetable.getRandomName(vegetable.getRandomNumber(15)));
        }
    }
}
