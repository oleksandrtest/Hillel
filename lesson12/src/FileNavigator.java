import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FileNavigator{
    private final Map<String, ArrayList<FileData>> filesList = new HashMap<>();

    public void add(FileData file) {
        if (!filesList.containsKey(file.getFilePath())) {
            filesList.put(file.getFilePath(), new ArrayList<>());
        }
        filesList.get(file.getFilePath()).add(file);
    }

    public void add(String filePath, FileData file) {
        if (filePath.equals(file.getFilePath())) {
            System.out.println(filePath);
            System.out.println(file.getFilePath());
            add(file);
        } else
            System.out.println("Wrong file path, please put correct!!!");
    }

    public ArrayList<FileData> find(String filePath) {
        return filesList.get(filePath);
    }

    public ArrayList<FileData> filterBySize(byte[] sizeInByte) {
        ArrayList<FileData> filteredList = new ArrayList<>();
        for (ArrayList<FileData> files : filesList.values()) {
            for (FileData fileData : files) {
                if (fileData.getFileSize().length <= sizeInByte.length) {
                    filteredList.add(fileData);
                }
            }
        }
        return filteredList;
    }

    public void remove(String filePath) {
        filesList.remove(filePath);
    }

    public ArrayList<FileData> sortBySize() {
        ArrayList<FileData> sortedList = new ArrayList<>();
        for (Map.Entry<String, ArrayList<FileData>> file : filesList.entrySet()) {
            sortedList.addAll(file.getValue());
        }
        Collections.sort(sortedList);
        return sortedList;
    }

}
