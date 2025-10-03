class MainClass {
    public static void main(String args[])
    {
        int a[] = {23, 19, 44, 10, 12, 25, 30, 49, 17, 22};
        
        int min = a[0];
        for(int i = 0; i < a.length; i++)
        {
            int var = a[i];
            if(min > var)
                min = var;
        }
        System.out.println(min);
    }
}