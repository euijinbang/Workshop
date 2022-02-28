import numpy as np
from scipy.sparse import csr_matrix

R = csr_matrix(np.array([
    [0, 5, 0, 4],
    [0, 4, 5, 4],
    [5, 0, 5, 0],
]))

b = (R * R.transpose()).toarray()
# print(b)

b[range(3), range(3)] = 0
# print(b)

sim = b
topk = sim.argsort(axis=1)[:, -K:]  # 행을 열 축 기준으로 좌에서 우로 인덱스 뽑기
print(topk)

