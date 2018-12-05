package com.example.folderservices.components;

import com.example.folderservices.models.File;
import com.example.folderservices.models.Folder;
import com.example.folderservices.models.User;
import com.example.folderservices.repositories.FileRepository;
import com.example.folderservices.repositories.FolderRespository;
import com.example.folderservices.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRespository folderRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRespository userRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){
        User user1 = new User("Kris");
        userRepository.save(user1);

        Folder folder1 = new Folder("FolderA", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("FolderB", user1);
        folderRepository.save(folder2);

        File file1 = new File("FileA", "docx", 2, folder1);
        fileRepository.save(file1);

        File file2 = new File("File B", "xslx", 3, folder1);
        fileRepository.save(file2);
    }
}