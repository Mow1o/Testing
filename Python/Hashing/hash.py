import hashlib

#1

# open file, read it and use
text = open("essay.txt", "r", encoding="utf-8")
text = text.read()

hash_value = hash(text)
print(hash_value)



#2
# open file in read binary mode, read it and use hashlib
Joo = open("essay.txt", "rb")
with open(hashlib.__file__, "rb") as Joo:
    bytes = Joo.read()
    hash_value1 = hashlib.sha256(bytes).hexdigest()
    print(hash_value1)