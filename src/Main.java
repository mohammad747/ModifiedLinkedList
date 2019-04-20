public class Main {
    public static void main(String[] args) {
        LinkeList list = new LinkeList();

        list.insert(18);
        list.insert(45);
        list.insert(12);

        list.show();


        list.deleteAt(1);

        list.show();
    }
}
