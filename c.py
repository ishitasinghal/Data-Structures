# Given two integers dividend and divisor, 
# divide two integers without using multiplication, 
# division, and mod operator.
# Return the quotient after dividing dividend by divisor.
# The integer division should truncate toward zero, which 
# means losing its fractional part. For example, 
# truncate(8.345) = 8 and truncate(-2.7335) = -2.

# CODE
flag = (dividend < 0) ^ (divisor < 0)
        u = abs(dividend)
        d = abs(divisor)
        
        m = 1
        nd = d
        while nd<<1 <= 1<<31:
            nd <<= 1
            m <<= 1
        
        ans = 0
        while nd >= d:
            if u >= nd:
                ans += m
                u -= nd
            m >>= 1
            nd >>= 1
        
        if flag:
            return max(-1<<31, min((1<<31)-1, -ans))
        else:
            return max(-1<<31, min((1<<31)-1, ans))
