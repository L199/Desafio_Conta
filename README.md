# Guia de Configuração do Ambiente

Este documento fornece instruções sobre como baixar e instalar Java 17, configurar Gradle, configurar certificados e configurar o IntelliJ IDEA. Siga os passos abaixo para configurar seu ambiente de desenvolvimento.

## 1. Instalar Java 17

### 1.1. Usar a Central de Software para Instalar o JDK 17

1. **Procurar por "jdk":**
   Na barra de busca da Central de Software, procure por "jdk".

2. **Instalar a versão mais recente do JDK 17:**
   - Certifique-se de selecionar o JDK fornecido pela Eclipse Foundation, não o OpenJDK.
   - Clique em "instalar".

3. **Verificar a instalação:**
   Após a instalação, abra o terminal e execute o seguinte comando para verificar se o JDK 17 foi instalado corretamente:
   ```sh
   where java
Confirmar o Sucesso da Instalação:
Se a instalação foi bem-sucedida, você verá a localização do executável do Java 17.
2. Configurar Gradle
Para tornar o Gradle acessível via linha de comando, precisamos adicionar o caminho do binário ao PATH.
No menu do Windows, pesquise por "Editar as variáveis de ambiente para a sua conta".
Crie uma nova variável de usuário com o nome "GRADLE_HOME" e o valor do caminho: C:\Users\seuRacf\jericho\tools\gradle-win, e clique em "ok".
Clique em "Path" e em "Editar", em seguida, clique em "Novo" e adicione C:\Users\LGFPSCD\jericho\tools\gradle-win\bin, depois clique em "ok".
3. Configurar Certificados do Jericho 2.3.0-beta
Para configurar os certificados do Jericho 2.3.0-beta, siga as etapas abaixo:

Jericho 2.3.0-beta:
Coloque os certificados em: C:\Users\LGEPSCD\jericho\tools\certificados.

Instalar os certificados para todos:
Certifique-se de ter acesso de administrador para executar os seguintes comandos:

sh
Copiar código
keytool -importcert -alias des-sts-mbi-cloud-ihf -file "C:\Users\LGFPSCD\jericho\tools\certificados\des-sts-mbi-cloud-íhf.cert" -keystore "C:\Users\LGFPSCD\jericho\tools\jdk17-win\lib\security\cacerts" -storepass changeit

keytool -importcert -alias gitcorp-prod-aws-cloud-ihf -file "C:\Users\LGFPSCD\Jericho\tools\certificados\gitcorp-prod-aws-cloud-ihf.cer" -keystore "C:\Users\LGFPSCD\jericho\tools\jdk17-win\lib\security\cacerts" -storepass changeit

keytool -importcert -alias gatewayawsdev -file "C:\Users\LGFPScD\jericho\tools\certificados\gatewayawsdev.cer" -keystore "C:\Users\LGFPSCD\jericho\tools\jdk17-win\lib\security\cacerts" -storepass changeit
Certifique-se de substituir os caminhos dos certificados e do keystore de acordo com sua configuração.
Todos os certificados foram instalados com sucesso.

4. Configuração no IntelliJ IDEA
Para configurar o IntelliJ IDEA, siga as etapas abaixo:

Abra o IntelliJ IDEA.

Vá para Settings > Build, Execution, Deployment > Build Tools > Gradle.

Configurar o Gradle no IntelliJ IDEA:

Gradle user home: C:/Users/seuRACF/Jericho/tools/gradle-win.
Use Gradle from: gradle-wrapper.properties File.
Gradle JVM: Ecplise Temurin version 17.
Clique em "Apply".
Configurações do Projeto:

SDK: Ecplise Temurin version 17.
Language level: 17 - Sealed types, always-strict floating-point semantics.
Clique em "Apply".
Para executar o IntelliJ IDEA, rode o Gradle:

gradle --configuration-cache
gradle --build-cache
Clique em Run 'Application' para rodar o Gradle.
