package com.example.myapplication.retrofit2;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class FeaturedPartnersItem{

	@SerializedName("additionalParameter")
	private String additionalParameter;

	@SerializedName("alternateText")
	private String alternateText;

	@SerializedName("endDate")
	private Object endDate;

	@SerializedName("imageUrl")
	private String imageUrl;

	@SerializedName("parameter")
	private String parameter;

	@SerializedName("id")
	private Object id;

	@SerializedName("type")
	private String type;

	@SerializedName("title")
	private String title;

	@SerializedName("url")
	private String url;

	@SerializedName("logoUrl")
	private String logoUrl;

	@SerializedName("startDate")
	private Object startDate;

	public void setAdditionalParameter(String additionalParameter){
		this.additionalParameter = additionalParameter;
	}

	public String getAdditionalParameter(){
		return additionalParameter;
	}

	public void setAlternateText(String alternateText){
		this.alternateText = alternateText;
	}

	public String getAlternateText(){
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

	public void setParameter(String parameter){
		this.parameter = parameter;
	}

	public String getParameter(){
		return parameter;
	}

	public void setId(Object id){
		this.id = id;
	}

	public Object getId(){
		return id;
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

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setLogoUrl(String logoUrl){
		this.logoUrl = logoUrl;
	}

	public String getLogoUrl(){
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
			"FeaturedPartnersItem{" + 
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