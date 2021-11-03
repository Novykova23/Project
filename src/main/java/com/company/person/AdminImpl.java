import com.company.interfaces.Admin;
import com.company.person.Person;

public class AdminImpl extends Person implements Admin {
    protected AdminImpl(String givenName, String familyName) {
        super(givenName, familyName);
    }
    default void acceptOrders() {

    }
}
