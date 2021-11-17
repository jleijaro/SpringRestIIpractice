package com.example.SpringRestIIpractice.repository;

import com.example.SpringRestIIpractice.entity.Cliente;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Getter @Setter
public class ClienteRepository {
    private List<Cliente> clienteList = new ArrayList<>();

}
