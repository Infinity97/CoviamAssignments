package com.example.myapplication.retrofit2;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class CardInitialAnimation{

	@SerializedName("verticalPosition")
	private int verticalPosition;

	@SerializedName("name")
	private String name;

	@SerializedName("json")
	private Json json;

	@SerializedName("horizontalPosition")
	private int horizontalPosition;

	@SerializedName("heightOffset")
	private int heightOffset;

	@SerializedName("url")
	private String url;

	@SerializedName("widthOffset")
	private int widthOffset;

	public void setVerticalPosition(int verticalPosition){
		this.verticalPosition = verticalPosition;
	}

	public int getVerticalPosition(){
		return verticalPosition;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setJson(Json json){
		this.json = json;
	}

	public Json getJson(){
		return json;
	}

	public void setHorizontalPosition(int horizontalPosition){
		this.horizontalPosition = horizontalPosition;
	}

	public int getHorizontalPosition(){
		return horizontalPosition;
	}

	public void setHeightOffset(int heightOffset){
		this.heightOffset = heightOffset;
	}

	public int getHeightOffset(){
		return heightOffset;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setWidthOffset(int widthOffset){
		this.widthOffset = widthOffset;
	}

	public int getWidthOffset(){
		return widthOffset;
	}

	@Override
 	public String toString(){
		return 
			"CardInitialAnimation{" + 
			"verticalPosition = '" + verticalPosition + '\'' + 
			",name = '" + name + '\'' + 
			",json = '" + json + '\'' + 
			",horizontalPosition = '" + horizontalPosition + '\'' + 
			",heightOffset = '" + heightOffset + '\'' + 
			",url = '" + url + '\'' + 
			",widthOffset = '" + widthOffset + '\'' + 
			"}";
		}
}