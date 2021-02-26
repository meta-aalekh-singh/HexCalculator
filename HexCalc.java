import java.util.*;
public class HexCalc{
    public static void hexToDecimal(String hex){
        System.out.println("\nThe Decimal representation is : " + Integer.parseInt(hex,16));
    }
    public static void decimalToHex(int dec){
        System.out.println("\nThe Hexadecimal representation is : " + Integer.toHexString(dec));
    }
    public static void add(String firstHex , String secondHex){
        int firstDec=Integer.parseInt(firstHex,16);
        int secondDec=Integer.parseInt(secondHex,16);
        int result = firstDec+secondDec;
        String hexResult=Integer.toHexString(result);
        System.out.println("\nThe addition is : " + hexResult);
    }
    public static void subtract(String firstHex , String secondHex){
        int firstDec=Integer.parseInt(firstHex,16);
        int secondDec=Integer.parseInt(secondHex,16);
        int result = firstDec-secondDec;
        String hexResult=Integer.toHexString(result);
        System.out.println("\nThe subtraction is : " + hexResult);
    }
    public static void multiply(String firstHex , String secondHex){
        int firstDec=Integer.parseInt(firstHex,16);
        int secondDec=Integer.parseInt(secondHex,16);
        int result = firstDec*secondDec;
        String hexResult=Integer.toHexString(result);
        System.out.println("\nThe multiplication is : " + hexResult);
    }
    public static void divide(String firstHex , String secondHex){
        int firstDec=Integer.parseInt(firstHex,16);
        int secondDec=Integer.parseInt(secondHex,16);
        int result = firstDec/secondDec;
        String hexResult=Integer.toHexString(result);
        System.out.println("\nThe division is : " + hexResult);
    }
    public static void forEqual(String firstHex , String secondHex){
        int firstDec=Integer.parseInt(firstHex,16);
        int secondDec=Integer.parseInt(secondHex,16);
        if(firstDec==secondDec){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
    public static void forGreater(String firstHex , String secondHex){
        int firstDec=Integer.parseInt(firstHex,16);
        int secondDec=Integer.parseInt(secondHex,16);
        if(firstDec>secondDec){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
    public static void forSmall(String firstHex , String secondHex){
        int firstDec=Integer.parseInt(firstHex,16);
        int secondDec=Integer.parseInt(secondHex,16);
        if(firstDec<secondDec){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
	public static void main(String[] args) {
	    	int flag=1;
	    	while(flag==1){
	    	    int choice,dec;
	    	    String firstHex,secondHex;
	    	    Scanner sc = new Scanner(System.in);
	    	    System.out.println("1. addition");
	    	    System.out.println("2. subtraction");
	    	    System.out.println("3. multiplication");
	    	    System.out.println("4. division");
	    	    System.out.println("5. hex to decimal");
	    	    System.out.println("6. decimal to hex");
	    	    System.out.println("7. to eqaul");
	    	    System.out.println("8. for greator");
	    	    System.out.println("9. for smaller");
	    	    System.out.println("10. Exitt");
	    	    choice = sc.nextInt();
	    	    switch(choice){
	    	        case 1 :    System.out.println("\nEnter a hex : ");
	    	                    firstHex=sc.next();
	    	                    System.out.println("\nEnter a hex : ");
	    	                    secondHex=sc.next();
	    	                    add(firstHex,secondHex);
	    	                    break;
	    	        case 2 :    System.out.println("\nEnter a hex : ");
	    	                    firstHex=sc.next();
	    	                    System.out.println("\nEnter a hex : ");
	    	                    secondHex=sc.next();
	    	                    subtract(firstHex,secondHex);
	    	                    break;
	    	        case 3 :    System.out.println("\nEnter a hex : ");
	    	                    firstHex=sc.next();
	    	                    System.out.println("\nEnter a hex : ");
	    	                    secondHex=sc.next();
	    	                    multiply(firstHex,secondHex);
	    	                    break;
	    	        case 4 :    System.out.println("\nEnter a hex : ");
	    	                    firstHex=sc.next();
	    	                    System.out.println("\nEnter a hex : ");
	    	                    secondHex=sc.next();
	    	                    divide(firstHex,secondHex);
	    	                    break;
	    	        case 5 :    System.out.println("\nEnter a hex : ");
	    	                    firstHex=sc.next();
	    	                    hexToDecimal(firstHex);
	    	                    break;
	    	        case 6 :    System.out.println("\nEnter a dec : ");
	    	                    dec=sc.nextInt();
	    	                    decimalToHex(dec);
	    	                    break;
	    	        case 7 :    System.out.println("\nEnter a hex : ");
	    	                    firstHex=sc.next();
	    	                    System.out.println("\nEnter a hex : ");
	    	                    secondHex=sc.next();
	    	                    forEqual(firstHex,secondHex);
	    	                    break;
	    	        case 8 :    System.out.println("\nEnter a hex : ");
	    	                    firstHex=sc.next();
	    	                    System.out.println("\nEnter a hex : ");
	    	                    secondHex=sc.next();
	    	                    forGreater(firstHex,secondHex);
	    	                    break;
	    	        case 9 :    System.out.println("\nEnter a hex : ");
	    	                    firstHex=sc.next();
	    	                    System.out.println("\nEnter a hex : ");
	    	                    secondHex=sc.next();
	    	                    forSmall(firstHex,secondHex);
	    	                    break;
	    	        case 10 :   flag=0;
	    	                    break;
	    	        default :   System.out.println("Wrong input .");
	    	    }
	    	    
	    	}
	}
}