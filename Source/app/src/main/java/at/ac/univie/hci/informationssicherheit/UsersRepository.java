package at.ac.univie.hci.informationssicherheit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This is repository of our users(for authentication )
 */
public class UsersRepository {
    List<User> users;
    //private static UsersRepository instance = null;

    public UsersRepository(){
        this.users = new ArrayList<>();
        User u1 = new User("Oliver", "Hietzinger", "n", "1",2);
        User u2 = new User("Tom", "Schmidt", "melinarud", "5678",3);
        User u3 = new User("Maria", "Mueller", "luiseberg", "91011",1);

        this.users.addAll(Arrays.asList(u1,u2,u3));
    }

    public List<User> getUsers(){
        return users;
    }


}



