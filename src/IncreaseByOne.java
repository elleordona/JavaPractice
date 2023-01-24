public class IncreaseByOne {
    // methods
    public static void printAndUpdate(int number) {
        System.out.println(number++);
    }

    public static void updateAndPrint(int number) {
        System.out.println(++number);
    }

    public static void main(String[] args) {
        IncreaseByOne.printAndUpdate(9); // 9
        IncreaseByOne.updateAndPrint(9); // 10
    }
}
