package com.example.folderservices;

import com.example.folderservices.models.File;
import com.example.folderservices.models.Folder;
import com.example.folderservices.models.User;
import com.example.folderservices.repositories.FileRepository;
import com.example.folderservices.repositories.FolderRespository;
import com.example.folderservices.repositories.UserRespository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FolderservicesApplicationTests {

	@Autowired
	FolderRespository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Autowired
	UserRespository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateFileFolderAndUser(){

		User user = new User("Iona");
		userRepository.save(user);

		Folder folder = new Folder("Folder Z", user);
		folderRepository.save(folder);

		File file = new File("File X", "stuff", 5, folder);
		fileRepository.save(file);
	}

}
