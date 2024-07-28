public class para {
    
    public static void main(String[] args) {
        
        String mygreet = greet("Abhinav singh");

        System.out.println(mygreet);

    }

     static String greet(String name)
    {

        String mess = "hello" + name;
        return mess;
    }
} 