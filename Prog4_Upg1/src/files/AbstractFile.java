package files;

/** 
 * Class for handling of basic functions of files and folders.
 * All files and folders inherit this class.
 *
 */
public abstract class AbstractFile {
	protected Folder parent;
	
	/**
	 * Takes a parent folder as parameter if the file isn't the root folder
	 * If is root folder, leave parent as null
	 */
	public AbstractFile(Folder parent, boolean isRoot) {
		if (!isRoot) this.parent = parent;
	}
	/**
	 * Set a new parent folder.
	 * Used when moving files
	 * @param folder new parent folder of the file
	 */
	public void setParent(Folder folder) {
		this.parent = folder;
	}
	
//	public abstract void delete();
	
	
}
