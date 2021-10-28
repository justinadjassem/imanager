package com.mairie.imanager.message;

import com.mairie.imanager.audit.Auditable;
import com.mairie.imanager.ticket.Ticket;
import com.mairie.imanager.utilisateurmessage.UtilisateurMessage;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;


@Entity
public class Message extends Auditable<String> {
    @Id
    private Long id;
    private String topic;
    private String corps;
    private Boolean etat;
    @ManyToOne
    private Ticket ticket;
    @OneToMany(mappedBy = "message")
    private Collection<UtilisateurMessage>utilisateurMessages;

    public Message() {}

    public Message(Long id, String topic, String corps, Boolean etat, Ticket ticket, Collection<UtilisateurMessage> utilisateurMessages) {
        this.id = id;
        this.topic = topic;
        this.corps = corps;
        this.etat = etat;
        this.ticket = ticket;
        this.utilisateurMessages = utilisateurMessages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getCorps() {
        return corps;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Collection<UtilisateurMessage> getUtilisateurMessages() {
        return utilisateurMessages;
    }

    public void setUtilisateurMessages(Collection<UtilisateurMessage> utilisateurMessages) {
        this.utilisateurMessages = utilisateurMessages;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", corps='" + corps + '\'' +
                ", etat=" + etat +
                ", ticket=" + ticket +
                ", utilisateurMessages=" + utilisateurMessages +
                '}';
    }
}
