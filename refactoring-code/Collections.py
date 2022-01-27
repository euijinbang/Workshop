class Collections:
    def __init__(self):
        pass

    @staticmethod
    def forward():
        print('move forward')

    @staticmethod
    def left():
        print('move left')

    @staticmethod
    def right():
        print('move right')

    @staticmethod
    def backward():
        print('move backward')

    @staticmethod
    def move(key):
        dict = {'w': 'forward', 'a': 'left', 'd': 'right', 's': 'backward'}

        func = dict.get(key)

        if func is not None:
            print(func)


Collections.move('w')
