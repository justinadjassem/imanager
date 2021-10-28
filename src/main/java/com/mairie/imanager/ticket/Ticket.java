package com.mairie.imanager.ticket;

import com.mairie.imanager.audit.Auditable;
import com.mairie.imanager.categorie.Categorie;
import com.mairie.imanager.message.Message;
import com.mairie.imanager.utilisateurticket.UtilisateurTicket;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Ticket extends Auditable<String> {
    @Id
    private Long id;
    private String description;
    private String equipement;
    @OneToMany(mappedBy = "ticket")
    private Collection<UtilisateurTicket> utilisateurTickets;
    @ManyToOne
    private Categorie categorie;
    @OneToMany(mappedBy = "ticket")
    private Collection<Message> messages;




}
