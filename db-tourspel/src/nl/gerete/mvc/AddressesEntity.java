package nl.gerete.mvc;

import javax.persistence.*;
import java.sql.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/2/15.
 */
@Entity @Table(name = "addresses", schema = "public", catalog = "tourspel") public class AddressesEntity {
	private long m_id;

	private String m_city;

	private Date m_enddate;

	private String m_housenr;

	private String m_housnrsuffix;

	private String m_postcode;

	private Date m_startdate;

	private String m_street;

	private String m_type;

	@Id @Column(name = "id", nullable = false, insertable = true, updatable = true) public long getId() {
		return m_id;
	}

	public void setId(long id) {
		m_id = id;
	}

	@Basic @Column(name = "city", nullable = false, insertable = true, updatable = true, length = 120) public String getCity() {
		return m_city;
	}

	public void setCity(String city) {
		m_city = city;
	}

	@Basic @Column(name = "enddate", nullable = true, insertable = true, updatable = true) public Date getEnddate() {
		return m_enddate;
	}

	public void setEnddate(Date enddate) {
		m_enddate = enddate;
	}

	@Basic @Column(name = "housenr", nullable = false, insertable = true, updatable = true, length = 120) public String getHousenr() {
		return m_housenr;
	}

	public void setHousenr(String housenr) {
		m_housenr = housenr;
	}

	@Basic @Column(name = "housnrsuffix", nullable = false, insertable = true, updatable = true, length = 120) public String getHousnrsuffix() {
		return m_housnrsuffix;
	}

	public void setHousnrsuffix(String housnrsuffix) {
		m_housnrsuffix = housnrsuffix;
	}

	@Basic @Column(name = "postcode", nullable = false, insertable = true, updatable = true, length = 120) public String getPostcode() {
		return m_postcode;
	}

	public void setPostcode(String postcode) {
		m_postcode = postcode;
	}

	@Basic @Column(name = "startdate", nullable = false, insertable = true, updatable = true) public Date getStartdate() {
		return m_startdate;
	}

	public void setStartdate(Date startdate) {
		m_startdate = startdate;
	}

	@Basic @Column(name = "street", nullable = false, insertable = true, updatable = true, length = 120) public String getStreet() {
		return m_street;
	}

	public void setStreet(String street) {
		m_street = street;
	}

	@Basic @Column(name = "type", nullable = false, insertable = true, updatable = true, length = 255) public String getType() {
		return m_type;
	}

	public void setType(String type) {
		m_type = type;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;

		AddressesEntity that = (AddressesEntity) o;

		if(m_id != that.m_id)
			return false;
		if(m_city != null ? !m_city.equals(that.m_city) : that.m_city != null)
			return false;
		if(m_enddate != null ? !m_enddate.equals(that.m_enddate) : that.m_enddate != null)
			return false;
		if(m_housenr != null ? !m_housenr.equals(that.m_housenr) : that.m_housenr != null)
			return false;
		if(m_housnrsuffix != null ? !m_housnrsuffix.equals(that.m_housnrsuffix) : that.m_housnrsuffix != null)
			return false;
		if(m_postcode != null ? !m_postcode.equals(that.m_postcode) : that.m_postcode != null)
			return false;
		if(m_startdate != null ? !m_startdate.equals(that.m_startdate) : that.m_startdate != null)
			return false;
		if(m_street != null ? !m_street.equals(that.m_street) : that.m_street != null)
			return false;
		if(m_type != null ? !m_type.equals(that.m_type) : that.m_type != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (m_id ^ (m_id >>> 32));
		result = 31 * result + (m_city != null ? m_city.hashCode() : 0);
		result = 31 * result + (m_enddate != null ? m_enddate.hashCode() : 0);
		result = 31 * result + (m_housenr != null ? m_housenr.hashCode() : 0);
		result = 31 * result + (m_housnrsuffix != null ? m_housnrsuffix.hashCode() : 0);
		result = 31 * result + (m_postcode != null ? m_postcode.hashCode() : 0);
		result = 31 * result + (m_startdate != null ? m_startdate.hashCode() : 0);
		result = 31 * result + (m_street != null ? m_street.hashCode() : 0);
		result = 31 * result + (m_type != null ? m_type.hashCode() : 0);
		return result;
	}
}
