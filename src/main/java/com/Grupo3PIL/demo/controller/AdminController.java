package com.Grupo3PIL.demo.controller;

import com.Grupo3PIL.demo.model.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private com.Grupo3PIL.demo.services.AdminService AdminService;

    @PostMapping("/admin")
    public Administrator saveAdmin(@RequestBody Administrator admin) {
        return AdminService.saveAdmin(admin);
    }

    // Read operation
    @GetMapping("/admin")
    public List<Administrator> listAdmin() {
        return AdminService.listAdmin();
    }

    // Update operation
    @PutMapping("/admin/{document}")
    public Administrator
    updatePersona(@RequestBody Administrator admin,
                  @PathVariable("document") Long document) {
        return AdminService.updateAdmin(
                admin, document);
    }

    // Delete operation
    @DeleteMapping("/admin/{document}")
    public String deleteAdminByDoc(@PathVariable("document")
                                   Long document) {
        AdminService.deleteAdmin(
                document);
        return "Deleted Successfully";
    }
}