package com.example.myapplication.retrofit2;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class CarouselBannersItem{

	@SerializedName("additionalParameter")
	private Object additionalParameter;

	@SerializedName("alternateText")
	private Object alternateText;

	@SerializedName("endDate")
	private Object endDate;

	@SerializedName("imageUrl")
	private String imageUrl;

	@SerializedName("parameter")
	private Object parameter;

	@SerializedName("id")
	private String id;

	@SerializedName("type")
	private Object type;

	@SerializedName("title")
	private Object title;

	@SerializedName("url")
	private String url;

	@SerializedName("logoUrl")
	private Object logoUrl;

	@SerializedName("startDate")
	private Object startDate;

	public void setAdditionalParameter(Object additionalParameter){
		this.additionalParameter = additionalParameter;
	}

	public Object getAdditionalParameter(){
		return additionalParameter;
	}

	public void setAlternateText(Object alternateText){
		this.alternateText = alternateText;
	}

	public Object getAlternateText(){
		return alternateText;
	}

	public void setEndDate(Object endDate){
		this.endDate = endDate;
	}

	public Object getEndDate(){
		return endDate;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(int i){
		return imageUrl;
	}

	public void setParameter(Object parameter){
		this.parameter = parameter;
	}

	public Object getParameter(){
		return parameter;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setType(Object type){
		this.type = type;
	}

	public Object getType(){
		return type;
	}

	public void setTitle(Object title){
		this.title = title;
	}

	public Object getTitle(){
		return title;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setLogoUrl(Object logoUrl){
		this.logoUrl = logoUrl;
	}

	public Object getLogoUrl(){
		return logoUrl;
	}

	public void setStartDate(Object startDate){
		this.startDate = startDate;
	}

	public Object getStartDate(){
		return startDate;
	}

	@Override
 	public String toString(){
		return 
			"CarouselBannersItem{" + 
			"additionalParameter = '" + additionalParameter + '\'' + 
			",alternateText = '" + alternateText + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",parameter = '" + parameter + '\'' + 
			",id = '" + id + '\'' + 
			",type = '" + type + '\'' + 
			",title = '" + title + '\'' + 
			",url = '" + url + '\'' + 
			",logoUrl = '" + logoUrl + '\'' + 
			",startDate = '" + startDate + '\'' + 
			"}";
		}
}