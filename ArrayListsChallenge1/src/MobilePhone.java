import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> ContactsList = new ArrayList<Contact>();

    public boolean newContact (String name, String number) {
        if(searchContact(name)){
            return false;
        }
        else {
            ContactsList.add(new Contact(name, number));
            return true;
        }
    }

    public boolean modifyContact (String currentName, String newName, String newNumber) {
        int position = findContact(currentName);
        if (position >= 0) {
            if (!searchContact(newName)) {
                if (!newName.equals("")) {
                    ContactsList.get(position).setName(newName);
                }
                if (!newNumber.equals("")) {
                    ContactsList.get(position).setNumber(newNumber);
                }
                return true;
            } else {
                System.out.println("You cannot use name which contains in other contact");
                return false;
            }
        } else {
            System.out.println("Contact you want to update doesn't exist");
            return false;
        }
    }

    public void printContactsList (){
        System.out.println("You have " + ContactsList.size() + " contacts in your list");
        for(int i=0; i<ContactsList.size();i++){
            System.out.println((i+1) + ". " + ContactsList.get(i).getName() + " -> " + ContactsList.get(i).getNumber());
        }
    }

    public boolean removeContact (String name){
        int position = findContact(name);
        if(position >= 0){
            ContactsList.remove(position);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean searchContact (String searchName){
        if(findContact(searchName)>=0){
            return true;
        }
        return false;
    }

    public Contact queryContact (String searchName){
        int position = findContact(searchName);
        if(position>=0){
            return ContactsList.get(position);
        }
        else{
            return null;
        }
    }

    private int findContact (String searchName){
        for(int position=0; position< ContactsList.size(); position++){
            if(ContactsList.get(position).getName().equals(searchName)){
                return position;
            }
        }
        return -1;
    }

}