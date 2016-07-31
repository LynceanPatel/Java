package files.common;

interface IFileUtil {
	public void createFile(String fileName, String filePath);
	public void deleteFile(String fileName, String filePath);
	public void writeFile(String fileName, String filePath);
	public void readFile(String fileName, String filePath);
}
