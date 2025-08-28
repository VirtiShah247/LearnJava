class Strings {
    public static void main(String[] args) {
        String s1 = "Hello student   how     are              you?";
        //  String[] w = s1.split(" ");
        String[] w = s1.split("\\s+");
        for(String ele:w)
        {
            System.out.println(ele);      
        }
    }
}
/*
String:
-> String is a class available in java.lang package.
-> It is a sequence of characters which can contain letters, numbers, special characters and spaces.
-> Once we create string object we can't modify it. If we try to modify then new object will be created. So string is immutable. 
-> Constructors:
    -> String s = new String();
    -> String s = new String(String s1);
    -> String s = new String(StringBuffer sb);        // To convert StringBuffer to String.
    -> String s = new String(char[] ch);         // To convert character array to string.
    -> String s = new String(byte[] b);         // To convert byte array to string.

-> Methods:
1. charAt:        // public char charAt(int) -> "Access-modifier return-type method(parameter-type)"
                  // returns the character of the string at the given index.
                  // String s = "Good";
                     sout(s.charAt(1));        // Output: o

2. length:        // public int length() -> "Access-modifier return-type method()"
                  // returns the length of the string.
                  // sout(s.length());         // Output: 4

3. concat         // public String concat(String)
                  // concatenates or joins two strings.
                  // s.concat("Morning");       // Output: Good -> because string is immutable.
                  // s = s.concat("Morning"); 
                     sout(s);         // Output: GoodMorning

4. toUpperCase    // public String toUpperCase()
                  // returns the string in Uppercase.
                  // String s1 = s.toUpperCase();
                     sout(s1);        // Output: GOOD


5. toLowerCase    // public String toLowerCase()
                  // returns the string in Lowercase.
                  // String s1 = s.toLowerCase();
                     sout(s1);        // Output: good

6. split          // public String[] split(String)
                  // split the string by given character.
                  // String s1 = "Hello how are you?";
                     String[] w = s1.split(" ");
                     for(String ele:w)
                     {
                        sout(ele);         // Output is: Hello
                                                         how 
                                                         are
                                                         you?
                     }

7. replace        // public String replace(char,char)
                  // replaces the every occurence of old character with new one.
                  // String s1 = "Hello";
                     s1 = s1.replace('e','a');
                     sout(s1);         // Output: Hallo     
                     
8. toString       // public String toString()
                  // converts into String.

9. startsWith     // public boolean starsWith(String)
                  // returns true if the string startsWith the mentioned substring else returns false.
                  // String s1 = "Hello";
                     sout(s1.startsWith("H"));         // Output: true

10. endsWith      // public boolean endsWith(String)
                  // returns true if the string endsWith the mentioned substring else returns false.
                  // String s1 = "Hello";
                     sout(s1.endsWith("o"));          // Output: true

11. indexOf       // public int indexOf(int)
                  // return the index of the given character and if character is not there then returns -1.
                  // sout(s1.indexOf('l'));           // Output: 2

12. lastIndexOf   // public int lastIndexOf(int)
                  // return the last index of the given character and if character is not there then returns -1.
                  // sout(s1.lastIndexOf('l'));           // Output: 3

13. toCharArray   // public char[] toCharArray()
                  // to convert the string into char array.
                  // char[] ch = s1.toCharArray();        // Output: {'H','e','l','l','o'}
                     
14. trim          // public String trim()
                  // to remove spaces from starting and ending of the string.
                  // String s1 = "    Hello       ";
                     s1 = s1.trim();
                     sout(s1);          // Output: Hello

15. equals        // public boolean equals(Object)
                  // content comparision
                  // String s1 = "Hello";
                     String s2 = new String("Hello");
                     sout(s1.equals(s2));       // Output: true -> because equals method compares the content of string.
                     sout(s1 == s2);        // Output: false -> because it compares the references of string.
                     
16. equalsIgnoreCase        // public boolean equalsIgnoreCase(String)
                            // ignores the cases while comparing.
                            // String s1 = "Hello";
                               String s2 = "HELLO";
                               sout(s1.equals(s2));       // Output: false
                               sout(s1.equalsIgnoreCase(s2));       // Output: true

17. compareTo     // public int compareTo(String)
                  // returns 0 if two strings are same else returns differences of lengths of both strings.
                  // String s1 = "hello";
                     String s2 = "hello";
                     sout(s1.compareTo(s2));        // Output: 0
                     
                     String s1 = "hello";
                     String s2 = "helloab";
                     sout(s1.compareTo(s2));        // Output: -2

                     String s1 = "Hello";
                     String s2 = "hello";
                     sout(s1.compareTo(s2));        // Output: -32 because the ASCII of H is 72 and of h is 104. So 72-104 = -32.

                     String s1 = "HEllo";
                     String s2 = "hello";
                     sout(s1.compareTo(s2));        // Output: -32 compares only the first different character that is H and h.

18. compareToIgnoreCase         // public int compareToIgnoreCase(String)
                                // same as compareTo, only difference is ignores the cases.

19. substring     // public String substring(int)       
                                            (int, int)
                  // by giving only one parameter, then it will return string starting from the starting index.
                  // by giving two parameter the first one is starting index and second is ending index.
                  // String s1 = "Hello! how are you?"
                     String s2 = s1.substring(7);
                     sout(s2);         // Output: how are you?
                     String s3 = s1.substring(11,14);
                     sout(s3);         // Output: are 


StringBuffer:
-> Constructors:
   -> StringBuffer sb = new StringBuffer();     -> Initial capacity = 16, New capacity = (old + 1) * 2
   -> StringBuffer sb = new StringBuffer(int capacity);     
   -> StringBuffer sb = new StringBuffer(String s);      -> This constructor is used when to convert string to stringbuffer.
   -> StringBuffer sb = new StringBuffer("Hello");      -> In this case the capacity will be length of string + 16. i.e. here 5 + 16 = 21

-> Methods:
1. append         // public StringBuffer append()
                  // similar to concate i.e. to add two strings.
                  // StringBuffer sb = new StringBuffer("Hi");
                     sb.append(10);
                     sout(sb);      -> Output: Hi10

2. insert         // public StringBuffer insert(int, )
                  // used to add a char, int, string, etc. at specified index.
                  // StringBuffer sb = new StringBuffer("HiHello");
                     sb.insert(2, "bye");
                     sout(sb);      -> Output: HibyeHello

3. replace        // public StringBuffer replace(int, int, "string")
                  // used to replace a string with another string.
                  // StringBuffer sb = new StringBuffer("HibyeHello");
                     sb.replace(2,5,"GM");
                     sout(sb);      -> Output: HiGMHello

4. delete         // public StringBuffer delete(int, int)
                  // used to delete a part of string.
                  // StringBuffer sb = new StringBuffer("HibyeHello");
                     sb.delete(2,5);
                     sout(sb);      -> Output: HiHello

5. reverse        // public StringBuffer reverse()
                  // used to reverse a string
                  // StringBuffer sb = new StringBuffer("Hi bye");
                     sb.reverse();
                     sout(sb);      -> Output: eyb iH

-> While creating StringBuffer it is mandatory to create it's object.
   E.g. StringBuffer sb = new StringBuffer("Hi bye");    -> It is valid
        StringBuffer sb = "Hi bye";    -> It is not valid

-> StringBuffer sb1 = new StringBuffer("Hi bye");
   StringBuffer sb2 = new StringBuffer("Hi bye");
   sout(sb1 == sb2)        -> Output: false
   sout(sb1.equals(sb2))   -> Output: false -> because here equals method is of Object class and not String class. And in Object class 
   the equals method does reference comparision.




-> 
*/
