package com.atguigu.bridge.video;

public abstract class PlatForm {
	public Video video;

	public PlatForm(Video video) {
		super();
		this.video = video;
	}
	public Video getVideo() {
		return video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}
	public void play() {
		video.play();
	}
}
