import re


# 1 find phone number in the text
text = 'I have called the service desk 100 times and nobody replies to me. I need a conversation ASAP!! My number is 111-1234567!'
result = re.findall('111-1234567', text)
print(result)



#2 find all phone numbers in the text
text = '111-1234567! That is my number! The other one is 7654321!'
result = re.findall(r"^\d{3}-\d{7}|^\d{7}", text)
print (result)



# 3 Open file, read it and count how many times the word "essay" appears in the text
text = open("essay.txt", "r", encoding="utf-8")
text = text.read()


pattern = re.findall("essay", text)
print (len(pattern))



# 4

raw = "economic"
pattern = re.findall(raw, text)
print(pattern)

# 5

raw = "economic"
pattern = re.findall(raw, text)
print(pattern)