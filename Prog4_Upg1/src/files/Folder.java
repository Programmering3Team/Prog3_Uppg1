package files;

import java.util.ArrayList;

/**
 * Class for containing folders and files, extends AbstractFile
 *
 */
public class Folder extends AbstractFile {
	private ArrayList<AbstractFile> children;

	public Folder(Folder parent, boolean isRoot) {
		super(parent, isRoot);
		children = new ArrayList<>();
	}
	
	/**
	 * Add a file or folder to the folder.
	 * @param abstractFile file or folder added to the folder
	 */
	public void addChild(AbstractFile abstractFile) {
		children.add(abstractFile);
		
	}

}
