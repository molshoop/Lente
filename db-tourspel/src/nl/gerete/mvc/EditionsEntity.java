package nl.gerete.mvc;

import javax.persistence.*;
import java.sql.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/2/15.
 */
@Entity @Table(name = "editions", schema = "public", catalog = "tourspel") public class EditionsEntity {
	private long m_editionId;

	private String m_edPhase;

	private Date m_edStartdate;

	private int m_edYear;

	private Date m_edChangedridersdeadline;

	private Date m_edEnddate;

	private Date m_edPaypricemoneydeadline;

	private Date m_edPayregistrationfeedeadline;

	private Date m_edRegistrationdeadline;

	@Id @Column(name = "edition_id", nullable = false, insertable = true, updatable = true) public long getEditionId() {
		return m_editionId;
	}

	public void setEditionId(long editionId) {
		m_editionId = editionId;
	}

	@Basic @Column(name = "ed_phase", nullable = false, insertable = true, updatable = true, length = 20) public String getEdPhase() {
		return m_edPhase;
	}

	public void setEdPhase(String edPhase) {
		m_edPhase = edPhase;
	}

	@Basic @Column(name = "ed_startdate", nullable = false, insertable = true, updatable = true) public Date getEdStartdate() {
		return m_edStartdate;
	}

	public void setEdStartdate(Date edStartdate) {
		m_edStartdate = edStartdate;
	}

	@Basic @Column(name = "ed_year", nullable = false, insertable = true, updatable = true) public int getEdYear() {
		return m_edYear;
	}

	public void setEdYear(int edYear) {
		m_edYear = edYear;
	}

	@Basic @Column(name = "ed_changedridersdeadline", nullable = true, insertable = true, updatable = true) public Date getEdChangedridersdeadline() {
		return m_edChangedridersdeadline;
	}

	public void setEdChangedridersdeadline(Date edChangedridersdeadline) {
		m_edChangedridersdeadline = edChangedridersdeadline;
	}

	@Basic @Column(name = "ed_enddate", nullable = true, insertable = true, updatable = true) public Date getEdEnddate() {
		return m_edEnddate;
	}

	public void setEdEnddate(Date edEnddate) {
		m_edEnddate = edEnddate;
	}

	@Basic @Column(name = "ed_paypricemoneydeadline", nullable = true, insertable = true, updatable = true) public Date getEdPaypricemoneydeadline() {
		return m_edPaypricemoneydeadline;
	}

	public void setEdPaypricemoneydeadline(Date edPaypricemoneydeadline) {
		m_edPaypricemoneydeadline = edPaypricemoneydeadline;
	}

	@Basic @Column(name = "ed_payregistrationfeedeadline", nullable = true, insertable = true, updatable = true) public Date getEdPayregistrationfeedeadline() {
		return m_edPayregistrationfeedeadline;
	}

	public void setEdPayregistrationfeedeadline(Date edPayregistrationfeedeadline) {
		m_edPayregistrationfeedeadline = edPayregistrationfeedeadline;
	}

	@Basic @Column(name = "ed_registrationdeadline", nullable = true, insertable = true, updatable = true) public Date getEdRegistrationdeadline() {
		return m_edRegistrationdeadline;
	}

	public void setEdRegistrationdeadline(Date edRegistrationdeadline) {
		m_edRegistrationdeadline = edRegistrationdeadline;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;

		EditionsEntity that = (EditionsEntity) o;

		if(m_edYear != that.m_edYear)
			return false;
		if(m_editionId != that.m_editionId)
			return false;
		if(m_edChangedridersdeadline != null ? !m_edChangedridersdeadline.equals(that.m_edChangedridersdeadline) : that.m_edChangedridersdeadline != null)
			return false;
		if(m_edEnddate != null ? !m_edEnddate.equals(that.m_edEnddate) : that.m_edEnddate != null)
			return false;
		if(m_edPaypricemoneydeadline != null ? !m_edPaypricemoneydeadline.equals(that.m_edPaypricemoneydeadline) : that.m_edPaypricemoneydeadline != null)
			return false;
		if(m_edPayregistrationfeedeadline != null ? !m_edPayregistrationfeedeadline.equals(that.m_edPayregistrationfeedeadline) : that.m_edPayregistrationfeedeadline != null)
			return false;
		if(m_edPhase != null ? !m_edPhase.equals(that.m_edPhase) : that.m_edPhase != null)
			return false;
		if(m_edRegistrationdeadline != null ? !m_edRegistrationdeadline.equals(that.m_edRegistrationdeadline) : that.m_edRegistrationdeadline != null)
			return false;
		if(m_edStartdate != null ? !m_edStartdate.equals(that.m_edStartdate) : that.m_edStartdate != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (m_editionId ^ (m_editionId >>> 32));
		result = 31 * result + (m_edPhase != null ? m_edPhase.hashCode() : 0);
		result = 31 * result + (m_edStartdate != null ? m_edStartdate.hashCode() : 0);
		result = 31 * result + m_edYear;
		result = 31 * result + (m_edChangedridersdeadline != null ? m_edChangedridersdeadline.hashCode() : 0);
		result = 31 * result + (m_edEnddate != null ? m_edEnddate.hashCode() : 0);
		result = 31 * result + (m_edPaypricemoneydeadline != null ? m_edPaypricemoneydeadline.hashCode() : 0);
		result = 31 * result + (m_edPayregistrationfeedeadline != null ? m_edPayregistrationfeedeadline.hashCode() : 0);
		result = 31 * result + (m_edRegistrationdeadline != null ? m_edRegistrationdeadline.hashCode() : 0);
		return result;
	}
}
