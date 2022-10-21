package phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private ArrayList<Record> records = new ArrayList<Record>();
    public PhoneBook() {
    }

    public void add(Record record){
        records.add(record);        // It`s basic method add elements in the list
    };

    public Record find(String name){
        for (Record record: records) {
            if (record.getName().equals(name)){
                return record;
            }
        }
        return null;
    };

    public List<Record> findAll(String name) {
        List<Record> listRecords = new ArrayList<>();
        for (Record record: records) {
            if(record.getName().equals(name)){
                listRecords.add(record);
            }
        }   return listRecords;

    }
};