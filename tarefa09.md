# 2.1
# Como medir a qualidade de um código?
- É preciso observar duplicidade de código, métodos e classes com responsabilidades relevantes, complexidade ciclomática elevada, ausência de testes de unidade e outros pontos.
### Verificação vs. Validação
A verificação tem como propósito averiguar se o software está de acordo com as especificações preestabelecidas, e a validação é o processo de confirmação de que o sistema está apropriado e consistente com os requisitos.
### Verificação Estática: Análise Estática de Código (AEC)
- Verificação de Regras de Estilo: 
Gerante que um código fonte siga um estilo de programação específico, incluindo aspectos como a formatação das chaves, a ordem das declarações e a utilização de javadoc, entre outros critérios. Esta verificação é fundamental para evitar certos tipos de erros e elevar a qualidade do software. No entanto, é importante ressaltar que violações dessas regras de estilo nem sempre indicam erros propriamente ditos.
- Verificação de Erro (Bug Checker):
  Comparação de objetos sem o uso do método "equals", concatenação de strings dentro de loops e fluxos não encerrados. É importante notar que, às vezes, os resultados dessas verificações podem não indicar defeitos reais, mas sim serem vistos como sinais de alerta.
### Vantagens da utilização de Verificadores Estáticos
* 1. A detecção de erros e códigos de risco torna-se mais fácil, facilitando a identificação de problemas potenciais no código.
* 2. Os programadores desenvolvem uma visão analítica objetiva, o que os ajuda a reconhecer onde foram imprecisos ou descuidados.
* 3. Os líderes de projeto têm a oportunidade de examinar o código, o projeto e a equipe de uma maneira mais abrangente, ganhando uma perspectiva diferenciada.
* 4. Ao eliminar certas classes de defeitos, a equipe pode se concentrar em outras áreas de eficiência do projeto, aumentando sua produtividade e qualidade geral.
