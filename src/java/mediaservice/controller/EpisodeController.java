package java.mediaservice.controller;

import java.mediaservice.model.Episode;
import java.mediaservice.model.MediaType;

public class EpisodeController extends Playable implements IMediaController {
	Episode m_episode;
	
	public EpisodeController(Episode episode) {
		m_episode = episode;
	}

	@Override
	public int getId() {
		return m_episode.getId();
	}

	@Override
	public void setId(int id) {
		m_episode.setId(id);
	}

	@Override
	public MediaType getMediaType() {
		// TODO Auto-generated method stub
		return m_episode.getMediaType();
	}

	@Override
	public void setMediaType(MediaType mt) {
		// TODO Auto-generated method stub
		m_episode.setMediaType(mt);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return m_episode.getTitle();
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		m_episode.setTitle(title);
	}

	@Override
	public String getCurrentPlayableMediaUrl() {
		// TODO Auto-generated method stub
		return m_episode.getCurrentPlayableMediaUrl();
	}

	@Override
	public void setCurrentPlayableMediaUrl(String url) {
		// TODO Auto-generated method stub
		m_episode.setCurrentPlayableMediaUrl(url);
	}

	@Override
	public String getPosterUrl() {
		// TODO Auto-generated method stub
		return m_episode.getPosterUrl();
	}

	@Override
	public void setPosterUrl(String url) {
		// TODO Auto-generated method stub
		m_episode.setPosterUrl(url);
	}

	@Override
	public void Play(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Pause(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Stop(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Rewind(String url, int speed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Forward(String url, int speed) {
		// TODO Auto-generated method stub
		
	}
}
