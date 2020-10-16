public class  LinkedListDeque<T>{

    private class IntNode {
        public T first;
        public IntNode next;
        public IntNode prev;

        public IntNode (T f, IntNode n){
            first = f;
            next = n;

        }
    }

    public IntNode sentinel;
    public int size;

    public LinkedListDeque(){
        sentinel = new IntNode(null, null); //change
        size = 0;
    }

    public  LinkedListDeque(T f){ //change
        sentinel = new IntNode(f, null);

        sentinel.next = new IntNode(f, sentinel.next);

        size += 1;
    }

    public void addFirst(T item) {
        if(sentinel.first == null){
            sentinel.first = item;
        }
        size += 1;
        sentinel.next = new IntNode(item, sentinel.next);
        sentinel.next.prev = sentinel;
    }
    public void addLast(T item){
        if(sentinel.first == null){
            sentinel.first = item;
        }
        int i = 1;
        IntNode p = sentinel.next;
        while(i < size){
            i++;
            p = p.next;
        }
        p.next = new IntNode(item, sentinel.next);
        sentinel.prev = p.next;
        size += 1;
    }

    public boolean isEmpty(){
        if(sentinel.next == null){
            return true;
        }
        return false;
    }

    public int size(){
        return size;
    }

    public void printDeque() {
        int i = 1;
        IntNode p = sentinel.next;
        while (i < size) {
            System.out.print(p.first);
            p = p.next;
            i += 1;
        }
    }


    public T removeFirst(){
        if(sentinel.next.equals(sentinel.prev)){
            return null;
        }
        IntNode p = sentinel.next;
        sentinel.next = sentinel.next.next;
        return p.first;

    }

    public T removeLast(){
        IntNode p = sentinel.prev;
        sentinel.prev = sentinel.prev.prev;
        sentinel.prev.next = sentinel.next;
        return p.first;
    }

    public T get(int index){
        index += 1;
        IntNode p = sentinel.next;
        while (index != size){
            p = p.next;
            index +=1;
        }
        return p.first;
    }

}