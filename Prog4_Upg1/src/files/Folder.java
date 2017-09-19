package files;

import java.util.ArrayList;

/**
 * Class for containing folders and files, extends AbstractFile
 *
 */
public class Folder extends AbstractFile {
	private ArrayList<AbstractFile> children;

	public Folder(String name, Folder parentFolder, boolean isRoot) {
		super(name, parentFolder, isRoot);
		children = new ArrayList<>();
	}
	
	/**
	 * Add a file or folder to the folder.
	 * @param abstractFile file or folder added to the folder
	 */
	public void addChild(AbstractFile abstractFile) {
		assert(children != null);
		children.add(abstractFile);
		assert(children.contains(abstractFile));	
	}
	
	/**
	 * Returns all the files in the folder and it's sub folders.
	 */
	public ArrayList<AbstractFile> getChildren() {
		ArrayList<AbstractFile> allChildren = new ArrayList<>();
		
		for (int i = 0; i < children.size(); i++) {
			// If the child is a folder, add all it's files, and it's sub folders files, to the list
			if (children.get(i).getClass().equals(Folder.class)) {
				allChildren.addAll(((Folder) children.get(i)).getChildren());
			// If the child is a file, add it to the list
			} else {
				allChildren.add(children.get(i));
			}	
		}
		return allChildren;
	}
	
	/**
	 * Returns the folder with the name given as a parameter if it exists, else it returns null
	 * 
	 */
	public Folder getFolder(String name) {
		if (this.name.equals(name)) return this;
		
		for (int i = 0; i < children.size(); i++) {
			// If a child in this folder has the name given as a parameter return it, else search is children
			// and return the folder if it has a folder with the name given.
			// If no folder is found, return null.
			if (children.get(i).getClass().equals(Folder.class)) {
				if (children.get(i).getName().equals(name)) {
					return (Folder) children.get(i);
				} else {
					if (((Folder) children.get(i)).getFolder(name) != null) {
						return ((Folder) children.get(i)).getFolder(name);
					}
				}
			}
		}
		return null;
	}
	
	
	/**
	 * Prints out the folder info and the info of the children
	 */
	@Override
	public String toString() {
		String childString = "";
		for (int i = 0; i < children.size(); i++) {
			childString += "\t" + children.get(i) + "\n";
		}
		return super.toString() + "\nChildern:\n" + childString;
	}

}
