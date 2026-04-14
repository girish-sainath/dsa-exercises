def sort(list):
    n = len(list)
    swapped = True
    while swapped:
        swapped = False
        for i in range(n - 1):
            if list[i] > list[i + 1]:
                list[i], list[i + 1] = list[i + 1], list[i]
                swapped = True
    return list