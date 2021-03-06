package files;

import java.io.File;

public class FileTree {
	private Folder rootFolder;
	
	public FileTree() {
		//Create the root folder of the data structure
		rootFolder = new Folder("All Sound Clips", null, true);
	}
	
	/**
	 * Create a new sound clip in the folder given as a parameter
	 * If no folder with the name given is found, a new folder is created in the root folder.
	 * 
	 * The created sound clip is returned
	 */
	public SoundClip createNewSoundClip(String name, File file, String targetFolderName) {
		assert(rootFolder != null);  //Test that root is not null
		Folder folder = rootFolder.getFolder(targetFolderName);
		if (folder == null) {
			folder = createNewFolderInRoot(targetFolderName);
		}
		SoundClip clip = new SoundClip(name, folder, file);
		folder.addChild(clip);
		//Test if root contains the created clip and that the clip is in the right folder
		assert(rootFolder.getChildren().contains(clip) && folder.getChildren().contains(clip));
		return clip;
	}
	
	/**
	 * Create a new folder in the folder given as a parameter
	 * If no folder with the name given is found, a new folder is created in the root folder.
	 * 
	 * The created folder is returned.
	 */
	public Folder createNewFolder(String name, String targetFolderName) {
		assert(rootFolder != null); //Test that root is not null
		Folder folder = rootFolder.getFolder(targetFolderName);
		if (folder == null) {
			folder = createNewFolderInRoot(targetFolderName);
		}
		Folder newFolder = new Folder(name, folder, false);
		folder.addChild(newFolder);
		//Test if root contains the target folder and the target folder contains the newly created folder
		assert(rootFolder.getFolder(targetFolderName) != null && folder.getFolder(name) != null);
		return newFolder;
	}
	
	/**
	 * Returns a new folder with the name given, created in the root folder
	 */
	public Folder createNewFolderInRoot(String name) {
		assert(rootFolder != null); //Test that root is not null
		Folder folder = new Folder(name, rootFolder, false);
		rootFolder.addChild(folder);
		assert(rootFolder.getFolder(name) != null); //Test if root contains the newly created folder
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


	public Folder getRootFolder() {
		return rootFolder;
	}





}
