import com.company.interfaces.Assistant;
import com.company.person.Person;

public class AssistantImpl extends Person implements Assistant {
    protected AssistantImpl(String givenName, String familyName) {
        super(givenName, familyName);
    }

    @Override
    public void help() {

    }
}
