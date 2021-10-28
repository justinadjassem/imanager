package com.mairie.imanager.utilisateurmessage;

import com.mairie.imanager.audit.Auditable;
import com.mairie.imanager.message.Message;
import com.mairie.imanager.utilisateur.Utilisateur;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.Instant;

@Entity
public class UtilisateurMessage extends Auditable<String> {
    @Id
    private Long id;
    private Instant dateSentMsg;
    private Instant dateOuvertureMsg;
    @ManyToOne
    private Message message;
    @ManyToOne
    private Utilisateur utilisateur;

}
