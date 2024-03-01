package course.work.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roomcategory")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RoomCategoryEntity {

    @Id
    @Column(name = "CategoryID", nullable = false)
    private String categoryId;

    @Column(name = "CategoryName", nullable = false)
    private String categoryName;

    @Column(name = "CategoryDescription", nullable = false)
    private String categoryDescription;

    @Column(name = "Price", nullable = false)
    private Double price;

}
