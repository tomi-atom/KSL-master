package atomstudio.ksl.response;

import com.google.gson.annotations.SerializedName;

public class BeritaItem{

	@SerializedName("id_post")
	private String idPost;

	@SerializedName("allow_comment")
	private String allowComment;

	@SerializedName("created")
	private String created;

	@SerializedName("id_category")
	private String idCategory;

	@SerializedName("id_author")
	private String idAuthor;

	@SerializedName("published")
	private String published;

	@SerializedName("type")
	private String type;

	@SerializedName("title")
	private String title;

	@SerializedName("picture")
	private String picture;

	@SerializedName("content")
	private String content;

	@SerializedName("meta_key")
	private String metaKey;

	@SerializedName("meta_description")
	private String metaDescription;

	@SerializedName("visitors")
	private String visitors;

	@SerializedName("publish")
	private String publish;

	@SerializedName("sticky")
	private String sticky;

	@SerializedName("permalink")
	private String permalink;

	@SerializedName("excerpt")
	private String excerpt;

	@SerializedName("updated")
	private String updated;

	public void setIdPost(String idPost){
		this.idPost = idPost;
	}

	public String getIdPost(){
		return idPost;
	}

	public void setAllowComment(String allowComment){
		this.allowComment = allowComment;
	}

	public String getAllowComment(){
		return allowComment;
	}

	public void setCreated(String created){
		this.created = created;
	}

	public String getCreated(){
		return created;
	}

	public void setIdCategory(String idCategory){
		this.idCategory = idCategory;
	}

	public String getIdCategory(){
		return idCategory;
	}

	public void setIdAuthor(String idAuthor){
		this.idAuthor = idAuthor;
	}

	public String getIdAuthor(){
		return idAuthor;
	}

	public void setPublished(String published){
		this.published = published;
	}

	public String getPublished(){
		return published;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setPicture(String picture){
		this.picture = picture;
	}

	public String getPicture(){
		return picture;
	}

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return content;
	}

	public void setMetaKey(String metaKey){
		this.metaKey = metaKey;
	}

	public String getMetaKey(){
		return metaKey;
	}

	public void setMetaDescription(String metaDescription){
		this.metaDescription = metaDescription;
	}

	public String getMetaDescription(){
		return metaDescription;
	}

	public void setVisitors(String visitors){
		this.visitors = visitors;
	}

	public String getVisitors(){
		return visitors;
	}

	public void setPublish(String publish){
		this.publish = publish;
	}

	public String getPublish(){
		return publish;
	}

	public void setSticky(String sticky){
		this.sticky = sticky;
	}

	public String getSticky(){
		return sticky;
	}

	public void setPermalink(String permalink){
		this.permalink = permalink;
	}

	public String getPermalink(){
		return permalink;
	}

	public void setExcerpt(String excerpt){
		this.excerpt = excerpt;
	}

	public String getExcerpt(){
		return excerpt;
	}

	public void setUpdated(String updated){
		this.updated = updated;
	}

	public String getUpdated(){
		return updated;
	}

	@Override
 	public String toString(){
		return 
			"BeritaItem{" + 
			"id_post = '" + idPost + '\'' + 
			",allow_comment = '" + allowComment + '\'' + 
			",created = '" + created + '\'' + 
			",id_category = '" + idCategory + '\'' + 
			",id_author = '" + idAuthor + '\'' + 
			",published = '" + published + '\'' + 
			",type = '" + type + '\'' + 
			",title = '" + title + '\'' + 
			",picture = '" + picture + '\'' + 
			",content = '" + content + '\'' + 
			",meta_key = '" + metaKey + '\'' + 
			",meta_description = '" + metaDescription + '\'' + 
			",visitors = '" + visitors + '\'' + 
			",publish = '" + publish + '\'' + 
			",sticky = '" + sticky + '\'' + 
			",permalink = '" + permalink + '\'' + 
			",excerpt = '" + excerpt + '\'' + 
			",updated = '" + updated + '\'' + 
			"}";
		}
}