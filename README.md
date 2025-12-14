# Sistema de Folha de Pagamento para lojas

Este é o segundo projeto que desenvolvi enquanto cursava a matéria de **Programação Orientada a Objetos**. O objetivo foi praticar conceitos da disciplina como a modelagem de classes e a implementação de regras de negócio em Java.  
O sistema simula uma **folha de pagamento** responsável por gerenciar empregados e gerentes de várias lojas, realizando cálculos de salários, descontos e estatísticas salariais.

## Descrição Geral
O sistema gerencia:
- Empregados e gerentes
- Lojas com múltiplos empregados
- Cálculo de salários com base em salários mínimos
- Descontos e gratificações
- Relacionamentos entre objetos conforme o modelo de negócio

---

## Regras de Negócio
- O salário de um **empregado** é calculado como:  
  `quantidade × salário mínimo − 10% do salário mínimo`
- O salário de um **gerente** é composto pelo salário do empregado + gratificação
- O salário mínimo é **único** para todos os empregados e definido de forma estática
- Cada empregado possui:
  - Matrícula sequencial e única
  - Data de admissão obtida automaticamente do sistema
- Uma loja:
  - Possui um gerente
  - Possui vários empregados (lista polimórfica)
  - Calcula salário total, desconto total e o empregado com maior salário (marajá)

  ---

## Conceitos de Programação Orientada a Objetos Aplicados
- Classes e objetos
- Encapsulamento
- Construtores
- Herança (`Gerente` estende `Empregado`)
- Polimorfismo (lista de empregados contendo `Empregado` e `Gerente`)
- Métodos e atributos estáticos
- Relacionamento um-para-muitos bidirecional
- Tratamento de exceções
- Regras de negócio encapsuladas nos métodos

---

## Estrutura do Projeto
- `Empregado` → Classe base que representa um empregado da loja, contendo regras de salário, matrícula, data de admissão e vínculo com a loja.

- `Gerente` → Subclasse de `Empregado`, adicionando gratificação e sobrescrevendo o cálculo de salário.

- `Loja` → Representa uma loja, gerencia a lista de empregados, calcula totais salariais, descontos e identifica o empregado com maior salário.

- `Teste` → Classe responsável por instanciar os objetos, criar relacionamentos e demonstrar o funcionamento do sistema.
