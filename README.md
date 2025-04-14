Este projeto demonstra a implementação de uma hierarquia de classes que representa diferentes categorias de animais utilizando os principais conceitos da Programação Orientada a Objetos em Java. A estrutura foi desenvolvida para exemplificar herança, classes abstratas e polimorfismo de forma clara e didática.

Estrutura Hierárquica:
A classe base abstrata Animal serve como modelo geral para todos os animais, contendo atributos comuns como nome, idade e peso, além de métodos básicos de comportamento. A partir dela, derivam três classes abstratas intermediárias: Mamifero, Ave e Reptil, cada uma especializando comportamentos específicos de seus grupos. Finalmente, as classes concretas implementam os detalhes particulares de cada animal, como Cachorro, Gato, Tartaruga, Iguana, Galinha, Calopsita, Pardal e Arara.

Instruções de Execução:
Para executar o projeto, primeiro compile os arquivos fonte usando o comando 'javac Animal.java Main.java' no terminal ou prompt de comando. Em seguida, execute o programa principal com o comando 'java Main'. O sistema demonstrará automaticamente as capacidades de cada animal implementado.

Resultados Esperados:
Ao ser executado, o programa exibirá uma série de mensagens que ilustram os comportamentos característicos de cada animal. Isso inclui a emissão de sons específicos, padrões de movimento distintos (como voar, andar ou rastejar), além de ações exclusivas como amamentação para mamíferos, postura de ovos para aves e troca de pele para répteis. A saída serve como verificação visual da correta implementação da hierarquia de classes e dos princípios de POO aplicados.

