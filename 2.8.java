class Main {
    public static void main(String[] args) {
        // fill in the code
        // create a random double in the range [0, 1), store in variable a, print out a
        double a = Math.random();
        System.out.println(a);
        // create a random double in the range [0, 10), store in variable b, print out b
        double b = Math.random() * 10;
        System.out.println(b);
        // print out a random double in the range [3,7),
        System.out.println(Math.random() * 4 + 3);
        // print out a random double in the range [-2,8),
        System.out.println(Math.random() * 10 - 2);
        // print out a random integer from the set {0, 1, 2, ..., 8}
        System.out.println((int) (Math.random() * 9));
        // print out a random integer from the set {1, 2, ..., 10}
        System.out.println((int) (Math.random() * 10) + 1);
        // print out a random integer from the set {5, 6, ..., 16}
        System.out.println((int) (Math.random() * 12) + 5);
        // create a variable called min which is the smallest possible integer, print it
        int min = Integer.MIN_VALUE;
        System.out.println(min);
        // subtract 1 from min, print it, what happened?
        System.out.println(min - 1);
        // create a variable called max which is the largest possible integer, print it
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        // add 1 to max, print it, what happened?
        System.out.println(max + 1);
    }
}