package TravelBookingPlatform;

import TravelBookingPlatform.data.MainMenuRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TravelBookingPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelBookingPlatformApplication.class, args);
	}
	@Bean
	public CommandLineRunner dataLoader (MainMenuRepository repo){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				repo.save(new MainMenu("HOL","Holiday", MainMenu.Type.typeOfDeparture));
				repo.save(new MainMenu("CB","City break", MainMenu.Type.typeOfDeparture));
				repo.save(new MainMenu("WITM","Weekend in the mountains", MainMenu.Type.typeOfDeparture));
				repo.save(new MainMenu("FM","Football match", MainMenu.Type.typeOfDeparture));
				repo.save(new MainMenu("OTH","Other", MainMenu.Type.typeOfDeparture));
				repo.save(new MainMenu("BDG","Bydgoszcz", MainMenu.Type.airport));
				repo.save(new MainMenu("CRAC","Cracow", MainMenu.Type.airport));
				repo.save(new MainMenu("GDN","Gdansk", MainMenu.Type.airport));
				repo.save(new MainMenu("WAR","Warsaw", MainMenu.Type.airport));
				repo.save(new MainMenu("WRO","Wroclaw", MainMenu.Type.airport));
				repo.save(new MainMenu("CRO","Croatia", MainMenu.Type.direction));
				repo.save(new MainMenu("FRA","France", MainMenu.Type.direction));
				repo.save(new MainMenu("GER","Germany", MainMenu.Type.direction));
				repo.save(new MainMenu("GRE","Greece", MainMenu.Type.direction));
				repo.save(new MainMenu("ITA","Italy", MainMenu.Type.direction));
				repo.save(new MainMenu("ESP","Spain", MainMenu.Type.direction));
				repo.save(new MainMenu("2-3","2-3 days", MainMenu.Type.stay));
				repo.save(new MainMenu("4-7","4-7 days", MainMenu.Type.stay));
				repo.save(new MainMenu("8-10","8-10 days", MainMenu.Type.stay));
				repo.save(new MainMenu("11-14","11-14 days", MainMenu.Type.stay));
				repo.save(new MainMenu("one","1", MainMenu.Type.numberOfContestants));
				repo.save(new MainMenu("two","2", MainMenu.Type.numberOfContestants));
				repo.save(new MainMenu("three","3", MainMenu.Type.numberOfContestants));
				repo.save(new MainMenu("four","4", MainMenu.Type.numberOfContestants));
				repo.save(new MainMenu("five","5", MainMenu.Type.numberOfContestants));

			}
		};
	}


}
