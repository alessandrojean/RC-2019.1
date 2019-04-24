# Protocolos de transporte UDP e TCP
*Retirado do roteiro de aula do Prof. Gustavo S. Pavani, CMCC/UFABC.*

## Roteiro - Protocolo de transporte UDP

1. Aplicação UDP.
   1. Execute a aplicação socket UDP cliente/servidor em Java. Envie uma
      mensagem de um cliente para o servidor (em outra máquina do laboratório),
      capturando os pacotes enviados com o Wireshark. Selecione um pacote UDP.
      1. Quantos e quais são os campos do cabeçalho UDP?
      2. O valor no campo *length* (comprimento) é o comprimento do que?
         Do cabeçalho, dados ou do pacote UDP inteiro?
      3. Qual é o maior número possível de porta de origem no UDP?
         E de destino? Justifique.
      4. Qual é o maior número possível de porta de origem no UDP?
         E de destino? Justifique.
   2. Examine um par te pacotes UDP em que o primeiro pacote é enviado pelo
      cliente e o segundo pacote é a resposta do servidor a este pacote.
      Descreva a relação entre os números de portas nos dois pacotes.

## Roteiro - Protocolo de transporte TCP

2. Aplicação TCP.
   1. Execute a aplicação socket TCP cliente/servidor em Java. Envie uma
      mensagem de um cliente para o servidor (em outra máquina do laboratório),
      capturando os pacotes com o Wireshark.
      1. Quantos e quais são os campos do cabeçalho TCP?
      2. Qual é o endereço IP e porta TCP usado pelo cliente? E pelo servidor?
      3. Execute novamente o cliente. Verifique a porta e IP do cliente.
      4. Qual o número de sequência do segmento TCP SYN usado para iniciar
         a conexão TCP entre cliente e servidor? Qual é o número do segmento
         SYNACK enviado pelo servidor em resposta ao SYN enviado pelo cliente?
         Qual o valor campo de reconhecimento do cabeçalho TCP para o segmento
         SYNACK? Como o servidor determinou esse valor? Explique como funciona
         todo este processo de estabelecimento de conexão TCP.
      5. É possível achar no campo de dados as mensagens enviadas pelo cliente
         e servidor?
   2. Acesse a página do [Pudim]. O processo de estabelecimento de conexão
      é similar a aplicação Java?
   3. Identifique os segmentos TCP trocados entre o *browser* e o Pudim,
      anotando o [RTT] (*round trip time*) dos 6 primeiros segmentos.

[Pudim]: https://www.pudim.com.br
[RTT]: https://tools.ietf.org/html/rfc6298

## Roteiro - Protocolo de transporte no Linux

3. Comando `netstat`.
   1. Execute o comando `netstat -a` e comente o que se pode observar na
      saída do comando.
   2. Execute o comando `netstat -s` e comente o que se pode observar na
      saída do comando.
4. Comando `nmap`.
   1. Execute o comando `nmap -v IP`, em que `IP` é o endereço IP da máquina
      a ser testada, capturando os pacotes no Wireshark. Explique o funcionamento
      do `nmap`.

      - Dica: instale o programa com o comando `sudo apt-get install nmap`.
