

def find_largest_index_position(store):
    
    largest_value = store[0][0]
    row_index = 0
    col_index = 0

    for count in range(len(store)):           
        for counter in range(len(store[count])):  
            if store[count][counter] > largest_value: 
                largest_value = store[count][counter]
                row_index = count
                col_index = counter

    return (row_index, col_index)


