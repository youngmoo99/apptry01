package com.example.apptry01;
//사용 자 계정 정보 모델 클래스
public class UserAccount {
    private String idToken; //Firbase Uid (고유 토큰정보)
    private String emailId; //이메일아이디
    private String password; //비밀번호
    private String myname; //이름
    private String birthday; //생년월일

    public UserAccount() { }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMyname() { return myname;}

    public void setMyname(String myname) { this.myname = myname; }

    public String getBirthday() { return birthday; }

    public void setBirthday(String birthday) { this.birthday = birthday; }
}
