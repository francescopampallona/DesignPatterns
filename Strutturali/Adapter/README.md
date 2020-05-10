**SCOPO DI ADAPTER**

Convertire l'interfaccia di una classe in un'altra interfaccia richiesta dal client. Adapter consente a classi diverse di operare insieme quanto ciò non sarebbe altrimenti possibile a causa di interfacce incompatibili.

Questo pattern è particolarmante utile quando si riusa codice di terze parti ed è necessario aggiornare le funzionalità di un software senza stravolgere l'intera gerarchia delle classi.

**PARTECIPANTI**

**TARGET** : Definisce l'interfaccia specifica del dominio utilizzata dal client

**ADAPTEE**: Individua l'interfaccia che deve essere adattata.

**ADAPTER**: Adatta l'interfaccia di ***Adaptee*** all'interfaccia ***Target***.
