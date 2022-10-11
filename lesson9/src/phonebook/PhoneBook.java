package phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private ArrayList<Record> records = new ArrayList<Record>();
    public PhoneBook() {
    }

    public void add(Record record){
        records.add(record);
    };

    public Record find(String name){
        for (Record rec: records) {
            if (rec.getName().equals(name)){
                return rec;
            }
        }
        return null;
    };

    public List<Record> findAll(String name) {
        List<Record> record = new ArrayList<>();
        for (Record rec: records) {
            if(rec.getName().equals(name)){
                record.add(rec);
            }
        }   return record;

    }
};