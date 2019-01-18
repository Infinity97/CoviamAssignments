package com.example.myapplication.retrofit2;

import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class Response{

	//@SerializedName("oneKlikFeatureStatus")
	private boolean oneKlikFeatureStatus;

	//@SerializedName("blibliImageBaseUrl")
	private String blibliImageBaseUrl;

	@SerializedName("banners")
	private Banners banners;

	@SerializedName("featureBrands")
	private List<FeatureBrandsItem> featureBrands;

	@SerializedName("featuredPartners")
	private List<FeaturedPartnersItem> featuredPartners;

	@SerializedName("phone")
	private String phone;

	@SerializedName("categoriesExtendedData")
	private List<CategoriesExtendedDataItem> categoriesExtendedData;

	@SerializedName("nonTransactionOtpStatus")
	private boolean nonTransactionOtpStatus;

	@SerializedName("gamesConfiguration")
	private List<GamesConfigurationItem> gamesConfiguration;

	@SerializedName("memberDetails")
	private MemberDetails memberDetails;

	@SerializedName("recomendedProducts")
	private RecomendedProducts recomendedProducts;

	@SerializedName("topCategories")
	private List<TopCategoriesItem> topCategories;

	@SerializedName("customCategories")
	private String customCategories;

	@SerializedName("blibliLiveEnabled")
	private boolean blibliLiveEnabled;

	@SerializedName("isFlashDealActive")
	private boolean isFlashDealActive;

	public void setOneKlikFeatureStatus(boolean oneKlikFeatureStatus){
		this.oneKlikFeatureStatus = oneKlikFeatureStatus;
	}

	public boolean isOneKlikFeatureStatus(){
		return oneKlikFeatureStatus;
	}

	public void setBlibliImageBaseUrl(String blibliImageBaseUrl){
		this.blibliImageBaseUrl = blibliImageBaseUrl;
	}

	public String getBlibliImageBaseUrl(){
		return blibliImageBaseUrl;
	}

	public void setBanners(Banners banners){
		this.banners = banners;
	}

	public Banners getBanners(){
		return banners;
	}

	public void setFeatureBrands(List<FeatureBrandsItem> featureBrands){
		this.featureBrands = featureBrands;
	}

	public List<FeatureBrandsItem> getFeatureBrands(){
		return featureBrands;
	}

	public void setFeaturedPartners(List<FeaturedPartnersItem> featuredPartners){
		this.featuredPartners = featuredPartners;
	}

	public List<FeaturedPartnersItem> getFeaturedPartners(){
		return featuredPartners;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setCategoriesExtendedData(List<CategoriesExtendedDataItem> categoriesExtendedData){
		this.categoriesExtendedData = categoriesExtendedData;
	}

	public List<CategoriesExtendedDataItem> getCategoriesExtendedData(){
		return categoriesExtendedData;
	}

	public void setNonTransactionOtpStatus(boolean nonTransactionOtpStatus){
		this.nonTransactionOtpStatus = nonTransactionOtpStatus;
	}

	public boolean isNonTransactionOtpStatus(){
		return nonTransactionOtpStatus;
	}

	public void setGamesConfiguration(List<GamesConfigurationItem> gamesConfiguration){
		this.gamesConfiguration = gamesConfiguration;
	}

	public List<GamesConfigurationItem> getGamesConfiguration(){
		return gamesConfiguration;
	}

	public void setMemberDetails(MemberDetails memberDetails){
		this.memberDetails = memberDetails;
	}

	public MemberDetails getMemberDetails(){
		return memberDetails;
	}

	public void setRecomendedProducts(RecomendedProducts recomendedProducts){
		this.recomendedProducts = recomendedProducts;
	}

	public RecomendedProducts getRecomendedProducts(){
		return recomendedProducts;
	}

	public void setTopCategories(List<TopCategoriesItem> topCategories){
		this.topCategories = topCategories;
	}

	public List<TopCategoriesItem> getTopCategories(){
		return topCategories;
	}

	public void setCustomCategories(String customCategories){
		this.customCategories = customCategories;
	}

	public String getCustomCategories(){
		return customCategories;
	}

	public void setBlibliLiveEnabled(boolean blibliLiveEnabled){
		this.blibliLiveEnabled = blibliLiveEnabled;
	}

	public boolean isBlibliLiveEnabled(){
		return blibliLiveEnabled;
	}

	public void setIsFlashDealActive(boolean isFlashDealActive){
		this.isFlashDealActive = isFlashDealActive;
	}

	public boolean isIsFlashDealActive(){
		return isFlashDealActive;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"oneKlikFeatureStatus = '" + oneKlikFeatureStatus + '\'' + 
			",blibliImageBaseUrl = '" + blibliImageBaseUrl + '\'' + 
			",banners = '" + banners + '\'' + 
			",featureBrands = '" + featureBrands + '\'' + 
			",featuredPartners = '" + featuredPartners + '\'' + 
			",phone = '" + phone + '\'' + 
			",categoriesExtendedData = '" + categoriesExtendedData + '\'' + 
			",nonTransactionOtpStatus = '" + nonTransactionOtpStatus + '\'' + 
			",gamesConfiguration = '" + gamesConfiguration + '\'' + 
			",memberDetails = '" + memberDetails + '\'' + 
			",recomendedProducts = '" + recomendedProducts + '\'' + 
			",topCategories = '" + topCategories + '\'' + 
			",customCategories = '" + customCategories + '\'' + 
			",blibliLiveEnabled = '" + blibliLiveEnabled + '\'' + 
			",isFlashDealActive = '" + isFlashDealActive + '\'' + 
			"}";
		}
}