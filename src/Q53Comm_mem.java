import java.util.Scanner;

public class Q53Comm_mem {
    public static void main(String[] args) {

    }
}

class CommunityMember {
    String name, address, contact, Date_of_join;
    Scanner sc = new Scanner(System.in);

    void getName() {
        System.out.println("Enter the name");
        name = sc.nextLine();
    }

    void getAddress() {
        System.out.println("Enter the address");
        address = sc.nextLine();
    }

    void getContact() {
        System.out.println("Enter The contact");
        contact = sc.nextLine();
    }

    void getDate_of_join() {
        System.out.println("Enter the Date_of_join");
        Date_of_join = sc.nextLine();
    }
}

class employee extends CommunityMember {
    void qualification() {
        System.out.println("Name " + super.name + " Address " + super.address + "Contact " + super.contact + " Date_of_join" + super.Date_of_join);
    }
}

class Student extends CommunityMember {
    void qualification() {
        System.out.println("Name " + super.name + " Address " + super.address + "Contact " + super.contact + " Date_of_join" + super.Date_of_join);
    }
}