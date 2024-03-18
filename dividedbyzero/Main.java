public static void main(String[] args) {
        try {
        System.out.println(3/0);
        } catch (Exception e) {
        } catch (ArithmeticException e) {
        System.out.printf("Caught runtime exception = %s\n", e.getMessage());
        }
        }