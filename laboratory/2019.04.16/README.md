# Protocolos ICMP/ARP/DHCP e tabela de roteamento
*Retirado do roteiro de aula do Prof. Gustavo S. Pavani, CMCC/UFABC.*

## Roteiro - Internet Control Message Protocol (ICMP)

1. Comando `ping`.
   1. Comece a captura com o Wireshark e execute o comando `ping www.uol.com.br`.
      Observe os pacotes capturados com o filtro para ICMP e identifique:
      1. O campo *Protocol* no pacote IP.
      2. Os tipos de mensagens ICMP trocados.
      3. As demais informações que constam nos pacotes trocados.
      4. O tempo de ida e volta das mensagens ICMP. Compare com os tempos
         mostrados na saída do terminal.
   2. Repita o procedimento para o comando `ping www.receita.fazenda.gov.br`.
      O que aconteceu? Explique.
   3. Comente sobre o tempo de resposta obtido com o `ping` para:
      - `127.0.0.1`
      - `www.ufabc.edu.br` 
      - `www.usp.br`
      - `www.google.com.br`
      - `www.mit.edu` 
      - `www.ufl.edu`
      - `www.cs.ubc.ca`
      - `www.chat.ru`
2. Comando `traceroute`.
   1. Execute o comando `traceroute www.uol.com.br`. Observe os pacotes
      capturados com o filtro para ICMP e identifique:
      1. O valor do TTL de cada mensagem enviada.
      2. O tipo de mensagem ICMP recebida.
      3. As demais informações que constam nos pacotes trocados.
      4. Quantas mensagens são enviadas e recebidas. Comente sobre a
         sequência de mensagens enviadas, explicando o funcionamento do
         comando.
   2. Repita o comando `traceroute` e comente sobre os resultados obtidos
      na saída para os seguintes endereços:
      - `127.0.0.1`
      - `www.ufabc.edu.br` 
      - `www.usp.br`
      - `www.google.com.br`
      - `www.mit.edu` 
      - `www.ufl.edu`
      - `www.cs.ubc.ca`
      - `www.chat.ru`

## Roteiro - Address Resolution Protocol (ARP)

3. Comando `arp`.
   1. Use o comando `arp -e` na linha de comando para listar o conteúdo da
      *cache* ARP. Verifique quais são os endereços que estão na *cache*.
   2. Inicie a captura com o Wireshark e execute o comando `ping` para um
      computador da rede local ainda não acessado e depois verifique novamente
      a tabela ARP (ex.: `ping 172.17.13.247`). Verifique também os pacotes
      ARP capturados. Veja os campos de cabeçalho, observando a requisição
      e a resposta. Verifique quais são os endereços MAC. Comente sobre
      o funcionamento do protocolo.
   3. Execute novamente o comando `ping` para a mesma máquina do item 3.2.
      Foram capturados pacotes ARP? Justifique.
   4. Remova as entradas da tabela ARP com o comando `arp -d IP`, em que
      `IP` é o endereço IP do *host* a ser removido, e liste o conteúdo
      da *cache*. O que aconteceu? Em seguida, execute o comando `ping IP`.
      Agora os pacotes ARP foram capturados? Justifique.

## Roteiro - Dynamic Host Configuration Protocol (DHCP)

4. Comando `dhclient`.
   1. No Ubuntu, pare o *Network Manager* com o comando 
      `sudo service network-manager stop`. Libere o endereço IP, executando
      o comando `sudo dhclient -r eth0`. Execute `ifconfig` para verificar
      o seu endereço IP. O seu computador ainda tem endereço IP?
      Tente acessar qualquer coisa na rede (o UOL, por exemplo).
   2. Inicie a captura com o Wireshark e execute o comando `sudo dhclient eth0`
      para obter novas configurações de rede (incluindo o endereço IP).
      Execute novamente o comando `ifconfig` e tente acessar a rede. Funcionou?
   3. Comente sobre as informações que estão presentes nos pacotes DHCP
      capturados (use o filtro "bootp" no Wireshark), explicando como
      funciona o protocolo.

## Roteiro - Tabela de roteamento

5. Comando `route`.
   1. Use o comando `route` para observar a tabela de roteamento do seu
      computador. Que rotas estão presentes?
   2. Exclua a rota padrão (*default*) da tabela de roteamento, com o
      comando `sudo route del default`. Tente acessar um servidor fora
      da sua sub-rede local, como o UOL. Ocorreu algum problema? Justifique.
   3. Execute o comando `ping` para o servidor do item 5.2, de preferência
      para o seu endereço IP. Qual foi a mensagem de erro?
   4. Execute um comando `ping` para uma máquina da sua sub-rede local.
      Esse comando foi executado? Justifique.
   5. Adicione novamente a rota padrão, com o comando 
      `sudo route add default gw IP`, em que `IP` é o endereço do roteador
      padrão exibido no item 5.1. Repita o `ping` para o servidor externo.
      Funcionou? Justifique.
