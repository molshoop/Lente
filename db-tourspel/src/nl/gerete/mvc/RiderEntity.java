package nl.gerete.mvc;

import javax.persistence.*;
import java.sql.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/2/15.
 */
@Entity @Table(name = "rider", schema = "public", catalog = "tourspel") public class RiderEntity {
	private long m_riderId;

	private Date m_dateOfBirth;

	private String m_firstName;

	private String m_lastName;

	private String m_middleName;

	private Integer m_number;

	@Id @Column(name = "rider_id", nullable = false, insertable = true, updatable = true) public long getRiderId() {
		return m_riderId;
	}

	public void setRiderId(long riderId) {
		m_riderId = riderId;
	}

	@Basic @Column(name = "date_of_birth", nullable = true, insertable = true, updatable = true) public Date getDateOfBirth() {
		return m_dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		m_dateOfBirth = dateOfBirth;
	}

	@Basic @Column(name = "first_name", nullable = true, insertable = true, updatable = true, length = 25) public String getFirstName() {
		return m_firstName;
	}

	public void setFirstName(String firstName) {
		m_firstName = firstName;
	}

	@Basic @Column(name = "last_name", nullable = true, insertable = true, updatable = true, length = 60) public String getLastName() {
		return m_lastName;
	}

	public void setLastName(String lastName) {
		m_lastName = lastName;
	}

	@Basic @Column(name = "middle_name", nullable = true, insertable = true, updatable = true, length = 10) public String getMiddleName() {
		return m_middleName;
	}

	public void setMiddleName(String middleName) {
		m_middleName = middleName;
	}

	@Basic @Column(name = "number", nullable = true, insertable = true, updatable = true) public Integer getNumber() {
		return m_number;
	}

	public void setNumber(Integer number) {
		m_number = number;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;

		RiderEntity that = (RiderEntity) o;

		if(m_riderId != that.m_riderId)
			return false;
		if(m_dateOfBirth != null ? !m_dateOfBirth.equals(that.m_dateOfBirth) : that.m_dateOfBirth != null)
			return false;
		if(m_firstName != null ? !m_firstName.equals(that.m_firstName) : that.m_firstName != null)
			return false;
		if(m_lastName != null ? !m_lastName.equals(that.m_lastName) : that.m_lastName != null)
			return false;
		if(m_middleName != null ? !m_middleName.equals(that.m_middleName) : that.m_middleName != null)
			return false;
		if(m_number != null ? !m_number.equals(that.m_number) : that.m_number != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (m_riderId ^ (m_riderId >>> 32));
		result = 31 * result + (m_dateOfBirth != null ? m_dateOfBirth.hashCode() : 0);
		result = 31 * result + (m_firstName != null ? m_firstName.hashCode() : 0);
		result = 31 * result + (m_lastName != null ? m_lastName.hashCode() : 0);
		result = 31 * result + (m_middleName != null ? m_middleName.hashCode() : 0);
		result = 31 * result + (m_number != null ? m_number.hashCode() : 0);
		return result;
	}
}
