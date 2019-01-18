package com.example.myapplication.retrofit2;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class EntryNotification{

	@SerializedName("imageURL")
	private Object imageURL;

	@SerializedName("title")
	private Object title;

	@SerializedName("message")
	private Object message;

	public void setImageURL(Object imageURL){
		this.imageURL = imageURL;
	}

	public Object getImageURL(){
		return imageURL;
	}

	public void setTitle(Object title){
		this.title = title;
	}

	public Object getTitle(){
		return title;
	}

	public void setMessage(Object message){
		this.message = message;
	}

	public Object getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"EntryNotification{" + 
			"imageURL = '" + imageURL + '\'' + 
			",title = '" + title + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}