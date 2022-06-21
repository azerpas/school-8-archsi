# Web Services

## Studied middlewares limitations
#### ➡️ Scaling to the Web is hard: 
- Protocoles that don't fit together
- Too many client constraints

#### Inconvénients intrinsèques
- Complexity
- Perenniality 
- Pricing

## New approach - W3C standards
- SOAP
- WSDL

## SOAP (Simple Object Access Protocol)
Messaging protocol for exchanging structured informations
- XML
- Usable with HTTP, SMTP, ...

### A SOAP Message
1. XML déclaration (optional)
2. SOAP envelop which is root `<Envelope>` with:
- A `<header>`
- A `<body>`

## WSDL
XML based interface description language