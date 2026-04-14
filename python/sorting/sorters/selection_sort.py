def sort(list):
    for i in range(len(list) - 1):
        lowest_value_index = i
        for j in range(i + 1, len(list)):
            if list[j] < list[lowest_value_index]:
                lowest_value_index = j
        if lowest_value_index != i:
            list[i], list[lowest_value_index] = list[lowest_value_index], list[i]
    return list