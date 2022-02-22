# text의 경우 유니코드 필수!
# open('filepath.txt', 'wt', encoding='utf8').write('가나다')

import pickle
# Pickling files : make a file and save data in it
# wb = write + binary
dogs_dict = {'Ozzy': 3, 'Filou': 8, 'Luna': 5, 'Skippy': 10, 'Barco': 12, 'Balou': 9, 'Laika': 16 }
filename = 'dogs.pkl'

outfile = open(filename, 'wb')
pickle.dump(dogs_dict, outfile)  # object, file
outfile.close()


# Unpickling files : get(read) the data
# rb = read + binary
infile = open(filename, 'rb')
new_dict = pickle.load(infile)
infile.close()

print(new_dict)
print(new_dict == dogs_dict)