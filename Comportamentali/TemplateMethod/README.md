**SCOPO DI TEMPLATE METHOD**

Definire la struttura di un algoritmo all'interno di un metodo, delegando alcuni passi dell'algoritmo alle sottoclassi. TemplateMethod lascia che le sottoclassi ridefiniscano alcuni passi
dell'algoritmo senza dover implementare di nuovo la struttura dell'algoritmo stesso.

**PARTECIPANTI**

**AbstractClass:** Definisce metodi primitivi astratti che le sottoclassi concrete definiranno per implementare i singoli passi di un algoritmo.Implementa un ***metodo template*** che
 definisce la struttura dell'algoritmo. 

**ConcreteClass:** Implementa i metodi primitivi.

**COLLABORAZIONI**

***ConcreteClass*** si basa su ***AbstractClass*** per implementare i passi invarianti dell'algoritmo.
In questo pattern il controllo è invertito, infatti è AbstractClass a chiamare i metodi definiti dalle classi figlie e non viceversa, questa struttura è chiamata ***Principio di Hollywood*** 
ossia ***Non chiamarci, ti chiamiamo noi***.

**UTILIZZI**
Template Method è così importante che è possibile trovarlo in quasi tutte le classi astratte.
Ad esempio è usato nelle Servlet.


