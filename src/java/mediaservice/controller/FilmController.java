package java.mediaservice.controller;

import java.mediaservice.model.Film;
import java.mediaservice.model.MediaType;

public class FilmController extends Playable implements IMediaController {
	Film m_film;
	
	public FilmController(Film film) {
		m_film = film;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return m_film.getId();
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		m_film.setId(id);
	}

	@Override
	public MediaType getMediaType() {
		// TODO Auto-generated method stub
		return m_film.getMediaType();
	}

	@Override
	public void setMediaType(MediaType mt) {
		// TODO Auto-generated method stub
		m_film.setMediaType(mt);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return m_film.getTitle();
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		m_film.setTitle(title);
	}

	@Override
	public String getCurrentPlayableMediaUrl() {
		// TODO Auto-generated method stub
		return m_film.getCurrentPlayableMediaUrl();
	}

	@Override
	public void setCurrentPlayableMediaUrl(String url) {
		// TODO Auto-generated method stub
		m_film.setCurrentPlayableMediaUrl(url);
	}

	@Override
	public String getPosterUrl() {
		// TODO Auto-generated method stub
		return m_film.getPosterUrl();
	}

	@Override
	public void setPosterUrl(String url) {
		// TODO Auto-generated method stub
		m_film.setPosterUrl(url);
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
