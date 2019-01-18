package com.example.myapplication.retrofit2;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class FeatureBrandsItem{

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
	private Object id;

	@SerializedName("type")
	private Object type;

	@SerializedName("title")
	private String title;

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

	public String getImageUrl(){
		return imageUrl;
	}

	public void setParameter(Object parameter){
		this.parameter = parameter;
	}

	public Object getParameter(){
		return parameter;
	}

	public void setId(Object id){
		this.id = id;
	}

	public Object getId(){
		return id;
	}

	public void setType(Object type){
		this.type = type;
	}

	public Object getType(){
		return type;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
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
			"FeatureBrandsItem{" + 
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