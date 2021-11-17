package com.example.SpringRestIIpractice.controller;

import com.example.SpringRestIIpractice.entity.Cliente;
import com.example.SpringRestIIpractice.entity.Cobranza;
import com.example.SpringRestIIpractice.entity.Inmueble;
import com.example.SpringRestIIpractice.repository.ClienteRepository;
import com.example.SpringRestIIpractice.repository.CobranzaRepository;
import com.example.SpringRestIIpractice.repository.InmueblaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sistema")
public class SistemaController {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private InmueblaRepository inmueblaRepository;

    @Autowired
    private CobranzaRepository cobranzaRepository;

    @Autowired
    private ModelMapper modelMapper;
//Opciones del CLientes
    @GetMapping("/Clientes")
    public List<Cliente> getCliente(){
        return clienteRepository.getClienteList();
    }

    @PostMapping("/agregarClientes")
    public void crearClientes(@RequestBody Cliente clientes ){
        Cliente cliente = modelMapper.map(clientes, Cliente.class);
        clienteRepository.getClienteList().add(cliente);
    }

//Opciones del Inmuebles
    @GetMapping("/Inmuebles")
    public List<Inmueble> getInmueble(){
        return inmueblaRepository.getInmuebleList();
    }

    @PostMapping("/agregarInmuebles")
    public void crearInmuebles(@RequestBody Inmueble inmuebles){
        Inmueble inmueble = modelMapper.map(inmuebles, Inmueble.class);
        inmueblaRepository.getInmuebleList().add(inmueble);
    }

//Opciones de cobranzas
    @GetMapping("/Cobranzas")
    public List<Cobranza> getCobranza(){
        return cobranzaRepository.getCobranzaLis();
    }

    @PostMapping("/agregarCobranzas")
    public void crearCobranza(@RequestParam Cobranza cobranzas, @RequestParam(name = "dni") String dni, @RequestParam(name = "numero")Integer numero){
        Cobranza cobranza = modelMapper.map(cobranzas,Cobranza.class);
        cobranzaRepository.getCobranzaLis().add(cobranza);
        //cobranzaRepository
    }
    /*@PostMapping("/agregarCobranzas")
    public void crearCobranza(@RequestBody Cobranza cobranzas){
        Cobranza cobranza = modelMapper.map(cobranzas, Cobranza.class);
        cobranzaRepository.getCobranzaLis().add(cobranza);
    }*/
}
