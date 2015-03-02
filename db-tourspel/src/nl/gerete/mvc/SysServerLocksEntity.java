package nl.gerete.mvc;

import javax.persistence.*;

/**
 * @author <a href="mailto:benshoe@gmail.com">Ben Schoen</a>
 * @since 3/2/15.
 */
@Entity @Table(name = "sys_server_locks", schema = "public", catalog = "tourspel") public class SysServerLocksEntity {
	private String m_lockName;

	@Id @Column(name = "lock_name", nullable = false, insertable = true, updatable = true, length = 60) public String getLockName() {
		return m_lockName;
	}

	public void setLockName(String lockName) {
		m_lockName = lockName;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;

		SysServerLocksEntity that = (SysServerLocksEntity) o;

		if(m_lockName != null ? !m_lockName.equals(that.m_lockName) : that.m_lockName != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		return m_lockName != null ? m_lockName.hashCode() : 0;
	}
}
