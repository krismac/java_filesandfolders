package com.example.folderservices.projections;

import com.example.folderservices.models.File;
import com.example.folderservices.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();

}