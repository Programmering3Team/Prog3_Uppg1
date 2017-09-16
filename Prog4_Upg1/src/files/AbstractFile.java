package files;

/** 
 * Class for handling of basic functions of files and folders.
 * All files and folders inherit this class.
 *
 */
public abstract class AbstractFile {
	protected String name;
	protected Folder parent;
	
	/**
	 * Takes a parent folder as parameter if the file isn't the root folder
	 * If is root folder, leave parent as null
	 */
	public AbstractFile(String name, Folder parent, boolean isRoot) {
		this.name = name;
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
	
	/**
	 * @return the name of the file
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Prints out the name and the parent of the file
	 */
	@Override
	public String toString() {
		return name +  ", Parent: " + parent + "\n";
	}
	
//	public abstract void delete();
	
	
}
