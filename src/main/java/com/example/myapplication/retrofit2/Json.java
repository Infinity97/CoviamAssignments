package com.example.myapplication.retrofit2;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class Json{

	@SerializedName("abc")
	private String abc;

	public void setAbc(String abc){
		this.abc = abc;
	}

	public String getAbc(){
		return abc;
	}

	@Override
 	public String toString(){
		return 
			"Json{" + 
			"abc = '" + abc + '\'' + 
			"}";
		}
}