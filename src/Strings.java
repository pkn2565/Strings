public class Strings {
    public static void main(String[] args) {

    //Outputs for string methods
    String charVar = new String("Tanes");
    String trimstring = new String("          Javier        ");
    System.out.println(charVar.charAt(3));
    String concatVar = new String("Patrick");
    System.out.println(concatVar.concat(charVar));
    boolean booleanVar = charVar.equals("Jude");
    System.out.println(booleanVar);
    boolean ignoreVar = charVar.equalsIgnoreCase("TANES");
    System.out.println(ignoreVar);
    int intVar = charVar.indexOf("nes");
    System.out.println(intVar);
    int lastVar = charVar.lastIndexOf("s");
    System.out.println(lastVar);
    String stringVar = charVar.toLowerCase();
    System.out.println(stringVar);
    String upperVar = charVar.toUpperCase();
    System.out.println(upperVar);
    String replaceVar = charVar.replace('T','D');
    System.out.println(replaceVar);
    String subVar = charVar.substring(2);
    System.out.println(subVar);
    String subendVar = charVar.substring(0,2);
    System.out.println(subendVar);
    String valueVar = charVar.valueOf(charVar);
    System.out.println(valueVar);
    String trimVar = trimstring.trim();
    System.out.println(trimVar);

    //StringBuffer/StringBuilder starts
    StringBuffer stringBuffer = new StringBuffer("Kanchanawanchai");
    StringBuilder stringBuilder = new StringBuilder("Professor Kanchanawanchai");
    System.out.println("String capacity: " + stringBuffer.capacity());
    System.out.println("String length: " + stringBuffer.length());
    System.out.println(stringBuffer.replace(1,5,"ABCDE"));
    System.out.println(stringBuilder.append(" is my teacher"));




    }

}
