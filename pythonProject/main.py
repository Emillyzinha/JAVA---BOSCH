# Faça um programa que peça uma nota, entre zero e dez.
# Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

numero = int(input("Diga uma nota entre 0 e 10: "))

while numero > 10:
    numero = int(input("Por favor, digite uma nota entre 0 e 10: "))