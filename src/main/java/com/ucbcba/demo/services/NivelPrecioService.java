package com.ucbcba.demo.services;

import com.ucbcba.demo.entities.NivelPrecio;

public interface NivelPrecioService {

    Iterable<NivelPrecio> listAllNivelPrecios();

    void saveNivelPrecio(NivelPrecio nivelPrecio);

    NivelPrecio getNivelPrecio(Integer id);

    void deleteNivelPrecio(Integer id);

}
