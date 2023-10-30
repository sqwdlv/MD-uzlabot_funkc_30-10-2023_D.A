import java.util.Scanner; //importejam java.util scanner, lai varetu izmantot user inputu 

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); //izmantojam, lai definetu objektu, kas laus sanemt user inputu.
        
        int num_x, num_y; //Definejam mainigos, lai varetu izmantot visa koda garuma: prieks try,switch, method.

        while (true) {
                System.out.println("Kadu matematisko darbibu velies izpildit (+, -, /, *, e - exit).");
                String math_op = scan.next();
                if (math_op.equals("e")) {
                    break;
                } // beidzas if statements, kurs parbauda vai user input ir "e", ja ta ir tad aptur izpildi


            try {//izpilda funkciju, saja gadijuma nolasa inputu no usera 
                System.out.print("Ievadi veselu skaitli x: ");
                num_x = scan.nextInt();
            } catch (java.util.InputMismatchException kluda) { //noker un apstrada kludas, kas radusas pec try bloka veiktas funkcijas
                System.out.println("Ludzu ievadi veselu skaitli.");
                continue;
            } // beidzas num_x inputs + validacija vai ir ievadits int

            try { //izpilda funkciju, saja gadijuma nolasa inputu no usera  
                System.out.print("Ievadi veselu skaitli y: ");
                num_y = scan.nextInt();
            } catch (java.util.InputMismatchException kluda) { //noker un apstrada kludas, kas radusas pec try bloka veiktas funkcijas
                System.out.println("Ludzu ievadi veselu skaitli.");
                continue;
            } // beidzas num_y inputs + validacija vai ir ievadits int

            switch (math_op) {
                case "+":
                    System.out.println("Jusu rezultats: " + sum(num_x, num_y));
                    break;
                case "-":
                    System.out.println("Jusu rezultats: " + sub(num_x, num_y));
                    break;
                case "/":
                    System.out.println("Jusu rezultats: " + div(num_x, num_y));
                    break;
                case "*":
                    System.out.println("Jusu rezultats: " + mult(num_x, num_y));
                    break;
                default:
                    System.out.println("Nepareiza izvele");
            } // beidzas switch
        } // beidzas while loops
    } //beidzas main 


    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static float div(float x, float y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Dalit ar nulli nedrikst!");
            return Float.NaN; // atgriezam NaN (not a number), jo teoretiski dalot ar nulli mes iegustam nedefinetu vertibu.
        }
    }

    public static int mult(int x, int y) {
        return x * y;
    }
}
