package com.example.folderservices.repositories;

import com.example.folderservices.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRespository extends JpaRepository<Folder, Long> {
}
