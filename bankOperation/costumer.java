package bankOperation;

public class Costumer {
    
    private String name;
    private String address;
    private String email;
    private String birthDate;
    private long id;
    private long phone;

    // Constructor using all the parameters to create the specific costumer
    public Costumer (String name, long id, String birthDate, String address,String email, long phone){

        // There is a word called "this" because the atribute have the same variable name.
        this.name = name;
        this.id = id;
        this.birthDate = birthDate;
        this.address = address;
        this.email = email;
        this.phone = phone;    
    }

    // In the following methods, it is possible to get which atribute the user want
    public String getName () { return name; }
    public String getAddress () { return address; }
    public String getEmail () { return email; }
    public String getBirthDate () { return birthDate; }
    public long getId () { return id; }
    public long getPhone () { return phone; }
    
    // In the following methods, it is possible to modificate the attributes
    public void setName (String newName) { name = newName; }
    public void setAddress (String newAddress) { address = newAddress; }
    public void setEmail (String newEmail) { email = newEmail; }
    public void setBirthDate (String newBirthDate) { birthDate = newBirthDate; }
    public void setId (long newId) { id = newId; }
    public void setPhone (long newPhone) { phone = newPhone; }
    
    // Method to show all costumer information - simplified
    public String toString () {
        return "Costumer Informations:\nName: " + name + "\nAddress: " + address + "\nE-mail: " + email + "\nBirth Date: " + birthDate + "\nIdentification: " + id + "\nPhone Number: " + phone;
    }
}
