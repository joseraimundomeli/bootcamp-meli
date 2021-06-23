


### Descrição do exercício: 

Crie a interface Precedente<T> com um método public int precedeA (T t).

Crie a classe Pessoa, com os atributos String nome e cpf, seus métodos de acesso e os construtores que você considera apropriados.

Criar uma classe Pessoa que implemente Precedente<Pessoa>, logo sobrescrever o método int precedeA(Pessoa p).

Defina um critério de precedência para implementar o método acima. Pode ser que uma pessoa preceda outra se o seu CPF for inferior, ou o nome for alfabeticamente inferior e assim por diante.

Crie a classe SortUtil com o método public static <T> sort (Precedente <T> arr []).

Dentro do método anterior, desenvolva o algoritmo de bolha (bubble sort) para ordenar a matriz.

Discussão: O método de classificação pode classificar uma matriz de qualquer tipo de dados?

Crie um programa, declare um array com várias pessoas, classifique-o e exiba-o.

Crie a classe Celular, com os atributos: number e holder, implemente Precedente<Celular> e proceda da mesma forma que fizemos com Pessoa do ponto anterior.


### Saída


	|-------- Com Pessoas ----------|
	|-------- Lista origianal ----------|
	Pessoa{cpf='01676512471', nome='Jose'}
	Pessoa{cpf='01676512472', nome='Paulo'}
	Pessoa{cpf='01676512473', nome='Gustavo'}
	Pessoa{cpf='01676512471', nome='Gustavo'}
	Pessoa{cpf='01676512472', nome='Gustavo'}
	Pessoa{cpf='01676512474', nome='Henrique'}
	Pessoa{cpf='01676512475', nome='Ernest'}
	Pessoa{cpf='01676512476', nome='Julia'}
	|-------- Lista Ordenada ----------|
	Pessoa{cpf='01676512475', nome='Ernest'}
	Pessoa{cpf='01676512471', nome='Gustavo'}
	Pessoa{cpf='01676512472', nome='Gustavo'}
	Pessoa{cpf='01676512473', nome='Gustavo'}
	Pessoa{cpf='01676512474', nome='Henrique'}
	Pessoa{cpf='01676512471', nome='Jose'}
	Pessoa{cpf='01676512476', nome='Julia'}
	Pessoa{cpf='01676512472', nome='Paulo'}


	|-------- Com celulares ----------|
	|-------- Lista Ordenada ----------|
	Celular{number='83 98744254', holder='Jose'}
	Celular{number='83 98744254', holder='Paulo'}
	Celular{number='83 98744251', holder='Gustavo'}
	Celular{number='83 98744253', holder='Gustavo'}
	Celular{number='83 98744252', holder='Gustavo'}
	Celular{number='83 98744254', holder='Henrique'}
	Celular{number='83 98744254', holder='Ernest'}
	Celular{number='83 98744254', holder='Julia'}
	|-------- Lista Ordenada ----------|
	Celular{number='83 98744254', holder='Ernest'}
	Celular{number='83 98744251', holder='Gustavo'}
	Celular{number='83 98744252', holder='Gustavo'}
	Celular{number='83 98744253', holder='Gustavo'}
	Celular{number='83 98744254', holder='Henrique'}
	Celular{number='83 98744254', holder='Jose'}
	Celular{number='83 98744254', holder='Julia'}
	Celular{number='83 98744254', holder='Paulo'}

	Process finished with exit code 0


