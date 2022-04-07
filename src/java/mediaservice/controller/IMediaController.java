package java.mediaservice.controller;

import java.mediaservice.model.MediaType;

public interface IMediaController {
	public int getId();
	public void setId(int id);
	public MediaType getMediaType();
	public void setMediaType(MediaType mt);
	public String getTitle();
	public void setTitle(String title);
	public String getCurrentPlayableMediaUrl();
	public void setCurrentPlayableMediaUrl(String url);
	public String getPosterUrl();
	public void setPosterUrl(String url);
}
