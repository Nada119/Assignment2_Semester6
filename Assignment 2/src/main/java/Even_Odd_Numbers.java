public class Even_Odd_Numbers {
    public String Func (int input) {
        int num = input;

        if (num >= 0 ) {

            if (num % 2 == 0)
                return "Even";
            else
                return "Odd";
        }
        else
        {
            return "Input is out of the Boundary";
        }
    }
}
