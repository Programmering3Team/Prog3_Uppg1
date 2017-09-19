package tests;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import files.FileTree;
import files.Folder;
import files.SoundClip;

/**
 * Test if the child hierarchy is working by checking if the different folders have the right children
 * 
 */
public class treeStructureTest {

	@Test
	public void test() {
		FileTree fileTree = new FileTree();
		
		Folder folder1 =  fileTree.createNewFolderInRoot("Folder1");
		SoundClip clip1 = fileTree.createNewSoundClip("file1", new File("file1"), "Folder1");
		SoundClip clip2 = fileTree.createNewSoundClip("file2", new File("file2"), "Folder1");
		Folder folder2 =  fileTree.createNewFolder("Folder2", "Folder1");
		SoundClip clip3 = fileTree.createNewSoundClip("file3", new File("file3"), "Folder2");
		SoundClip clip4 = fileTree.createNewSoundClip("file4", new File("file4"), "Folder2");
		SoundClip clip5 = fileTree.createNewSoundClip("file5", new File("file5"), "Folder2");
		Folder folder3 =  fileTree.createNewFolder("Folder3", "Folder2");
		SoundClip clip6 = fileTree.createNewSoundClip("file6", new File("file6"), "Folder3");
		SoundClip clip7 = fileTree.createNewSoundClip("file7", new File("file7"), "Folder3");
		
		assertTrue(folder1.getChildren().contains(clip7)); // clip7 should be a child of folder1
		assertFalse(folder2.getChildren().contains(clip1)); //clip1 should NOT be a child of folder 2
		// Folder 2 should contain clip3 and clip6 and NOT clip1
		assertTrue(folder2.getChildren().contains(clip3) && folder2.getChildren().contains(clip6) && !folder2.getChildren().contains(clip1));
	}

}
