import java.net.PortUnreachableException;
import java.util.Scanner;
public class RTOCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the city or district : ");
        String name = sc.next();

        switch (name){
            case "Mumbai central"  -> System.out.print("RTO Code is : MH 01 " );
            case "Mumbai west"     -> System.out.print("RTO Code is : MH 02 " );
            case "Mumbai east "    -> System.out.print("RTO Code is : MH 03 " );
            case "Thane"           -> System.out.print("RTO Code is : MH 04 " );
            case "'Kalyan"         -> System.out.print("RTO Code is : MH 05 " );
            case "Raigad "         -> System.out.print("RTO Code is : MH 06 " );
            case "Sindhudurg"      -> System.out.print("RTO Code is : MH 07 " );
            case "Ratnagiri"       -> System.out.print("RTO Code is : MH 08 " );
            case "Kolhapur"        -> System.out.print("RTO Code is : MH 09 " );
            case "Sangli"          -> System.out.print("RTO Code is : MH 10 " );
            case "Satara"          -> System.out.print("RTO Code is : MH 11 " );
            case "Pune"            -> System.out.print("RTO Code is : MH 12 " );
            case "Solapur"         -> System.out.print("RTO Code is : MH 13 " );
            case "Pimpri"          -> System.out.print("RTO Code is : MH 14 " );
            case "Nasik"           -> System.out.print("RTO Code is : MH 15 " );
            case "Ahmednagar"      -> System.out.print("RTO Code is : MH 16 " );
            case "Shrirampur"      -> System.out.print("RTO Code is : MH 17 " );
            case "Dhule"           -> System.out.print("RTO Code is : MH 18 " );
            case "Jalgaon"         -> System.out.print("RTO Code is : MH 19 " );
            case "Aurangabad"      -> System.out.print("RTO Code is : MH 20 " );
            case "Jalna"           -> System.out.print("RTO Code is : MH 21 " );
            case "Parbhani"        -> System.out.print("RTO Code is : MH 22 " );
            case "Beed "           -> System.out.print("RTO Code is : MH 23 " );
            case "Latur"           -> System.out.print("RTO Code is : MH 24 " );
            case "Osmanabad"       -> System.out.print("RTO Code is : MH 25 " );
            case "Nanded"          -> System.out.print("RTO Code is : MH 26 " );
            case "Amravati"        -> System.out.print("RTO Code is : MH 27 " );
            case "Buldhana"        -> System.out.print("RTO Code is : MH 28 " );
            case "Yavatmal"        -> System.out.print("RTO Code is : MH 29 " );
            case "Akola"           -> System.out.print("RTO Code is : MH 30 " );
            case "Nagpur"          -> System.out.print("RTO Code is : MH 31 " );
            case "Wardha"          -> System.out.print("RTO Code is : MH 32 " );
            case "Gadchiroli"      -> System.out.print("RTO Code is : MH 33 " );
            case "Chandrapur"      -> System.out.print("RTO Code is : MH 34 " );
            case "Gondia"          -> System.out.print("RTO Code is : MH 35 " );
            case "Bhandara"        -> System.out.print("RTO Code is : MH 36 " );
            case "Washim"          -> System.out.print("RTO Code is : MH 37 " );
            case "Hingoli"         -> System.out.print("RTO Code is : MH 38 " );
            case "Nandurbar"       -> System.out.print("RTO Code is : MH 39 " );
            case "Nagpur rular"    -> System.out.print("RTO Code is : MH 40 " );
            case "Malegaon"        -> System.out.print("RTO Code is : MH 41 " );
            case "Baramati"        -> System.out.print("RTO Code is : MH 42 " );
            case "Navi mumbai "    -> System.out.print("RTO Code is : MH 43 " );
            case "Ambejogai"       -> System.out.print("RTO Code is : MH 44 " );
            case "Akluj"           -> System.out.print("RTO Code is : MH 45 " );
            case "Panvel"          -> System.out.print("RTO Code is : MH 46 " );
            case "Borivali"        -> System.out.print("RTO Code is : MH 47 " );
            case "Vasai"           -> System.out.print("RTO Code is : MH 48 " );
            case "Nagpur east"     -> System.out.print("RTO Code is : MH 49 " );
            case "Karad"           -> System.out.print("RTO Code is : MH 50 " );
            default                -> System.out.println("Please Enter the Valid Name");
        }
        System.out.println("\nThank you!");


    }
}
