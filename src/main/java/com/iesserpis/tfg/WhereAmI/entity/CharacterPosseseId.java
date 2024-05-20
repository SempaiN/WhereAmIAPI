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
public class CharacterPosseseId implements Serializable {
    private static final long serialVersionUID = 2220040968487393997L;
    @Column(name = "idcharacter", nullable = false)
    private Integer idcharacter;

    @Column(name = "idstat", nullable = false)
    private Integer idstat;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CharacterPosseseId entity = (CharacterPosseseId) o;
        return Objects.equals(this.idcharacter, entity.idcharacter) &&
                Objects.equals(this.idstat, entity.idstat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcharacter, idstat);
    }

}