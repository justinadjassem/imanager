package com.mairie.imanager.section;

import com.mairie.imanager.audit.Auditable;
import com.mairie.imanager.utilisateur.Utilisateur;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Section extends Auditable<String> {
    @Id
    private Long id;
    private String designation;
    private String description;
    @OneToMany(mappedBy = "section")
    private Collection<Utilisateur> utilisateurs;
}
