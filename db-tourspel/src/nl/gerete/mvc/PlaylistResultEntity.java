package nl.gerete.mvc;

import javax.persistence.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/2/15.
 */
@Entity @Table(name = "playlist_result", schema = "public", catalog = "tourspel") public class PlaylistResultEntity {
	private long m_playresultId;

	private int m_score;

	@Id @Column(name = "playresult_id", nullable = false, insertable = true, updatable = true) public long getPlayresultId() {
		return m_playresultId;
	}

	public void setPlayresultId(long playresultId) {
		m_playresultId = playresultId;
	}

	@Basic @Column(name = "score", nullable = false, insertable = true, updatable = true) public int getScore() {
		return m_score;
	}

	public void setScore(int score) {
		m_score = score;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;

		PlaylistResultEntity that = (PlaylistResultEntity) o;

		if(m_playresultId != that.m_playresultId)
			return false;
		if(m_score != that.m_score)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (m_playresultId ^ (m_playresultId >>> 32));
		result = 31 * result + m_score;
		return result;
	}
}
