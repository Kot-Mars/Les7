import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> basket = new ArrayList<>();
        ArrayList<Integer> basket2 = new ArrayList<>();
        List<List<Integer>> pallet = new ArrayList<>();
        basket.add(1);
        basket2.add(3);
        pallet.add(basket);
        pallet.add(basket2);
        System.out.println(pallet);

        String str = "Я знаю Java и C#";
        String[] stringsArray = str.split(" ");

        List<List<String>> pallet2 = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();

        for (int i = 0; i < stringsArray.length; i++) {
            pallet2.add(Collections.singletonList(stringsArray[i]));
        }
        for (int i = 0; i < stringsArray.length; i++) {
            stringArrayList.add(stringsArray[i]);
        }
        System.out.println(pallet2);
        System.out.println(stringArrayList);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        scanner.close();
        System.out.println((num == 0) ? "Исключенние" : (num % 2 == 0) ? "Четное" : "Не четное");

        Customer customer1 = new Customer("+19918172132", "Иванов Иван Иванович");
        Customer customer2 = new Customer("+79999999999", "Ковалёв Мартин Олегович");
        Customer customer3 = new Customer("+79319815471", "Королёв Тимур Евгеньевич");
        Customer customer4 = new Customer("+79544443132", "Щукин Игнатий Валентинович");

        Customer[] customers = {customer1, customer2, customer3, customer4};
        HashMap<Integer, Customer> phoneBook = new HashMap<>();
        for (int i = 0; i < customers.length; i++) {
            phoneBook.put(i, customers[i]);
            System.out.println(phoneBook.get(i));
        }


    }
}
