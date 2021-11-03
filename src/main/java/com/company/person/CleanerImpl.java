import com.company.interfaces.Cleaner;
import com.company.person.Person;

public class CleanerImpl extends Person implements Cleaner {
    protected CleanerImpl(String givenName, String familyName) {
        super(givenName, familyName);
    }

    @Override
    public void clean() {

    }
}
