
#1
#find index of o
x = ['p','y','t','h','o','n']
print(x.index('o'))

#2
#Find string in array
x = ["Moon","Earth","Jupiter"]
print(x.index("Earth"))

#3
# Find number 7 in array
x = [5,1,7,0,3,4]
print(x.index(7))

#4
#Find multiple occurrences
x = [5,1,7,0,3,4,5,3,2,6,7,3,6]
get_indexes = lambda x, xs: [i for (y, i) in zip(xs, range(len(xs))) if x == y]
print(get_indexes(7,x))