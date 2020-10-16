public class AList<Item> {
    private Item[] items;
    private int size;
    private double usageFactor;

    public AList(){
        items = (Item[]) new Object[100];
        size = 0;
        usageFactor = size / items.length + 1;

    }

    public void checkFactor(){
        if((items.length > 16) && (usageFactor < 0.25)){
            resizeArr(size * 2);
        }
    }

    public void add(int x){
        int i = 0;
        int j = 0;
        if(size != items.length){
            resizeArr(size * 2);
        }
        Item[] a = (Item[]) new Object[size];

        while(j < size + 1){
            if(items[i] == items[x]){
                a[j] = items[i+1];
                i += 2;
                j++;
            }
            else {
                a[j] = items[i];
                i++;
                j++;
            }
        }
        items = a;
    }

    public void remove(int x) {
        items[x] = null;
        Item[] a = (Item[]) new Object[size - 1];
        int i = 0;
        while (i < size) {
            if (items[i] != null) {
                a[i] = items[i];
                i++;
            }
        }
        items = a;
    }
    public void addLast(Item x){
        if(size == items.length){
            resizeArr(size * 2);
        }

        items[size] = x;
        size += 1;
    }
    public Item getLast(){
        return items[size - 1];
    }

    public Item get(int x){
        return items[x];
    }

    public int size(){
        return size;
    }

    public Item removeLast(){
        Item x = items[size - 1];
        size -= 1;
        items[size] = null;
        return x;
    }

    private void resizeArr(int capacity){
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }
}