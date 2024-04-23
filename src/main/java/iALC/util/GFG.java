package iALC.util;

//Java program to remove invalid parenthesis
import java.util.*;

public class GFG{
	
	public String tratado;


//method checks if character is parenthesis(open
//or closed)
public boolean isParenthesis(char c)
{
 return ((c == '(') || (c == ')'));
}

//method returns true if string contains valid
//parenthesis
static boolean isValidString(String str)
{
 int cnt = 0;
 for (int i = 0; i < str.length(); i++)
 {
     if (str.charAt(i) == '(')
         cnt++;
     else if (str.charAt(i) == ')')
         cnt--;
     if (cnt < 0)
         return false;
 }
 return (cnt == 0);
}

//method to remove invalid parenthesis
public String removeInvalidParenthesis(String str)
{
 if (str.isEmpty())
     return "";

 // visit set to ignore already visited string
 HashSet<String> visit = new HashSet<String>();

 // queue to maintain BFS
 Queue<String> q = new LinkedList<>();
 String temp;
 int count=0;
 boolean level = false;

 // pushing given string as
 // starting node into queue
 q.add(str);
 visit.add(str);
 while (!q.isEmpty())
 {
     str = q.peek(); q.remove();
     if (isValidString(str))
     {
         if (count==0) {
    	 System.out.println(count+"  "+str);
    	 this.tratado=str;
         }
         count++;
         // If answer is found, make level true
         // so that valid string of only that level
         // are processed.
         level = true;
     }
     if (level)
         continue;
     for (int i = 0; i < str.length(); i++)
     {
         if (!isParenthesis(str.charAt(i)))
             continue;

         // Removing parenthesis from str and
         // pushing into queue,if not visited already
         temp = str.substring(0, i) + str.substring(i + 1);
         if (!visit.contains(temp))
         {
             q.add(temp);
             visit.add(temp);
         }
     }
 } return tratado;
}

//Driver Code
//public static void main(String args[])
public String testeParenteses(String formula )
{
	

 //String expression = "()())()";
 //removeInvalidParenthesis(expression);

 //expression = "()v)";
// removeInvalidParenthesis(expression);
 
 //String expression = "(∀R.Aa ≫ Bb)))))))) "; //((∀R.(Aa ≫ Bb)) ≫ (ƎR.Aa ≫ ƎR.Bb))
 return removeInvalidParenthesis(formula);

 //String expression = "(((∀R.(Aa ≫ Bb)) ≫ (ƎR.Aa ≫ ƎR.Bb))"; //((∀R.(Aa ≫ Bb)) ≫ (ƎR.Aa ≫ ƎR.Bb))
 //removeInvalidParenthesis(expression);
 
 
 //expression = "(∀R.(Aa ≫ Bb))";
 //removeInvalidParenthesis(expression);

 
}
}