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
