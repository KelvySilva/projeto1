package br.com.sg.treinee.projeto1.service;

import br.com.sg.treinee.projeto1.domain.Cliente;
import br.com.sg.treinee.projeto1.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente findOne(Long id) {
        Optional<Cliente> optionalCliente = this.repository.findById(id);
        if (optionalCliente.isPresent()) {
            return optionalCliente.get();
        }else {
            return null;
        }

    }

    @Transactional
    public Cliente save(Cliente cliente){
        this.repository.save(cliente);
        return cliente;
    }

    public List<Cliente> list() {
        return this.repository.findAll();
    }

    @Transactional
    public Cliente update(Cliente cliente){
        this.repository.saveAndFlush(cliente);
        return cliente;
    }



}
