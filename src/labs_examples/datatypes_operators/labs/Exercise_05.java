package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }
        if (a || b){
            System.out.println("a or b is true");
        }
        if (a == a & b == b){
            System.out.println("a equals a and b equals b");
        }
        if (a == a && b == b){
            System.out.println("a equals a and b equals b");
        }

        // write your code below

    }

}

