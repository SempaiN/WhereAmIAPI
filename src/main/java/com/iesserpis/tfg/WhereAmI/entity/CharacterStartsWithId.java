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
public class CharacterStartsWithId implements Serializable {
    private static final long serialVersionUID = -2371244027101250145L;
    @Column(name = "idcharacter", nullable = false)
    private Integer idcharacter;

    @Column(name = "id_trinket", nullable = false)
    private Integer idTrinket;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CharacterStartsWithId entity = (CharacterStartsWithId) o;
        return Objects.equals(this.idcharacter, entity.idcharacter) &&
                Objects.equals(this.idTrinket, entity.idTrinket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcharacter, idTrinket);
    }

}