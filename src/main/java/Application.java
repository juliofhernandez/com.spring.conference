import com.spring.service.SpeakerService;
import com.spring.service.SpeakerServiceImpl;

public class Application {
    public static void main(String[] args) {
        SpeakerService speakerService= new SpeakerServiceImpl();
        System.out.println(speakerService.findAll().get(0).getFirstName());
    }
}
