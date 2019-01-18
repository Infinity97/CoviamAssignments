package com.example.myapplication.retrofit2;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class CategoriesExtendedDataItem{

	@SerializedName("webViewUrl")
	private String webViewUrl;

	@SerializedName("categoryId")
	private String categoryId;

	public void setWebViewUrl(String webViewUrl){
		this.webViewUrl = webViewUrl;
	}

	public String getWebViewUrl(){
		return webViewUrl;
	}

	public void setCategoryId(String categoryId){
		this.categoryId = categoryId;
	}

	public String getCategoryId(){
		return categoryId;
	}

	@Override
 	public String toString(){
		return 
			"CategoriesExtendedDataItem{" + 
			"webViewUrl = '" + webViewUrl + '\'' + 
			",categoryId = '" + categoryId + '\'' + 
			"}";
		}
}