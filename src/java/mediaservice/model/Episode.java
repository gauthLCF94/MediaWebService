package java.mediaservice.model;

public class Episode extends Media {
	private String m_description;
	private int m_duration;

	public Episode(String title, int id, String url, String description, int duration) {
		super(id, title, description);
		this.m_mediaType = MediaType.Episode;
		this.m_currentPlayableMediaUrl = url;
		this.m_duration = duration;
	}
	
	public String getDescription() {
		return m_description;
	}

	public void setDescription(String m_description) {
		this.m_description = m_description;
	}

	public int getDuration() {
		return m_duration;
	}

	public void setDuration(int m_duration) {
		this.m_duration = m_duration;
	}
}
