package TravelBookingPlatform.web;

import TravelBookingPlatform.MainMenu;
import TravelBookingPlatform.data.MainMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MainMenuByIdConverter implements Converter<String, MainMenu> {
    private MainMenuRepository mainMenuRepo;

    @Autowired
    public MainMenuByIdConverter(MainMenuRepository mainMenuRepo){
        this.mainMenuRepo = mainMenuRepo;
    }

    @Override
    public MainMenu convert (String id){
        Optional<MainMenu> optionalMainMenu = mainMenuRepo.findById(id);
        return optionalMainMenu.isPresent() ?
                optionalMainMenu.get() : null;
    }

}
