**DECORATOR**

Detto anche ***Wrapper***

**SCOPO DI DECORATOR**

Aggiungere ***dinamicamente*** responsabilità a un oggetto. I decoratori forniscono un'***alternativa flessibile*** alla definizione di sottoclassi come strumento per l'estensione delle
funzionalità.

**PARTECIPANTI**

**Component**: Definisce un'interfaccia comune per gli oggetti ai quali possono essere aggiunte responsabilità dinamicamente

**ConcreteComponent**: Definisce un oggetto al quale possono essere aggiunte responsabilità ulteriori

**Decorator**:  Mantiene un riferimento a un oggetto ***Component*** e definisce un'***interfaccia conforme all'interfaccia di Component***

**ConcreteDecorator**: Aggiunge responsabilità al componente

**CONSIDERAZIONE PERSONALE**

Il mio pattern preferito assieme a Composite

