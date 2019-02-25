package atomstudio.ksl.item;

import android.media.Image;

import java.util.Date;

public class ItemPost {

    String idPost, idAuthor, title, permalink, excerpt, content, metaKey, metaDescription;
    Image picture;
    Date published, created, updated;

    public ItemPost(String idPost, String idAuthor, String title, String permalink, String excerpt, String content, String metaKey, String metaDescription, Image picture, Date published, Date created, Date updated) {
        this.idPost = idPost;
        this.idAuthor = idAuthor;
        this.title = title;
        this.permalink = permalink;
        this.excerpt = excerpt;
        this.content = content;
        this.metaKey = metaKey;
        this.metaDescription = metaDescription;
        this.picture = picture;
        this.published = published;
        this.created = created;
        this.updated = updated;
    }

    public String getIdPost() {
        return idPost;
    }

    public void setIdPost(String idPost) {
        this.idPost = idPost;
    }

    public String getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(String idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMetaKey() {
        return metaKey;
    }

    public void setMetaKey(String metaKey) {
        this.metaKey = metaKey;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public Image getPicture() {
        return picture;
    }

    public void setPicture(Image picture) {
        this.picture = picture;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
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