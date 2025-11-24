class Main {
    public static void main(String[] args) {
        int a[] = {10, 12, 16, 19, 34, 56, 45, 22, 76};
        
        int max = a[0];
        int secondMax = Integer.MIN_VALUE;
        
        for(int i = 1; i< a.length; i++) {
            int var = a[i];
            
            if(var > max) {
                secondMax = max;
                max = var;
            }
            
            else if(var > secondMax && var < max) {
                secondMax = var;
            }
        }
        System.out.println("Second largest element: " + secondMax);
    }
}
