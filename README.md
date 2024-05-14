# Guia de Configuração do Ambiente

Este documento fornece instruções detalhadas sobre como baixar e instalar Java 17, Jericho HTML Parser versão 2.3.0-beta, e StackSpot. Siga os passos abaixo para configurar seu ambiente de desenvolvimento.

## 1. Instalar Java 17

### 1.1. Usar a Central de Software para Instalar o JDK 17

1. **Entrar na central de software:**
   Abra a Central de Software do seu sistema operacional.

2. **Procurar por "jdk":**
   Na barra de busca da Central de Software, procure por "jdk".

3. **Instalar a versão mais recente do JDK 17:**
   - Certifique-se de selecionar o JDK fornecido pela Eclipse Foundation, não o OpenJDK.
   - Clique em "Instalar".

![Central de Software - Buscar JDK](images/central_software_jdk_search.png)

4. **Verificar a instalação:**
   Após a instalação, abra o terminal e execute o seguinte comando para verificar se o JDK 17 foi instalado corretamente:

   ```sh
   where java


1.2. Confirmar o Sucesso da Instalação
Se a instalação foi bem-sucedida, você deverá ver a localização do executável do Java.


2. Baixar Jericho HTML Parser 2.3.0-beta
2.1. Baixar do Link
Acesse o seguinte link para baixar o Jericho HTML Parser 2.3.0-beta:
Baixar Jericho HTML Parser 2.3.0-beta
3. Instalar e Configurar o StackSpot
3.1. Pedir Permissões no UIacessos
Solicite as seguintes permissões no UIacessos:

G XS6_STACKSPOTAI_DEV
UP2-GITHUB_COPILOT
DE7-GITHUB_DEVELOPER
G LE9 VIEWER
DE7-GITHUB_DEVELOPER
ED7-GITHUB_DEVELOPER
3.2. Baixar e Instalar o STK CLI
Fazer o download do STK CLI:
Acesse o link abaixo e baixe o instalador do STK CLI:
Baixar STK CLI

Instalar o STK CLI:
Siga as instruções do instalador para completar a instalação.

3.3. Configurar e Usar o STK CLI
Abrir o Git Bash:
Abra o Git Bash no seu sistema.

Logar no STK:
No Git Bash, execute o seguinte comando para fazer login no STK:

sh
Copiar código
stk login
Configurar o Proxy:
Após fazer login, configure o proxy executando o comando abaixo:

sh
Copiar código
stk init --proxy proxynew.itau:8080
Fazer login novamente:
Depois de configurar o proxy, faça login novamente:

sh
Copiar código
stk login
Você será solicitado a fornecer suas credenciais de acesso ao StackSpot.


Conclusão
Seguindo essas instruções, você deve ter configurado com sucesso Java 17, Jericho HTML Parser 2.3.0-beta e StackSpot em seu ambiente de desenvolvimento. Se encontrar algum problema, consulte a documentação oficial de cada ferramenta ou procure ajuda nos fóruns de suporte.

Para mais informações, consulte:

Documentação do Java 17
Documentação do Jericho HTML Parser
Documentação do StackSpot
