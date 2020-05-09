**SCOPO**
Specificare la tipologia di oggetti da creare utilizzando un'istanza prototipo e creare nuovi oggetti copiando questo prototipo.

**PROBLEMA**
Lo svantaggio del Factory Method è che occorre definire tante classi CreatorN quanti sono gli oggetti concreti ConcreteObjectN.
Se il numero di oggetti concreti è molto grande, ***il pattern Factory Method non è più adatto!!!***

**SOLUZIONE**
Usando il pattern Prototype non sarà più necessario creare una classe CreatorN per ogni ConcreteObjectN.
Il metodo createObject di Creator adesso ci permette di creare oggetti appartenenti a classi diverse.