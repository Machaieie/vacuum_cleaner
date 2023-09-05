# Readme - Projeto Aspirador de Sujeira

Este é um projeto simples que simula o funcionamento de um aspirador de sujeira em uma sala. O código Java fornecido implementa um aspirador que percorre uma sala, detecta sujeira em posições aleatórias e a limpa. Este README fornecerá uma visão geral do projeto, explicará como funciona e como executá-lo.

## Visão Geral do Projeto

O projeto consiste em uma classe Java chamada `AspiradorDeSujeira`. Esta classe representa um aspirador de sujeira em uma sala com 20 posições. O aspirador é inicializado com a sala contendo sujeira em algumas posições aleatórias (com uma probabilidade de 30%). O objetivo é que o aspirador percorra a sala, identifique a sujeira e a limpe.

## Funcionalidades

O projeto oferece as seguintes funcionalidades:

1. **Inicialização da Sala**: A sala é inicializada com sujeira em algumas posições aleatórias.

2. **Limpeza da Sala**: O método `limparSala` faz com que o aspirador percorra a sala e limpe qualquer sujeira que encontre. Ele imprime mensagens na tela para indicar quando a sujeira é encontrada e limpa.

3. **Verificação de Sujeira**: O método `temSujeira` verifica se há sujeira em qualquer posição da sala.

4. **Limpeza de Sujeira**: O método `limparSujeira` limpa a sujeira em uma posição específica da sala.

5. **Movimentação do Aspirador**: O aspirador pode se mover para a direita e para a esquerda na sala. Os métodos `moverParaDireita` e `moverParaEsquerda` cuidam disso.

6. **Retorno à Posição Inicial**: Após limpar toda a sala, o aspirador retorna à posição inicial.

## Como Executar o Projeto

Para executar o projeto, siga estas etapas:

1. Certifique-se de que você tenha o ambiente de desenvolvimento Java configurado em seu sistema.

2. Baixe o arquivo Java `AspiradorDeSujeira.java` e adicione-o ao seu projeto ou diretório de trabalho.

3. Abra um terminal e navegue até o diretório onde o arquivo `AspiradorDeSujeira.java` está localizado.

4. Compile o código-fonte usando o seguinte comando:

   ```shell
   javac AspiradorDeSujeira.java
   ```

5. Após a compilação bem-sucedida, execute o programa com o seguinte comando:

   ```shell
   java AspiradorDeSujeira
   ```

O programa iniciará a simulação do aspirador de sujeira, imprimirá mensagens na tela conforme limpa a sujeira e, no final, informará que a aspiração foi concluída.

## Personalização

Você pode personalizar este projeto adicionando recursos adicionais, como:

- Introduzir diferentes algoritmos de movimentação do aspirador.
- Alterar a probabilidade de sujeira na sala.
- Adicionar mais recursos de relatórios ou interface gráfica para visualizar o progresso da limpeza.

Sinta-se à vontade para explorar e expandir este projeto de acordo com suas necessidades e interesses.

## Contribuições

Se você quiser contribuir para este projeto, fique à vontade para criar um fork do repositório, fazer as melhorias desejadas e enviar uma solicitação de pull. Suas contribuições são bem-vindas!

## Autor

Este projeto foi criado por Edwin Machaieie e é mantido por DarkDev.

---

Aproveite o projeto do Aspirador de Sujeira! Se você tiver alguma dúvida ou quiser discutir melhorias, não hesite em entrar em contato com  `machaieieedwin1@gmail.com`
