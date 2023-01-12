package services;

import model.Administrator;
import java.util.List;

public interface AdminService {

    Administrator saveAdmin(Administrator admin);

    List<Administrator> listAdmin();

    Administrator updateAdmin(Administrator admin, Long document);

    void deleteAdmin(Long document);
}