package com.example.myapplication.retrofit2;

import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class Banners{

	@SerializedName("middle_banners")
	private List<Object> middleBanners;

	@SerializedName("carousel_banners")
	private List<CarouselBannersItem> carouselBanners;

	@SerializedName("top_banners")
	private List<TopBannersItem> topBanners;

	public void setMiddleBanners(List<Object> middleBanners){
		this.middleBanners = middleBanners;
	}

	public List<Object> getMiddleBanners(){
		return middleBanners;
	}

	public void setCarouselBanners(List<CarouselBannersItem> carouselBanners){
		this.carouselBanners = carouselBanners;
	}

	public List<CarouselBannersItem> getCarouselBanners(){
		return carouselBanners;
	}

	public void setTopBanners(List<TopBannersItem> topBanners){
		this.topBanners = topBanners;
	}

	public List<TopBannersItem> getTopBanners(){
		return topBanners;
	}

	@Override
 	public String toString(){
		return 
			"Banners{" + 
			"middle_banners = '" + middleBanners + '\'' + 
			",carousel_banners = '" + carouselBanners + '\'' + 
			",top_banners = '" + topBanners + '\'' + 
			"}";
		}
}