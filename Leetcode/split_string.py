class Solution:

    def balancedStringSplit(self, s: str) -> int:

        count = 0
        balance = 0
        for c in s:
            if c == 'R':
                balance += 1
            else:
                balance -= 1
            if balance == 0:
                count += 1

        return count



sol = Solution()
input_str = input("Enter a string: ")
result = sol.balancedStringSplit(input_str)
print(result) # Output: 4