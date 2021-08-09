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

    // Mail validation block.
    public boolean validateMail(String mail){
        String check = "^([A-Za-z0-9-_.]+)@([a-zA-Z0-9]+).([a-z]{2,4}+).([a-z]{2,4})$";
        Pattern pattern = Pattern.compile(check);
        Matcher matcher = pattern.matcher(mail);
        return matcher.matches();
    }
    
     // Number validation block.
    public boolean validatePhoneNumber(String phoneNumber){
        String check = "^(91)[0-9]{10}$";
        Pattern pattern = Pattern.compile(check);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

     // Password validation block.
    public boolean validatePassword(String password){
        String check = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(check);
        Matcher matcher = pattern.matcher(password);
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
	
	// Validating Mail.
        System.out.println("Enter your E-Mail address :- ");
        userDetails.setMail(input.next());
        boolean eMail = userRegistrationCheck.validateMail(userDetails.getMail());
        if(eMail)
            System.out.println("Entered Mail is valid !!");
        else
            System.out.println("Entered Mail is invalid !!");

	// Validating Phone Number.
        System.out.println("Enter your phone number :-");
        userDetails.setPhoneNumber(input.next());
        boolean number = userRegistrationCheck.validatePhoneNumber(userDetails.getPhoneNumber());
        if(number)
            System.out.println("Entered Phone number is valid !!");
        else
            System.out.println("Entered Phone number is invalid !!");

	// Validating password.
        System.out.println("Enter your password :- ");
        userDetails.setPassword(input.next());
        boolean pass = userRegistrationCheck.validatePassword(userDetails.getPassword());
        if(pass)
            System.out.println("Entered password is valid !!");
        else
            System.out.println("Password should have minimum 8 characters, one upper-case, one numeric and exactly one special character.");
    }
}
