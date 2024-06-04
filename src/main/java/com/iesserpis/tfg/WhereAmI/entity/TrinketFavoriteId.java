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
public class TrinketFavoriteId implements Serializable {
    private static final long serialVersionUID = 7484724016509248856L;
    @Column(name = "idTrinket", nullable = false)
    private Integer idTrinket;

    @Column(name = "idUser", nullable = false)
    private Integer idUser;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TrinketFavoriteId entity = (TrinketFavoriteId) o;
        return Objects.equals(this.idUser, entity.idUser) &&
                Objects.equals(this.idTrinket, entity.idTrinket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, idTrinket);
    }

}