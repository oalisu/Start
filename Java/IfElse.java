public class IfElse {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        
        if (biologyGrade > chemistryGrade) {
            System.err.println("Yes you did!");
        } else {
            System.err.println("No you did not. Sorry!");
        }

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        
        if (sales>costs) {
            System.err.println("Yes we did make money.");
        } else {
            System.err.println("No, unfortunately we did not make any money.");
        }

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        
        if (temperature<targetTemperature) {
            System.err.println("Yes, it is colder than we expected.");
        } else {
            System.err.println("No it is warmer than we expected.");
        }

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        
        if (currentSpeed>speedLimit) {
            System.err.println("Yes you are above the speed limit, please slow down.");
        } else {
            System.err.println("No, you still below it.");
        }

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        
        if (age>=retirementAge) {
            System.err.println("Yes, you are able to retire now whenever you want.");
        } else {
            System.err.println("No, you still have a few years to go through.");
        }

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        
        if (myGrade==bestGrade) {
            System.err.println("Yes you scored an A!");
        } else {
            System.err.println("No, you scored below A, Sorry.");
        }

        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
        
        if (word.equals(secondWord)) {
            System.err.println("Yes they are the exactly the same word.");
        } else {
            System.err.println("No they are two different words.");
        }

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different");
        
        if (!thirdWord.equals(fourthWord)) {
            System.err.println("Yes, they are two different words.");
        } else {
            System.err.println("No they are the exactly the same word.");
        }
    }
}
