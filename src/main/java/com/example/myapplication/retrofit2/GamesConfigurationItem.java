package com.example.myapplication.retrofit2;

import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class GamesConfigurationItem{

	@SerializedName("currentTime")
	private String currentTime;

	@SerializedName("minIosVersion")
	private String minIosVersion;

	@SerializedName("loginNeeded")
	private boolean loginNeeded;

	@SerializedName("enabledGeoLocations")
	private List<Object> enabledGeoLocations;

	@SerializedName("entryNotification")
	private EntryNotification entryNotification;

	@SerializedName("startTime")
	private String startTime;

	@SerializedName("endTime")
	private String endTime;

	@SerializedName("type")
	private String type;

	@SerializedName("gamePlay")
	private String gamePlay;

	@SerializedName("minAndroidVersion")
	private String minAndroidVersion;

	@SerializedName("gameExtendedData")
	private GameExtendedData gameExtendedData;

	@SerializedName("geoLocationEnabled")
	private boolean geoLocationEnabled;

	public void setCurrentTime(String currentTime){
		this.currentTime = currentTime;
	}

	public String getCurrentTime(){
		return currentTime;
	}

	public void setMinIosVersion(String minIosVersion){
		this.minIosVersion = minIosVersion;
	}

	public String getMinIosVersion(){
		return minIosVersion;
	}

	public void setLoginNeeded(boolean loginNeeded){
		this.loginNeeded = loginNeeded;
	}

	public boolean isLoginNeeded(){
		return loginNeeded;
	}

	public void setEnabledGeoLocations(List<Object> enabledGeoLocations){
		this.enabledGeoLocations = enabledGeoLocations;
	}

	public List<Object> getEnabledGeoLocations(){
		return enabledGeoLocations;
	}

	public void setEntryNotification(EntryNotification entryNotification){
		this.entryNotification = entryNotification;
	}

	public EntryNotification getEntryNotification(){
		return entryNotification;
	}

	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	public String getStartTime(){
		return startTime;
	}

	public void setEndTime(String endTime){
		this.endTime = endTime;
	}

	public String getEndTime(){
		return endTime;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setGamePlay(String gamePlay){
		this.gamePlay = gamePlay;
	}

	public String getGamePlay(){
		return gamePlay;
	}

	public void setMinAndroidVersion(String minAndroidVersion){
		this.minAndroidVersion = minAndroidVersion;
	}

	public String getMinAndroidVersion(){
		return minAndroidVersion;
	}

	public void setGameExtendedData(GameExtendedData gameExtendedData){
		this.gameExtendedData = gameExtendedData;
	}

	public GameExtendedData getGameExtendedData(){
		return gameExtendedData;
	}

	public void setGeoLocationEnabled(boolean geoLocationEnabled){
		this.geoLocationEnabled = geoLocationEnabled;
	}

	public boolean isGeoLocationEnabled(){
		return geoLocationEnabled;
	}

	@Override
 	public String toString(){
		return 
			"GamesConfigurationItem{" + 
			"currentTime = '" + currentTime + '\'' + 
			",minIosVersion = '" + minIosVersion + '\'' + 
			",loginNeeded = '" + loginNeeded + '\'' + 
			",enabledGeoLocations = '" + enabledGeoLocations + '\'' + 
			",entryNotification = '" + entryNotification + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",endTime = '" + endTime + '\'' + 
			",type = '" + type + '\'' + 
			",gamePlay = '" + gamePlay + '\'' + 
			",minAndroidVersion = '" + minAndroidVersion + '\'' + 
			",gameExtendedData = '" + gameExtendedData + '\'' + 
			",geoLocationEnabled = '" + geoLocationEnabled + '\'' + 
			"}";
		}
}