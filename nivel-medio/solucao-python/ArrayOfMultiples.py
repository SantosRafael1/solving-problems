
def return_multiples(number, length):
    numbers = [None] * length

    i = 1
    while(i < len(numbers)):
        numbers[i] = (number * i)
        i += 1
    
    return numbers

    
print(return_multiples(7, 5))
