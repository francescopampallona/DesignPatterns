**SCOPO DI CHAIN OF RESPONSIBILITY**

Evitare l'accoppiamento fra il mittente di una richiesta e il destinatario, consentendo che più di un singolo oggetto possa eseguire la richiesta. Concatenare gli
oggetti destinatari e passare la richiesta di oggetto in oggetto finchè uno di questi non riesce ad esaudirla (***CONCETTO DI DELEGAZIONE***).

**PARTECIPANTI**

**Handler:** Definisce un'interfaccia comune per la gestione delle richieste.

**ConcreteHandler:** Gestisce le richieste di cui è responsabile. Può accedere al proprio successore. Se il ***ConcreteHandler*** sa gestire una richiesta, lo fa; altrimenti passa la
richiesta al suo successore.

**COLLABORAZIONI**

Quando un client invoca una richiesta questa viene propagata lungo la catena finchè un ConcreteHandler non si assume la responsabilità di gestirla.




