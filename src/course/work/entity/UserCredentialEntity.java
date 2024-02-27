package course.work.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "UserCredential")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserCredentialEntity {

    @Id
    @Column(name = "Username")
    private String username;

    @Column(name = "Password")
    private String password;

}
