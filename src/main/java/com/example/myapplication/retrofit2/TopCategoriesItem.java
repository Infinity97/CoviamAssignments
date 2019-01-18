package com.example.myapplication.retrofit2;

import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class TopCategoriesItem{

	@SerializedName("customUrl")
	private String customUrl;

	@SerializedName("sequence")
	private int sequence;

	@SerializedName("topCategoryId")
	private String topCategoryId;

	@SerializedName("level")
	private int level;

	@SerializedName("imageUrl")
	private String imageUrl;

	@SerializedName("name")
	private String name;

	@SerializedName("categoryAlias")
	private String categoryAlias;

	@SerializedName("parentCategoryId")
	private Object parentCategoryId;

	@SerializedName("label")
	private Object label;

	@SerializedName("categoryId")
	private String categoryId;

	@SerializedName("subCategories")
	private List<Object> subCategories;

	public void setCustomUrl(String customUrl){
		this.customUrl = customUrl;
	}

	public String getCustomUrl(){
		return customUrl;
	}

	public void setSequence(int sequence){
		this.sequence = sequence;
	}

	public int getSequence(){
		return sequence;
	}

	public void setTopCategoryId(String topCategoryId){
		this.topCategoryId = topCategoryId;
	}

	public String getTopCategoryId(){
		return topCategoryId;
	}

	public void setLevel(int level){
		this.level = level;
	}

	public int getLevel(){
		return level;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCategoryAlias(String categoryAlias){
		this.categoryAlias = categoryAlias;
	}

	public String getCategoryAlias(){
		return categoryAlias;
	}

	public void setParentCategoryId(Object parentCategoryId){
		this.parentCategoryId = parentCategoryId;
	}

	public Object getParentCategoryId(){
		return parentCategoryId;
	}

	public void setLabel(Object label){
		this.label = label;
	}

	public Object getLabel(){
		return label;
	}

	public void setCategoryId(String categoryId){
		this.categoryId = categoryId;
	}

	public String getCategoryId(){
		return categoryId;
	}

	public void setSubCategories(List<Object> subCategories){
		this.subCategories = subCategories;
	}

	public List<Object> getSubCategories(){
		return subCategories;
	}

	@Override
 	public String toString(){
		return 
			"TopCategoriesItem{" + 
			"customUrl = '" + customUrl + '\'' + 
			",sequence = '" + sequence + '\'' + 
			",topCategoryId = '" + topCategoryId + '\'' + 
			",level = '" + level + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",name = '" + name + '\'' + 
			",categoryAlias = '" + categoryAlias + '\'' + 
			",parentCategoryId = '" + parentCategoryId + '\'' + 
			",label = '" + label + '\'' + 
			",categoryId = '" + categoryId + '\'' + 
			",subCategories = '" + subCategories + '\'' + 
			"}";
		}
}