package nl.gerete.mvc;

import javax.persistence.*;
import java.sql.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/2/15.
 */
@Entity @Table(name = "personrights", schema = "public", catalog = "tourspel") public class PersonrightsEntity {
	private long m_id;

	private Date m_enddate;

	private String m_applicationRight;

	private Date m_startdate;

	@Id @Column(name = "id", nullable = false, insertable = true, updatable = true) public long getId() {
		return m_id;
	}

	public void setId(long id) {
		m_id = id;
	}

	@Basic @Column(name = "enddate", nullable = true, insertable = true, updatable = true) public Date getEnddate() {
		return m_enddate;
	}

	public void setEnddate(Date enddate) {
		m_enddate = enddate;
	}

	@Basic @Column(name = "application_right", nullable = false, insertable = true, updatable = true, length = 64) public String getApplicationRight() {
		return m_applicationRight;
	}

	public void setApplicationRight(String applicationRight) {
		m_applicationRight = applicationRight;
	}

	@Basic @Column(name = "startdate", nullable = false, insertable = true, updatable = true) public Date getStartdate() {
		return m_startdate;
	}

	public void setStartdate(Date startdate) {
		m_startdate = startdate;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;

		PersonrightsEntity that = (PersonrightsEntity) o;

		if(m_id != that.m_id)
			return false;
		if(m_applicationRight != null ? !m_applicationRight.equals(that.m_applicationRight) : that.m_applicationRight != null)
			return false;
		if(m_enddate != null ? !m_enddate.equals(that.m_enddate) : that.m_enddate != null)
			return false;
		if(m_startdate != null ? !m_startdate.equals(that.m_startdate) : that.m_startdate != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (m_id ^ (m_id >>> 32));
		result = 31 * result + (m_enddate != null ? m_enddate.hashCode() : 0);
		result = 31 * result + (m_applicationRight != null ? m_applicationRight.hashCode() : 0);
		result = 31 * result + (m_startdate != null ? m_startdate.hashCode() : 0);
		return result;
	}
}
