package nl.gerete.mvc;

import javax.persistence.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/2/15.
 */
@Entity @Table(name = "etappe_results", schema = "public", catalog = "tourspel") public class EtappeResultsEntity {
	private long m_etapperesultId;

	private int m_etPlace;

	@Id @Column(name = "etapperesult_id", nullable = false, insertable = true, updatable = true) public long getEtapperesultId() {
		return m_etapperesultId;
	}

	public void setEtapperesultId(long etapperesultId) {
		m_etapperesultId = etapperesultId;
	}

	@Basic @Column(name = "et_place", nullable = false, insertable = true, updatable = true) public int getEtPlace() {
		return m_etPlace;
	}

	public void setEtPlace(int etPlace) {
		m_etPlace = etPlace;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;

		EtappeResultsEntity that = (EtappeResultsEntity) o;

		if(m_etPlace != that.m_etPlace)
			return false;
		if(m_etapperesultId != that.m_etapperesultId)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (m_etapperesultId ^ (m_etapperesultId >>> 32));
		result = 31 * result + m_etPlace;
		return result;
	}
}
