package Chapter_1;
import java.util.*;
public class Solution{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str=sc.next();
            //Complete the code
            boolean check=false;
            Stack st=new Stack();
            for(char ch:str.toCharArray()){

                if (ch == '(' || ch == '{' || ch == '['){

                    st.push(ch);
                    //System.out.println(st);
                }
                else{
                    if(st.empty()) {
                        System.out.println(false);
                        check=true;
                        break;
                    }
                    else{

                        char top = (Character) st.peek();
                        if(ch == ')' && top == '(' ||
                                ch == '}' && top == '{' ||
                                ch == ']' && top == '['){
                            st.pop();

                        }
                        else {
                            System.out.println(false);
                            check=true;
                            break;
                        }
                    }
                }
            }
            if(check) {
                check=false;
                break;
            }
            System.out.println(st.empty());
        }

    }
}
