package tests.properties;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

public class OwnerTests {

    @Test
    @Tag("owner1")

    void ownerTest() {
        CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);

        String user = credentials.user();
        String password = credentials.password();

        System.out.println(format("Login: %s, password %s",user, password));
    }
}
