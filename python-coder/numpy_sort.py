import numpy as np

a = np.array([[4, 3, 5, 7],
             [1, 12, 11, 9],
             [2, 15, 1, 14]])

print(a)

# axis=0 이면 각가의 열을 행 축 기준 위에서 아래로 정렬
# axis=1 이면 각각의 행을 열 축 기준 왼쪽에서 오른쪽으로 정렬
b = np.sort(a, axis=0)
c = np.sort(a, axis=1)
print(b)
print(c)

# 정렬된 순서만 알고 싶을 때 사용(index)
d = np.argsort(a, axis=0)
e = np.argsort(a, axis=1)
print(d)
print(e)



