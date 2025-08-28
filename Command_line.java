public class Command_line {
    public static void main(String[] args) {
        // int a = Integer.parseInt(args[0]);`
        // int b = Integer.parseInt(args[1]);
        // int c = a + b;
        // System.out.println(c);
        String name = args[0];
        int roll_no = Integer.parseInt(args[1]);
        String gender = args[2];
        boolean pass = Boolean.parseBoolean(args[3]);

        System.out.println("Name: "+name);
        System.out.println("Roll No: "+roll_no);
        System.out.println("Gender: "+gender);
        System.out.println("Pass: "+pass);
    }
}
/*
byte -> Byte.parseByte(args[0])
short -> Short.parseShort(args[0])
same type of syntax for int,long,float,double,boolean
string -> args[0]
char -> args[0].charAt(0)
 */