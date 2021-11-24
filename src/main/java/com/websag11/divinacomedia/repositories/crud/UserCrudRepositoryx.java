/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.websag11.divinacomedia.repositories.crud;

import com.websag11.divinacomedia.models.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Gerox
 */
public interface UserCrudRepositoryx extends CrudRepository<User,Integer>{
   
    public Optional<User> findByName(String name);


    public List<User> findByNameOrEmail(String name, String email);

    public Optional<User> findByEmail(String email);

    public Optional<User> findByEmailAndPassword(String email, String password);
    
}
