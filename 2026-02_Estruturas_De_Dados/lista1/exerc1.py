import sys

# Exercício 1.1

def soma_expressao():

	a = 3
	b = 5
	
	res = (2*a)*(3*b)
	print(res)

# Exercício 1.2

def soma_variaveis():

	a = int(input("Escolha o 1° número:"))
	b = int(input("Escolha o 2° número:"))
	c = int(input("Escolha o 3° número:"))
	
	res = a+b+c
	print(res)

# Exercício 1.3

def area_triangulo():

	b = 6
	h = 5
	
	res = (b*h)/2
	print(res)
	
# Exercício 1.4

def aumento_salario():

	salario = 3600
	aumento = 0.23*3600
	salario_atualizado = salario + aumento
	
	print(f"Salário: RS{salario}")
	print(f"Valor Aumento: RS{aumento}")
	print(f"Salário Atualizado: RS{salario_atualizado}")
	
# Exercício 1.5

def media_altura():
	n1 = float(input("Digite o 1° valor: "))
	n2 = float(input("Digite o 2° valor: "))
	n3 = float(input("Digite o 3° valor: "))
	n4 = float(input("Digite o 4° valor: "))

	media = (n1+n2+n3+n4)/4
	
	print(f"Média de altura: RS{media}")
	
# Exercício 1.6

def metros_mili():
	n1 = float(input("Digite o valor: "))

	mm = n1*1000
	
	print(f"Metros: {n1}")
	print(f"Milimetros: {mm}")
	
# Exercício 1.7

def converte_tempo():
	n1 = int(sys.arvg[1])
	n2 = int(sys.arvg[1])
	n3 = int(sys.arvg[1])
	n4 = int(sys.arvg[1])
	
	dias = n1*86400
	hrs = n2*3600
	min = n3*60
	
	total = dias + hrs + min + n4
	
	print(f"{dias} dias, {hrs} horas, {min}, minutos e {n4} segundos")
	print(f"Em segundos: {total}")

soma_variaveis()