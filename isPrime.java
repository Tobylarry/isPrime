public class isPrime {

    public static void main(String[] args) {
        issPrime(35);
    }

    public static void issPrime(int number){
           int x = (((number*2)+number)+1);
           if(x%2 != 0){
               System.out.println("It is prime");
           }else{
               System.out.println("It is not prime!!!!");
           }
    }
}
