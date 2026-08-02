class Main {
    public static void main(String[] args) {
         int[] arr = {1, 4, 3, 2, 6, 5};
        double sum = 0;
        for(int i:arr) sum+=i;
        System.out.printf("%.2f",(sum/arr.length));
    }
}
