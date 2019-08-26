import java.io.*;
import java.util.*;

public class Balanced_Brackets
{
    static class Stack
    {
    int top=-1;
    char items[]=new char[100];
    void push(char x)
        {
        if(top==99)
            {  
            System.out.println("Stack is full");
            }   
        else
        items[++top]=x;
        } 

char pop(){
if(top==-1){ 
System.out.println("Stack is empty");
return '\0';
} 
else
{ 
char element = items[top];
top--;
return element;
} 
}

boolean isEmpty(){
return (top==-1)?true:false;
} 
}
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

static boolean Balanced(char exp[])
{
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
        char exp[] = {'{','(',')','}','[',']', '{'}; 
          if (Balanced(exp)) 
            System.out.println("Balanced "); 
          else
            System.out.println("Not Balanced ");   
    } 
    
}
