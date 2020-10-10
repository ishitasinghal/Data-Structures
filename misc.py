##num = input()
##list2=[int(i)**3 for i in num]
##if(num==str(sum(list2))):
##    print("Armstrong")
##else:
##    print("Not armstrong")

##from collections import Counter
##arr = [2, 3, 3, 2, 5]
##print(Counter(arr))


##arr=[1,2,3,4,5,6,7,8]
##st = "This is a string"
##print(arr[::-1])
##print(st[::-1])


##def evesort(arr, i, j):
##    while(i<j):
##        while(arr[i]%2==0 and i<j):
##            i+=1
##        while(arr[j]%2==1 and i<j):
##            j-=1
##        if(i<j):
##            arr[i],arr[j]=arr[j],arr[i]
##            i+=1
##            j-=1
##    return(arr)
##        
##arr = [3,4,6,1,8,34,2,9,90,31]
##i=0
##j=len(arr)-1
##print(evesort(arr,i,j))        


##arr1= [1,4,3,6,8,9]
##arr2= [4,2,7,80,3,1]
##arr3= arr1
##for i in range(len(arr2)):
##    if(arr2[i] in arr3):
##        pass
##    else:
##        arr3.append(arr2[i])
##print(arr3)


def isPalindrome(x):
        stint = str(x)
        if(stint[0]=='-'):
            return("false")
        if(stint[::-1]==stint):
            return("true")
        else:
            return("false")
x=-121
print(isPalindrome(x))
        
