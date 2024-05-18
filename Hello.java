import java.util.*;
public class Hello {
    public static boolean UniqueAl(String a,int k){
        Set<Character> set=new HashSet<>();
        for(char i : a.toCharArray()){
            set.add(i);
        }
        return set.size()==k;
    }

    public static void main(String[] args) {
		//Longest substring K unique Alphabets
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int k=sc.nextInt();
		
		int max=0;
		for(int i=0;i<str.length();i++){
		    for(int j=i;j<str.length();j++){
		        if(UniqueAl(str.substring(i,j+1),k)){
		            int mm=(str.substring(i,j+1)).length();
		            if(mm>max){
		                max=mm;
		            }
		        }
		    }
		}System.out.print(max);

	}
}
