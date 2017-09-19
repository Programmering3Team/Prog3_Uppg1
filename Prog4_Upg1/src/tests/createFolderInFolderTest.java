package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import files.FileTree;
import files.Folder;


/**
 * Tests if a folder is created in another folder.
 * A folder is created in the root folder and another folder is then created in that folder.
 * 
 */
public class createFolderInFolderTest {
	
	@Test
	public void test() {
		FileTree fileTree = new FileTree();
		Folder folder1 = fileTree.createNewFolderInRoot("Folder1");
		Folder folder2 = fileTree.createNewFolder("Folder2", "Folder1");
		
		assertEquals(folder2.getParent(), folder1);
	}

}
