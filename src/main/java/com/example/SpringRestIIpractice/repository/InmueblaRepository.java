package com.example.SpringRestIIpractice.repository;

import com.example.SpringRestIIpractice.entity.Inmueble;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Getter @Setter
public class InmueblaRepository {
    private List<Inmueble> inmuebleList = new ArrayList<>();
}
