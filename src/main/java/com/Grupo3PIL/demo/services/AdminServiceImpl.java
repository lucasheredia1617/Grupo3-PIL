package com.Grupo3PIL.demo.services;

import com.Grupo3PIL.demo.repository.TurnPointRepository;
import com.Grupo3PIL.demo.model.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class AdminServiceImpl implements AdminService {
    @Autowired
    TurnPointRepository repository;

    @Override
    public Administrator saveAdmin(Administrator admin) {
        return repository.save(admin);
    }

    @Override
    public List<Administrator> listAdmin() {
        return null;
    }

    @Override
    public Administrator updateAdmin(Administrator admin, Long document) {
        return null;
    }

    @Override
    public void deleteAdmin(Long document) {
    }

}