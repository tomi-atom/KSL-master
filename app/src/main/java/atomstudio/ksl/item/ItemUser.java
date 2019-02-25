package atomstudio.ksl.item;

import java.util.Date;

public class ItemUser {

    int id_user,nim;
    String username, password,emaiil, emailKsl, jurusan, fakultas, name, picture, quote, bio, telegram, github, facebook, instagram, phone;
    Date created, updated;

    public ItemUser(int id_user, int nim, String username, String password, String emaiil, String emailKsl, String jurusan, String fakultas, String name, String picture, String quote, String bio, String telegram, String github, String facebook, String instagram, String phone, Date created, Date updated) {
        this.id_user = id_user;
        this.nim = nim;
        this.username = username;
        this.password = password;
        this.emaiil = emaiil;
        this.emailKsl = emailKsl;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.name = name;
        this.picture = picture;
        this.quote = quote;
        this.bio = bio;
        this.telegram = telegram;
        this.github = github;
        this.facebook = facebook;
        this.instagram = instagram;
        this.phone = phone;
        this.created = created;
        this.updated = updated;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmaiil() {
        return emaiil;
    }

    public void setEmaiil(String emaiil) {
        this.emaiil = emaiil;
    }

    public String getEmailKsl() {
        return emailKsl;
    }

    public void setEmailKsl(String emailKsl) {
        this.emailKsl = emailKsl;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getTelegram() {
        return telegram;
    }

    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
