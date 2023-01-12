package com.Grupo3PIL.demo.services;

import com.Grupo3PIL.demo.model.Administrator;
import java.util.List;

public interface AdminService {

    Administrator saveAdmin(Administrator admin);

    List<Administrator> listAdmin();

    Administrator updateAdmin(Administrator admin, Long document);

    void deleteAdmin(Long document);
}