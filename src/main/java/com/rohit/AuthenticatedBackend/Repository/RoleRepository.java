package com.rohit.AuthenticatedBackend.Repository;

import com.rohit.AuthenticatedBackend.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
