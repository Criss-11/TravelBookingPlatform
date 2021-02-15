package TravelBookingPlatform.web;

import TravelBookingPlatform.MainMenu;
import TravelBookingPlatform.TravelBookingPlatform;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import TravelBookingPlatform.MainMenu.Type;

@Slf4j
@Controller
@RequestMapping ("/design")
public class DesignTravelBookingPlatformController {

@ModelAttribute
public void addMainMenuListToModel(Model model) {
    List<MainMenu> mainMenuList = Arrays.asList(
            new MainMenu("HOL","Holiday", Type.typeOfDeparture),
            new MainMenu("CB","City break", Type.typeOfDeparture),
            new MainMenu("WITM","Weekend in the mountains", Type.typeOfDeparture),
            new MainMenu("FM","Football match", Type.typeOfDeparture),
            new MainMenu("OTH","Other", Type.typeOfDeparture),
            new MainMenu("BDG","Bydgoszcz", Type.airport),
            new MainMenu("CRAC","Cracow", Type.airport),
            new MainMenu("GDN","Gdansk", Type.airport),
            new MainMenu("WAR","Warsaw", Type.airport),
            new MainMenu("WRO","Wroclaw", Type.airport),
            new MainMenu("CRO","Croatia", Type.direction),
            new MainMenu("FRA","France", Type.direction),
            new MainMenu("GER","Germany", Type.direction),
            new MainMenu("GRE","Greece", Type.direction),
            new MainMenu("ITA","Italy", Type.direction),
            new MainMenu("ESP","Spain", Type.direction),
            new MainMenu("2-3","2-3 days", Type.stay),
            new MainMenu("4-7","4-7 days", Type.stay),
            new MainMenu("8-10","8-10 days", Type.stay),
            new MainMenu("11-14","11-14 days", Type.stay),
            new MainMenu("one","1", Type.numberOfContestants),
            new MainMenu("two","2", Type.numberOfContestants),
            new MainMenu("three","3", Type.numberOfContestants),
            new MainMenu("four","4", Type.numberOfContestants),
            new MainMenu("five","5", Type.numberOfContestants)
    );
    Type[] types = Type.values();
    for (Type type : types) {
        model.addAttribute(type.toString().toLowerCase(),
                filterByType(mainMenuList, type));
    }
}

    @GetMapping
    public String showDesingForm(Model model){
        model.addAttribute("design", new TravelBookingPlatform());
        return "design";
    }


 //tag::filterByType[]
    private List<MainMenu> filterByType(
            List<MainMenu> mainMenuList, MainMenu.Type type) {
        return mainMenuList
                .stream()
                .filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }
//end::filterByType[]



}
