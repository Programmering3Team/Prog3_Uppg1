package tests;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import files.FileTree;
import files.SoundClip;

/**
 * Test if a sound clip is created in the root folder.
 * 
 */
public class createSoundClipTest {

	@Test
	public void test() {
		FileTree fileTree = new FileTree();
		SoundClip clip = fileTree.createNewSoundClip("clip1", new File("clip1"), "All Sound Clips");
		
		assertTrue(clip.getParent() == fileTree.getRootFolder());
	}

}
