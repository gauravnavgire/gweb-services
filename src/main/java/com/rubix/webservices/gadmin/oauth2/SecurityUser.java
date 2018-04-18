package com.rubix.webservices.gadmin.oauth2;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rubix.webservices.gadmin.user.service.model.LinkUserRole;
import com.rubix.webservices.gadmin.user.service.model.Roles;
import com.rubix.webservices.gadmin.user.service.model.UserModel;

/**
 * Created by santoshm1 on 02/06/14.
 */
public class SecurityUser extends UserModel implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = -694318736321199793L;

	@JsonIgnore
	private UserModel user;

	private Set<String> permissions;

	private Set<String> roles;

	public SecurityUser(UserModel user) {

		if (user != null) {
			this.setId(user.getId());
			this.setUserName(user.getUserName());
			this.setFirstName(user.getFirstName());
			this.setLastName(user.getLastName());
			this.setPassword(user.getPassword());
			this.user = user;
		}
	}

	public Set<String> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<String> permissions) {
		this.permissions = permissions;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<LinkUserRole> userRoles = this.getUser().getLinkUserRoles();
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		List<String> permissions = new ArrayList<>();
		if (userRoles != null) {
			for (LinkUserRole linkrole : userRoles) {
					Roles role = linkrole.getRole();
					permissions.add(role.getRoleDisplayName());
			}
		}

		if (permissions != null) {
			for (String permission : permissions) {
				GrantedAuthority authority = new SimpleGrantedAuthority(
						permission);
				authorities.add(authority);
			}
		}

		return authorities;
	}

	@Override
	public String getPassword() {
		return super.getPassword();
	}

	@Override
	public String getUsername() {
		return super.getFirstName() + super.getLastName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}




	/**
	 * @return the user
	 */
	public UserModel getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(UserModel user) {
		this.user = user;
	}

	public Set<String> getRoles() {
		return roles;
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}

}
