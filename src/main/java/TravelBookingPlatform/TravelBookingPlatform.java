package TravelBookingPlatform;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class TravelBookingPlatform {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Date createdAt;

    @ManyToMany(targetEntity = MainMenu.class)
    private List<MainMenu> mainMenuList= new ArrayList<>();

    @PrePersist
    void createdAt() {
        this.createdAt=new Date();
    }
}
