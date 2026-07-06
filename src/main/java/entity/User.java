package com.company.wallet.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String fullName;

	@Column(unique = true, nullable = false)
	private String email;

	@Column(nullable = false)
	private String password;

	private String role;
	
	private LocalDateTime createdAt;
	
	@PrePersist
	public void prePersist() {
	    this.createdAt = LocalDateTime.now();
	}

}