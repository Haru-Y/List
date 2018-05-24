public class List {
    private ListElement head;
    private ListElement tail;

    public void add(int data) {
        ListElement a = new ListElement();
        a.data = data;
        if (tail == null) {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
    }
    pu

    public void del(int data) {
        if (head == null)
            return;
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        } else {
            ListElement e = head;
            while (e.next != null) {
                if (e.next.data == data){
                    if (tail ==e.next) {
                        tail = e;
                    }
                    e.next=e.next.next;
                    return;
                }
                e = e.next;
            }
        }
    }

    public void print() {
        ListElement t = head;
        while (t != null) {
            System.out.println(t.data + " ");
            t = t.next;
        }
    }
}
