**SCOPO DI BRIDGE**

Disaccoppia un'astrazione dalla sua implementazione in modo che le due possano ***variare indipendentemente***.

Detto anche ***Handle/Body o Driver***

**PARTECIPANTI**

**Abstraction**: definisce l'interfaccia dell'astrazione. Mantiene un riferimento ad un oggetto di tipo ***Implementor***.

**RefinedAbstraction**: estende l'interfaccia definita da ***Abstraction***.

**Implementor**: definisce l'interfaccia per le classi che implementano l'astrazione (ConcreteImplementor).

**VANTAGGIO PRINCIPALE**

Con N RefinedAbstraction ed M ConcreteImplementor abbiamo soltanto (N+M) classi grazie all'utilizzo di questo pattern che ***separa l'astrazione dall'implementazione***.
Senza questa separazione (usando semplicemente l'ereditarietà) sarebbe stato necessario creare (N*M) classi in modo da supportare tutte le combinazioni possibili di astrazione e 
implementazione.

**COLLABORAZIONI**

***Abstraction*** trasferisce le richieste ricevute dal Client al suo oggetto ***Implementor***.

**ATTENZIONE**

Bridge potrebbe essere confuso con Adapter, ma in realtà i due pattern hanno obiettivi diversi, infatti Adapter serve ad adattare,Bridge a separare un 'astrazione dalla sua implementazione, 
per fare in modo che varino indipendentemente. Inoltre ***Bridge*** si usa spesso all'***inizio di un progetto*** al contrario di ***Adapter*** che viene usato per adattare delle nuove 
a classi che sono state ***già progettate***.


