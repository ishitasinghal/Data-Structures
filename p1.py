# Problem Statement
# Given an unsorted array A of size N of non-negative integers, 
# find a continuous sub-array which adds to a given number S.

# Input:
# The first line of input contains an integer T denoting the 
# number of test cases. Then T test cases follow. Each test 
# case consists of two lines. The first line of each test case 
# is N and S, where N is the size of array and S is the sum. The 
# second line of each test case contains N space separated integers 
# denoting the array elements.

# Output:
# For each testcase, in a new line, print the starting and ending 
# positions(1 indexing) of first such occuring subarray from the 
# left if sum equals to subarray, else print -1.

# CODE

list1 = [3, 6, 2, 6, 9, 12, 5, 8, 4]
s = int(input())
while(sum<=s):
    
