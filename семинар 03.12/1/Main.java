public class Main {

    public static void main(String[] args) {
        System.out.println(numbers(15));
    }

    public static StringBuilder numbers(int number) {
        StringBuilder str = new StringBuilder();
        if (number > 1) {
            str.append(numbers(number-1));
            str.append(" ");
            str.append(number);
        } else{
            str.append(1);
        }
        return str;

    }
}

