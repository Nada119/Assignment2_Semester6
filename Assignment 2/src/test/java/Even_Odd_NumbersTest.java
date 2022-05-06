import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Even_Odd_NumbersTest {
    @Test
    void input_8_Output_Even() {
        var even_odd_numbers = new Even_Odd_Numbers();
        assertEquals("Even", even_odd_numbers.Func(8));
    }
    @Test
    void input_7_Output_Odd() {
        var even_odd_numbers = new Even_Odd_Numbers();
        assertEquals("Odd", even_odd_numbers.Func(7));
    }
    @Test
    void input_0_Output_Even() {
        var even_odd_numbers = new Even_Odd_Numbers();
        assertEquals("Even", even_odd_numbers.Func(0));
    }
    @Test
    void input_1_Output_Odd() {
        var even_odd_numbers = new Even_Odd_Numbers();
        assertEquals("Odd", even_odd_numbers.Func(1));
    }
    @Test
    void input_100000_Output_Even() {
        var even_odd_numbers = new Even_Odd_Numbers();
        assertEquals("Even", even_odd_numbers.Func(100000));
    }
    @Test
    void input_negative_1_Output_Refused() {
        var even_odd_numbers = new Even_Odd_Numbers();
        assertEquals("Input is out of the Boundary", even_odd_numbers.Func(-10));
    }
    @Test
    void input_negative_2_Output_Refused() {
        var even_odd_numbers = new Even_Odd_Numbers();
        assertEquals("Input is out of the Boundary", even_odd_numbers.Func(-5));
    }
}