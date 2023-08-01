
public class Collatz {
    
    public static void main(String[] args) {

        int collatzNum = 12;
        int numSteps = 0;
        int highestNumReached = collatzNum;
        int initValue = collatzNum;
        System.out.println(collatzNum);

        while(collatzNum != 1){

            if(collatzNum % 2 == 0)
            collatzNum /= 2;
            else collatzNum = collatzNum*3 + 1;

            if(collatzNum > highestNumReached)
            highestNumReached = collatzNum;

            System.out.println(collatzNum);
            numSteps++;
        }

        System.out.printf("Initial value: %d%n",initValue);
        System.out.printf("Number of steps: %d%n",numSteps);
        System.out.printf("Highest number reached: %d%n",highestNumReached);

        switch (numSteps) {
            
            case 0:
            System.out.println("No steps required%n");
            break;

            case 1:
            System.out.println("Only took one step!%n");
            break;
            
            case 2:
            System.out.println("Two steps%n");
            break;   

            case 3:
            System.out.println("Three steps%n");
            break;  

            case 4:
            System.out.println("Four steps%n");
            break;             
                    
            default:
            System.out.printf("Wow, %d steps was a lot of steps!%n", numSteps);
        }
    }
}
