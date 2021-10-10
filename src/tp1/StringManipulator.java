package tp1;

import java.util.Locale;

public class StringManipulator {

    private String s;

    public StringManipulator(String s) {
        this.s = s;
    }

    public void reverse(){
        //do your stuff
        String f="";
        for (int i=this.s.length()-1;i>=0;i--){
            f=f+this.s.charAt(i);
        }
        System.out.println("reverse : "+f);
    }

    public void isPalindrome(){
        //do your stuff
        int i=0;
        int j=this.s.length()-1;

        boolean test=true;
        while (i<=j && test==true){
            if (this.s.charAt(i)!=this.s.charAt(j)){
                test=false;
            }
            i++;
            j--;
        }
        System.out.println("isplaindrome : "+test);

    }

    public void toUpperCase(){
        String f = this.s.toUpperCase();
        System.out.println("uppercase : "+f);
    }

    public void toLowerCase(){
        String f = this.s.toLowerCase();
        System.out.println("lowercase : "+f);
    }

    public void getVowelNumber(){
        int c=0;
        this.s=this.s.toLowerCase();
        for (int i=0;i<this.s.length();i++){
            if (this.s.charAt(i)=='a'||this.s.charAt(i)=='i'||this.s.charAt(i)=='u'||this.s.charAt(i)=='e'||this.s.charAt(i)=='o'||this.s.charAt(i)=='y'){
                c++;
            }
        }
        System.out.println("vowelNumber : "+c);
    }

    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator("tenet");
        stringManipulator.reverse();
        stringManipulator.isPalindrome();
        stringManipulator.toUpperCase();
        stringManipulator.toLowerCase();
        stringManipulator.getVowelNumber();
    }
}
