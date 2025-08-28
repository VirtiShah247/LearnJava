// The name of file name and class name should be same when there is public written before class name.
// E.g. public class Test
class Test
{
    public static void main(String[] args)
    {
        // int x = 01130;
        // int y = 0xFACE;
        // int z = 0b1101;
        // System.out.println(z);

        // float x = 10.5f;
        // System.out.println(x);

        // long l = 9234567890l;
        // System.out.println(l);

        // char c = 'a';
        // System.out.println(c);

        // boolean b = true;
        // System.out.println(b);

        // String s = "Hello";
        // System.out.println(s);

        // String s = "My\tName\nis\nShrey";
        // System.out.println(s);

        // float f = (float)12.5;
        // System.out.println(f);

        // char c = (char)97;
        // System.out.println(c);

        // long a = 97;
        // byte b = (byte)a;
        // System.out.println(b);

        // int i=0;
        // i+=1.5;
        // System.out.println(i);

        // int a = 11;
        // System.out.println(a>>1);

        // System.out.println("Hello World!");
        // System.out.println(Integer.MAX_VALUE);
    }
}
/*
Identifiers in Java:
1. a-z,A-Z,0-9,_,$
2. Space is not allowed in variable name.
3. Variable name should not start with numbers.
4. Variable name should not contain reserved keywords. E.g. if, else, etc.
5. Predefined classes can be used but it is advisable.
6. SELECT, FROM, ... Query keywords are not advisable.


Naming conventions in Java:
-> variable name - should start with lowercase, if more than one word then use camel case.
-> class name - should start with uppercase and camel case.
-> method name - should start with lowercase.
-> interface name - should start with uppercase.
-> package name - should start with lowercase and seperated with ".".
-> constants name - In capital letters and if more than one word then seprate it with _.


Data Types in Java:
1. Primitive Data Types

    i. Integer Data Types
        - byte
        - short
        - int
        - long

    ii. Floating Data Types
        - float 
        - double

    iii. Character Data Types
        - char

    iv. Boolean Data Types
        - boolean

2. Non Primitive Data Types - String, Array


Literals in Java:
1. Integer literals:
    - decimal literals (0-9)
    - octal literals (0-7) starts with 0
    - hexagonal literals (0-9,a-f,A-F) starts with 0x
    - binary litrals (0,1) starts with 0b

2. Floating literals:
    - float literals E.g. float x = 10.5f

3. Character literals:
    - Write the character in single quote
    
4. Boolean literals:
    - Only 2 valid values are true and false

5. String literals:
    - String s = "Hello";

    
Type Casting:
1. Widening (Implicit):
    - long l = 126;

2. Narrowing (Explicit):
    - float f = (float)12.5;
    - char c = (char)97;


Operators in Java:
1. Arithmetic operators -> +,-,*,/,%

2. Logical operators -> &&,||

3. Relational operators -> ==,!=,>=,<=,>,<

4. Assignment operators -> =

5. Bitwise operators -> &,|,^,~,<<,>>
    -> ~ -> Unary complement, Formula: (n+1)*-1
    -> << -> Shift left -> The value gets double
    -> >> -> Shift right -> The value gets half

6. Conditional or Ternary operator
    -> (condition) ? true value : false value

7. Increment or Decrement operator -> ++,--
 */