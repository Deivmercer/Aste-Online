package aste_online.dominio;

import java.util.Date;
import java.util.List;
import java.util.TreeSet;

/**
 * Rappresentazione di un asta.
 */
public class Asta {

    String nome;
    Date data_inizio;
    int durata;
    boolean aperta;
    List<Oggetto> oggetti;
    TreeSet<Offerta> offerte;

    /**
     * Crea una nuova asta.
     * @param nome          Il nome dell'asta
     * @param data_inizio   La data in cui inizierà l'asta
     * @param durata        La durata (in ore) dell'asta
     */
    public Asta(String nome, Date data_inizio, int durata) {

        this.nome = nome;
        this.data_inizio = data_inizio;
        this.durata = durata;
        aperta = false;
        String messaggio = "E' stata creata una nuova asta: " + this.nome + ".\n"
                         + "Verra' aperta il " + data_inizio.toString() + " e sarenno disponibili i seguenti oggetti:\n";
        for (Oggetto oggetto : oggetti) {
            messaggio += oggetto.getNome() + "\n";
        }
        // Recupera gli utenti dal DB
        // List<Utente> utenti = ...
        Servizio_EMail.invia_email(messaggio, utenti);
    }

    /**
     *  Apre l'asta, in modo che gli utenti possano effettuare delle offerte.
     */
    public void apri() {

        aperta = true;
    }

    /**
     * Chiude l'asta, fa partire il processo di pagamento al vincitore ed il processo di spedizione per gli oggetti.
     * Se non è stata effettuata nessuna offerta l'asta viene semplicemente chiusa.
     */
    public void chiudi() {

        aperta = false;
        if (offerte.size() > 0) {
            boolean esito = Pagamento_Adapter.post_addebito(offerta.utente.getMetodoDiPagamento.serializza(),
                                                           offerte.first().getValore());
            if (esito) {
                for (Oggetto oggetto : oggetti) {
                    String risultato = Vettore_Adapter.post_info_oggetto(oggetto.serializza());
                    // Salva il risultato...
                }
            } else {
                // Se il pagamento non va a buon fine, rimuovo l'offerta e riprovo con la seconda più alta
                offerte.remove(offerte.first());
                chiudi();
            }
        }
    }

    /**
     * Aggiunge un offerta alla lista ordinata.
     * @param offerta   La nuova offerta
     */
    public void aggiungiOfferta(Offerta offerta) {

        offerte.add(offerta);
    }

    /**
     * Aggiunge un listener sulla proprietà offerte; la finestra dell'asta verrà aggiornata ogni volta che un utente
     * fa una nuova offerta.
     */
    public void addPropertyListener() {

        // ...
    }
}
