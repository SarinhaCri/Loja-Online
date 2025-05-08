# Projeto Loja Online - Padrões de Projeto em Java

Este projeto é uma implementação didática de um sistema de pedidos de uma loja online, utilizando três padrões de projeto clássicos em Java: **Singleton**, **Strategy** e **Observer**.


## Padrões de Projeto Utilizados

### Singleton
Utilizado para garantir que exista **apenas uma instância do carrinho de compras** em toda a aplicação.

### Strategy
Aplicado no cálculo do frete, permitindo alternar entre **frete normal** e **frete expresso**, sem alterar a lógica principal do sistema.

### Observer
Usado para **notificar os clientes automaticamente** quando um pedido é concluído.


## Estrutura do Projeto

src/
├── carrinho/ -> Singleton (Carrinho de Compras).
│ └── Carrinho.java
│
├── frete/ -> Strategy (Cálculo de Frete).
│ ├── FreteStrategy.java
│ ├── FreteNormal.java
│ ├── FreteExpresso.java
│
├── notificacao/ -> Observer (Notificação de Clientes)
│ ├── Notificador.java
│ ├── Cliente.java
│
└── Main.java -> Execução do sistema

### Objetivo
Este projeto foi desenvolvido como desafio para aplicação prática dos conceitos de Padrões de Projeto (Design Patterns) na linguagem Java. A proposta é mostrar como esses padrões ajudam a estruturar uma aplicação com baixo acoplamento e alta coesão, facilitando manutenção e expansão.

#### Autor
Nome: Sara Cristina Viana

