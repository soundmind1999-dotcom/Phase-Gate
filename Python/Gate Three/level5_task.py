def complete_array(input_list, length):

    output = [-1] * length

    for number in range(min(len(input_list), length)):

        output[number] = input_list[number]
    
    return output




















