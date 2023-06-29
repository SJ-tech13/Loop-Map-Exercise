import java.util.Arrays;
import java.util.HashMap;
import java.util.*;
/*You are a car dealer. Create a hash map of vehicles.
The model is the Key, the make is the Value.
Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
(e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")

*/
public class Vehicles {
    public static void main(String[] args) {
        HashMap<String, String> autos = new HashMap<String, String>();
        autos.put("Civic", "Honda");
        autos.put("Caravan", "Dodge");
        autos.put("Charger", "Dodge");
        autos.put("Ram", "Dodge");
        autos.put("Accord", "Honda");
        autos.put("Camary", "Toyota");
        autos.put("Maxima", "Nissan");
        autos.put("F-150", "Ford");
        autos.put("1500", "Chevy");

        // ask for 'user' input
        Scanner model = new Scanner(System.in);
        System.out.println("What model are you interested in? ");
        String carType = model.nextLine();

        if (autos.containsKey(carType))
        {
            System.out.println("We have do seem to have a " + carType +" in stock");
        }
        else {
            System.out.println("It does not appear there are any in stock.");
        }
    }

}

