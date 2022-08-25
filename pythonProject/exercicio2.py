# Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
# mostrando uma mensagem de erro e voltando a pedir as informações.

nome = input("Olá, digite o seu nome: ")
senha = input("Digite a sua senha (a senha tem que ser diferente do nome): ")

while senha == nome:
    print("ERRO!")
    nome = input("Digite o seu nome: ")
    senha = input("Digite a sua senha (a senha tem que ser diferente do nome): ")