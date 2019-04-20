class LinkedList {
    private Node head;

    void isEmpty(LinkedList list) {
        //If we don't have the head node the list is empty
        if (head == null)
            System.out.println("The list is empty");
        else
            System.out.println("The list is not empty");
    }//End of isEmpty

    void insert(int data) {
        //Create a new node
        Node node = new Node();
        node.data = data;
        node.next = null;
        //If we don't have any nodes before
        if (head == null) {
            head = node;
          //We already have a list so we have to add it to the tail of linkedList
        } else {
            Node n = head;
            //Traverse to the last node
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }//End of insert
    //Display the list
    void show() {
        Node node = head;
        //Until the list is finished
        while (node.next != null) {

            System.out.print(node.data + " ");
            //Go next node
            node = node.next;
        }
        //Display the last node which is at the tail of our linkedList
        System.out.println(node.data);
    }//End of show

    //Delete the node at the specific index
    void deleteAt(int index) {
        //Delete the first node
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            //System.out.println("n1 " + n1.data);
            n1 = null;
        }
    }//End of deleteAt


}//End of class
