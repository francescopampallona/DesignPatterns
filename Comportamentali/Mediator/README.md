**SCOPO DI MEDIATOR**

Mediator incapsula le modalità di comunicazione tra gli altri oggetti.Mediator favorisce un ***basso accoppiamento*** tra oggetti e permette il riutilizzo degli stessi oggetti in altri
contesti con modalità di comunicazione diverse, infatti per modificare la modalità di comunicazione tra gli oggetti è sufficente estendere soltanto Mediator.

E' una modalità di comunicazione centralizzata.

**PARTECIPANTI**

**Mediator:** definisce un'interfaccia per comunicare con gli oggetti Collegue.

**ConcreteMediator:** implementa la modalità di comunicazione tra i Collegue. Conosce e ***memorizza*** i suoi Collegue.

**Collegue:** definisce l'interfaccia dei Collegue e conosce Mediator.

**ConcreteCollegue:**  implementa la modalità di comunicazione con Mediator.