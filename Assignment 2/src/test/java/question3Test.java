import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class question3Test {
    @Test
    void Test1() throws IOException {
        Question3 question3_object = new Question3();
        question3_object.setMyInput("abbcd");
        question3_object.question3();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test1.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }
    @Test
    void Test2() throws IOException {
        Question3 question3_object = new Question3();
        question3_object.setMyInput("Aa");
        question3_object.question3();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test2.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }
    @Test
    void Test3() throws IOException {
        Question3 question3_object = new Question3();
        question3_object.setMyInput("aaa");
        question3_object.question3();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test3.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }
    @Test
    void Test4() throws IOException {
        Question3 question3_object = new Question3();
        question3_object.setMyInput("cdb");
        question3_object.question3();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test4.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }
    @Test
    void Test5() throws IOException {
        Question3 question3_object = new Question3();
        question3_object.setMyInput("");
        question3_object.question3();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test5.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }
    @Test
    void Test6() throws IOException {
        Question3 question3_object = new Question3();
        question3_object.setMyInput("caaaa");
        question3_object.question3();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test6.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }
    @Test
    void Test7() throws IOException {
        Question3 question3_object = new Question3();
        question3_object.setMyInput("ba");
        question3_object.question3();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test7.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }
    @Test
    void Test8() throws IOException {
        Question3 question3_object = new Question3();
        question3_object.setMyInput("cb");
        question3_object.question3();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test8.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }
    @Test
    void Test9() throws IOException {
        Question3 question3_object = new Question3();
        question3_object.setMyInput("cab");
        question3_object.question3();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test9.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }
    @Test
    void Test10() throws IOException {
        Question3 question3_object = new Question3();
        question3_object.setMyInput("caab");
        question3_object.question3();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test10.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }
    @Test
    void Test11() throws IOException {
        Question3 question3_object = new Question3();
        question3_object.setMyInput("caaab");
        question3_object.question3();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test11.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }
    @Test
    void Test12() throws IOException {
        Question3 question3_object = new Question3();
        question3_object.setMyInput("caaaab");
        question3_object.question3();
        Path realOutput_file = Path.of("Output.txt");
        String contentOf_realOutput_file = Files.readString(realOutput_file);
        Path expectedOutput_file = Path.of("Test12.txt");
        String contentOf_expectedOutput_file = Files.readString(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }

}