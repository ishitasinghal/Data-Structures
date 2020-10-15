Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true

CODE

class Solution:
    def isValid(self, s: str) -> bool:
        list1=[]
        for i in str:
            if(i=='{' or i=='[' or i=='('):
                list1.append(i)
            if(i==']' or i=='}' or i==')'):
                
        
