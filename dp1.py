#Longest palindrome string

#CODE

def palinn(s):
        n = len(s)
        dp = [[False] * n for _ in range(n)]
        max_l = 0
        posl=0
        posr=0
        for i in range(0,n):
            dp[i][i] = True
            if i+1 < n:
                dp[i][i+1] = s[i] == s[i+1]
                j=i+1
            if dp[i][j]:
                if j-i > max_l:
                    max_l = j-i
                    posl = i
                    posr = j
        for i in reversed(range(0,n-2)):
            for j in range(i+2,n):
                dp[i][j] = dp[i+1][j-1] and s[i]==s[j]
                if dp[i][j]:
                    if j-i > max_l:
                        max_l = j-i
                        posl = i
                        posr = j
        return s[posl:posr+1]
