import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int i, j, len;
		for(i=0;i<a.length();i++){
		    for(j=i+1;j<a.length();j++){
		        if(a.charAt(i) == a.charAt(j)){
		            System.out.println("not isogram");
		            return;
		        }
		    }
		}
	}
}
