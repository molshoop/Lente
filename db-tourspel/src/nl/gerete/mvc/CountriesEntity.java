package nl.gerete.mvc;

import javax.persistence.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/2/15.
 */
@Entity @Table(name = "countries", schema = "public", catalog = "tourspel") public class CountriesEntity {
	private long m_countryId;

	private String m_name;

	private String m_shortname;

	@Id @Column(name = "country_id", nullable = false, insertable = true, updatable = true) public long getCountryId() {
		return m_countryId;
	}

	public void setCountryId(long countryId) {
		m_countryId = countryId;
	}

	@Basic @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 120) public String getName() {
		return m_name;
	}

	public void setName(String name) {
		m_name = name;
	}

	@Basic @Column(name = "shortname", nullable = false, insertable = true, updatable = true, length = 5) public String getShortname() {
		return m_shortname;
	}

	public void setShortname(String shortname) {
		m_shortname = shortname;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;

		CountriesEntity that = (CountriesEntity) o;

		if(m_countryId != that.m_countryId)
			return false;
		if(m_name != null ? !m_name.equals(that.m_name) : that.m_name != null)
			return false;
		if(m_shortname != null ? !m_shortname.equals(that.m_shortname) : that.m_shortname != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (m_countryId ^ (m_countryId >>> 32));
		result = 31 * result + (m_name != null ? m_name.hashCode() : 0);
		result = 31 * result + (m_shortname != null ? m_shortname.hashCode() : 0);
		return result;
	}
}
