a = [1, 2, 3, 4, 5, 6]
b = [3, 5, -3, 0, 1, 4]

c = []

for i in range(len(a)):
    if i % 2 == 0:
        c.append(a[i])
    else:
        c.append(b[i])

print(c)