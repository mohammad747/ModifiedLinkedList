public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.isEmpty(list);

        list.insert(18);
        list.insert(45);
        list.insert(12);

        list.isEmpty(list);

        list.show();


        list.deleteAt(1);

        list.show();
    }
}
