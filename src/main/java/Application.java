import com.spring.service.SpeakerService;
import com.spring.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
//        First Instance
        SpeakerService speakerService=applicationContext.getBean("speakerService",SpeakerService.class);
        System.out.println(speakerService);

//        getFirstName()
        System.out.println(speakerService.findAll().get(0).getFirstName());

//        Second Instance
        SpeakerService speakerService2=applicationContext.getBean("speakerService",SpeakerService.class);
        System.out.println(speakerService2);
    }
}
