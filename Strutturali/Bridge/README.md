**SCOPO DI BRIDGE**

Disaccoppia un'astrazione dalla sua implementazione in modo che le due possano ***variare indipendentemente***.

Detto anche ***Handle/Body o Driver***

**PARTECIPANTI**

**Abstraction**: definisce l'interfaccia dell'astrazione. Mantiene un riferimento ad un oggetto di tipo ***Implementor***.

**RefinedAbstraction**: estende l'interfaccia definita da ***Abstraction***.

**Implementor**: definisce l'interfaccia per le classi che implementano l'astrazione (ConcreteImplementor).

**COLLABORAZIONI**

***Abstraction*** trasferisce le richieste ricevute dal Client al suo oggetto ***Implementor***.

**ATTENZIONE**

Bridge potrebbe essere confuso con Adapter, ma in realtà i due pattern hanno obiettivi diversi, infatti Adapter serve ad adattare,Bridge a separare un 'astrazione dalla sua implementazione, 
per fare in modo che varino indipendentemente. Inoltre ***Bridge*** si usa spesso all'***inizio di un progetto*** al contrario di ***Adapter*** che viene usato per adattare delle nuove 
a classi che sono state ***già progettate***.


