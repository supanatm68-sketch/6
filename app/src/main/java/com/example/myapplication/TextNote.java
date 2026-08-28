package com.example.myapplication;

public class TextNote extends Note {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void getSummary() {
        System.out.println("หัวข้อ: " + getTitle());
        System.out.println("วันที่สร้าง: " + getCreatedDate());
        System.out.println("เนื้อหา: " + content);

        if (getUser() != null) {
            System.out.println("เจ้าของโน้ต: " + getUser().getUsername());
        }
    }
}