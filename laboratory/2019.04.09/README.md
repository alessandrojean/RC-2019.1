# Protocolos de aplicação HTTP e DNS
*Retirado do roteiro de aula do Prof. Gustavo S. Pavani, CMCC/UFABC.*

## Wireshark

- Wireshark é um analisador de protocolos (*sniffer*), distribuído 
  gratuitamente, a partir do endereço http://www.wireshark.org.
  - Ele pode ser executado em diversas plataformas, incluindo sistemas
    Unix e Windows.
- Capturando pacotes:
  - Abra o Wireshark e ative a captura de pacotes (*Capture > Interfaces*).
    - Na opção *Interfaces*, escolha a interface Ethernet (eth0).
    - Em *Options*, selecione a opção *enable network name resolution*.
    - Clique em *Start* para iniciar a captura.
  - Exemplo: acesse a página do [Pudim].
    - Pare a captura de pacotes clicando no botão *Stop* da janela de captura.
- A interface do Wireshark é dividida em três partes:
  - A primeira contém uma relação dos pacotes capturados, um por linha.
  - A segunda contém informações sobre o pacote que está selecionado, onde
    cada linha contém um protocolo, na ordem em que eles são empilhados.
    Dentro de cada protocolo, são mostrados os campos do seu cabeçalho.
  - A terceira parte contém a carga útil do pacote, que é apresentada no
    formato hexadecimal e o seu correspondente para ASCII.

[Pudim]: https://www.pudim.com.br

## Roteiro - *Hypertext Transfer Protocol* (HTTP)

1. Interação básica HTTP.
   1. Acesse a página http://gaia.cs.umass.edu/wireshark-labs/INTRO-wireshark-file1.html
      e aplique o filtro HTTP para ver apenas os pacotes do protocolo HTTP.
      Observe os pacotes capturados e identifique:
      1. Versão do HTTP do navegador e do servidor web acessado.
      2. Línguas que o navegador aceita.
      3. IP do seu computador e do servidor.
      4. Código de *status* retornado do servidor para o navegador.
      5. HTTP persistente ou não persistente.
      6. Última modificação do arquivo HTML do servidor.
      7. Número de *bytes* de conteúdo retornado ao navegador.
   2. Analise os dados (*raw data*) do pacote e descreva o que é 
      possível observar.
2. GET Condicional.
   1. Limpe o *cache* do seu navegador e acesse a página
      http://gaia.cs.umass.edu/wireshark-labs/HTTP-wireshark-file2.html.
   2. Verifique o conteúdo da primeira requisição `GET`. É possível
      ver `IF-MODIFIED-SINCE` no HTTP `GET`?
   3. Verifique a resposta do servidor. O servidor retorna o conteúdo
      do arquivo?
   4. Faça uma segunda requisição `GET` e verifique a resposta
      do servidor. É possível ver `IF-MODIFIED-SINCE` no HTTP
      `GET`? Explique.
   5. Verifique a resposta do servidor ao segundo `GET`.
      O servidor retorna o conteúdo do arquivo? Explique.
3. HTML com objetos.
   1. Acesse a página http://gaia.cs.umass.edu/wireshark-labs/HTTP-wireshark-file4.html.
   2. Quantas requisições HTTP `GET` foram feitas pelo navegador?
      Para qual endereço IP estas requisições foram feitas?
   3. Identifique se o navegador fez o *download* das imagens (objetos)
      de maneira serial ou paralela. Explique.
4. Autenticação HTTP.
   1. Acesse a página http://gaia.cs.umass.edu/wireshark-labs/protected_pages/HTTP-wireshark-file5.html
      com nome de usuário `wireshark-students` e senha `network`.
   2. Qual a resposta do servidor ao HTTP `GET` inicial do navegador?
   3. Na segunda mensagem `GET` do navegador, qual novo campo é incluído
      na mensagem `GET`?
   4. É possível visualizar o nome de usuário e senha no pacote capturado
      pelo wireshark? Discuta sobre a segurança desta autenticação HTTP.

## Roteiro - *Domain Name System* (DNS)

5. Resolução de nomes.
   1. Acesse o site https://www.ipv6.br e filtre as mensagens DNS.
   2. O protocolo DNS usa TCP ou UDP?
   3. Identifique a porta de destino da mensagem `query` DNS e a porta
      de origem da mensagem de resposta do DNS.
   4. Identifique o endereço IP para qual a mensagem de `query` do DNS
      foi enviada.
   5. Examine a resposta DNS. Quantas "respostas" foram dadas? Qual o 
      conteúdo destas respostas?
   6. Aplique os filtros necessários e considere o pacote TCP SYN subsequente
      enviado pelo navegador. O IP de destino do pacote TCP SYN corresponde
      ao endereço IP fornecido pela mensagem de resposta DNS?
   7. Esta página contém imagens. Antes de requisitar cada imagem, seu
      *host* faz novas *queries* DNS?
6. Usando `nslookup`.
   1. Execute o comando `nslookup www.mit.edu`.
   2. Identifique a porta de destino da mensagem de *query* DNS e a porta
      de origem da mensagem de resposta do DNS.
   3. Identifique o endereço IP para qual a mensagem de *query* DNS
      foi enviada.
   4. Examine a resposta DNS. Quantas "respostas" foram dadas? Qual
      o conteúdo destas respostas?
   5. Execute o comando `nslookup www.aiit.or.kr google-public-dns-a.google.com`.
   6. Identifique o endereço IP para qual a mensagem de \emph{query} do DNS
      foi enviada. Este endereço IP é o mesmo do seu servidor DNS local?
      Caso contrário, esse endereço IP corresponde a que servidor?
   7. Examine a resposta DNS. Quantas "respostas" foram dadas? Qual o
      conteúdo destas respostas?
