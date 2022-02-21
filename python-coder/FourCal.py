class FourCal:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    # 이하 메서드는 객체의 초깃값 설정에 필요하므로 생성자로 대체한다.
    # def set_data(self, x, y):
    #     self.x = x
    #     self.y = y

    def add(self):
        result = self.x + self.y
        return result

    def sub(self):
        result = self.x - self.y
        return result

    def mul(self):
        result = self.x * self.y
        return result

    def div(self):
        result = self.x / self.y
        return result

#
# cal1 = FourCal(3, 5)
# cal2 = FourCal(4, 6)

# print(type(cal1))
# print(type(cal2))
#
# print('-------------')

# cal1.set_data(3, 5)
# cal2.set_data(4, 6)
# print(cal1.x)
# print(cal2.x)
#
# print('-------------')
#
# print(cal1.add())
# print(cal1.sub())
# print(cal2.mul())
# print(cal2.div())
#
# print('-------------')

# a = FourCal(5, 10)
# a.add()


class MoreFourCal(FourCal):
    def pow(self):
        result = self.x ** self.y
        return result

    # 메서드 오버라이딩
    def div(self):
        if self.y == 0:
            return 0
        else:
            return self.x / self.y


child = MoreFourCal(3, 5)
print(child.add())
print(child.mul())
print(child.pow())

aa = MoreFourCal(4, 0)
print(aa.div())