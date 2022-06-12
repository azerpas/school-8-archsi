# Messages oriented middlewares (MOM)

Message async exchange system.
- Uses message queue & broker to exchange messages.
- Between clients and servers.

### Unicast vs. multicast
- Unicast: One message sent to one receiver.
- Multicast: Many messages sent to many receivers.

### Topic model
- Topic: A message is sent from a `publisher` to all `subscribers` that match the topic.

## MOM Topologies
### Centralized (hub & spoke)
- Hub: A single server that handles all messages.
#### Advantages
- Unrelated clients connect to the hub.
#### Disadvantages
- Huge network trafic
- Unique point of failure
- Low scaling
- High latency

### Decentralized 
A MOM instance is instantiated on each client.
#### Advantages
- Distribution
#### Disadvantages
- Different interoperability
- Heavy clients

### Hybrid
Combines both advantages and disadvantages of centralized and decentralized MOM.