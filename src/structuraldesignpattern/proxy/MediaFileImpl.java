package structuraldesignpattern.proxy;

public class MediaFileImpl implements MediaFile {
	private String fileName;

	public MediaFileImpl(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void printName() {
		System.out.println("Displaying " + fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}
}
