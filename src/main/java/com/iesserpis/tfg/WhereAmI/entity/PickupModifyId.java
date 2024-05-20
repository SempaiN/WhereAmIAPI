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
public class PickupModifyId implements Serializable {
    private static final long serialVersionUID = -3641168360181189999L;
    @Column(name = "idpickup", nullable = false)
    private Integer idpickup;

    @Column(name = "id_stat", nullable = false)
    private Integer idStat;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PickupModifyId entity = (PickupModifyId) o;
        return Objects.equals(this.idpickup, entity.idpickup) &&
                Objects.equals(this.idStat, entity.idStat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpickup, idStat);
    }

}