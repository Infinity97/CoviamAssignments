package com.example.myapplication.retrofit2;

import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class GameExtendedData{

	@SerializedName("correctAnswerPoint")
	private int correctAnswerPoint;

	@SerializedName("backgroundColorCode")
	private String backgroundColorCode;

	@SerializedName("navbarTitle")
	private String navbarTitle;

	@SerializedName("noneImageUrl")
	private String noneImageUrl;

	@SerializedName("brandCacheCount")
	private int brandCacheCount;

	@SerializedName("baseImagePath")
	private String baseImagePath;

	@SerializedName("redeemVoucherURL")
	private String redeemVoucherURL;

	@SerializedName("minBrandsRequired")
	private int minBrandsRequired;

	@SerializedName("noneDisplayText")
	private String noneDisplayText;

	@SerializedName("cardBackImageUrl")
	private String cardBackImageUrl;

	@SerializedName("cardInitialAnimation")
	private CardInitialAnimation cardInitialAnimation;

	@SerializedName("infoText")
	private String infoText;

	@SerializedName("instructionsUrl")
	private String instructionsUrl;

	@SerializedName("pnvRequired")
	private boolean pnvRequired;

	@SerializedName("gameBanner")
	private String gameBanner;

	@SerializedName("tncUrl")
	private String tncUrl;

	@SerializedName("logoImageUrl")
	private String logoImageUrl;

	@SerializedName("countdownTimer")
	private int countdownTimer;

	@SerializedName("extraPoints")
	private int extraPoints;

	@SerializedName("baseUrl")
	private String baseUrl;

	@SerializedName("cardFinalAnimation")
	private CardFinalAnimation cardFinalAnimation;

	@SerializedName("gameLogo")
	private String gameLogo;

	@SerializedName("zipAssestsPath")
	private String zipAssestsPath;

	@SerializedName("bonusPointResponseTime")
	private int bonusPointResponseTime;

	@SerializedName("cardFrontImageUrl")
	private String cardFrontImageUrl;

	@SerializedName("brandsData")
	private List<BrandsDataItem> brandsData;

	@SerializedName("backgroundImageUrl")
	private String backgroundImageUrl;

	public void setCorrectAnswerPoint(int correctAnswerPoint){
		this.correctAnswerPoint = correctAnswerPoint;
	}

	public int getCorrectAnswerPoint(){
		return correctAnswerPoint;
	}

	public void setBackgroundColorCode(String backgroundColorCode){
		this.backgroundColorCode = backgroundColorCode;
	}

	public String getBackgroundColorCode(){
		return backgroundColorCode;
	}

	public void setNavbarTitle(String navbarTitle){
		this.navbarTitle = navbarTitle;
	}

	public String getNavbarTitle(){
		return navbarTitle;
	}

	public void setNoneImageUrl(String noneImageUrl){
		this.noneImageUrl = noneImageUrl;
	}

	public String getNoneImageUrl(){
		return noneImageUrl;
	}

	public void setBrandCacheCount(int brandCacheCount){
		this.brandCacheCount = brandCacheCount;
	}

	public int getBrandCacheCount(){
		return brandCacheCount;
	}

	public void setBaseImagePath(String baseImagePath){
		this.baseImagePath = baseImagePath;
	}

	public String getBaseImagePath(){
		return baseImagePath;
	}

	public void setRedeemVoucherURL(String redeemVoucherURL){
		this.redeemVoucherURL = redeemVoucherURL;
	}

	public String getRedeemVoucherURL(){
		return redeemVoucherURL;
	}

	public void setMinBrandsRequired(int minBrandsRequired){
		this.minBrandsRequired = minBrandsRequired;
	}

	public int getMinBrandsRequired(){
		return minBrandsRequired;
	}

	public void setNoneDisplayText(String noneDisplayText){
		this.noneDisplayText = noneDisplayText;
	}

	public String getNoneDisplayText(){
		return noneDisplayText;
	}

	public void setCardBackImageUrl(String cardBackImageUrl){
		this.cardBackImageUrl = cardBackImageUrl;
	}

	public String getCardBackImageUrl(){
		return cardBackImageUrl;
	}

	public void setCardInitialAnimation(CardInitialAnimation cardInitialAnimation){
		this.cardInitialAnimation = cardInitialAnimation;
	}

	public CardInitialAnimation getCardInitialAnimation(){
		return cardInitialAnimation;
	}

	public void setInfoText(String infoText){
		this.infoText = infoText;
	}

	public String getInfoText(){
		return infoText;
	}

	public void setInstructionsUrl(String instructionsUrl){
		this.instructionsUrl = instructionsUrl;
	}

	public String getInstructionsUrl(){
		return instructionsUrl;
	}

	public void setPnvRequired(boolean pnvRequired){
		this.pnvRequired = pnvRequired;
	}

	public boolean isPnvRequired(){
		return pnvRequired;
	}

	public void setGameBanner(String gameBanner){
		this.gameBanner = gameBanner;
	}

	public String getGameBanner(){
		return gameBanner;
	}

	public void setTncUrl(String tncUrl){
		this.tncUrl = tncUrl;
	}

	public String getTncUrl(){
		return tncUrl;
	}

	public void setLogoImageUrl(String logoImageUrl){
		this.logoImageUrl = logoImageUrl;
	}

	public String getLogoImageUrl(){
		return logoImageUrl;
	}

	public void setCountdownTimer(int countdownTimer){
		this.countdownTimer = countdownTimer;
	}

	public int getCountdownTimer(){
		return countdownTimer;
	}

	public void setExtraPoints(int extraPoints){
		this.extraPoints = extraPoints;
	}

	public int getExtraPoints(){
		return extraPoints;
	}

	public void setBaseUrl(String baseUrl){
		this.baseUrl = baseUrl;
	}

	public String getBaseUrl(){
		return baseUrl;
	}

	public void setCardFinalAnimation(CardFinalAnimation cardFinalAnimation){
		this.cardFinalAnimation = cardFinalAnimation;
	}

	public CardFinalAnimation getCardFinalAnimation(){
		return cardFinalAnimation;
	}

	public void setGameLogo(String gameLogo){
		this.gameLogo = gameLogo;
	}

	public String getGameLogo(){
		return gameLogo;
	}

	public void setZipAssestsPath(String zipAssestsPath){
		this.zipAssestsPath = zipAssestsPath;
	}

	public String getZipAssestsPath(){
		return zipAssestsPath;
	}

	public void setBonusPointResponseTime(int bonusPointResponseTime){
		this.bonusPointResponseTime = bonusPointResponseTime;
	}

	public int getBonusPointResponseTime(){
		return bonusPointResponseTime;
	}

	public void setCardFrontImageUrl(String cardFrontImageUrl){
		this.cardFrontImageUrl = cardFrontImageUrl;
	}

	public String getCardFrontImageUrl(){
		return cardFrontImageUrl;
	}

	public void setBrandsData(List<BrandsDataItem> brandsData){
		this.brandsData = brandsData;
	}

	public List<BrandsDataItem> getBrandsData(){
		return brandsData;
	}

	public void setBackgroundImageUrl(String backgroundImageUrl){
		this.backgroundImageUrl = backgroundImageUrl;
	}

	public String getBackgroundImageUrl(){
		return backgroundImageUrl;
	}

	@Override
 	public String toString(){
		return 
			"GameExtendedData{" + 
			"correctAnswerPoint = '" + correctAnswerPoint + '\'' + 
			",backgroundColorCode = '" + backgroundColorCode + '\'' + 
			",navbarTitle = '" + navbarTitle + '\'' + 
			",noneImageUrl = '" + noneImageUrl + '\'' + 
			",brandCacheCount = '" + brandCacheCount + '\'' + 
			",baseImagePath = '" + baseImagePath + '\'' + 
			",redeemVoucherURL = '" + redeemVoucherURL + '\'' + 
			",minBrandsRequired = '" + minBrandsRequired + '\'' + 
			",noneDisplayText = '" + noneDisplayText + '\'' + 
			",cardBackImageUrl = '" + cardBackImageUrl + '\'' + 
			",cardInitialAnimation = '" + cardInitialAnimation + '\'' + 
			",infoText = '" + infoText + '\'' + 
			",instructionsUrl = '" + instructionsUrl + '\'' + 
			",pnvRequired = '" + pnvRequired + '\'' + 
			",gameBanner = '" + gameBanner + '\'' + 
			",tncUrl = '" + tncUrl + '\'' + 
			",logoImageUrl = '" + logoImageUrl + '\'' + 
			",countdownTimer = '" + countdownTimer + '\'' + 
			",extraPoints = '" + extraPoints + '\'' + 
			",baseUrl = '" + baseUrl + '\'' + 
			",cardFinalAnimation = '" + cardFinalAnimation + '\'' + 
			",gameLogo = '" + gameLogo + '\'' + 
			",zipAssestsPath = '" + zipAssestsPath + '\'' + 
			",bonusPointResponseTime = '" + bonusPointResponseTime + '\'' + 
			",cardFrontImageUrl = '" + cardFrontImageUrl + '\'' + 
			",brandsData = '" + brandsData + '\'' + 
			",backgroundImageUrl = '" + backgroundImageUrl + '\'' + 
			"}";
		}
}