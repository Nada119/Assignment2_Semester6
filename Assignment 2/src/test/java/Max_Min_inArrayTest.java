import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Max_Min_inArrayTest {
    @Test
    void Test1() {
        var max_min_inArray = new Max_Min_inArray();
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int[] expectedArray = {10, 1};
        int[] resultArray =  max_min_inArray.Func(numbers);
        assertArrayEquals(expectedArray, resultArray);
    }
    @Test
    void Test2() {
        var max_min_inArray = new Max_Min_inArray();
        int[] numbers = {-10,-5,-20,40,60,30};
        int[] expectedArray = {60, -20};
        int[] resultArray =  max_min_inArray.Func(numbers);
        assertArrayEquals(expectedArray, resultArray);
    }
    @Test
    void Test3() {
        var max_min_inArray = new Max_Min_inArray();
        int[] numbers = {-10,-5,-20,40,60,-10,-5,-20,40,60,-10,-5,-20,40,60,-10,-5,-20,40,60,-10,-5,-20,40,60,-10,-5,-20,40,60,-10,-5,-20,40,60,-10,-5,-20,40,60,-10,-5,-20,40,60,-10,-5,-20,40,60,-10,-5,-20,40,60,};
        int[] expectedArray = {60, -20};
        int[] resultArray =  max_min_inArray.Func(numbers);
        assertArrayEquals(expectedArray, resultArray);

    }
    @Test
    void Test4() {
        var max_min_inArray = new Max_Min_inArray();
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class,() -> {
            max_min_inArray.Func(numbers);
        });

    }



}