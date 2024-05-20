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
public class CharacterOwnId implements Serializable {
    private static final long serialVersionUID = 4052332082610453012L;
    @Column(name = "id_character", nullable = false)
    private Integer idCharacter;

    @Column(name = "id_pickup", nullable = false)
    private Integer idPickup;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CharacterOwnId entity = (CharacterOwnId) o;
        return Objects.equals(this.idPickup, entity.idPickup) &&
                Objects.equals(this.idCharacter, entity.idCharacter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPickup, idCharacter);
    }

}