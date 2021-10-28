package com.mairie.imanager.utilisateur;

import com.mairie.imanager.audit.Auditable;
import com.mairie.imanager.role.Role;
import com.mairie.imanager.section.Section;
import com.mairie.imanager.utilisateurmessage.UtilisateurMessage;
import com.mairie.imanager.utilisateurticket.UtilisateurTicket;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import static javax.persistence.FetchType.*;

@Entity
public class Utilisateur extends Auditable<String>implements Serializable {
    @Id
    @GeneratedValue
    @Column(nullable = false,updatable = false)
    private Long id;
    @Column(nullable = false,updatable = false)
    private String utilisateurCode;
    private String civilite;
    private String nom;
    private String prenom;
    @Column(unique = true)
    private String email;
    private String password;
    private Date dateDeNaissance;
    private String imageUrl;
    private String poste;
    private String fonction;
    private boolean enabled;
    private boolean tokenExpired;

    @ManyToMany(fetch = EAGER)
    @JoinTable(
            name = "utilisateur_roles",
            joinColumns = @JoinColumn(
                    name = "utilisateur_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;
    @ManyToOne
    private Section section;
    @OneToMany(mappedBy = "utilisateur")
    private Collection<UtilisateurTicket> utilisateurTickets;
    @OneToMany(mappedBy = "utilisateur")
    private Collection<UtilisateurMessage>utilisateurMessages;

    public Utilisateur() {}

    public Utilisateur(Long id, String utilisateurCode, String civilite, String nom, String prenom, String email, String password, Date dateDeNaissance, String imageUrl, String poste, String fonction, boolean enabled, boolean tokenExpired, Collection<Role> roles, Section section, Collection<UtilisateurTicket> utilisateurTickets, Collection<UtilisateurMessage> utilisateurMessages) {
        this.id = id;
        this.utilisateurCode = utilisateurCode;
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.dateDeNaissance = dateDeNaissance;
        this.imageUrl = imageUrl;
        this.poste = poste;
        this.fonction = fonction;
        this.enabled = enabled;
        this.tokenExpired = tokenExpired;
        this.roles = roles;
        this.section = section;
        this.utilisateurTickets = utilisateurTickets;
        this.utilisateurMessages = utilisateurMessages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUtilisateurCode() {
        return utilisateurCode;
    }

    public void setUtilisateurCode(String utilisateurCode) {
        this.utilisateurCode = utilisateurCode;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isTokenExpired() {
        return tokenExpired;
    }

    public void setTokenExpired(boolean tokenExpired) {
        this.tokenExpired = tokenExpired;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Collection<UtilisateurTicket> getUtilisateurTickets() {
        return utilisateurTickets;
    }

    public void setUtilisateurTickets(Collection<UtilisateurTicket> utilisateurTickets) {
        this.utilisateurTickets = utilisateurTickets;
    }

    public Collection<UtilisateurMessage> getUtilisateurMessages() {
        return utilisateurMessages;
    }

    public void setUtilisateurMessages(Collection<UtilisateurMessage> utilisateurMessages) {
        this.utilisateurMessages = utilisateurMessages;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", utilisateurCode='" + utilisateurCode + '\'' +
                ", civilite='" + civilite + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", imageUrl='" + imageUrl + '\'' +
                ", poste='" + poste + '\'' +
                ", fonction='" + fonction + '\'' +
                ", enabled=" + enabled +
                ", tokenExpired=" + tokenExpired +
                ", roles=" + roles +
                ", section=" + section +
                ", utilisateurTickets=" + utilisateurTickets +
                ", utilisateurMessages=" + utilisateurMessages +
                '}';
    }
}
