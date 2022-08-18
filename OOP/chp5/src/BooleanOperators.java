public class BooleanOperators {
    public static void main(String[] args) {
        System.out.printf("%n%s%n%s%b%n%s%b%n%s%b%n%s%b", "Logical AND (&&) Operator tests:",
                "true && true: ",true && true,
                "true && false: ", true && false,
                "false && false: ", false && false,
                "false && true: ", false && true);

        System.out.printf("%n%n%s%n%s%b%n%s%b%n%s%b%n%s%b", "Logical OR (||) Operator tests:",
                "true || true: ",true || true,
                "true || false: ", true || false,
                "false || false: ", false || false,
                "false || true: ", false || true);

        System.out.printf("%n%s%n%s%b%n%s%b%n%s%b%n%s%b", "Logical AND (&&) Operator tests:",
                "true & true: ",true & true,
                "true & false: ", true & false,
                "false & false: ", false & false,
                "false & true: ", false & true);

        System.out.printf("%n%n%s%n%s%b%n%s%b%n%s%b%n%s%b", "Boolean OR (|) Operator tests:",
                "true | true: ",true | true,
                "true | false: ", true | false,
                "false | false: ", false | false,
                "false | true: ", false | true);

        System.out.printf("%n%n%s%n%s%b%n%s%b%n%s%b%n%s%b", "Boolean Exclusive OR (^) Operator tests:",
                "true ^ true: ",true ^ true,
                "true ^ false: ", true ^ false,
                "false ^ false: ", false ^ false,
                "false ^ true: ", false ^ true);

        System.out.printf("%n%nLogical Negation: %n%s%b%n%s%b%n",
                "! false: ", !false,
                "!true: ", !true);
    }

}
