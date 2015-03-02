package nl.gerete.mvc;

import javax.persistence.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/2/15.
 */
@Entity @Table(name = "persons", schema = "public", catalog = "tourspel") public class PersonsEntity {
	private long m_id;

	private String m_email;

	private String m_firstname;

	private String m_lastname;

	private String m_password;

	private String m_phonenumber;

	private String m_prefix;

	@Id @Column(name = "id", nullable = false, insertable = true, updatable = true) public long getId() {
		return m_id;
	}

	public void setId(long id) {
		m_id = id;
	}

	@Basic @Column(name = "email", nullable = false, insertable = true, updatable = true, length = 120) public String getEmail() {
		return m_email;
	}

	public void setEmail(String email) {
		m_email = email;
	}

	@Basic @Column(name = "firstname", nullable = true, insertable = true, updatable = true, length = 120) public String getFirstname() {
		return m_firstname;
	}

	public void setFirstname(String firstname) {
		m_firstname = firstname;
	}

	@Basic @Column(name = "lastname", nullable = false, insertable = true, updatable = true, length = 20) public String getLastname() {
		return m_lastname;
	}

	public void setLastname(String lastname) {
		m_lastname = lastname;
	}

	@Basic @Column(name = "password", nullable = false, insertable = true, updatable = true, length = 16) public String getPassword() {
		return m_password;
	}

	public void setPassword(String password) {
		m_password = password;
	}

	@Basic @Column(name = "phonenumber", nullable = true, insertable = true, updatable = true, length = 20) public String getPhonenumber() {
		return m_phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		m_phonenumber = phonenumber;
	}

	@Basic @Column(name = "prefix", nullable = true, insertable = true, updatable = true, length = 24) public String getPrefix() {
		return m_prefix;
	}

	public void setPrefix(String prefix) {
		m_prefix = prefix;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;

		PersonsEntity that = (PersonsEntity) o;

		if(m_id != that.m_id)
			return false;
		if(m_email != null ? !m_email.equals(that.m_email) : that.m_email != null)
			return false;
		if(m_firstname != null ? !m_firstname.equals(that.m_firstname) : that.m_firstname != null)
			return false;
		if(m_lastname != null ? !m_lastname.equals(that.m_lastname) : that.m_lastname != null)
			return false;
		if(m_password != null ? !m_password.equals(that.m_password) : that.m_password != null)
			return false;
		if(m_phonenumber != null ? !m_phonenumber.equals(that.m_phonenumber) : that.m_phonenumber != null)
			return false;
		if(m_prefix != null ? !m_prefix.equals(that.m_prefix) : that.m_prefix != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (m_id ^ (m_id >>> 32));
		result = 31 * result + (m_email != null ? m_email.hashCode() : 0);
		result = 31 * result + (m_firstname != null ? m_firstname.hashCode() : 0);
		result = 31 * result + (m_lastname != null ? m_lastname.hashCode() : 0);
		result = 31 * result + (m_password != null ? m_password.hashCode() : 0);
		result = 31 * result + (m_phonenumber != null ? m_phonenumber.hashCode() : 0);
		result = 31 * result + (m_prefix != null ? m_prefix.hashCode() : 0);
		return result;
	}
}
