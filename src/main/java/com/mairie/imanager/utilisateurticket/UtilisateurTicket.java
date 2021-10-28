package com.mairie.imanager.utilisateurticket;

import com.mairie.imanager.audit.Auditable;
import com.mairie.imanager.ticket.Ticket;
import com.mairie.imanager.utilisateur.Utilisateur;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.Instant;

@Entity
public class UtilisateurTicket extends Auditable<String> {
    @Id
    private Long id;
    private Instant dateOuverture;
    private Instant dateFermeture;
    @ManyToOne
    private Utilisateur utilisateur;
    @ManyToOne
    private Ticket ticket;

}
