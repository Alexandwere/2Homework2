package homework2;

public class Ex3 {
    public static void main(String[] args) {
        double  fuel = 10;
        boolean isEngineWork = true;
        boolean hasErrors = false;
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        if (fuel >=10 && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                && isEngineWork && !hasErrors) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не едет");
        }
    }
}
