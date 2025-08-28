// display alphabets and vowels.
// display 1 to 100 and odd no
class ThreadRunParent4 extends Thread{
    public void run(){
        for(int i=0; i<26; i++){
            char alpha = (char)(i+97);
            System.out.println(alpha);
            // if(alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u'){
            //     System.out.println(alpha + " vowel");
            // }
        }
        for(int i=0; i<100; i++){
            if((i+1)%2 != 0){
                System.out.println((i+1)+ " ODD");
            }
        }
    }
}
class ThreadRunChild4 extends Thread{
    // static Thread obj;
    public void start(){
        super.start();
        try {
            
            // super.join();
            for(int i=0; i<26; i++){
                char alpha = (char)(i+97);
                // System.out.println(alpha);
                if(alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u'){
                    System.out.println(alpha + " vowel");
                }
            }
            for(int i=0; i<100; i++){
                // System.out.println(i+1);
               System.out.println((i+1));
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
public class ThreadExample4 {
    public static void main(String[] args) {
        ThreadRunChild4 r4 = new ThreadRunChild4();
        r4.start();
        ThreadRunParent4 r5 = new ThreadRunParent4();
        r5.start();


        // ThreadRun5 r5 = new ThreadRun5();
        // r5.start();
    }
}
