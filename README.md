# Spring Boot + Integração com Twilio

Este projeto demonstra como integrar o envio de mensagens via microserviço Spring Boot utilizando a API do Twilio. O serviço permite o envio de mensagens WhatsApp por meio de uma API REST.

### Pré-requisitos

- **Java 11 ou superior**: Certifique-se de ter o JDK 11 ou versão superior instalado.
- **Maven**: O projeto utiliza o Maven para o gerenciamento de dependências e build.
- **Conta Twilio**: É necessário ter uma conta no Twilio para enviar mensagens. Cadastre-se em [Twilio](https://www.twilio.com/).
- **Número habilitado para WhatsApp no Twilio**: Você precisará obter um número habilitado para o Twilio.

### Configuração e Setup

#### 1. Criar uma Conta no Twilio
- Cadastre-se para uma conta gratuita no Twilio [aqui](https://www.twilio.com/).
- Navegue até o **Twilio Console** e obtenha o **Account SID** e **Auth Token**.

#### 2. Obter um Número Habilitado para
- Acesse o **Twilio Console** para obter um número que possa enviar mensagens.
- Siga as instruções do Twilio para habilitar o envio de mensagens no número que você obteve.

#### 3. Definir Variáveis de Ambiente

Antes de rodar a aplicação, defina as seguintes variáveis de ambiente com suas credenciais do Twilio. Essas credenciais serão usadas para enviar as mensagens.

No **macOS/Linux**:
```bash
export TWILIO_ACCOUNT_SID="seu_account_sid"
export TWILIO_AUTH_TOKEN="seu_auth_token"
export TWILIO_PHONE_NUMBER="+551415XXXXXXX"  # Seu número do Twilio
