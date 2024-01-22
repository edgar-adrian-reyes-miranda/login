package com.logueo.spring.Services;

import com.logueo.spring.DTO.AdministradorDto;
import com.logueo.spring.Entity.Administrador;
import com.logueo.spring.Repository.AdminsitradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdministradorServices {
    @Autowired
    private AdminsitradorRepository adminsitradorRepository;

    //listas
    @Transactional(readOnly = true)
    public List<Administrador> findAllAdmins(){
        return adminsitradorRepository.findAll();
    }

    ///por id
    @Transactional(readOnly = true)
    public Administrador findByIdAdminstrador(Long id){
        return adminsitradorRepository.findById(id).orElse(null);
    }
    //correo
    @Transactional(readOnly = true)
    public Administrador findByUsername(String username){
        return adminsitradorRepository.findByUsername(username);
    }

    //guardar
    @Transactional
    public Administrador crearAdmins(AdministradorDto administradorDto){
        Administrador admins= new Administrador();
         admins.setUsername(administradorDto.getUsername());
         admins.setPassword(administradorDto.getPassword());
         return adminsitradorRepository.save(admins);
    }

    //eliminar
    @Transactional
    public void EliminarAdmins(Long id){
        adminsitradorRepository.deleteById(id);
    }

    //editar
    @Transactional
    public Administrador editarAdministradores(Long id, AdministradorDto administradorDto){
        Administrador admins = adminsitradorRepository.findById(id).orElse(null);
        if (admins != null){
            admins.setUsername(administradorDto.getUsername());
            admins.setPassword(administradorDto.getPassword());
            return adminsitradorRepository.save(admins);
        }else {
            return null;
        }
    }
}
