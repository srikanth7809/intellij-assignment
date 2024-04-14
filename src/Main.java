public class Main {

    static Complex add(Complex a, Complex b) {
        int i = a.data1 + b.data1;
        int j = a.data2 + b.data2;
        Complex D1 = new Complex(i, j);
        return D1;
    }

    public static void main(String[] args) {
        // Input complex numbers
        Complex C1 = new Complex(3, 4); // Representing 3 + 4i
        Complex C2 = new Complex(5, 6); // Representing 5 + 6i

        // Output the input complex numbers
        System.out.println("C1.data1 = " + C1.data1);
        System.out.println("C1.data2 = " + C1.data2);
        System.out.println("C2.data1 = " + C2.data1);
        System.out.println("C2.data2 = " + C2.data2);

        // Add two complex numbers
        Complex C3 = add(C1, C2);

        // Output the result
        System.out.println("C3.data1 = " + C3.data1);
        System.out.println("C3.data2 = " + C3.data2);
    }
}
