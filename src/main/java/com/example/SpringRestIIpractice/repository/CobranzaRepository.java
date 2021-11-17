package com.example.SpringRestIIpractice.repository;

import com.example.SpringRestIIpractice.entity.Cobranza;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Getter @Setter
public class CobranzaRepository {
    private List<Cobranza> cobranzaLis = new ArrayList<>();

}
