import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationRunner{

    // Name validation block.
    public boolean validateName(String name){
        String check = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(check);

        if(name.isEmpty())
            return false;

        Matcher matcher = pattern.matcher(name);
        return matcher.matches();

    }
    public void validateUserDetails(){
        Scanner input = new Scanner(System.in);
        UserDetails userDetails = new UserDetails();
        UserRegistrationRunner userRegistrationCheck = new UserRegistrationRunner();

        // Validating First Name.
        System.out.println("Enter your First Name :- ");
        userDetails.setFirstName(input.next());
        boolean fName = userRegistrationCheck.validateName(userDetails.getFirstName());
        if(fName)
            System.out.println("Entered name is valid !!");
        else
            System.out.println("Entered name is invalid !!");
	
	   // Validating Last Name.
        System.out.println("Enter your Last Name :- ");
        userDetails.setLastName(input.next());
        boolean lName = userRegistrationCheck.validateName(userDetails.getLastName());
        if(lName)
            System.out.println("Entered Name is valid !!");
        else
            System.out.println("Entered name is invalid !!");

}
