package com.poly.Storage;

public class VideoLikedInfo {
	//Cau lenh sql tra ve 4 gia tri nen co 4 cot
	
	private Integer videoId;
	
	private String title;
	
	private String href;
	
	private Integer totalLike;

	public Integer getVideoId() {
		return videoId;
	}

	public void setVideoId(Integer videoId) {
		this.videoId = videoId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public Integer getTotalLike() {
		return totalLike;
	}

	public void setTotalLike(Integer totalLike) {
		this.totalLike = totalLike;
	}
	
	
}
