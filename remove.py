# Given nums = [3,2,2,3], val = 3,

# Your function should return length = 2, with the first two elements of nums being 2.

# It doesn't matter what you leave beyond the returned length.

# CODE

def removeElement(self, nums: List[int], val: int) -> int:
    N=len(nums)-1
        while N >=0:
            if(nums[N]==val):
                nums.remove(val)
            N-=1
        return(len(nums))
