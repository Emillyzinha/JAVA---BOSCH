# Faça um programa que leia e valide as seguintes informações:
# Nome: maior que 3 caracteres;
# Idade: entre 0 e 150;
# Salário: maior que zero;
# Sexo: 'f' ou 'm';
# Estado Civil: 's', 'c', 'v', 'd';
from Tools.scripts.fixcid import Char

nome = input("Informe o seu nome: ")
while len(nome) < 3:
    nome = input("O seu nome tem que ter mais de 3 caracteres: ")

idade = int(input("Informe a sua idade: "))
while idade > 150:
    idade = int(input("Sua idade tem que ser menor: "))

salario = int(input("Informe o seu salário: "))
while salario < 0:
    salario = int(input("Seu salário tem que ser maior: "))

sexo = input("Informe o seu sexo:\n "
             "[f]\n"
             "[m]\n").lower()
while sexo != 'f' and sexo != 'm':
    sexo = input("Informe o sexo com uma dessas opções:\n"
          "[f]\n"
          "[m]\n").lower()

estadoC = input("Informe o seu estado civil com uma letra:\n "
                "Solteira (s)\n"
                "Casado (c)\n"
                "Viúva (v)\n"
                "Divorciada (d)\n").lower()
while estadoC != 's'and 'c' and 'v' and 'd':
    estadoC = input("Informe o seu estado civil com uma das opções abaixo:\n "
                    "Solteira (s)\n"
                    "Casado (c)\n"
                    "Viúva (v)\n"
                    "Divorciada (d)\n").lower()