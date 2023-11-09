class ListComparator:
    def __init__(self, list1, list2):
        self.list1 = list1
        self.list2 = list2

    def calculate_average(self, numbers):
        return sum(numbers) / len(numbers)

    def compare_lists(self):
        average1 = self.calculate_average(self.list1)
        average2 = self.calculate_average(self.list2)
        
        if average1 > average2:
            return "Первый список имеет большее среднее значение"
        elif average2 > average1:
            return "Второй список имеет большее среднее значение"
        else:
            return "Средние значения равны"

# Проверка сравнения списков
list1 = [1, 2, 3, 4, 5]
list2 = [6, 7, 8, 9, 10]

comparator = ListComparator(list1, list2)
result = comparator.compare_lists()
print(result)