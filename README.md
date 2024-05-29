Projeto final da disciplina de Tópicos em Dispositivos Móveis do curso de pós-graduação em Sistemas
para Dispositivos Móveis do Instituto Federal de Educação, Ciência e Tecnologia de São Paulo - IFSP.
O projeto consiste em um sistema de gerenciamento de locais a serem visitados pelo Brasil.
O aplicativo foi desenvolvido utilizando a linguagem de programação Kotlin e a IDE Android Studio.

## Funcionalidades

- Cadastro de locais
- Listagem de locais
- Edição de locais
- Exclusão de locais
- Marcar como visitado

## Tecnologias

- Kotlin
- Android Studio
- Room
- Coroutines
- StateFlow
- Compose

Durante o desenvolvimento, lembre-se de tomar nota das seguintes coisas:

- Tempo: Quanto tempo cada fase tem levado? Esse tempo tem sido gasto com o quê?

- Quanto de código você teve de escrever e quanto a IA conseguiu criar?

- Quais os seus sentimentos enquanto usa da IA? Animação? Frustração? Medo?

# Quais são as vantagens e desvantagens de usar a IA?

Durante o desenvolvimento do projeto, foi possível perceber que a IA é uma ferramenta muito poderosa
e que pode ser utilizada para auxiliar em diversas tarefas. No entanto, é importante ressaltar que a
IA não é perfeita e que ainda existem limitações em relação ao seu uso.

- Vantagens:
- A IA é capaz de gerar código de forma rápida e eficiente, o que pode acelerar o desenvolvimento de
  um projeto.
- A IA pode ser utilizada para automatizar tarefas repetitivas e tediosas, permitindo que os
  desenvolvedores foquem em atividades mais criativas e desafiadoras.
- A IA pode ser utilizada para identificar padrões e tendências nos dados, o que pode ajudar a tomar
  decisões mais informadas.
- Desvantagens:
- A IA ainda não é capaz de substituir completamente os desenvolvedores, pois ainda existem
  limitações em relação à sua capacidade de compreender o contexto e a intenção por trás do código.
- A IA pode gerar código que não é otimizado ou que não segue as melhores práticas de programação, o
  que pode resultar em problemas
- A IA pode introduzir vieses e preconceitos nos sistemas, caso os dados utilizados para treiná-la
  sejam enviesados ou incompletos.
- A IA pode ser utilizada de forma antiética ou prejudicial, como, por exemplo, para criar deepfakes
  ou disseminar desinformação.

# Desenvolvimento

Durante o desenvolvimento do card do local foi possível perceber que a IA ajudou bastante na seleção
de atributos e na criação do layout, no entanto, foi necessário fazer algumas modificações para que
o card ficasse mais agradável visualmente. Ela conhecia os parâmetros a serem utilizados, porém, não
compreendia muito o contexto em que eles seriam utilizados. A criação do card levou cerca de duas
horas e meia(somente layout puro). A IA conseguiu criar bastante código, porém em alguns momentos
ela se perdia. Adicionei comentário para que ela pudesse compreender melhor o contexto. E em
determinados momentos ela acabou gerando mais comentários e não entendeu dever seguir o que
estava previsto no contexto. Somente após eu dar início de fato a função é que ela foi capaz de
entender que precisava gerar o conteúdo correto.

Durante o desenvolvimento do layout para a lista de lugares, o GitHub Copilot muitas vezes sugeria
código correto, porém sem os fechamentos de instruções, por exemplo, faltando o fecha parenteses de
algum componente ou classe. O GitHub Copilot foi muito eficiente em gerar dados para a lista de
lugares para que eu pudesse testar como estava ficando o comportamento dela. Foi muito eficaz em
conseguir definir que eu estava tentando colocar um espaço entre as células na listagem. Nesta parte
de código, o GitHub Copilot mostrou-se menos eficiente. Quase todo código que conseguiu ser gerado
por ele precisou de algum tipo de ajuste. Apenas na parte de criação de dados mocados que ele se
saiu muito bem. A criação do layout da lista de lugares levou cerca de 3 horas.

Durante a criação do banco de dados e sua configuração a IA se mostrou meio perdida como se não
conhece bem o que devia fazer nesse contexto. A IA não conseguiu gerar o código de forma eficiente,
isso quando conseguiu gerar algo. Precisei fazer muitas modificações para que ele funcionasse
corretamente. A criação do banco de
dados e sua configuração levou cerca de 4 horas. 