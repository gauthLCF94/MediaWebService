package java.mediaservice.model;

public abstract class Media {
	protected int m_id;
	protected MediaType m_mediaType;
	protected String m_title;
	protected String m_description;
	protected String m_currentPlayableMediaUrl;	
	protected String m_posterUrl;
	
	public Media(int id, String title, String description) {
		this.m_id = id;
		this.m_title = title;
		this.m_description = description;
	}
	
	public MediaType getMediaType() {
		return m_mediaType;
	}

	public void setMediaType(MediaType mediaType) {
		this.m_mediaType = mediaType;
	}

	public int getId() {
		return m_id;
	}

	public void setId(int m_id) {
		this.m_id = m_id;
	}

	public String getTitle() {
		return m_title;
	}

	public void setTitle(String m_title) {
		this.m_title = m_title;
	}

	public String getDescription() {
		return m_description;
	}

	public void setDescription(String description) {
		this.m_description = description;
	}
	
	public String getCurrentPlayableMediaUrl() {
		return m_currentPlayableMediaUrl;
	}

	public void setCurrentPlayableMediaUrl(String m_currentPlayableMediaUrl) {
		this.m_currentPlayableMediaUrl = m_currentPlayableMediaUrl;
	}

	public String getPosterUrl() {
		return m_posterUrl;
	}

	public void setPosterUrl(String m_posterUrl) {
		this.m_posterUrl = m_posterUrl;
	}

}
