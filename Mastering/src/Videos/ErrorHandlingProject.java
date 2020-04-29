package Videos;

public class ErrorHandlingProject {
    public static void main(String[] args){
        float sum = 0;
        // We are taking input from command line. Through "Edit Configurations".
        // The arguments passes are - 1 3 + 5.
        // '+' can't be parsed into float value.
        for(String argument : args){
            try{
                sum += Float.parseFloat(argument);
            } catch (Exception e){
                // System.out.println("Exception : " + e.getMessage());
                System.out.println(argument + " is not a number.");
            }
        }
        System.out.println("Sum: " + sum);
    }
}
