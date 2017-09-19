package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import files.FileTree;
import files.Folder;

public class createFolderInRootTest {
	
	/**
	 * Creates a folder in the root folder and then 
	 * tests if the root folder is the parent folder of the created folder.
	 * 
	 */

	@Test
	public void test() {
		FileTree fileTree = new FileTree();
		Folder createdFolder = fileTree.createNewFolderInRoot("Folder1");
		assertEquals(createdFolder.getParent(), fileTree.getRootFolder());
	}

}
