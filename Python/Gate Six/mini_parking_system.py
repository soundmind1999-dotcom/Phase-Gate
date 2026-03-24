parking_slots = [0] * 20

def park_car_automatic():
    for index in range(len(parking_slots)):
        if parking_slots[index] == 0:
            parking_slots[index] = 1
            return True
    return False


def park_at_slot(slot_number):
    if slot_number < 1 or slot_number > 20:
        return False

    if parking_slots[slot_number - 1] == 0:
        parking_slots[slot_number - 1] = 1
        return True
    return False


def remove_car(slot_number):
    if slot_number < 1 or slot_number > 20:
        return False

    if parking_slots[slot_number - 1] == 1:
        parking_slots[slot_number - 1] = 0
        return True
    return False


def display_parking_status():
    available_spaces = 0
    filled_spaces = 0

    for slot in parking_slots:
        if slot == 0:
            available_spaces += 1
        else:
            filled_spaces += 1

    return available_spaces, filled_spaces



