# Programação UDP
*Retirado do roteiro de aula do Prof. Gustavo S. Pavani, CMCC/UFABC.*

## Roteiro - Protocolo UDP

1. Aplicação cliente-servidor UDP.
   1. Execute primeiro o servidor (`UDPServer.java`) e depois o cliente
      (`UDPClient.java`). O que aconteceu? Justifique.
   2. Execute primeiro o cliente e depois o servidor. O que aconteceu?
      Justifique.
   3. Altere as portas do servidor e cliente. O que acontece se as portas
      forem diferentes? Justifique.
   4. Execute servidor e cliente em máquinas diferentes. Em seguida,
      envie várias mensagens ao servidor a partir de várias máquinas
      diferentes (ao mesmo tempo!). O que aconteceu?
   5. Modifique o programa cliente para enviar mais de uma mensagem
      digitada pelo usuário. É necessário alterar também o código do
      servidor? Justifique.
   6. Modifique o programa para que o servidor não responda a um usuário
      indesejado (*white list* ou *black list*).
2. Desenvolvimento de aplicação cliente-servidor UDP.
   1. Crie um protocolo de aplicação qualquer e implemente o cliente
      e servidor para esse protocolo.
