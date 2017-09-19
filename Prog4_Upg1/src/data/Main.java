package data;

import java.io.File;

import files.FileTree;
import files.Folder;

public class Main {
	
	public static void main(String[] args) {
		FileTree files = new FileTree();
		files.createNewFolderInRoot("Folder1");
		files.createNewSoundClip("clip1", new File("file1"), "Folder1");
		files.createNewSoundClip("clip2", new File("file2"), "Folder1");
		files.createNewSoundClip("clip3", new File("file3"), "Folder1");
		files.createNewFolder("Folder2", "Folder1");
		files.createNewSoundClip("clip3", new File("file7"), "Folder2");
		files.createNewSoundClip("clip3", new File("file5"), "Folder55");
		
		Folder folder = files.getFolder("All Sound Clips");
		if (folder != null) {
			System.out.println(folder.getChildren());
		}
		
//		System.out.println(files);
		
	}

}
