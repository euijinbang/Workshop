import numpy as np
from scipy.sparse import csr_matrix

row = np.array([0, 0, 1, 2, 2, 2])
col = np.array([0, 2, 2, 0, 1, 2])
data = np.array([1, 2, 3, 4, 5, 6])

mat = csr_matrix((data, (row, col)), shape=(3, 3))
mat2 = csr_matrix((data, (row, col)), shape=(3, 3)).toarray()

print(mat)
print(mat2)
print('shape:', mat.shape)
print(mat[0])
print(mat[0].nonzero())
print(mat[0].nonzero()[0])
print(mat[0].nonzero()[1])






