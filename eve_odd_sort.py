#Bringing eve to one side and odd to 
#the other side of the array
#without using a thrrd array

arr = [3,4,6,1,8,34,2,9,90,31]
n=len(arr)
j=n-1
i=0
while(i!=j+1):
    if(arr[i]%2==1 and arr[j]%2==0):
        arr[i],arr[j]=arr[j],arr[i]
        i+=1
        j-=1
    elif(arr[i]%2==1 and arr[j]%2==1):
        i+=1
print(arr)
