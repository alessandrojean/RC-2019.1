# Programação TCP
*Retirado do roteiro de aula do Prof. Gustavo S. Pavani, CMCC/UFABC.*

## Roteiro - Protocolo TCP

1. Aplicação cliente-servidor TCP.
   1. Execute primeiro o servidor (`TCPServer.java`) e depois o cliente
      (`TCPClient.java`). O que aconteceu? Justifique.
   2. Execute primeiro o cliente e depois o servidor. O que aconteceu?
      Justifique.
   3. Altere as portas do servidor e cliente. O que acontece se
      as portas forem diferentes? Justifique.
   4. Execute servidor e cliente em máquinas diferentes. Em seguida,
      envie várias mensagens ao servidor a partir de várias máquinas
      diferentes (ao mesmo tempo!). O que aconteceu? Justifique.
   5. Verifique o cliente e servidor UDP da aula anterior. Quais as
      principais diferenças para o cliente e servidor TCP?
   6. Modifique o programa cliente para que permaneça conectado
      enviando mensagens ao servidor. A conexão só era desfeita se
      o cliente enviar o comando "tchau" para o servidor. Faça 
      também as modificações necessárias no código do servidor.
2. Desenvolvimento de um servidor TCP com múltiplos clientes.
   1. Implemente um servidor que atenda a vários clientes simultaneamente.
