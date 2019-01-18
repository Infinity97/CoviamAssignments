package com.example.myapplication.retrofit2;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class BrandsDataItem{

	@SerializedName("brandName")
	private String brandName;

	@SerializedName("filename")
	private String filename;

	@SerializedName("priority")
	private int priority;

	public void setBrandName(String brandName){
		this.brandName = brandName;
	}

	public String getBrandName(){
		return brandName;
	}

	public void setFilename(String filename){
		this.filename = filename;
	}

	public String getFilename(){
		return filename;
	}

	public void setPriority(int priority){
		this.priority = priority;
	}

	public int getPriority(){
		return priority;
	}

	@Override
 	public String toString(){
		return 
			"BrandsDataItem{" + 
			"brandName = '" + brandName + '\'' + 
			",filename = '" + filename + '\'' + 
			",priority = '" + priority + '\'' + 
			"}";
		}
}