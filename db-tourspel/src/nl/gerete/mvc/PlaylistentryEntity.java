package nl.gerete.mvc;

import javax.persistence.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/2/15.
 */
@Entity @Table(name = "playlistentry", schema = "public", catalog = "tourspel") public class PlaylistentryEntity {
	private long m_playlistentryId;

	private int m_plePlace;

	@Id @Column(name = "playlistentry_id", nullable = false, insertable = true, updatable = true) public long getPlaylistentryId() {
		return m_playlistentryId;
	}

	public void setPlaylistentryId(long playlistentryId) {
		m_playlistentryId = playlistentryId;
	}

	@Basic @Column(name = "ple_place", nullable = false, insertable = true, updatable = true) public int getPlePlace() {
		return m_plePlace;
	}

	public void setPlePlace(int plePlace) {
		m_plePlace = plePlace;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;

		PlaylistentryEntity that = (PlaylistentryEntity) o;

		if(m_playlistentryId != that.m_playlistentryId)
			return false;
		if(m_plePlace != that.m_plePlace)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (m_playlistentryId ^ (m_playlistentryId >>> 32));
		result = 31 * result + m_plePlace;
		return result;
	}
}
