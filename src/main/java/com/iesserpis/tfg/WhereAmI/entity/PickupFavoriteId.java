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
public class PickupFavoriteId implements Serializable {
    private static final long serialVersionUID = -5084351846113994331L;
    @Column(name = "idpickup", nullable = false)
    private Integer idpickup;

    @Column(name = "iduser", nullable = false)
    private Integer iduser;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PickupFavoriteId entity = (PickupFavoriteId) o;
        return Objects.equals(this.iduser, entity.iduser) &&
                Objects.equals(this.idpickup, entity.idpickup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iduser, idpickup);
    }

}