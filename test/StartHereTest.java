import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class StartHereTest {
    private StartHere startHere;

    @BeforeEach
    public void setUp() {
        startHere = new StartHere();
    }

    @Test
    public void testCreateWindow() {
        startHere.createWindow(startHere);
        assertNotNull(startHere.getPokemonWindow());
    }

    @Test
    public void testSetupPokemonJavaLabel() {
        startHere.setupPokemonJavaLabel();
        assertNotNull(startHere.pokemonJ);
        assertNotNull(startHere.pokemonJava.getIcon());
    }

    @Test
    public void testSetupSinglePlayerButton() {
        startHere.setupSinglePlayerButton(startHere);
        assertNotNull(startHere.getSinglePlayer());
    }

    @Test
    public void testGetBlueviolet() {
        Color blueviolet = new Color(138, 43, 226);
        assertEquals(startHere.getBlueviolet(), blueviolet);
    }
}
