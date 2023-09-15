public class HelloWorld 
{
    public static void main(String[] args) 
    {
        String[] stringarray = {"Alpha","Bravo","Charlie","Delta","Echo"};
        for (int i = 0; i < stringarray.length; i++){
            System.out.println(stringarray[i]);
        }
        for (String p:stringarray) {
            System.out.print(p);
        }
        for (int i = 0; i < stringarray.length; i++);  {
            System.out.print(stringarray[i]) ;  
            if (int i < stringarray.length-1) {
                System.out.print("-");
            }
        }
    }
}