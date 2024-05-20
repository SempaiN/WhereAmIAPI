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
public class ItemModifyId implements Serializable {
    private static final long serialVersionUID = 1152019902857786702L;
    @Column(name = "iditem", nullable = false)
    private Integer iditem;

    @Column(name = "idstat", nullable = false)
    private Integer idstat;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ItemModifyId entity = (ItemModifyId) o;
        return Objects.equals(this.iditem, entity.iditem) &&
                Objects.equals(this.idstat, entity.idstat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iditem, idstat);
    }

}