package files;

import java.io.File;

public class FileTree {
	private Folder rootFolder;
	
	public FileTree() {
		rootFolder = new Folder("All Sound Clips", null, true);
	}
	
	
	/**
	 * Create a new Sound clip in the folder given as a parameter
	 * If no folder with the name given is found, a new folder is created in the root folder.
	 */
	public void createNewSoundClip(String name, File file, String targetFolderName) {
		Folder folder = rootFolder.getFolder(targetFolderName);
		if (folder == null) {
			folder = createNewFolderInRoot(targetFolderName);
		}
		SoundClip clip = new SoundClip(name, folder, file);
		folder.addChild(clip);
	}
	
	/**
	 * Create a new folder in the folder given as a parameter
	 * If no folder with the name given is found, a new folder is created in the root folder.
	 */
	public void createNewFolder(String name, String targetFolderName) {
		Folder folder = rootFolder.getFolder(targetFolderName);
		if (folder == null) {
			folder = createNewFolderInRoot(targetFolderName);
		}
		Folder newFolder = new Folder(name, folder, false);
		folder.addChild(newFolder);
	}
	
	/**
	 * Returns a new folder with the name given, created in the root folder
	 */
	public Folder createNewFolderInRoot(String name) {
		Folder folder = new Folder(name, rootFolder, false);
		rootFolder.addChild(folder);
		return folder;
	}
	
	/**
	 * Returns the folder with the name given as parameter,
	 * Returns null if no folder with the name is found
	 */
	public Folder getFolder(String name) {
		return rootFolder.getFolder(name);
	}
	
	@Override
	public String toString() {
		return rootFolder.toString();
	}





}
