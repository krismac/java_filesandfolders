package com.example.folderservices.repositories;

import com.example.folderservices.models.File;
import com.example.folderservices.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection =  EmbedFolder.class)
public interface FileRepository extends JpaRepository<File, Long> {
}