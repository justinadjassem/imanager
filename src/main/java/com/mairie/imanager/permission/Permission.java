package com.mairie.imanager.permission;

import com.mairie.imanager.audit.Auditable;
import com.mairie.imanager.role.Role;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Permission extends Auditable<String> {
    @Id
    private Long id;
    private String nom;
    private String description;
    @ManyToMany(mappedBy = "permissions")
    private Collection<Role> roles;

    public Permission() {}

    public Permission(Long id, String nom, String description, Collection<Role> roles) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", roles=" + roles +
                '}';
    }
}
