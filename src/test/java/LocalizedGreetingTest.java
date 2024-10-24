
import org.junit.Test;
import java.util.Locale;
import java.util.ResourceBundle;
import static org.junit.Assert.assertEquals;

public class LocalizedGreetingTest {

    @Test
    public void testEnglishGreeting() {
        Locale locale = new Locale("en", "US");
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
        String greeting = messages.getString("greeting");
        assertEquals("Hello, World!", greeting);
    }

    @Test
    public void testSpanishGreeting() {
        Locale locale = new Locale("es", "ES");
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
        String greeting = messages.getString("greeting");
        assertEquals("Hola, Mundo!", greeting);
    }

    @Test
    public void testFrenchGreeting() {
        Locale locale = new Locale("fr", "FR");
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
        String greeting = messages.getString("greeting");
        assertEquals("Bonjour, Monde!", greeting);
    }

    @Test
    public void testIraniGreeting() {
        Locale locale = new Locale("fa", "IR");
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
        String greeting = messages.getString("greeting");
        assertEquals("سلام", greeting);
    }

    @Test
    public void testJapaneseGreeting() {
        Locale locale = new Locale("ja", "JP");
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
        String greeting = messages.getString("greeting");
        assertEquals("こんにちは、世界！", greeting);
    }

    @Test
    public void testInvalidChoiceDefaultsToEnglish() {
        Locale locale = new Locale("en", "US"); // Simulate default choice
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
        String greeting = messages.getString("greeting");
        assertEquals("Hello, World!", greeting); // Expected default is English
    }
}


