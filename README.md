# Aste Online

Progetto di Analisi e Progettazione del Software, A.A. 2020/2021.  
Il progetto è stato realizzato con IBM Rational Software Architect Designer.

## Introduzione

Il sito "Aste OnLine" permette di organizzare e gestire la messa all’asta di oggetti e l’assegnazione degli stessi al miglior offerente attraverso la conduzione di processi
d’asta.

## Funzionalità e requisiti

Il servizio, che verrà fornito attraverso il Web, presenta le seguenti caratteristiche di funzionamento:
* Gestione degli oggetti d’asta: gli utenti registrati hanno la possibilità di inserire e modificare oggetti da mettere all’asta. Ogni oggetto è caratterizzato da un nome, una
descrizione, un anno di produzione, un prezzo di partenza, e una categoria a scelta tra quelle predefinite (es. mobile, quadro). L’amministratore delle aste può inserire e 
modificare le categorie di oggetti, ognuna caratterizzata da un nome e da una descrizione;
* Gestione del processo d’asta: l’amministratore delle aste può aprire nuove aste, definendo per ognuna di esse: nome dell’asta, data d’inizio, durata e oggetti in vendita per
quell’asta. Una volta creata un’asta, viene inviata una notifica automatica via email a tutti gli utenti registrati nel sistema, che possono iscriversi all’asta se interessati.
Giunta la data di inizio, l’amministratore delle aste può avviare un’asta e a questo punto tutti gli utenti iscritti all’asta possono partecipare effettuando offerte. Al proprio
termine temporale, un’asta viene dichiarata chiusa e tutti gli oggetti offerti vengono aggiudicati ai rispettivi migliori offerenti. La chiusura di un’asta comporta l’inizio del 
processo di addebito ai vincitori. Il processo di delivery degli oggetti aggiudicati viene gestito da una società esterna;
* Gestione degli utenti: deve essere possibile la registrazione online degli utenti. Il processo di registrazione richiede username, password, nome completo, email, indirizzo,
numero telefonico e dati relativi alla modalità di pagamento per effettuare acquisti e vendite (c/c o altra modalità), che verrà verificata al momento della registrazione. Per 
poter usufruire dei servizi offerti dal sistema, un utente registrato dovrà prima autenticarsi, fornendo username e password. Gli utenti registrati possono: inserire nuovi 
oggetti da mettere all’asta, partecipare alle aste alle quali sono interessati (iscrivendosi prima dell’inizio), fare offerte, visualizzare i migliori offerenti al termine di ogni asta alla quale partecipavano, e visualizzare la lista delle aste vinte. Analogamente, anche un amministratore dovrà autenticarsi per poter svolgere le sue funzioni;
* Gestione delle ricerche: tutti gli utenti possono effettuare ricerche fra gli oggetti d’asta, con filtri in base alla categoria, nome e descrizione degli oggetti;
* È prevista la funzionalità di rilancio automatico degli oggetti all’asta. Nel momento in cui l’Utente Registrato (e iscritto all’asta) effettua un’offerta valida per un 
oggetto, può applicare la funzionalità di rilancio automatico per quell’oggetto, specificando importo del rilancio e numero massimo di rilanci, da effettuare automaticamente 
quando il sistema riceve un’offerta valida per quell’oggetto da parte di un altro utente. Il rilancio automatico viene effettuato fintantoché non si raggiunge il numero massimo 
di rilanci oppure il rilancio rappresenta l’offerta massima corrente;
* È prevista la funzionalità di analisi delle aste terminate. L’Amministratore può consultare le aste terminate e produrre un report statistico mensile o annuale relativo 
all’importo totale degli oggetti venduti, al quantitativo medio di oggetti venduti e al numero medio di partecipanti. 
 
Le categorie di utenti del sistema sono le seguenti:
* Utenti generici: possono effettuare ricerche e registrarsi come utenti del servizio;
* Utenti registrati: possono gestire il proprio account, inserire e modificare oggetti d’asta sulla 
base delle categorie esistenti, e partecipare alle aste;
* Utente Premium: un Utente Registrato diventa Utente Premium nel momento in cui si aggiudica almeno 20 oggetti dalle aste alle quali ha partecipato. L’operazione di passaggio 
a Utente Premium viene gestita automaticamente dal sistema. Un Utente Premium ha la possibilità di creare aste riservate ai propri oggetti e monitorare l’andamento delle offerte
nelle proprie aste, decidendo autonomamente quando concludere un’asta. La fase che segue la chiusura di un’asta, ossia pagamenti e spedizioni, viene gestita dall’Amministratore
come per le aste tradizionali;
* Amministratori: possono inserire e modificare categorie di oggetti d’asta, creare aste, gestire la riscossione del pagamento dai vincitori d’asta e preparare gli oggetti per 
la consegna al destinatario.
