# 1. Quais os elementos básicos da P.O.O. e suas definições?
1 - Abstração
Antes de mais nada, imagine o que esse objeto irá realizar. Para isso, é preciso verificar três pontos na abstração:
Identidade ao objeto que vai ser criado. Essa identidade deve ser única dentro do sistema, para que não haja conflito, ou seja, sem repetições.
Característica do objeto. Dentro da programação orientada a objetos, as características são nomeadas como propriedades. Por exemplo, as propriedades de um objeto “pessoa” poderiam ser “peso”, “tamanho” e “idade”.
Ações que o objeto irá executar, chamadas de métodos. Eles podem ser muito variados, dependendo do tipo de solução desenvolvida.

2 - Encapsulamento
O encapsulamento é uma técnica que adiciona segurança à aplicação em uma programação orientada a objetos, pois esconde as propriedades, criando uma espécie de caixa preta.
Muitas das linguagens orientadas a objetos implementam o encapsulamento baseado em propriedades privadas, por métodos chamados getters e setters, responsáveis por retornar e setar o valor da propriedade, respectivamente. Assim, se evita o acesso direto à propriedade do objeto, adicionando outra camada de segurança à aplicação.

3 - Herança
A herança é um mecanismo que permite as classes compartilharem seus atributos, métodos e outros membros da classe entre si.
Herança é sempre utilizada mesmo que não explicitamente. Quando uma classe é criada e não há nenhuma referência à sua superclasse, implicitamente a classe criada é derivada diretamente da classe Object. É por esse motivo que todos os objetos podem invocar os métodos da classe Object

4 - Polimorfismo
Polimorfismo é o princípio pelo qual duas ou mais classes derivadas de uma mesma superclasse podem invocar métodos que têm a mesma identificação (assinatura) mas comportamentos distintos, especializados para cada classe derivada, usando para tanto uma referência a um objeto do tipo da superclasse. A decisão sobre qual o método que deve ser selecionado, de acordo com o tipo da classe derivada, é tomada em tempo de execução, através do mecanismo de ligação tardia.

# 2. O que é herança e como utilizar?
A herança é um mecanismo que permite as classes compartilharem seus atributos, métodos e outros membros da classe entre si.
Herança é sempre utilizada mesmo que não explicitamente. Quando uma classe é criada e não há nenhuma referência à sua superclasse, implicitamente a classe criada é derivada diretamente da classe Object. É por esse motivo que todos os objetos podem invocar os métodos da classe Object, tais como equals() e toString(). Por exemplo, imagine que já exista uma classe que defina o comportamento de um dado objeto da vida real, por exemplo, animal. Uma vez que eu sei que o leão é um animal, o que se deve fazer é aproveitar a classe animal e fazer com que a classe leão derive (herde) da classe animal.
Ou seja, herança acontece quando duas classes são próximas, têm características mútuas mas não são iguais e existe uma especificação de uma delas. Portanto, em vez de escrever todo o código novamente é possível poupar algum tempo e dizer que uma classe herda da outra e depois basta escrever o código para a especificação dos pontos necessários da classe derivada (classe que herdou).

# 3. O que é polimorfismo e como utilizar?
Polimorfismo é o princípio pelo qual duas ou mais classes derivadas de uma mesma superclasse podem invocar métodos que têm a mesma identificação (assinatura) mas comportamentos distintos, especializados para cada classe derivada, usando para tanto uma referência a um objeto do tipo da superclasse. A decisão sobre qual o método que deve ser selecionado, de acordo com o tipo da classe derivada, é tomada em tempo de execução, através do mecanismo de ligação tardia.
No caso de polimorfismo, é necessário que os métodos tenham exatamente a mesma identificação, sendo utilizado o mecanismo de redefinição de métodos. Esse mecanismo de redefinição não deve ser confundido com o mecanismo de sobrecarga de métodos.
O uso de polimorfismo é ilustrado através de um exemplo. Através desse exemplo introduzem-se os conceitos relacionados de upcasting e a motivação para a definição de métodos abstratos. 