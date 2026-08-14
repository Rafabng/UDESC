import sys

# Usamos para ler os números direto do terminal
# 1 -> Começa a partir do primeiro
# : -> pega todos os números que eu digitar no terminal
# -2 -> com exceção dos últimos dois números
numeros = [int(valor) for valor in sys.argv[1:-2]]

# [-2] -> pego apenas o penúltimo dígito
# [-1] -> pega o último dígito
x,y = int(sys.argv[-2]), int(sys.argv[-1])

soma = int(numeros[x]) + int(numeros[y])

print(soma)