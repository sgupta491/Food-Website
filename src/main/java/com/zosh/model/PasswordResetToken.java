package com.zosh.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PasswordResetToken {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	
	 @Column(nullable = false, unique = true)
	private String token;
	
	@ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
	 @JoinColumn(nullable = false)
	private User user;
	
	 @Column(nullable = false)
	private Date expiryDate;
	
	public boolean isExpired() {
        return expiryDate.before(new Date());
    }

	

}
