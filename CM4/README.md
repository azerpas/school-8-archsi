[← Back](../README.md)

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

## WSDL - Logic Model

### Simple type parameter
```xml
<wsdl:message name="personneMsg">
    <wsdl:part name="nom" type="xsd:string" />
    <wsdl:part name="prenom" type="xsd:string" />
</wsdl:message>
```
### Complex type parameter
```xml
<wsdl:message name="personneMsg">
    <wsdl:part name="personne" element="exemple:personne" />
</wsdl:message>
```

### Operation categories
- One-way
- Request-response
- Solicit-response
- Notification

#### Receive
```xml
<wsdl:input ...>
```
#### Send
```xml
<wsdl:output ...>
```

## WSDL - Binding Model

### Binding
How the protocol, data format, will be transmitted through the wire

## WSDL - Physical Model

### Port
Connection point to a Web service. Typically represented by HTTP URL. 
### Service 
Collection of system functions exposed to Web-based protocols

## UDDI (Universal Description, Discovery and Integration)

**Roles:**
- White Pages: Informations about business supplying Web services 
- Yellow Pages: Criteria and options of services categories
- Green Pages: WSDL

# Example - Axis 2 & JAX-WS

## Axis 2
Apache implementation of SOAP
- Support JAX-WS spec
- Listen to SOAP messages
- Client-side API to exchange SOAP messages

## JAX-WS
Java API for XML Web Services

### Uses annotations
- `@WebService`
- `@WebMethod`: Method to be exposed
- `@WebParam`: Mapping parameter personalization
- `@WebResult`: Mapping result personalization
- `@OneWay`