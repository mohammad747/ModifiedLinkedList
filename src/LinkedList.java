class LinkedList {
    private Node head;

    void isEmpty(LinkedList list){
        if (head==null)
            System.out.println("The list is empty");
        else
        System.out.println("The list is not empty");
    }

    void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head==null){
            head = node;
        }
        else {
            Node n = head;

            while (n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }

    void show(){
        Node node = head;

        while (node.next!=null){

            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println(node.data);
    }


    void deleteAt(int index)
    {
        if(index==0)
        {
            head = head.next;
        }
        else
        {
            Node n = head;
            Node n1 = null;
            for(int i=0;i<index-1;i++)
            {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            //System.out.println("n1 " + n1.data);
            n1 = null;
        }
    }


}
