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
public class ItemFavoriteId implements Serializable {
    private static final long serialVersionUID = -4409198662580092970L;
    @Column(name = "iditem", nullable = false)
    private Integer iditem;

    @Column(name = "iduser", nullable = false)
    private Integer iduser;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ItemFavoriteId entity = (ItemFavoriteId) o;
        return Objects.equals(this.iditem, entity.iditem) &&
                Objects.equals(this.iduser, entity.iduser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iditem, iduser);
    }

}