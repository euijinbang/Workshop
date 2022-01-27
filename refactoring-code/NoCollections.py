class NoCollections:
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
        if key == 'w':
            NoCollections.forward()
        elif key == 'a':
            NoCollections.left()
        elif key == 'd':
            NoCollections.right()
        else:
            NoCollections.backward()


NoCollections.move('w')
