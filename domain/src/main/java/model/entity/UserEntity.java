package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * created by  eric.nyandwi on Jan,28/01/2019
 */
@Entity
public class UserEntity  extends BaseEntity{
    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
