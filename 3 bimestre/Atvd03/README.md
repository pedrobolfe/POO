# Atividade 01 do 3 bim

* Aluno: Pedro Henrique Schroeder Bolfe
* Turma: 3° Info

  Suponha que você está desenvolvendo um sistema de gerenciamento de veículos para uma concessionária. Você precisa modelar diferentes tipos de veículos, como carros e motos, e também precisa implementar funcionalidades específicas para cada tipo de veículo.


Crie uma classe base chamada "Veiculo". Ela deve ter atributos como "marca", "modelo" e "ano". Crie um construtor para inicializar esses atributos e métodos de acesso (getters e setters) para eles.


Crie duas classes filhas: "Carro" e "Moto", ambas herdam da classe "Veiculo". Essas classes devem ter atributos adicionais específicos, como "numeroDePortas" para carros e "cilindradas" para motos. Crie construtores para inicializar esses atributos e também implemente métodos de acesso.


Na classe "Veiculo", crie um método chamado "exibirDetalhes" que imprime as informações básicas do veículo (marca, modelo, ano). Agora, para cada classe filha (Carro e Moto), sobrescreva o método "exibirDetalhes" para também incluir os atributos específicos desses veículos.


Crie uma classe de teste chamada "TesteVeiculos" com o método "main". Dentro desse método, crie instâncias de carros e motos, configure seus atributos e chame o método "exibirDetalhes" para verificar se a sobreposição de métodos está funcionando corretamente.
