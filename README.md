# RC-2019.1
![Year][year] ![Id][id] ![T-P-I][tpi] ![Last class][last-class]
![Language][language] ![IDE][ide]

Algorithms written in the laboratory classes of Computer Networks
(Redes de Computadores) at the Federal University of ABC (UFABC).

[year]: https://img.shields.io/badge/year-2019.1-blue.svg?style=flat-square
[id]: https://img.shields.io/badge/id-MCTA022--13-yellowgreen.svg?style=flat-square
[tpi]: https://img.shields.io/badge/T--P--I-3--1--4-lightgrey.svg?style=flat-square
[last-class]: https://img.shields.io/badge/last_class-2019.04.23-green.svg?style=flat-square
[language]: https://img.shields.io/badge/language-Java-yellow.svg?style=flat-square
[ide]: https://img.shields.io/badge/IDE-VSCode-orange.svg?style=flat-square

## Classes

- **12/02/2019** *(Theory)*: Introduction.
- **14/02/2019** *(Theory)*: The Physical Layer.
- **19/02/2019** *(Theory)*: The Data Link Layer.
- **21/02/2019** *(Theory)*: Elementary Data Link Protocols
      and Sliding Window Protocols.
- **26/02/2019** *(Theory)*: The Medium Acess Control Sublayer.
- **28/02/2019** *(Theory)*: Collision-Free Protocols,
      Ethernet and Data Link Layer Switching.
- **07/03/2019** *(Theory)*: The Network Layer, Routing Algorithms,
      Distance-Vector and Link-State Routing.
- **12/03/2019** *(Theory)*: Hierarchical, Broadcast and Multicast Routing,
      Routing for Mobile Hosts and Congestion Control.
- **14/03/2019** *(Theory)*: **First Test**.
- **19/03/2019** *(Theory)*: Quality of Service, Traffic Shapping,
      Integrated and Differenciated Services and MultiProtocol Label Switching.
- **21/03/2019** *(Theory)*: Internetworking and IP Version 4 Protocol.
- **26/03/2019** *(Laboratory)*: [UDP Programming].
- **28/03/2019** *(Theory)*: Internet Control Protocols and OSPF and BGP
      Routing Protocols.
- **02/04/2019** *(Laboratory)*: [TCP Programming].
- **04/04/2019** *(Theory)*: Internet Multicasting, IP Version 6, The
      Transport Layer and The Transport Service.
- **09/04/2019** *(Laboratory)*: [Application Protocols: HTTP and DNS].
- **11/04/2019** *(Theory)*: Elements of Transport Protocol,
      Connection Establishment and Release and Error Control and Flow Control.
- **16/04/2019** *(Laboratory)*: [ICMP/ARP/DHCP Protocols and Routing Table].
- **18/04/2019** *(Theory)*: UDP, RTP and TCP Protocol.
- **23/04/2019** *(Laboratory)*: [Transport Protocols: UDP and TCP].

[UDP Programming]: laboratory/2019.03.26/
[TCP Programming]: laboratory/2019.04.02/
[Application Protocols: HTTP and DNS]: laboratory/2019.04.09/
[ICMP/ARP/DHCP Protocols and Routing Table]: laboratory/2019.04.16/
[Transport Protocols: UDP and TCP]: laboratory/2019.04.23/

## Build instructions

Use the following commands to compile any `.java` file in this repository.

```bash
# Assuming you have the JDK in your path.

# Compiles the file in the same folder.
$ javac File.java
# Compiles all the .java files in the folder.
$ java *.java
# Run the program.
$ java File
```

You can also import any `.java` file to a Java IDE, like Eclipse, Netbeans
or IntelliJ Idea too.

## Bibliography

- Tanenbaum, A. S. **Computer Networks**, 4th edition. 
  Prentice Hall, 2002.
- Peterson, L. L. *et al*. **Computer Networks: A Systems Approach**, 3rd edition.
  Morgan Kaufmann, 2003.
- Kurose, J. F. *et al*. **Computer Networking: A Top-Down Approach**, 3rd edition.
  Addison-Wesley, 2006.

## License

    The MIT License (MIT)

    Copyright (c) 2018 Alessandro Jean

    Permission is hereby granted, free of charge, to any person obtaining a copy of
    this software and associated documentation files (the "Software"), to deal in
    the Software without restriction, including without limitation the rights to
    use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
    the Software, and to permit persons to whom the Software is furnished to do so,
    subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
    FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
    COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
    IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
    CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
