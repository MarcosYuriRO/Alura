import os

restaurantes = ['Pizza', 'Sushi']

def main():
    os.system('cls')
    exibir_nome_do_programa()
    exibir_opcoes()
    escolher_opcao()

def exibir_nome_do_programa():
    print('Sabor Express')

def exibir_opcoes():
    print('1. Cadastrar restaurante')
    print('2. Listar restaurantes')
    print('3. Ativar restaurante')
    print('4. Sair\n')

def escolher_opcao():
    try:
        opcao_escolhida = int(input('Escolha uma opção: '))

        if opcao_escolhida == 1:
            cadastrar_novo_restaurante()
        elif opcao_escolhida == 2:
            listar_restaurantes()
        elif opcao_escolhida == 3:
            print('Ativar restaurante')
        elif opcao_escolhida == 4:
            finalizar_app()
        else:
            opcao_invalida()
    except:
        opcao_invalida()

def cadastrar_novo_restaurante():
    os.system('cls')
    print('Cadastro de novos restaurantes\n')
    nome_do_restaurante = input('Digite o nome do restaurante que deseja cadastrar: ')
    restaurantes.append(nome_do_restaurante)
    print(f'O restaurante {nome_do_restaurante} foi cadastrado com successo!')
    voltar_ao_menu()

def listar_restaurantes():
    os.system('cls')
    print('Listagem de todos os restaurantes:')
    for restaurante in restaurantes:
        print(f'{restaurante}')
    voltar_ao_menu()

def finalizar_app():
    os.system('cls')
    print('Finalizando o app')

def opcao_invalida():
    print('Opção inválida!\n')
    voltar_ao_menu()

def voltar_ao_menu():
    input('\nDigite uma tecla para voltar ao menu principal\n')
    main()

if __name__ == '__main__':
    main()