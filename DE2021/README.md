## 1. Proposer un fichier JSON décrivant une interface de service exposant plusieurs opérations. 
```json
// Pas au programme ?
```
## 2. Proposez un schéma JSON validant votre fichier
```json
// Pas au programme ?
```
## 3. Citez trois différences principales entre JSON vs XML
```json
// Pas au programme ?
```
https://www.guru99.com/json-vs-xml-difference.html
## 4. Qu'est-ce qu'entend par le concept "middleware"?
Logiciel mis entre deux couches informatiques
## 5. Quelles sont les fonctions des souches « stub » et « skeleton » ?
Tous les deux générés automatiquement
#### Stub
Partie cliente
- Prépare les paramètres d'entrée et d'invocation
- Décode les paramètres la sortie et le résultat
#### Skeleton
Partie serveur
- Décode les paramètres d'entrée et d'invocation
- Prépare les paramètres de sortie et le résultat
## 6. Citez trois caractéristiques d'un MOM?
- Possède un message broker
- Utilise des files de message
- Fournit une API
## 7. Combien existe-t-il de types de fonctionnement des MOM (Message-Oriented middleware)? Présentez chacun des types par un schéma simplifié. 
```

```
## 8. Quelle est la différence entre les modes push et pull?
- Push: l'envoyeur envoie des messages au receveur. Attend ou échoue.
- Pull: le receveur va chercher le message chez le client. Périodiquement. Block.
## 9. Qu'est ce qu'une application large échelle?
Web application
## 10. En quoi les Web services permettent de développer des applications larges échelle ?
**Architecture WSOA : Web Services Oriented Architecture**
- Augmente la productivité 
- Augmente interoperabilité
## 11. Identifier les trois standards / composantes utilisés pour développer les Web Services SOAP en définissant le rôle de chacun. 
- XML: Le message en lui-même
- HTTP: Le protocole de transport synchrone
- SMTP: Le protocole de transport asynchrone
## 12. Pourquoi considère-t-on que SOAP est protocole abstrait ?
Parce qu'il permet seulement la description du message à traiter
## 13. Citez les quatre types d'opérations en Web Services SOAP. 
- One-Way: Reçoit un message, ne renvoie rien
- Request-Response: Reçoit un message, renvoie un message
- Solicit-Response: Envoie un message, attend une réponse
- Notification: Envoie un message, ne attend rien
## 14. A quoi sert le bloc Binding dans les interfaces WebServices SOAP?
Lier une description abstraite (portType) à un protocole
- HTTP
- MIME
- SOAP
## 15. Qu'est-ce qu'un style REST?
Un style d'architecture pour systèmes Web
## 16. Citez les trois concepts clés de REST
- Ressources 
- Méthodes
- Représentations
## 17. Quand utilise-t-on REST et quand utilise-t-on SOAP?
SOAP est un protocole de communication client / serveur alors que REST est un style d'architecture de systèmes Web.
## 18. Pourquoi les API REST sont sans état?
Parce que c'est au développeur de gérer l'état du côté client.
## 19. Vous construisez une API pour vos restaurants et vous voulez que les utilisateurs de cette API puissent chercher les restaurants par ville, accéder au menu et acheter des plats. Proposer les URL permettent de :
### a. Lister tous les restaurants de la ville de Paris
```
/paris/restaurants
```
### b. Accéder au menu M16 du restaurant numéro 10 de la ville de Paris
```
/paris/restaurants/10/menu/M16
```
