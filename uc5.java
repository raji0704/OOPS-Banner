public class uc5 {
    public static void main(String[] args){
        String[] l = {
            (String.join(" ","    ***    ","    ***    ","******   ","   *****")),
            (String.join(" "," **     ** "," **     ** ","**    ** "," **     ")),
            (String.join(" ","**       **","**       **","**     **","**      ")),
            (String.join(" ","**       **","**       **","**    ** "," **     ")),
            (String.join(" ","**       **","**       **","******   ","   ***  ")),
            (String.join(" ","**       **","**       **","**       ","     ** ")),
            (String.join(" ","**       **","**       **","**       ","      **")),
            (String.join(" "," **     ** "," **     ** ","**       ","     ** ")),
            (String.join(" ","    ***    ","    ***    ","**       ","*****   "))
        };

        for(int i = 0; i < l.length; i++) {
            System.out.println(l[i]);
        }
    }
}