public class Main {
    public static void main(String[] args) {
        int ticket = 3000; // цена билета
        int amount = 20; // за каждые 20 рублей начисление 1 миля
        int miles = ticket / amount; 

        System.out.println("Количество начисленных миль:" + miles);




    }
}