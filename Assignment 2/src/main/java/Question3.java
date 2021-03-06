import java.io.*;
import java.util.*;

public class Question3 {

    /* This funtion takes a string as input containing several button clicks of a b c d and prints out
        current state , innerstate , date and time
     */
    ArrayList<String> output = new ArrayList<String>();
    String myInput;

    public String getMyInput() {
        return myInput;
    }

    public void setMyInput(String myInput) {
        this.myInput = myInput;
    }

    public void question3() throws IOException {
        String myInput = getMyInput();
        if (myInput.length() == 0) {
            File f = new File("Output.txt");
            FileOutputStream fos = new FileOutputStream(f);
            PrintWriter pw = new PrintWriter(fos);
            output.add("Your Input is empty");
            pw.write(String.valueOf(output));
            pw.flush();
            fos.close();
            pw.close();
        } else {
            File f = new File("Output.txt");
            FileOutputStream fos = new FileOutputStream(f);
            PrintWriter pw = new PrintWriter(fos);

            String state = "Normal Display";
            String innerState = "Time";
            int m = 0, h = 0, D = 1, M = 1, Y = 2000;
            myInput.toLowerCase();
            for (int i = 0; i < myInput.length(); i++) {
                char currentChar = myInput.charAt(i);
                switch (state) {
                    case "Normal Display":
                        if (currentChar == 'c') {
                            state = "Update";
                            innerState = "min";
                        }
                        if (currentChar == 'b') {
                            state = "Alarm";
                            innerState = "Alarm";
                        }
                        if (currentChar == 'a') {
                            if (innerState == "Time") {
                                innerState = "Date";
                            } else {
                                innerState = "Time";
                            }
                        }
                        if (currentChar == 'd') {
                            output.add("No action in this state with input d");
                        }
                        break;
                    case "Alarm":
                        if (currentChar == 'a') {
                            if (innerState == "Alarm") {
                                innerState = "Chime";
                            }
                        }
                        if (currentChar == 'b') {
                            output.add("No action in this state with input b");


                        }
                        if (currentChar == 'c') {
                            output.add("No action in this state with input c");


                        }
                        if (currentChar == 'd') {
                            state = "Normal Display";
                            innerState = "Time";
                        }
                        break;
                    case "Update":
                        if (currentChar == 'a') {
                            switch (innerState) {
                                case "min":
                                    innerState = "hour";
                                    break;
                                case "hour":
                                    innerState = "day";
                                    break;
                                case "day":
                                    innerState = "month";
                                    break;
                                case "month":
                                    innerState = "year";
                                    break;
                                case "year":
                                    state = "Normal Display";
                                    innerState = "Time";
                                    break;
                            }
                        }
                        if (currentChar == 'b') {
                            switch (innerState) {
                                case "min":
                                    m++;
                                    if (m == 60) {
                                        m = 0;
                                        h++;
                                        if (h == 24) {
                                            h = 0;
                                            D++;
                                            if (D == 31) {
                                                D = 1;
                                                M++;
                                                if (M == 13) {
                                                    M = 1;
                                                    Y++;
                                                }
                                            }

                                        }
                                    }
                                case "hour":
                                    h++;
                                    if (h == 24) {
                                        h = 0;
                                        D++;
                                        if (D == 31) {
                                            D = 1;
                                            M++;
                                            if (M == 13) {
                                                M = 1;
                                                Y++;
                                            }
                                        }

                                    }
                                case "day":
                                    D++;
                                    if (D == 31) {
                                        D = 1;
                                        M++;
                                        if (M == 13) {
                                            M = 1;
                                            Y++;
                                        }
                                    }
                                case "month":
                                    M++;
                                    if (M == 13) {
                                        M = 1;
                                        Y++;
                                    }
                                case "year":
                                    Y++;

                            }
                        }
                        if (currentChar == 'c') {
                            output.add("No action in this state with input c");

                        }
                        if (currentChar == 'd') {
                            state = "Normal Display";
                            innerState = "Time";
                        }
                        break;

                }
                output.add("Current State is : " + state);
                output.add("Current innerState is : " + innerState);
                output.add("DATE: " + Y + " - " + M + " - " + D);
                output.add("TIME: " + h + " : " + m);


            }
            System.out.println(output);
            pw.write(String.valueOf(output));
            pw.flush();
            fos.close();
            pw.close();
        }
    }

}



