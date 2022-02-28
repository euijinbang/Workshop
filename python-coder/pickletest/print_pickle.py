import pickle

# Unpickling files : get(read) the data
# rb = read + binary
infile = open('../tiny/item_ids.pkl', 'rb')
data = pickle.load(infile)
infile.close()

print(data)


def get_pickle(path):
    with open(path + '../data/cws/pkl/dict.pkl', 'rb') as inpc:
        data2 = pickle.load(inpc)

    return data2


