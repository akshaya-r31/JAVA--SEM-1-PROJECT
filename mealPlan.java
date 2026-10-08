import java.util.Scanner;

public class mealPlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] labels = {"Breakfast", "Lunch", "Dinner"};

        // meals[i] = {breakfast, lunch, dinner} for meal plan i + 1
        String[][] meals = {
            {"paneer stuffed parathas with milk curd",
             "bowl of chole masala with whole wheat rotis and cucumber salad",
             "bowl of dal makhani with a plate of jeera rice"},

            {"large vegetable oats uttapams with coconut chutney and sambar",
             "bowl of rajma masala with rice",
             "plate of paneer bhurji with buttered tandoori rotis"},

            {"bowl of vegetable upma loaded with roasted cashews and peanuts",
             "bowl of mixed dal fry with high fiber missi rotis",
             "plate of paneer tikka masala served with two butter naans"},

            {"moong dal cheelas stuffed with crumbled paneer and coriander chutney",
             "bowl of aloo baingan sabzi with a serving of dal tadka and rice",
             "bowl of kala chana masala with whole wheat phulkas"},

            {"bowl of savory vegetable daliya porridge cooked in ghee with nuts",
             "bowl of mixed vegetable korma with multi grain rotis",
             "bowl of high protein soya chunks curry with peas pulao"},

            {"aloo parathas served with a large bowl of Greek yogurt",
             "bowl of lobia (black-eyed peas) curry with brown rice",
             "plate of aromatic vegetable paneer biryani served with cucumber raita"},

            {"bowl of high protein sprouts chaat mixed with roasted peanuts",
             "bowl of palak paneer served with whole wheat bajra rotis",
             "bowl of mixed lentil khichdi topped with ghee and roasted papad"}
        };

        int[] prices = {250, 280, 300, 250, 250, 250, 250};

        int choice;
        int totalPrice = 0;

        do {
            // Menu printed from the arrays
            System.out.println("\nMeal Plan");
            for (int i = 0; i < meals.length; i++) {
                System.out.print((i + 1) + ". ");
                for (int j = 0; j < labels.length; j++) {
                    System.out.print(labels[j] + ": " + meals[i][j]);
                    System.out.print(j < labels.length - 1 ? "; " : "\n");
                }
            }
            System.out.println("8. Eat out / NA");

            System.out.print("Enter your choice: ");
            if (!sc.hasNextInt()) {
                sc.next();   // discard bad input
                System.out.println("Invalid Choice Please enter a number between 1 and 8");
                choice = 0;
                continue;
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Selected Meal: 1 (" + meals[0][0] + ", ...)");
                    totalPrice += prices[0];
                    System.out.printf("Added Meal 1 to your list the price is %d%n", totalPrice);
                    break;

                case 2:
                    System.out.println("Selected Meal: 2 (" + meals[1][0] + ", ...)");
                    totalPrice += prices[1];
                    System.out.printf("Added Meal 2 to your list the price is %d%n", totalPrice);
                    break;

                case 3:
                    System.out.println("Selected Meal: 3 (" + meals[2][0] + ", ...)");
                    totalPrice += prices[2];
                    System.out.printf("Added Meal 3 to your list the price is %d%n", totalPrice);
                    break;

                case 4:
                    System.out.println("Selected Meal: 4 (" + meals[3][0] + ", ...)");
                    totalPrice += prices[3];
                    System.out.printf("Added Meal 4 to your list the price is %d%n", totalPrice);
                    break;

                case 5:
                    System.out.println("Selected Meal: 5 (" + meals[4][0] + ", ...)");
                    totalPrice += prices[4];
                    System.out.printf("Added Meal 5 to your list the price is %d%n", totalPrice);
                    break;

                case 6:
                    System.out.println("Selected Meal: 6 (" + meals[5][0] + ", ...)");
                    totalPrice += prices[5];
                    System.out.printf("Added Meal 6 to your list the price is %d%n", totalPrice);
                    break;

                case 7:
                    System.out.println("Selected Meal: 7 (" + meals[6][0] + ", ...)");
                    totalPrice += prices[6];
                    System.out.printf("Added Meal 7 to your list the price is %d%n", totalPrice);
                    break;

                case 8:
                    System.out.printf("Your budget is %d%n", totalPrice);
                    System.out.println("Thank you! Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice Please enter a number between 1 and 8");
            }
        } while (choice != 8);

        sc.close();
    }
}