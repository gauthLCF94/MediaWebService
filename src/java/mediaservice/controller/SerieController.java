package java.mediaservice.controller;

import java.mediaservice.model.MediaType;
import java.mediaservice.model.Serie;

public class SerieController implements IMediaController {
	Serie m_serie;
	
	public SerieController(Serie serie) {
		m_serie = serie;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return m_serie.getId();
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		m_serie.setId(id);
	}

	@Override
	public MediaType getMediaType() {
		// TODO Auto-generated method stub
		return m_serie.getMediaType();
	}

	@Override
	public void setMediaType(MediaType mt) {
		// TODO Auto-generated method stub
		m_serie.setMediaType(mt);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return m_serie.getTitle();
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		m_serie.setTitle(title);
	}

	@Override
	public String getCurrentPlayableMediaUrl() {
		// TODO Auto-generated method stub
		return m_serie.getCurrentPlayableMediaUrl();
	}

	@Override
	public void setCurrentPlayableMediaUrl(String url) {
		// TODO Auto-generated method stub
		m_serie.setCurrentPlayableMediaUrl(url);
	}

	@Override
	public String getPosterUrl() {
		// TODO Auto-generated method stub
		return m_serie.getPosterUrl();
	}

	@Override
	public void setPosterUrl(String url) {
		// TODO Auto-generated method stub
		m_serie.setPosterUrl(url);
	}
}
