# (user_id, movie_id, rating)
line = "0::1193::5.0"

# (id, name)

token = line.strip().split('::')

print(token)
print("user_id " + token[0], "movie_id " + token[1], "rating" + token[2])
print(token[0][0])

# 'User%05d'%(int(token[0]))
print('User%05d'%int(token[0]))

line2 = "1::Toy Story (1995)::Animation|Children's|Comedy"

token2 = line2.strip().split('::')
id = token2[0]
title, year = token2[1].rsplit(' ', 1)
year = year[1:-1]
text = token2[2]
print(token2)
print(id)
print(title)
print(year)
print(text)


# print
s1 = "string"
num1 = 100
f1 = .10
d1 = 1.23456789
# print("%s, %d, %f, %f" % (s1, num1, f1, d1))
# # string, 100, 0.100000, 1.234568
#
# # %5d 5자리 확보 후 오른쪽 정렬
# print("%5d"%123)
# # %05d 5자리 확보 후 오른쪽 정렬, 빈칸 0
# print("%05d"%123)
# # %f 소수점 여섯자리까지 출력
# print("%f"%123.456789)
# # %7.1f 7자리 확보 후 소수점 첫째자리까지만 출력(둘째자리에서 반올림)
# print("%7.1f"%123.456789)
# # %7.3f 7자리 확보 후 소수점 3째자리까지만 출력
# print("%7.3f"%123.456789)
"""
string, 100, 0.100000, 1.234568
123
00123
123.456789
123.5
123.457
"""
