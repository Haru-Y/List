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
    public void srch(int data) {
        ListElement b = new ListElement();
        b.data = data;
        if (head == null)
            System.out.println("Элемент " + data + " не найден");
        if ((head == tail) & (head == b))
            System.out.println("Элемент " + data + " найден");
        if ((head == tail) & (head != b))
            System.out.println("Элемент " + data + " не найден");
        else {
            ListElement e = head;
            while (e != null) {
                if (e.data == data) {
                    System.out.println("Элемент " + data + " найден");
                    return;
                }

                e = e.next;
            }
            System.out.println("Элемент " + data + " не найден");
        }
    }

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
