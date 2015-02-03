/**
 * David P. Lopez
 * COP2800
 * Bank Account Application
 */

package PhoneConverter;
import java.util.Scanner;

/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
public class PhoneNumberConverter {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Phone Number: ");
        String phoneNumber = in.next();
        
        String areaCode = phoneNumber.substring(0,3);
        String preFix = phoneNumber.substring(3,6);
        String postFix = phoneNumber.substring(6,10);
        
        String formattedNumber = "Phone Number: " + "(" + areaCode + ")" + preFix + "-" + postFix;
        
        System.out.println(formattedNumber); 
    }
}
