import com.company.interfaces.Videograph;
import com.company.person.Person;

public class VideographImpl extends Person implements Videograph {
    protected VideographImpl(String givenName, String familyName) {
        super(givenName, familyName);
    }

    @Override
    public void makeVideo() {

    }
}
