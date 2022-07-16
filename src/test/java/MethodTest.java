import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Dm.Petrov
 * DATE: 16.07.2022
 */
public class MethodTest {
    Main sut;

    @BeforeEach
    public void init() {
        System.out.println("test started...");
        sut = new Main();
    }

    @BeforeAll
    public static void started() {
        System.out.println("tests started ...");
    }

    @AfterAll
    public static void finished() {
        System.out.println("tests finished !!!");
    }

    @AfterEach
    public void testFinished() {
        System.out.println("test finished!!!");
    }

    @Test
    public void calculatingTheNumberOfLargeSizedBooks() {
        int[] arr = {56, 233, 150, 567, 321};
        int bookSize = 70;
        int result = sut.calculatingTheNumberOfLargeSizedBooks(arr, bookSize);
        assertEquals(4, result);
    }

    @Test
    public void calculatingTheNumberOfLargeSizedBooks2() {
        int[] arr = {56, 233, 150, 567, 321};
        int bookSize = -100;
        int result = sut.calculatingTheNumberOfLargeSizedBooks(arr, bookSize);
        assertEquals(-1, result);
    }

    @Test
    public void calculatingTheNumberOfLargeSizedBooks3() {
        int[] arr = {56, 233, 150, 567, 321};
        int bookSize = 1000;
        int result = sut.calculatingTheNumberOfLargeSizedBooks(arr, bookSize);
        assertEquals(0, result);

    }

    @Test
    public void calculatingTheNumberOfLargeSizedBooks4() {
        int[] arr = {56, 233, 150, 567, 321};
        int bookSize = 15;
        int result = sut.calculatingTheNumberOfLargeSizedBooks(arr, bookSize);
        assertEquals(5, result);

    }

}
