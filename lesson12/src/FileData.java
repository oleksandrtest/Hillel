import java.util.Arrays;

public class FileData implements Comparable<FileData> {

    private String fileName;
    private String filePath;
    private byte[] fileSize;

    public FileData(String fileName, String filePath, byte[] fileSize) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public byte[] getFileSize() {
        return fileSize;
    }

    public void setFileSize(byte[] fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public int compareTo(FileData file) {
        if (this.fileSize.length < file.fileSize.length) {
            return -1;
        } else {
            return 1;
        }
    }
}
