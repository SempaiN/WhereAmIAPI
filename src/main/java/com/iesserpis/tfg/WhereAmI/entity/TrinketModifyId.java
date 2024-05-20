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
public class TrinketModifyId implements Serializable {
    private static final long serialVersionUID = 6250623111693134948L;
    @Column(name = "idtrinket", nullable = false)
    private Integer idtrinket;

    @Column(name = "idstat", nullable = false)
    private Integer idstat;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TrinketModifyId entity = (TrinketModifyId) o;
        return Objects.equals(this.idtrinket, entity.idtrinket) &&
                Objects.equals(this.idstat, entity.idstat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idtrinket, idstat);
    }

}