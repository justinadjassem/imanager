package com.mairie.imanager.role;

import com.mairie.imanager.audit.Auditable;
import com.mairie.imanager.permission.Permission;
import com.mairie.imanager.utilisateur.Utilisateur;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Role extends Auditable<String> {
    @Id
    private Long id;
    private String designation;
    private String description;

    @ManyToMany(mappedBy = "roles")
    private Collection<Utilisateur> utilisateurs;

    @ManyToMany
    @JoinTable(
            name = "roles_permissiom",
            joinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "privilege_id", referencedColumnName = "id"))
    private Collection<Permission> permissions;

    public Role() {}

    public Role(Long id, String designation, String description, Collection<Utilisateur> utilisateurs, Collection<Permission> permissions) {
        this.id = id;
        this.designation = designation;
        this.description = description;
        this.utilisateurs = utilisateurs;
        this.permissions = permissions;
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

    public Collection<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(Collection<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public Collection<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Collection<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", description='" + description + '\'' +
                ", utilisateurs=" + utilisateurs +
                ", permissions=" + permissions +
                '}';
    }
}
