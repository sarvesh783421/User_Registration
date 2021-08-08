public class UserDetails {
    String firstName;
    String lastName;
    String eMail;
   
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String name){
        this.firstName = name;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String name){
        this.lastName = name;
    }    

    public String getMail(){
        return eMail;
    }
    public void setMail(String mail){
        this.eMail = mail;
    }
}
