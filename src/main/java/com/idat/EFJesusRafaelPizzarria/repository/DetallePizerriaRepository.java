package com.idat.EFJesusRafaelPizzarria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFJesusRafaelPizzarria.entity.PizerriaDetalle;


@Repository
public interface DetallePizerriaRepository extends JpaRepository<PizerriaDetalle, Integer> {

}