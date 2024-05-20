package com.iesserpis.tfg.WhereAmI.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class UserCanCreateId implements Serializable {
    private static final long serialVersionUID = -6053917986361398572L;
    @Column(name = "id_user", nullable = false)
    private Integer idUser;

    @Column(name = "id_character", nullable = false)
    private Integer idCharacter;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserCanCreateId entity = (UserCanCreateId) o;
        return Objects.equals(this.idUser, entity.idUser) &&
                Objects.equals(this.idCharacter, entity.idCharacter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, idCharacter);
    }

}