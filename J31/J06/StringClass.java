package J31.J06;
public class StringClass{
    public static void main(String[] args) {
        String name = "Tunc Oncu";
        
        System.out.println(name.length());
        System.out.println(name.concat(" Welcome"));
        System.out.println(name.indexOf("u"));
        System.out.println(name.charAt(5));
        System.out.println(name.compareTo("Tunc OncU"));
        System.out.println(name.compareToIgnoreCase("TUNC ONCU"));
        System.out.println(name.contains("Oncu"));
        System.out.println(name.endsWith("cu"));
        System.out.println(name.replaceFirst("Tunc", "Oncu"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
    }
}