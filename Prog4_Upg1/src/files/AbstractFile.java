package files;

/** 
 * Class for handling of basic functions of files and folders.
 * All files and folders inherit this class.
 *
 */
public abstract class AbstractFile {
	protected String name;
	protected Folder parentFolder;
	
	/**
	 * Takes a parent folder as parameter if the file isn't the root folder
	 * If is root folder, leave parent as null
	 */
	public AbstractFile(String name, Folder parentFolder, boolean isRoot) {
		this.name = name;
		if (!isRoot) this.parentFolder = parentFolder;
	}
	
	/**
	 * Set a new parent folder.
	 * Used when moving files
	 * @param folder new parent folder of the file
	 */
	public void setParent(Folder newParentFolder) {
		assert(newParentFolder != null); // Make sure the new parent folder isn't null
		this.parentFolder = newParentFolder;
	}
	
	/**
	 * Rename the file
	 * @param newName the new name of the file
	 */
	public void rename(String newName) {
		this.name = newName;
	}
	
	/**
	 * @return the name of the file
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Prints out the name;
	 */
	@Override
	public String toString() {
		return name;
	}
	
	public Folder getParent() {
		return parentFolder;
	}
}
