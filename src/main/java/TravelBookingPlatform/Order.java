package TravelBookingPlatform;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table (name = "Travel_Order")
public class Order implements Serializable {
    public static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date placedAt;

    @NotBlank(message = "Name is required")
    private String name;
    //    @NotBlank (message="Surname is required")
    private String surname;
    //    @NotBlank (message="Street is required")
    private String street;
    //    @NotBlank (message="City is required")
    private String city;
    //    @NotBlank (message="State is required")
    private String state;
    //    @NotBlank (message="Zip code is required")
    private String zip;
    //    @NotBlank (message="Email is required")
    private String email;
    //    @NotBlank (message="Phone number is required")
    private String phoneNumber;
    //    @CreditCardNumber(message="Not a valid credit card number")
    private String ccNumber;
    //    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
//            message="Must be formatted MM/YY")
    private String ccExpiration;
    //    @Digits(integer=3, fraction=0, message="Invalid CVV")
    private String ccCVV;

    @ManyToMany(targetEntity = TravelBookingPlatform.class)
    private List<TravelBookingPlatform> travelBookingPlatformList= new ArrayList<>();

    public void addDesign(TravelBookingPlatform design){
        this.travelBookingPlatformList.add(design);
    }

    @PrePersist
    void placedAt (){
        this.placedAt = new Date();
    }
    }

