package com.example.folderservices.repositories;

import com.example.folderservices.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<User, Long> {
}
