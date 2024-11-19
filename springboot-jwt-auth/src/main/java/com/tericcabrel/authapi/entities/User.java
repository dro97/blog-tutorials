
package com.tericcabrel.authapi.entities;

import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;


public class User implements UserDetails {
    @Id
    private String id;

    private String fullName;

    private String nick;

    private String password;

    private Date createdAt;

    private Date updatedAt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of();
	}

	@Override
	public String getUsername() {
		return nick;
	}
    
    

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return List.of();
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return data;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public User setId(String id) {
//        this.id = id;
//        return this;
//    }
//
//    public String getFullName() {
//        return fullName;
//    }
//
//    public User setFullName(String fullName) {
//        this.fullName = fullName;
//        return this;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public User setEmail(String email) {
//        this.email = email;
//        return this;
//    }
//
//    public User setPassword(String password) {
//        this.password = password;
//        return this;
//    }
//
//    public Date getCreatedAt() {
//        return createdAt;
//    }
//
//    public User setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
//        return this;
//    }
//
//    public Date getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public User setUpdatedAt(Date updatedAt) {
//        this.updatedAt = updatedAt;
//        return this;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", fullName='" + fullName + '\'' +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                ", createdAt=" + createdAt +
//                ", updatedAt=" + updatedAt +
//                '}';
//    }
}

