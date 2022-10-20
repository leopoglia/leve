package com.leve.model.Factory;

import com.leve.DTO.TransporteDTO;
import com.leve.model.entities.Aviao;
import com.leve.model.entities.Onibus;
import com.leve.model.entities.Transporte;
import com.leve.model.entities.Trem;
import org.springframework.beans.BeanUtils;

public class TransporteFactory {
    public Transporte getFactory(TransporteDTO transporteDTO, Integer tipo){
        switch (tipo){
            case 1:{
                Aviao aviao = new Aviao();
                BeanUtils.copyProperties(transporteDTO, aviao);
                return aviao;
            }
            case 2:{
                Trem trem = new Trem();
                BeanUtils.copyProperties(transporteDTO, trem);
                return trem;
            }
            default:{
                Onibus onibus = new Onibus();
                BeanUtils.copyProperties(transporteDTO, onibus);
                return onibus;
            }
        }
    }
}
