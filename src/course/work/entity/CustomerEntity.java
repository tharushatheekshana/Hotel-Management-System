package course.work.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerEntity {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Room", nullable = false)
    private Integer room;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Phone", nullable = false)
    private Integer phone;

    @Column(name = "Email", nullable = false)
    private String email;

    @Column(name = "Address", nullable = false)
    private String address;

    @Column(name = "City", nullable = false)
    private String city;

    @Column(name = "Nationality", nullable = false)
    private String nationality;

    @Column(name = "ID", nullable = false)
    private Integer idNo;

    @Column(name = "RoomType", nullable = false)
    private String roomType;

    @Column(name = "Package", nullable = false)
    private String customerPackage;

    @Column(name = "CheckInDate", nullable = false)
    private java.sql.Date checkInDate;

    @Column(name = "CheckOutDate", nullable = false)
    private java.sql.Date checkOutDate;

    @Column(name = "CheckInTime", nullable = false)
    private LocalTime checkInTime;

    @Column(name = "CheckOutTime", nullable = false)
    private LocalTime checkOutTime;

}
