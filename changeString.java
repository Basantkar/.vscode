import java.util.*;

public class changeString{
    public static void main(String[] args){
    //     String input="Geeks for gesks";
    //     StringBuilder  input1= new StringBuilder();
    //     input1.append(input);
    //     // reverse StrringBuilder INPUT 1
    //     input1.reverse();
    //     // print reversse String
    //     System.out.println(input1);
    // }
    // }
    //{{{{{{{{{ use lower case as a input }}}}}}}}}
   Scanner in = new Scanner (System.in);
   System.out.print("input a string:");
   String line = in.nextLine();
   line=line.toLowerCase();
System.out.println(line);
    }
}
