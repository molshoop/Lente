package nl.gerete.mvc;

import javax.persistence.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/2/15.
 */
@Entity @Table(name = "regions", schema = "public", catalog = "tourspel") public class RegionsEntity {
	private long m_id;

	private String m_region;

	@Id @Column(name = "id", nullable = false, insertable = true, updatable = true) public long getId() {
		return m_id;
	}

	public void setId(long id) {
		m_id = id;
	}

	@Basic @Column(name = "region", nullable = false, insertable = true, updatable = true, length = 120) public String getRegion() {
		return m_region;
	}

	public void setRegion(String region) {
		m_region = region;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;

		RegionsEntity that = (RegionsEntity) o;

		if(m_id != that.m_id)
			return false;
		if(m_region != null ? !m_region.equals(that.m_region) : that.m_region != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (m_id ^ (m_id >>> 32));
		result = 31 * result + (m_region != null ? m_region.hashCode() : 0);
		return result;
	}
}
