import java.io.*;
import java.util.*;

public class Balanced_Brackets{
static class Stack{
int top=-1;
char items[]=new char[100];

void push(char x){//2
if(top==99){  //1
System.out.println("Stack is full");
}   //1
else
items[++top]=x;
} //2

char pop(){//5
if(top==-1){ //3
System.ou.println("Stack is empty");
} //3
else
{ //4
char element = items[top];
top--;
retrun element;
} //4
}//5

boolean isEmpty(){//6
return (top==-1)?true:false;
} //6

static boolean isMatchingPair(char c1, char c2){
if(c1=='(' && c2==')'){
return true;}
else if(c1=='{' && c2=='}'){
return true;}
else if(c1=='[' && c2==']'){
return true;}
else
return false;
}

static boolean Balanced(exp[]){
Stack st = new Stack();
for(int i=0;i<exp.length;i++){
if(exp[i]=='{' || exp[i]=='(' || exp[i]=='['){
st.push(exp[i]);
}
if(exp[i]=='}' || exp[i]==')' || exp[i]==']'){
if(st.isEmpty()){                   //checking whether the stack is Empty
return false;
}
else if(!isMatchingPair(st.pop(), exp[i])){
return false;
}
}
}
if(st.isEmpty()) 
return true; /*balanced*/
else{   
return false; 
}  
}
public static void main(String[] args)  
    { 
        char exp[] = {'{','(',')','}','[',']'}; 
          if (Balanced(exp)) 
            System.out.println("Balanced "); 
          else
            System.out.println("Not Balanced ");   
    } 
  
}   
 




		 