**SCOPO DI COMMAND**

Incapsula una richiesta in un oggetto, consentendo di parametrizzare i client con richieste diverse, accodare o mantenere uno storico delle richieste e gestire richieste cancellabili.

**PARTECIPANTI**

**Command:** Specifica un'interfaccia per l'esecuzione di un'operazione generica.

**ConcreteCommand:** Implementa il metodo ***Execute***.

**Invoker:** Chiede a Command di portare a termine la richiesta.

**Receiver:** Conosce il modo di svolgere le operazioni associate ad una richiesta.

**COLLABORAZIONI**

```
Client-->>aReceiver: new Receiver()
Client-->>anInvoker: new Invoker()
Client-->>aCommand: new Command(aReceiver)
Client->>anInvoker: StoreCommand(key,aCommand)
Client->>anInvoker: Execute(key)
anInvoker->>aCommand: Execute() 
aCommand->>aReceiver: Action()
```

<img src="sequence_diagram.svg">