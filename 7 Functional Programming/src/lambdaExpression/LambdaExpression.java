package lambdaExpression;

public class LambdaExpression {
    static void main() {
         /*
         * Lambda Expression:
         *
         * 1. Lambda expressions are used to provide a simple way
         *    to implement a functional interface.
         *
         * 2. We don't need to mention the data type of parameters
         *    because Java can infer the data type automatically.
         *
         * 3. If there is only one parameter, we don't need to
         *    use parentheses.
         *
         * 4. If there is only one statement, we don't need to
         *    use curly braces {}.
         *
         * 5. If there is only one expression that returns a value,
         *    we don't need to use the return keyword.
         *
         * 6. If there are multiple statements, we need to use
         *    curly braces {}.
         *
         * 7. If we use curly braces {} and want to return a value,
         *    we need to explicitly use the return keyword.
         *
         * 8. Lambda expressions can have zero, one, or multiple
         *    parameters.
          */


        // No argument Lambda expression
        // () -> System.out.println("Hello");


        // Lambda expression with one argument
        // name -> System.out.println(name);


        // Lambda expression with multiple arguments
        // (a, b) -> System.out.println(a + b);


        // Lambda expression with one argument and return value
        // x -> x * x;


        // Lambda expression with multiple arguments and return value
        // (a, b) -> a + b;


        // Lambda expression with explicit parameter types
        // (int a, int b) -> a + b;


        // Lambda expression with multiple statements
        // (a, b) -> {
        //     int sum = a + b;
        //     System.out.println(sum);
        //     return sum;
        // };


        // Lambda expression with a single statement
        // x -> System.out.println(x);


        // Lambda expression with a block body
        // x -> {
        //     System.out.println(x);
        // };


        // Lambda expression with an expression body
        // x -> x * 2;


        // Lambda expression with no return keyword
        // (a, b) -> a + b;


        // Lambda expression with return keyword
        // (a, b) -> {
        //     return a + b;
        // };
    }
}