def calculate_prefix_sum_for_loop(arr: list[int]) -> list[int]:
    prefix_sum: list[int] = arr.copy()
    for i in range(1, len(arr)):
        prefix_sum[i] = prefix_sum[i - 1] + arr[i]
    return prefix_sum


def calculate_prefix_sum(arr: list[int]) -> list[int]:
    total = 0
    return [total := total + x for x in arr]


if __name__ == '__main__':
    arr: list[int] = [30, 60, 10, 40, 50, 20]
    prefix_sum_for_loop: list[int] = calculate_prefix_sum_for_loop(arr)
    prefix_sum: list[int] = calculate_prefix_sum(arr)
    print('Original List:')
    print(arr)
    print('Prefix Sum List - For Loop:')
    print(prefix_sum_for_loop)
    print('Prefix Sum List:')
    print(prefix_sum)