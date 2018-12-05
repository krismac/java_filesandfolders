package com.example.folderservices;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FolderservicesApplicationTests {

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Autowired
	UserRepository userRepository;

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
