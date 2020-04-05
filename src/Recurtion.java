public class Recurtion {
    int getFactorial(int number){
        if(number == 1){
            return 1;
        }
        return getFactorial(number-1) * number;
    }
}
