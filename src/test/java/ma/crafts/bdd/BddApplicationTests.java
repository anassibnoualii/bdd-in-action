package ma.crafts.bdd;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BddApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@Profile("classpath:application-test.yml")
public class BddApplicationTests {
    @Test
    public void context() {
    }
}
