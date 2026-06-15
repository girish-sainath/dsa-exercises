class Solution:
    def merge(self, intervals: list[list[int]]) -> list[list[int]]:
        intervals.sort(key = lambda i : i[0])
        merged_intervals = [intervals[0]]
        for start, end in intervals[1:]:
            last_end = merged_intervals[-1][1]
            if start <= last_end:
                merged_intervals[-1][1] = max(last_end, end)
            else:
                merged_intervals.append([start, end])
        return merged_intervals

if __name__ == '__main__':
    solution = Solution()

    intervals = [[1,3],[2,6],[8,10],[15,18]]
    expected = [[1,6],[8,10],[15,18]]
    actual = solution.merge(intervals)
    print(f'\n\nInput: {intervals}')
    print(f'Expected: {expected}')
    print(f'Actual: {actual}')
    assert expected == actual, 'Expected output not returned'

    intervals = [[1, 4], [4, 5]]
    expected = [[1, 5]]
    actual = solution.merge(intervals)
    print(f'\n\nInput: {intervals}')
    print(f'Expected: {expected}')
    print(f'Actual: {actual}')
    assert expected == actual, 'Expected output not returned'