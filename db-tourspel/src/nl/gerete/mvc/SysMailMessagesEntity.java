package nl.gerete.mvc;

import javax.persistence.*;
import java.sql.*;
import java.util.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/2/15.
 */
@Entity @Table(name = "sys_mail_messages", schema = "public", catalog = "tourspel") public class SysMailMessagesEntity {
	private int m_smmId;

	private Timestamp m_smmDate;

	private String m_smmSubject;

	private String m_smmFromAddress;

	private String m_smmFromName;

	private byte[] m_smmData;

	@Id @Column(name = "smm_id", nullable = false, insertable = true, updatable = true, precision = 0) public int getSmmId() {
		return m_smmId;
	}

	public void setSmmId(int smmId) {
		m_smmId = smmId;
	}

	@Basic @Column(name = "smm_date", nullable = false, insertable = true, updatable = true) public Timestamp getSmmDate() {
		return m_smmDate;
	}

	public void setSmmDate(Timestamp smmDate) {
		m_smmDate = smmDate;
	}

	@Basic @Column(name = "smm_subject", nullable = false, insertable = true, updatable = true, length = 250) public String getSmmSubject() {
		return m_smmSubject;
	}

	public void setSmmSubject(String smmSubject) {
		m_smmSubject = smmSubject;
	}

	@Basic @Column(name = "smm_from_address", nullable = false, insertable = true, updatable = true, length = 128) public String getSmmFromAddress() {
		return m_smmFromAddress;
	}

	public void setSmmFromAddress(String smmFromAddress) {
		m_smmFromAddress = smmFromAddress;
	}

	@Basic @Column(name = "smm_from_name", nullable = false, insertable = true, updatable = true, length = 64) public String getSmmFromName() {
		return m_smmFromName;
	}

	public void setSmmFromName(String smmFromName) {
		m_smmFromName = smmFromName;
	}

	@Basic @Column(name = "smm_data", nullable = true, insertable = true, updatable = true) public byte[] getSmmData() {
		return m_smmData;
	}

	public void setSmmData(byte[] smmData) {
		m_smmData = smmData;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;

		SysMailMessagesEntity that = (SysMailMessagesEntity) o;

		if(m_smmId != that.m_smmId)
			return false;
		if(!Arrays.equals(m_smmData, that.m_smmData))
			return false;
		if(m_smmDate != null ? !m_smmDate.equals(that.m_smmDate) : that.m_smmDate != null)
			return false;
		if(m_smmFromAddress != null ? !m_smmFromAddress.equals(that.m_smmFromAddress) : that.m_smmFromAddress != null)
			return false;
		if(m_smmFromName != null ? !m_smmFromName.equals(that.m_smmFromName) : that.m_smmFromName != null)
			return false;
		if(m_smmSubject != null ? !m_smmSubject.equals(that.m_smmSubject) : that.m_smmSubject != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = m_smmId;
		result = 31 * result + (m_smmDate != null ? m_smmDate.hashCode() : 0);
		result = 31 * result + (m_smmSubject != null ? m_smmSubject.hashCode() : 0);
		result = 31 * result + (m_smmFromAddress != null ? m_smmFromAddress.hashCode() : 0);
		result = 31 * result + (m_smmFromName != null ? m_smmFromName.hashCode() : 0);
		result = 31 * result + (m_smmData != null ? Arrays.hashCode(m_smmData) : 0);
		return result;
	}
}
