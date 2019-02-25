package atomstudio.ksl;

public class Post {
    private int picture;
    private String title, author;

    public Post(int picture, String title, String author) {
        this.picture = picture;
        this.title = title;
        this.author = author;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
