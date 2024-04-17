public class Task {
    public static void main(String[] args) {
        String number = "1234";
        ParseAndPrintNumber x = new ParseAndPrintNumber();
        x.parseAndPrintNumber(number);
    }

    static class ParseAndPrintNumber {
        public void parseAndPrintNumber(String str) {
            int number = Integer.parseInt(str);
            int result = number / 2;
            System.out.print(result);
        }
    }
}
