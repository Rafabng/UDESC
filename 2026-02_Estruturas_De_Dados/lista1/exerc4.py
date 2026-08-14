import sys

n = int(sys.argv[1])

# Exercício 4.7 -- Numero perfeito
def perfeito(num):
    soma = 0
    divisores = ''
    for i in range(1, num):
        if num % i == 0:
            soma+= i
            divisores += f'{i} '
    return soma == num, divisores

ehPerfeito, divisores = perfeito(n)
if ehPerfeito:
    print(f'{n} é PERFEITO!')
else:
    print(f'{n} é NÃO PERFEITO!')
print(f'Divisores: [{divisores[:-1]}]')