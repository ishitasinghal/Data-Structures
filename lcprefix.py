# Problem Statement
# (Source: leetcode)
# Write a function to find the longest common prefix string amongst an array of strings.
# If there is no common prefix, return an empty string "".

# CODE

    def longestCommonPrefix(self, strs: List[str]) -> str:
        lcp = ""
        if len(strs) == 0:
            return lcp
        minlen = len(strs[0])
        for i in range(len(strs)):
            minlen=min(len(strs[i]),minlen)
        i =0
        while i<minlen:
            char=strs[0][i]
            for j in range(1,len(strs)):
                #print(strs[j][i])
                if strs[j][i] != char:
                    return lcp
            lcp=lcp+char
            i +=1
        return lcp
