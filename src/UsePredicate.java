import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UsePredicate {

    // create a list of strings
    List<String> names =
            Arrays.asList("Jhon", "Omar", "Gahul", "Kazi", "Patel");


    void findNameInList(String giveFirstLetter) {

        boolean isFound = false;
        // declare the predicate type as string and use
        // lambda expression to create object
        Predicate<String> p = (s) -> {
            return s.startsWith(giveFirstLetter);
        };

        // Iterate through the list
        for (String st : names) {
            // call the test method to check
            if (p.test(st)){
                isFound = true;

            }
        }

        if (isFound){
            System.out.println("Your Name, First letter is Found");
        }else {
            System.out.println("Your Name, First letter not Found");
        }
    }
}
