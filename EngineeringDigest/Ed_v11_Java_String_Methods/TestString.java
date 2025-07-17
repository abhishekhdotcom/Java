package Ed_v11_Java_String_Methods;

public class TestString {
    public static void main(String[] args) {
        String name = "Krishna";
        int length = name.length(); // find length
        System.out.println(length);

        char c = name.charAt(3); // find charactor
        System.out.println(c);

        String name2 = "Radha";
        boolean isEqual = name.equals(name2); // check equality
        System.out.println(isEqual);

        String name3 = "radha";
        boolean isEqual1 = name2.equalsIgnoreCase(name3); // check equality ignore case sensetive
        System.out.println(isEqual1);

        String str1 = "remote";
        String str2 = "rimote"; // incorrect spelling
        int i = str1.compareTo(str2); // compareTo
        System.out.println(i);

        String str3 = "Remote"; // capital case
        String str4 = "remote"; // small case
        int i1 = str3.compareToIgnoreCase(str4); // compare char ignore case sensetive
        System.out.println(i1);

        String name1 = "sri krishna";
        String subStrings = name1.substring(4); // substring
        System.out.println(subStrings);

        String myName = "abhishekh kumar";
        String capitalName = myName.toUpperCase(); // Convert Upper Case
        System.out.println(capitalName);

        String nameWithSpace = "    abhishekh kumar";
        String removeSpace = nameWithSpace.trim(); // Remove white space
        System.out.println(removeSpace);

        String myName1 = "Abhishekh pal";
        String replaceMyName = myName1.replace("pal", "Kumar"); // replace string
        System.out.println(replaceMyName);

        String myName2 = "pal Abhishekh pal pal";
        String replaceMyName1 = myName2.replaceFirst("pal", "Kumar"); // replace only first matched string
        System.out.println(replaceMyName1);

        String myName3 = "pal Abhishekh pal pal";
        String replaceMyName2 = myName3.replaceAll("pal", "Kumar"); // replace all matched string
        System.out.println(replaceMyName2);

        String myName4 = "abhishekh kumar";
        boolean isContain1 = myName4.contains("ish"); // check string contain
        boolean isContain2 = myName4.contains("j"); // check char contain
        System.out.println(isContain1);
        System.out.println(isContain2);

        String myName5 = "abhishekh kumar";
        boolean isStartWith1 = myName5.startsWith("ish"); // check startWith case sensitive
        boolean isStartWith2 = myName5.startsWith("abhi"); // check startWith case sensitive
        System.out.println(isStartWith1);
        System.out.println(isStartWith2);

        String myName6 = "abhishekh kumar";
        boolean isEndWith1 = myName6.endsWith("pal"); // check endWith case sensitive
        boolean isEndWith2 = myName6.endsWith("kumar"); // check endWith case sensitive
        System.out.println(isEndWith1);
        System.out.println(isEndWith2);

        String s1 = ""; // space count
        String s2 = " "; // space count
        boolean isEmptys1 = s1.isEmpty(); // check is empty
        boolean isEmptys2 = s2.isEmpty(); // check is empty
        System.out.println(isEmptys1);
        System.out.println(isEmptys2);

        String s3 = "";
        String s4 = "  ";
        String s5 = "a";
        boolean isBlanks1 = s3.isBlank(); // check is blank
        boolean isBlanks2 = s4.isBlank(); // check is blank
        boolean isBlanks3 = s5.isBlank(); // check is blank
        System.out.println(isBlanks1);
        System.out.println(isBlanks2);
        System.out.println(isBlanks3);

        String myNames = "abhishekh kumar";
        int mynameIdx = myNames.indexOf("h"); // find first matched string
        System.out.println(mynameIdx);

        String myNames1 = "abhishekh kumar";
        int mynameIdx1 = myNames1.lastIndexOf("h"); // find last matched string
        System.out.println(mynameIdx1);
        System.out.println("Program run successfully!");
    }
}
