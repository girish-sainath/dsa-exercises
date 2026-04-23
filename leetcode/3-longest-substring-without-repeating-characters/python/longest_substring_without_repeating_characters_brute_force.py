class Solution(object):
    def length_of_longest_substring(self, s: str) -> int:
        n = len(s)
        res = 0
        for i in range(n):
            for j in range(i, n):
                if self.check_repetition(s, i, j):
                    res = max(res, j - i + 1) 
        return res

    def check_repetition(self, s: str, start: int, end: int) -> bool:
        chars = set()
        for i in range(start, end + 1):
            c = s[i]
            if c in chars:
                return False
            chars.add(c)
        return True


sol = Solution()
s = 'abcabcbb'
print(s)
print(sol.length_of_longest_substring(s))

s = 'bbbbb'
print(s)
print(sol.length_of_longest_substring(s))

s = 'pwwkew'
print(s)
print(sol.length_of_longest_substring(s))
