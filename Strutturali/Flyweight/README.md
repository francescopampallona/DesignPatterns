**SCOPO DI FLYWEIGHT**

Utilizzare la ***condivisione*** per supportare in modo efficiente un gran numero di oggetti a granularità fine.

**PROBLEMA**

Un gran numero di oggetti creato a runtime utilizzano una quantità notevole di memoria e possono dunque introdurre un carico inaccettabile per il sistema durante l'esecuzione.

**SOLUZIONE**

Il pattern Flyweight descrive come condividere oggetti in modo da consentire il loro uso a granularità fine senza avere costi proibitivi.

Un FLYWEIGHT è un ***oggetto condiviso*** che può essere usato simultaneamente in più contesti. Gli  oggetti flyweight non possono fare alcuna ipotesi sul contesto in cui operano
ed è pertanto fondamentale la distinzione tra lo ***STATO INTERNO***(o intrinseco) e lo ***STATO ESTERNO***(o estrinseco) di un oggetto flyweight.

Lo ***STATO INTERNO*** memorizzato nel flyweight, è costituito da ***informazioni di stato indipendenti dal contesto*** in cui si trova il flyweight e pertanto ***può essere condiviso***.

Lo ***STATO ESTERNO*** dipende invece dal contesto in cui opera il flyweight e pertanto ***NON può essere condiviso***. Gli ***oggetti client sono responsabili del passaggio dello stato esterno 
al flyweight quando necessario***.

**PARTECIPANTI**

**Flyweight:** Dichiara un'interfaccia attraverso la quale gli oggetti flyweight possono ricevere lo stato esterno e agire di conseguenza.

**ConcreteFlyweight:** Implementa l'interfaccia Flyweight e consente la memorizzazione dello stato interno, se esiste. Un oggetto ConcreteFlyweight ***deve poter essere condiviso*** 
 pertanto tutte le informazioni di stato in esso memorizzate devono far parte del suo ***stato interno***.

**UnsharedConcreteFlyweight:** Non tutte le sottoclassi di Flyweight devono essere condivise. L'interfaccia Flyweight abilita la condivisione, ma non la impone.

**FlyweightFactory:** Si assicura che i flyweight siano condivisi in modo appropriato. Quando un client richiede un flyweight, l'oggetto FlyweightFactory restituisce un'istanza esistente,
oppure, se non esiste alcuna istanza, prima la crea e poi la restituisce.

**COLLABORAZIONI**

I client non dovrebbero istanziare direttamente i ***ConcreteFlyweight***, ma dovrebbero richiedere i riferimenti alla ***FlyweightFactory*** in modo da assicurare che la condivisione sia
effettuata in modo appropriato.










