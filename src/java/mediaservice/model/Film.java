package java.mediaservice.model;

public class Film extends Media {
	private int m_duration;

	public Film(int id, String title, String description, String url, int duration)
	{
		super(id, title, description);
		this.m_mediaType = MediaType.Film;
		this.m_currentPlayableMediaUrl = url;
		this.m_duration = duration;
	}
	
	public int getDuration() {
		return m_duration;
	}

	public void setDuration(int m_duration) {
		this.m_duration = m_duration;
	}
}
