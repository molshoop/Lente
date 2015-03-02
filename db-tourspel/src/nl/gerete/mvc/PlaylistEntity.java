package nl.gerete.mvc;

import javax.persistence.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/2/15.
 */
@Entity @Table(name = "playlist", schema = "public", catalog = "tourspel") public class PlaylistEntity {
	private long m_playlistId;

	private long m_currentpoints;

	private String m_plListname;

	private String m_plPaid;

	private String m_plPlaylisttype;

	@Id @Column(name = "playlist_id", nullable = false, insertable = true, updatable = true) public long getPlaylistId() {
		return m_playlistId;
	}

	public void setPlaylistId(long playlistId) {
		m_playlistId = playlistId;
	}

	@Basic @Column(name = "currentpoints", nullable = false, insertable = true, updatable = true) public long getCurrentpoints() {
		return m_currentpoints;
	}

	public void setCurrentpoints(long currentpoints) {
		m_currentpoints = currentpoints;
	}

	@Basic @Column(name = "pl_listname", nullable = false, insertable = true, updatable = true, length = 40) public String getPlListname() {
		return m_plListname;
	}

	public void setPlListname(String plListname) {
		m_plListname = plListname;
	}

	@Basic @Column(name = "pl_paid", nullable = false, insertable = true, updatable = true, length = 1) public String getPlPaid() {
		return m_plPaid;
	}

	public void setPlPaid(String plPaid) {
		m_plPaid = plPaid;
	}

	@Basic @Column(name = "pl_playlisttype", nullable = false, insertable = true, updatable = true, length = 10) public String getPlPlaylisttype() {
		return m_plPlaylisttype;
	}

	public void setPlPlaylisttype(String plPlaylisttype) {
		m_plPlaylisttype = plPlaylisttype;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;

		PlaylistEntity that = (PlaylistEntity) o;

		if(m_currentpoints != that.m_currentpoints)
			return false;
		if(m_playlistId != that.m_playlistId)
			return false;
		if(m_plListname != null ? !m_plListname.equals(that.m_plListname) : that.m_plListname != null)
			return false;
		if(m_plPaid != null ? !m_plPaid.equals(that.m_plPaid) : that.m_plPaid != null)
			return false;
		if(m_plPlaylisttype != null ? !m_plPlaylisttype.equals(that.m_plPlaylisttype) : that.m_plPlaylisttype != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (m_playlistId ^ (m_playlistId >>> 32));
		result = 31 * result + (int) (m_currentpoints ^ (m_currentpoints >>> 32));
		result = 31 * result + (m_plListname != null ? m_plListname.hashCode() : 0);
		result = 31 * result + (m_plPaid != null ? m_plPaid.hashCode() : 0);
		result = 31 * result + (m_plPlaylisttype != null ? m_plPlaylisttype.hashCode() : 0);
		return result;
	}
}
