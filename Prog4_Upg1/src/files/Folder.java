package files;

import java.util.ArrayList;

/**
 * Class for containing folders and files, extends AbstractFile
 *
 */
public class Folder extends AbstractFile {
	private ArrayList<AbstractFile> children;

	
	public Folder(String name, Folder parent, boolean isRoot) {
		super(name, parent, isRoot);
		children = new ArrayList<>();
	}
	
	/**
	 * Add a file or folder to the folder.
	 * @param abstractFile file or folder added to the folder
	 */
	public void addChild(AbstractFile abstractFile) {
		children.add(abstractFile);
		
	}
	
	/**
	 * Prints out the folder info and the info of the children
	 */
	@Override
	public String toString() {
		String childString = "";
		for (int i = 0; i < children.size(); i++) {
			childString += children.get(i) + "\n";
		}
		return super.toString() + "\nChildern:\n" + childString;
	}

}
