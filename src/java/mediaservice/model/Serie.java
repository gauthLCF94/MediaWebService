package java.mediaservice.model;

import java.util.List;
import java.util.Map;

public class Serie extends Media {
	private Map<Integer, List<Episode>> m_seasons;
	private int m_currentSeason;
	private int m_currentEpisode;
	
	public Serie(String title, int id, String description, Map<Integer,List<Episode>> seasons) {
		super(id, title, description);
		this.m_mediaType = MediaType.Serie;
		this.m_currentSeason = 0;
		this.m_currentEpisode = 0;
		this.m_seasons = seasons;
		this.m_currentPlayableMediaUrl = m_seasons.get(m_currentSeason).get(m_currentEpisode).getCurrentPlayableMediaUrl();
	}
	
	public int getCurrentSeason() {
		return m_currentSeason;
	}
	
	public void setCurrentSeason(int currentSeason) {
		this.m_currentSeason = currentSeason;
	}
	
	public int getCurrentEpisode() {
		return m_currentEpisode;
	}
	
	public void setCurrentEpisode(int currentEpisode) {
		this.m_currentEpisode = currentEpisode;
	}
	
	public Map<Integer, List<Episode>> getSeasons() {
		return m_seasons;
	}
	
	public void setSeasons(Map<Integer, List<Episode>> seasons) {
		this.m_seasons = seasons;
	}


}
