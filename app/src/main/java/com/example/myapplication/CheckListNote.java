package com.example.myapplication;

public class CheckListNote extends Note {

    private String items;

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    @Override
    public void getSummary() {
        System.out.println("หัวข้อ: " + getTitle());
        System.out.println("วันที่สร้าง: " + getCreatedDate());
        System.out.println("รายการ: " + items);

        if (getUser() != null) {
            System.out.println("เจ้าของโน้ต: " + getUser().getUsername());
        }
    }
}