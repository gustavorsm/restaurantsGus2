package com.ucbcba.demo.repositories;

import com.ucbcba.demo.entities.NivelPrecio;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;

@Transactional
public interface NivelPrecioRepository extends CrudRepository<NivelPrecio, Integer> {

}