public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("1: " + Character.toLowerCase('A'));
        System.out.println("2: " + Character.isDigit('X'));
        System.out.println("3: " + Character.isAlphabetic(';'));
        System.out.println("4: " + Character.isLetter('S'));
        System.out.println("5: " + Character.isLetterOrDigit('1'));
        System.out.println("6: " + Character.isSpaceChar('0'));
        System.out.println("7: " + Character.isUpperCase('5'));
        System.out.println("8: " + new Character('A').hashCode());
        System.out.println("9: " + Character.isUpperCase(100));
        System.out.println("10: " + Character.valueOf('Y'));

        String s="Some text";
        System.out.println("11: " + s.toUpperCase());

        s=""+Character.toString('A');
        s += 'B';
        System.out.println("12: " + s);

        s="Some ";
        System.out.println("13: " + s+"text");

        String s1=Integer.toString(150);
        String s2=Character.valueOf('5').toString();
        System.out.println("14: " + s1+s2);

        s1="To be or not to be";
        System.out.println("15: " + s1.contains("be"));

        s1="ABC";
        s2="Abc";
        System.out.println("16: " + s1.compareTo(s2));

        s1="Hello world";
        System.out.println("17: " + s1.substring(6,s1.length()));

        s1="Hello world";
        System.out.println("18: " + s1.startsWith("abc"));


        s="Hello world";
        System.out.println("19: " + s.charAt(3));

        s="Hello world";
        s1=s.replaceAll("o", "_");
        System.out.println("20" + s1);


        StringBuffer sb=new StringBuffer("Hello world");
        sb.delete(0,5);
        System.out.println("21: " + sb);

        System.out.println("22: " + new StringBuffer("Hello").reverse());

        sb=new StringBuffer("Hello world");
        sb.replace(6,7,"W");
        System.out.println("23: " + sb);

        sb=new StringBuffer("Some text");
        sb.insert(5,"short ");
        System.out.println("24: " + sb);

        sb=new StringBuffer("Hello world");
        s=sb.toString();
        System.out.println("25: " + s);


        //Task 2
        String emoji1 = "\uD83D\uDE10"; // U+1F610
        String emoji2 = "\uD83D\uDE11"; // U+1F611
        String emoji3 = "\uD83D\uDE15"; // U+1F615

        System.out.println("\nЕмоджі U+1F610: " + emoji1);
        System.out.println("Емоджі U+1F611: " + emoji2);
        System.out.println("Емоджі U+1F615: " + emoji3);

        //Task 3
        String ryadok = "ряДОК В яКомУ виКОРистовуЮТЬСЯ вЕЛИКі І МАлеНЬКІ літЕри У ДовільНОму поряДКУ";
        System.out.println("\nДо: " + ryadok);
        ryadok = ryadok.substring(0,1).toUpperCase() + ryadok.substring(1).toLowerCase();
        System.out.println("Після: " + ryadok);
    }
}