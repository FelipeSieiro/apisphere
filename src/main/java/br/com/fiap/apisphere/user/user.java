package br.com.fiap.apisphere.user;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name ="tb_sphere_users")
@Data
public class User {

    @Id @GeneratedValue
    Long id;
    String name;
    String bio;
    String email;
    String password;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
