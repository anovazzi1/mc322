## Lab 04

Fernando dos Reis Santos Filho

Otavio Anovazzi

## Resta Um

O [Resta Um](https://en.wikipedia.org/wiki/Peg_solitaire) (Peg Solitaire em inglês) é um jogo antigo cujo primeiro registro é de 1687. Ele é constituído de um tabuleiro em formato de cruz com todas as casas preenchidas por pedras, exceto a do meio. Trata-se de um jogo para se jogar sozinho. Em cada movimento do jogo, cada peça pode “comer” outra pulando-a (no mesmo estilo do jogo de damas). Tal como na dama, o pulo só pode acontecer se do outro lado houver um espaço vago; a peça comida desaparece. O único movimento permitido é esse de “comer” e ele só pode ser realizado nas quatro direções: cima, baixo, direita e esquerda; não são permitidos movimentos diagonais. O desafio final é só deixar uma única pedra no tabuleiro. O risco é que alguma pedra fique sem nenhum vizinho pois, nesse caso, ela não poderá se mover.

O seu desafio aqui é escrever um conjunto de [classes](https://github.com/FerFilho23/MC322/tree/main/lab04/src/mc322/lab04) que simule o funcionamento do Resta Um. Deve haver pelo menos uma classe cujo objeto represente o tabuleiro e outra cujos objetos representem as peças do tabuleiro.
Os movimentos a serem jogados no tabuleiro serão recebidos a partir da chamada de um método de um objeto, cuja classe já está codificada. O estado inicial do tabuleiro e seu novo estado depois de cada movimento deve ser mostrado no console na forma de caracteres.

## Entrada do Programa:
	
  A entrada do programa será um arquivo [`.csv`](https://github.com/FerFilho23/MC322/tree/main/lab04/db) contendo todos os comandos a serem executados pelo jogo. Cada comando consistirá de uma posição inicial (posição da peça a ser movida) e uma posição final (posição para onde a peça selecionada será movida). No arquivo `.csv` os comandos serão separados por vírgulas, ou seja, cada comando, contendo posição inicial e final, será separado por vírgula do próximo. Está sendo disponibilizado uma classe ([CSVReader](https://github.com/FerFilho23/MC322/blob/main/lab04/src/mc322/lab04/CSVReader.java)) para ler esse arquivo .csv e retornar a entrada pronta num vetor de String, onde cada posição desse vetor consiste da posição inicial e da posição final separadas por ":".
	Exemplo de uma posição do vetor contendo as entradas: f4:d4. Nesse exemplo, a posição inicial é a coluna f e a linha 4 e a posição final é a coluna d e a linha 4.

## Saída do Programa:
	
  O programa tem duas saídas possíveis: uma saída no console (saída padrão) e um vetor de strings em que cada posição do vetor contém uma string com o estado do tabuleiro.
A saída do programa deve ser impressa na saída padrão STDOUT e deve imprimir a posição inicial (source) e final (target) da peça que vai ser movimentada na rodada, bem como o estado do tabuleiro após a movimentação. Antes da primeira movimentação imprima o estado inicial do tabuleiro, como demonstrado abaixo:

![image](https://user-images.githubusercontent.com/56443820/115719120-2c407680-a352-11eb-8c59-67d6ec349d50.png)

