package nl.gerete.mvc;

import javax.persistence.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/2/15.
 */
@Entity @Table(name = "team", schema = "public", catalog = "tourspel") public class TeamEntity {
	private long m_teamId;

	private String m_name;

	private String m_teamCaptainName;

	@Id @Column(name = "team_id", nullable = false, insertable = true, updatable = true) public long getTeamId() {
		return m_teamId;
	}

	public void setTeamId(long teamId) {
		m_teamId = teamId;
	}

	@Basic @Column(name = "name", nullable = true, insertable = true, updatable = true, length = 40) public String getName() {
		return m_name;
	}

	public void setName(String name) {
		m_name = name;
	}

	@Basic @Column(name = "team_captain_name", nullable = true, insertable = true, updatable = true, length = 40) public String getTeamCaptainName() {
		return m_teamCaptainName;
	}

	public void setTeamCaptainName(String teamCaptainName) {
		m_teamCaptainName = teamCaptainName;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;

		TeamEntity that = (TeamEntity) o;

		if(m_teamId != that.m_teamId)
			return false;
		if(m_name != null ? !m_name.equals(that.m_name) : that.m_name != null)
			return false;
		if(m_teamCaptainName != null ? !m_teamCaptainName.equals(that.m_teamCaptainName) : that.m_teamCaptainName != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (m_teamId ^ (m_teamId >>> 32));
		result = 31 * result + (m_name != null ? m_name.hashCode() : 0);
		result = 31 * result + (m_teamCaptainName != null ? m_teamCaptainName.hashCode() : 0);
		return result;
	}
}
