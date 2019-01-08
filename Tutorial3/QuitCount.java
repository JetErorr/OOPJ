package Tutorial3;

import java.util.*;
class QuitCount{
public static int a,e,i,o,u;
public static void main(String[] args){
Scanner Sc =new Scanner(System.in);
String s=new String();
while(true){
int ta=0,te=0,ti=0,to=0,tu=0;
System.out.println("Enter A line :");
s=Sc.nextLine();
if(s.equals("quit")){
break;
}else{
int n=s.length()-1;
for(int x=0;x<=n;x++){
switch(s.charAt(x)){
case 'a' : case 'A' : a++; ta++; break;
case 'e' : case 'E' : e++; te++;break;
case 'i' : case 'I' : i++;  ti++; break;
case 'o' : case 'O' : o++; to++; break;
case 'u' : case 'U' : u++; tu++; break;
    }
}
System.out.println("\n\n In this statement: a ="+ta+"e ="+te+"i ="+ti+"o ="+to+"u ="+tu);
}
} 
System.out.println("\n\n Total numbers of the vowels: a="+a+"e="+e+"i="+i+"o="+o+"u="+u);
Sc.close();
}
} 