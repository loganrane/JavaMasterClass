package Videos;

public class MultipleCatchBlocks {
    public static void main(String[] args){
        int[] number = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};
        for(int i=0; i<number.length; i++){
            try{
                System.out.println(number[i] + " / " + denom[i] + " is " + number[i] / denom[i]);
            }
            catch(ArithmeticException e){
                System.out.println("Can't divide by zero.");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("No matching element found");
            } finally {
                // This will always be running.
                System.out.println("Running")
            }
        }
    }
}
