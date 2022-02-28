import numpy as np
from scipy.sparse import csr_matrix
import sys

import pickle


def load(path):
    return pickle.load(open(path, "rb"))


R_train = load('./tiny/R_train.pkl')
mat = csr_matrix(R_train)
print(mat)
rows, cols = R_train.nonzero()
z = zip(rows, cols)
# print(list(z))

print('---------------------')

for row, col in zip(rows, cols):
    pass
