package bankOperation;

public class costumer {
    
    private String name;
    private String address;
    private String email;
    private String birthDate;
    private long id;
    private long phone;

    // Constructor using all the parameters to create the specific costumer
    public costumer (String name, long id, String birthDate, String address,String email, long phone){

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
    public String getName () { return name; }
    public String getName () { return name; }
    public String getName () { return name; }
    public String getName () { return name; }
    public String getName () { return name; }
    

}
