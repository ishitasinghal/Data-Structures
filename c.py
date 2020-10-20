# Given two integers dividend and divisor, 
# divide two integers without using multiplication, 
# division, and mod operator.
# Return the quotient after dividing dividend by divisor.
# The integer division should truncate toward zero, which 
# means losing its fractional part. For example, 
# truncate(8.345) = 8 and truncate(-2.7335) = -2.

# CODE
def divide(divisor, dividend):
    res=0
    if(divisor<0):
        res=dividend//(-1*divisor)
        return(-1*res)
    return(dividend//divisor)
