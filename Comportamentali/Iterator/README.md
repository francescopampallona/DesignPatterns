**SCOPO DI ITERATOR**

Fornire accesso sequenziale agli elementi di una collezione di oggetti senza esporre all'esterno la struttura interna di tale collezione.

**PARTECIPANTI**

**Iterator:** definisce un'interfaccia per accedere e attraversare una sequenza di elementi

**ConcreteIterator:** implementa l'interfaccia Iterator e tiene traccia della posizione corrente nell'attraversamento dell'oggetto composito

**Aggregate:** definisce un'interfaccia per la creazione di un oggetto Iterator

**ConcreteAggregate:** implementa l'interfaccia Aggregate e contiene la struttura della collezione

**ITERATOR IN JAVA**

Questo pattern è nativamente fornito da java in alcune librerie presenti all'interno del package ***java.util***. 
