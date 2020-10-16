class Sort{
    public static void sort(String[] x){
        sort(x, 0);

    }

    private static void sort(String[] x, int start){
        if(start == x.length){
            return;
        }
        int smallestindex = findSmallest(x, start);
        swap(x, start, smallestindex);
        sort(x, start + 1);
    }

    public static void swap(String[] x, int a, int b){
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    public static int findSmallest(String[] x, int start){
        int smallestindex = start;
        for(int i = start; i < x.length; i++){
            if(x[i].length() < x[smallestindex].length()){
                smallestindex = i;
            }
        }
        return smallestindex;
    }
}