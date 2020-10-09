#Bringing eve to one side and odd to 
#the other side of the array
#without using a thrrd array

def evesort(arr, i, j):
    while(i<j):
        while(arr[i]%2==0 and i<j):
            i+=1
        while(arr[j]%2==1 and i<j):
            j-=1
        if(i<j):
            arr[i],arr[j]=arr[j],arr[i]
            i+=1
            j-=1
    return(arr)
        
arr = [3,4,6,1,8,34,2,9,90,31]
i=0
j=len(arr)-1
print(evesort(arr,i,j))   
