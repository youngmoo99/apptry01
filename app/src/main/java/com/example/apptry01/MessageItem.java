package com.example.apptry01;
//채팅 액티비티 메시지 아이템

public class MessageItem {

    String name;
    String message;
    String time;
    String profileUrl;

    public MessageItem(String name, String message, String time, String pofileUrl) {
        this.name = name;
        this.message = message;
        this.time = time;
        this.profileUrl = pofileUrl;
    }

    //firebase DB에 객체로 값을 읽어올 때..
    //파라미터가 비어있는 생성자가 핑요함.
    public MessageItem() {
    }

    //Getter & Setter
    //사용자 이름(name) , 보낼 메시지(message)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPofileUrl() {
        return profileUrl;
    }

    public void setPofileUrl(String pofileUrl) {
        this.profileUrl = pofileUrl;
    }
}