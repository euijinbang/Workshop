import numpy as np
from scipy.sparse import csr_matrix

row = np.array([0, 0, 1, 2, 2, 2])
col = np.array([0, 2, 2, 0, 1, 2])
data = np.array([1, 2, 3, 4, 5, 6])

mat = csr_matrix((data, (row, col)), shape=(3, 3))
mat2 = csr_matrix((data, (row, col)), shape=(3, 3)).toarray()

print(mat)
print(mat2)
print('---------------------')
print('shape:', mat.shape)
print('---------------------')
print(mat.nonzero())  # x좌표, y좌표
rows, cols = mat.nonzero()
print('---------------------')
print(mat.shape[0])
print(mat.shape[1])
print('---------------------')
print(rows)
print(cols)
print('---------------------')
z = zip(rows, cols)
print(list(z))
print('---------------------')
# for row, col in zip(rows, cols):
#     print(row)
#     print(col)
#     print('---')
# print(mat[0])  # 첫 행을 출력 (0이 아닌 값)
# print(mat[0].nonzero())  # x좌표, y좌표
# print(mat[0].nonzero()[0])  # x좌표 벡터화
# print(mat[0].nonzero()[1])  # y좌표 벡터화






