package TravelBookingPlatform.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Confirm {
    @GetMapping("/confirm")
    public String home() {
        return "confirm";
    }
}
