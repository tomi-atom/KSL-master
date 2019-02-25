package atomstudio.ksl.response;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("github")
	private String github;

	@SerializedName("level")
	private String level;

	@SerializedName("email_ksl")
	private String emailKsl;

	@SerializedName("created")
	private String created;

	@SerializedName("facebook")
	private String facebook;

	@SerializedName("bio")
	private String bio;

	@SerializedName("telegram")
	private String telegram;

	@SerializedName("jurusan")
	private String jurusan;

	@SerializedName("id_user")
	private String idUser;

	@SerializedName("instagram")
	private String instagram;

	@SerializedName("picture")
	private String picture;

	@SerializedName("fakultas")
	private String fakultas;

	@SerializedName("password")
	private String password;

	@SerializedName("nim")
	private String nim;

	@SerializedName("quote")
	private String quote;

	@SerializedName("phone")
	private String phone;

	@SerializedName("name")
	private String name;

	@SerializedName("updated")
	private String updated;

	@SerializedName("email")
	private String email;

	@SerializedName("username")
	private String username;

	public void setGithub(String github){
		this.github = github;
	}

	public String getGithub(){
		return github;
	}

	public void setLevel(String level){
		this.level = level;
	}

	public String getLevel(){
		return level;
	}

	public void setEmailKsl(String emailKsl){
		this.emailKsl = emailKsl;
	}

	public String getEmailKsl(){
		return emailKsl;
	}

	public void setCreated(String created){
		this.created = created;
	}

	public String getCreated(){
		return created;
	}

	public void setFacebook(String facebook){
		this.facebook = facebook;
	}

	public String getFacebook(){
		return facebook;
	}

	public void setBio(String bio){
		this.bio = bio;
	}

	public String getBio(){
		return bio;
	}

	public void setTelegram(String telegram){
		this.telegram = telegram;
	}

	public String getTelegram(){
		return telegram;
	}

	public void setJurusan(String jurusan){
		this.jurusan = jurusan;
	}

	public String getJurusan(){
		return jurusan;
	}

	public void setIdUser(String idUser){
		this.idUser = idUser;
	}

	public String getIdUser(){
		return idUser;
	}

	public void setInstagram(String instagram){
		this.instagram = instagram;
	}

	public String getInstagram(){
		return instagram;
	}

	public void setPicture(String picture){
		this.picture = picture;
	}

	public String getPicture(){
		return picture;
	}

	public void setFakultas(String fakultas){
		this.fakultas = fakultas;
	}

	public String getFakultas(){
		return fakultas;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setNim(String nim){
		this.nim = nim;
	}

	public String getNim(){
		return nim;
	}

	public void setQuote(String quote){
		this.quote = quote;
	}

	public String getQuote(){
		return quote;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUpdated(String updated){
		this.updated = updated;
	}

	public String getUpdated(){
		return updated;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"github = '" + github + '\'' + 
			",level = '" + level + '\'' + 
			",email_ksl = '" + emailKsl + '\'' + 
			",created = '" + created + '\'' + 
			",facebook = '" + facebook + '\'' + 
			",bio = '" + bio + '\'' + 
			",telegram = '" + telegram + '\'' + 
			",jurusan = '" + jurusan + '\'' + 
			",id_user = '" + idUser + '\'' + 
			",instagram = '" + instagram + '\'' + 
			",picture = '" + picture + '\'' + 
			",fakultas = '" + fakultas + '\'' + 
			",password = '" + password + '\'' + 
			",nim = '" + nim + '\'' + 
			",quote = '" + quote + '\'' + 
			",phone = '" + phone + '\'' + 
			",name = '" + name + '\'' + 
			",updated = '" + updated + '\'' + 
			",email = '" + email + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}