package com.mairie.imanager.categorie;

import com.mairie.imanager.audit.Auditable;
import com.mairie.imanager.ticket.Ticket;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Categorie extends Auditable<String> {
    @Id
    private Long id;
    private String designation;
    private String description;
    @OneToMany(mappedBy = "categorie")
    private Collection<Ticket> tickets;

    public Categorie() {}

    public Categorie(Long id, String designation, String description, Collection<Ticket> tickets) {
        this.id = id;
        this.designation = designation;
        this.description = description;
        this.tickets = tickets;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", description='" + description + '\'' +
                ", tickets=" + tickets +
                '}';
    }
}
