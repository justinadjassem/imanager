package com.mairie.imanager.utilisateur;

import com.mairie.imanager.role.Role;
import com.mairie.imanager.section.Section;
import com.mairie.imanager.utilisateurmessage.UtilisateurMessage;
import com.mairie.imanager.utilisateurticket.UtilisateurTicket;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public class UtilisateurDto implements Serializable {

    private Long id;
    private String utilisateurCode;
    private String civilite;
    private String nom;
    private String prenom;
    private String email;
    private Date dateDeNaissance;
    private String imageUrl;
    private String poste;
    private String fonction;
    private boolean enabled;
    private boolean tokenExpired;
    private Collection<Role> roles;
    private Section section;
    private Collection<UtilisateurTicket> utilisateurTickets;
    private Collection<UtilisateurMessage>utilisateurMessages;

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
}
