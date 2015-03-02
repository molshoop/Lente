package nl.gerete.mvc;

import javax.persistence.*;
import java.sql.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/2/15.
 */
@Entity @Table(name = "sys_mail_recipients", schema = "public", catalog = "tourspel") public class SysMailRecipientsEntity {
	private int m_smrId;

	private String m_smrAddress;

	private String m_smrType;

	private Timestamp m_smrDatePosted;

	private int m_smrRetries;

	private Timestamp m_smrNextretry;

	private String m_smrState;

	private String m_smrName;

	private String m_smrLasterror;

	@Id @Column(name = "smr_id", nullable = false, insertable = true, updatable = true, precision = 0) public int getSmrId() {
		return m_smrId;
	}

	public void setSmrId(int smrId) {
		m_smrId = smrId;
	}

	@Basic @Column(name = "smr_address", nullable = false, insertable = true, updatable = true, length = 128) public String getSmrAddress() {
		return m_smrAddress;
	}

	public void setSmrAddress(String smrAddress) {
		m_smrAddress = smrAddress;
	}

	@Basic @Column(name = "smr_type", nullable = false, insertable = true, updatable = true, length = 10) public String getSmrType() {
		return m_smrType;
	}

	public void setSmrType(String smrType) {
		m_smrType = smrType;
	}

	@Basic @Column(name = "smr_date_posted", nullable = false, insertable = true, updatable = true) public Timestamp getSmrDatePosted() {
		return m_smrDatePosted;
	}

	public void setSmrDatePosted(Timestamp smrDatePosted) {
		m_smrDatePosted = smrDatePosted;
	}

	@Basic @Column(name = "smr_retries", nullable = false, insertable = true, updatable = true, precision = 0) public int getSmrRetries() {
		return m_smrRetries;
	}

	public void setSmrRetries(int smrRetries) {
		m_smrRetries = smrRetries;
	}

	@Basic @Column(name = "smr_nextretry", nullable = false, insertable = true, updatable = true) public Timestamp getSmrNextretry() {
		return m_smrNextretry;
	}

	public void setSmrNextretry(Timestamp smrNextretry) {
		m_smrNextretry = smrNextretry;
	}

	@Basic @Column(name = "smr_state", nullable = false, insertable = true, updatable = true, length = 4) public String getSmrState() {
		return m_smrState;
	}

	public void setSmrState(String smrState) {
		m_smrState = smrState;
	}

	@Basic @Column(name = "smr_name", nullable = true, insertable = true, updatable = true, length = 64) public String getSmrName() {
		return m_smrName;
	}

	public void setSmrName(String smrName) {
		m_smrName = smrName;
	}

	@Basic @Column(name = "smr_lasterror", nullable = true, insertable = true, updatable = true, length = 128) public String getSmrLasterror() {
		return m_smrLasterror;
	}

	public void setSmrLasterror(String smrLasterror) {
		m_smrLasterror = smrLasterror;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;

		SysMailRecipientsEntity that = (SysMailRecipientsEntity) o;

		if(m_smrId != that.m_smrId)
			return false;
		if(m_smrRetries != that.m_smrRetries)
			return false;
		if(m_smrAddress != null ? !m_smrAddress.equals(that.m_smrAddress) : that.m_smrAddress != null)
			return false;
		if(m_smrDatePosted != null ? !m_smrDatePosted.equals(that.m_smrDatePosted) : that.m_smrDatePosted != null)
			return false;
		if(m_smrLasterror != null ? !m_smrLasterror.equals(that.m_smrLasterror) : that.m_smrLasterror != null)
			return false;
		if(m_smrName != null ? !m_smrName.equals(that.m_smrName) : that.m_smrName != null)
			return false;
		if(m_smrNextretry != null ? !m_smrNextretry.equals(that.m_smrNextretry) : that.m_smrNextretry != null)
			return false;
		if(m_smrState != null ? !m_smrState.equals(that.m_smrState) : that.m_smrState != null)
			return false;
		if(m_smrType != null ? !m_smrType.equals(that.m_smrType) : that.m_smrType != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = m_smrId;
		result = 31 * result + (m_smrAddress != null ? m_smrAddress.hashCode() : 0);
		result = 31 * result + (m_smrType != null ? m_smrType.hashCode() : 0);
		result = 31 * result + (m_smrDatePosted != null ? m_smrDatePosted.hashCode() : 0);
		result = 31 * result + m_smrRetries;
		result = 31 * result + (m_smrNextretry != null ? m_smrNextretry.hashCode() : 0);
		result = 31 * result + (m_smrState != null ? m_smrState.hashCode() : 0);
		result = 31 * result + (m_smrName != null ? m_smrName.hashCode() : 0);
		result = 31 * result + (m_smrLasterror != null ? m_smrLasterror.hashCode() : 0);
		return result;
	}
}
