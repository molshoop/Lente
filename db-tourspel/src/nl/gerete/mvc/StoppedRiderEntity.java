package nl.gerete.mvc;

import javax.persistence.*;
import java.sql.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/2/15.
 */
@Entity @Table(name = "stopped_rider", schema = "public", catalog = "tourspel") public class StoppedRiderEntity {
	private long m_stoppedRiderId;

	private Date m_stopdate;

	@Id @Column(name = "stopped_rider_id", nullable = false, insertable = true, updatable = true) public long getStoppedRiderId() {
		return m_stoppedRiderId;
	}

	public void setStoppedRiderId(long stoppedRiderId) {
		m_stoppedRiderId = stoppedRiderId;
	}

	@Basic @Column(name = "stopdate", nullable = false, insertable = true, updatable = true) public Date getStopdate() {
		return m_stopdate;
	}

	public void setStopdate(Date stopdate) {
		m_stopdate = stopdate;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;

		StoppedRiderEntity that = (StoppedRiderEntity) o;

		if(m_stoppedRiderId != that.m_stoppedRiderId)
			return false;
		if(m_stopdate != null ? !m_stopdate.equals(that.m_stopdate) : that.m_stopdate != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (m_stoppedRiderId ^ (m_stoppedRiderId >>> 32));
		result = 31 * result + (m_stopdate != null ? m_stopdate.hashCode() : 0);
		return result;
	}
}
