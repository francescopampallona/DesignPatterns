**SCOPO DI COMPOSITE**

Comporre oggetti in strutture ad albero per rappresentare gerarchie parte-tutto e consentire ai client di ***trattare oggetti singoli e composizioni in modo uniforme***.

**PARTECIPANTI**

**Component**: Dichiara l'interfaccia comune per gli oggetti che fanno parte della composizione.

**Leaf**: Rappresenta gli oggetti foglia della composizione, ossia gli oggetti che non possono avere figli. Definisce il comportamento degli ***oggetti primitivi*** nella composizione.

**Composite**: Definisce il comportamento per i componenti che hanno figli. Memorizza i componenti figli. 

**COLLABORAZIONI**

I client utilizzano l'interfaccia della classe ***Component*** per interagire con gli oggetti della struttura composita che possono essere sia oggetti Leaf, sia oggetti Composite.