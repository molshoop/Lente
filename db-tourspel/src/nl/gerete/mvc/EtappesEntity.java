package nl.gerete.mvc;

import javax.persistence.*;
import java.sql.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/2/15.
 */
@Entity @Table(name = "etappes", schema = "public", catalog = "tourspel") public class EtappesEntity {
	private long m_etappeId;

	private Date m_etDate;

	private String m_etEnd;

	private double m_etLength;

	private String m_phase;

	private String m_etStage;

	private String m_etStart;

	private String m_etType;

	private String m_etUrl;

	@Id @Column(name = "etappe_id", nullable = false, insertable = true, updatable = true) public long getEtappeId() {
		return m_etappeId;
	}

	public void setEtappeId(long etappeId) {
		m_etappeId = etappeId;
	}

	@Basic @Column(name = "et_date", nullable = false, insertable = true, updatable = true) public Date getEtDate() {
		return m_etDate;
	}

	public void setEtDate(Date etDate) {
		m_etDate = etDate;
	}

	@Basic @Column(name = "et_end", nullable = false, insertable = true, updatable = true, length = 64) public String getEtEnd() {
		return m_etEnd;
	}

	public void setEtEnd(String etEnd) {
		m_etEnd = etEnd;
	}

	@Basic @Column(name = "et_length", nullable = false, insertable = true, updatable = true, precision = 17) public double getEtLength() {
		return m_etLength;
	}

	public void setEtLength(double etLength) {
		m_etLength = etLength;
	}

	@Basic @Column(name = "phase", nullable = false, insertable = true, updatable = true, length = 20) public String getPhase() {
		return m_phase;
	}

	public void setPhase(String phase) {
		m_phase = phase;
	}

	@Basic @Column(name = "et_stage", nullable = false, insertable = true, updatable = true, length = 5) public String getEtStage() {
		return m_etStage;
	}

	public void setEtStage(String etStage) {
		m_etStage = etStage;
	}

	@Basic @Column(name = "et_start", nullable = false, insertable = true, updatable = true, length = 64) public String getEtStart() {
		return m_etStart;
	}

	public void setEtStart(String etStart) {
		m_etStart = etStart;
	}

	@Basic @Column(name = "et_type", nullable = false, insertable = true, updatable = true, length = 32) public String getEtType() {
		return m_etType;
	}

	public void setEtType(String etType) {
		m_etType = etType;
	}

	@Basic @Column(name = "et_url", nullable = true, insertable = true, updatable = true, length = 256) public String getEtUrl() {
		return m_etUrl;
	}

	public void setEtUrl(String etUrl) {
		m_etUrl = etUrl;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;

		EtappesEntity that = (EtappesEntity) o;

		if(Double.compare(that.m_etLength, m_etLength) != 0)
			return false;
		if(m_etappeId != that.m_etappeId)
			return false;
		if(m_etDate != null ? !m_etDate.equals(that.m_etDate) : that.m_etDate != null)
			return false;
		if(m_etEnd != null ? !m_etEnd.equals(that.m_etEnd) : that.m_etEnd != null)
			return false;
		if(m_etStage != null ? !m_etStage.equals(that.m_etStage) : that.m_etStage != null)
			return false;
		if(m_etStart != null ? !m_etStart.equals(that.m_etStart) : that.m_etStart != null)
			return false;
		if(m_etType != null ? !m_etType.equals(that.m_etType) : that.m_etType != null)
			return false;
		if(m_etUrl != null ? !m_etUrl.equals(that.m_etUrl) : that.m_etUrl != null)
			return false;
		if(m_phase != null ? !m_phase.equals(that.m_phase) : that.m_phase != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = (int) (m_etappeId ^ (m_etappeId >>> 32));
		result = 31 * result + (m_etDate != null ? m_etDate.hashCode() : 0);
		result = 31 * result + (m_etEnd != null ? m_etEnd.hashCode() : 0);
		temp = Double.doubleToLongBits(m_etLength);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		result = 31 * result + (m_phase != null ? m_phase.hashCode() : 0);
		result = 31 * result + (m_etStage != null ? m_etStage.hashCode() : 0);
		result = 31 * result + (m_etStart != null ? m_etStart.hashCode() : 0);
		result = 31 * result + (m_etType != null ? m_etType.hashCode() : 0);
		result = 31 * result + (m_etUrl != null ? m_etUrl.hashCode() : 0);
		return result;
	}
}
