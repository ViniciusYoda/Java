# Estudos de Java

Repositório de exercícios introdutórios de Java, organizados por aula. Os exemplos percorrem desde a estrutura básica de um programa até operadores, condicionais, repetições, vetores e métodos.

O projeto é didático: cada arquivo com um método `main` representa um programa independente. Não há uma aplicação única, framework, dependências externas ou ferramenta de build como Maven e Gradle.

## Conteúdo

| Pasta | Tema principal | Exemplos |
| --- | --- | --- |
| `aula04/aula04` | Primeiro programa | Saída de `Hello, World!` |
| `aula05` | Estrutura inicial | Classe principal e preparação do primeiro exercício |
| `aula06` | Tipos, entrada e conversões | `Scanner`, formatação, idade, `String` e `int` |
| `aula07` | Operadores aritméticos | Divisão, resto, incremento e classe `Math` |
| `aula08` | Comparações e operador ternário | Strings, jogo de adivinhação e situação eleitoral |
| `aula09` | Condicionais simples | Média, maioridade, paridade e delta |
| `aula10` | Condicionais compostas e `switch` | Votação, triângulos e classificação por quantidade de pernas |
| `aula11` | Repetição com `while` | Contadores, `break`, `continue` e fatorial |
| `aula12` | Repetição com `do...while` | Soma e análise de números informados pelo usuário |
| `aula13` | Repetição com `for` | Laços simples, aninhados e passo configurável |
| `aula14` | Vetores | Percurso, ordenação, busca e preenchimento com `Arrays` |
| `aula15` | Métodos e classes | Soma, contador reutilizável e classe de fatorial |
| `ex04/ex04` | Exercício extra | Data e hora do sistema com `java.util.Date` |

## Estrutura do repositório

Cada aula segue, em geral, esta organização:

```text
aulaXX/
├── src/    # código-fonte (.java)
├── bin/    # classes compiladas pelo editor (.class), quando existentes
└── README.md
```

As pastas `aula04` e `ex04` possuem um nível adicional com o mesmo nome. Os arquivos `README.md` internos foram gerados pelo modelo de projeto Java do VS Code; este documento na raiz é a referência geral do repositório.

## Pré-requisitos

- JDK 8 ou superior instalado. O JRE sozinho permite executar classes já compiladas, mas não fornece o comando `javac`.
- Terminal com `java` e `javac` disponíveis no `PATH`.
- Opcionalmente, Visual Studio Code com o **Extension Pack for Java**.

Confirme a instalação:

```bash
java -version
javac -version
```

Os exemplos usam somente a biblioteca padrão do Java. Não é necessário baixar dependências.

## Como executar

Como há várias classes chamadas `App` em pastas diferentes, compile e execute uma aula por vez.

### Classe sem pacote

Exemplo com `ParOuImpar`, da aula 09:

```bash
cd aula09
javac -encoding UTF-8 -d bin src/ParOuImpar.java
java -cp bin ParOuImpar
```

Para outra classe da mesma aula, substitua `ParOuImpar` pelo nome do arquivo e da classe desejada.

### Classe com pacote

Alguns exemplos declaram um pacote, como `tiposprimitivos`:

```bash
cd aula06
javac -encoding UTF-8 -d bin src/tiposprimitivos/TiposPrimitivos.java
java -cp bin tiposprimitivos.TiposPrimitivos
```

No PowerShell, os mesmos comandos funcionam; também é possível usar `\` nos caminhos.

### Visual Studio Code

1. Abra a pasta de uma aula, e não necessariamente a raiz inteira.
2. Abra a classe desejada dentro de `src`.
3. Use **Run Java** acima do método `main`.
4. Para programas com `Scanner`, informe os valores solicitados no terminal integrado.

## Roteiro de estudo sugerido

1. Execute os exemplos na ordem das aulas.
2. Leia o código e tente prever a saída antes da execução.
3. Altere valores fixos e observe o resultado.
4. Nos programas com entrada, teste valores comuns e casos-limite.
5. Corrija os exercícios listados na seção seguinte e valide novamente.

## Pontos de atenção encontrados

A análise estática identificou itens úteis para estudo e correção:

- `ex04/ex04/src/App.java`: existe um caractere `]` após `new Date();`, causando erro de sintaxe.
- `aula12/src/Numeros.java`: `resp` é `String`, mas é comparada com o caractere `'S'`; use uma comparação entre strings, preferencialmente sem diferenciar maiúsculas de minúsculas.
- `aula14/src/Vetor02.java`: o laço usa `c <= mes.length`; ao alcançar o tamanho do vetor, ocorre `ArrayIndexOutOfBoundsException`.
- `aula14/src/Vetor04.java`: `Arrays.binarySearch` pressupõe um vetor ordenado para produzir um resultado confiável, mas o vetor é pesquisado antes de ser ordenado.
- `aula09/src/ProgramaIdade.java` e `aula10/src/Vota.java`: o ano atual está fixado em `2024`; o exemplo de `aula08/src/Situacao.java` mostra como obtê-lo com `LocalDate`.
- Diversas classes `App` ainda contêm apenas o código padrão `Hello, World!`; os exercícios principais estão nas demais classes de cada pasta.
- Há arquivos `.class` versionados dentro de `bin` e também em `src`. Esses artefatos podem ficar desatualizados em relação ao código-fonte; prefira recompilar os `.java` localmente.

Esses pontos foram preservados para não modificar o objetivo dos exercícios sem uma solicitação específica.

## Estado da validação

O conteúdo e a estrutura foram verificados por inspeção dos arquivos. No ambiente usado para esta documentação, `java` está disponível na versão 8, mas `javac` não está instalado ou não está no `PATH`; por isso, não foi possível executar uma compilação completa do código-fonte.

## Próximos passos

- Instalar/configurar um JDK e compilar cada aula separadamente.
- Corrigir os pontos de atenção acima.
- Remover artefatos compilados do controle de versão e adicionar um `.gitignore` para `bin/` e `*.class`.
- Substituir os READMEs padrão de cada aula por objetivos, exemplos de entrada e saída e exercícios propostos.
