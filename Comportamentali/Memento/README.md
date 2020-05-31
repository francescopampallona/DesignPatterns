**SCOPO DI MEMENTO**

Catturare ed esternare lo stato interno di un oggetto, senza violare l'incapsulamento, in modo tale che, in un secondo momento, sia possibile ripristinare un oggetto esportato.

**PARTECIPANTI**

**Memento:** memorizza lo stato interno dell'oggetto Originator. Non permette l'accesso alla sua struttura dati se non dall'***Originator***.
Il Caretaker vede un'interfaccia ridotta di Memento.

**Originator:** crea un Memento contenente un'instantanea del proprio stato interno corrente. Usa Memento per ripristinare il proprio stato interno.

**Caretaker:** memorizza uno stack di oggetti Memento. 

**COLLABORAZIONI**

Un ***Caretaker*** richiede un Memento ad un Originator e lo restituirà all'Originator soltanto se e quando quest'ultimo avrà bisogno di ripristinare un particolare stato precedente
associato a quel particolare Memento.

I Memento sono passivi. Solo l'Originator che ha creato il Memento assegnerà o recupererà il proprio stato dal Memento.