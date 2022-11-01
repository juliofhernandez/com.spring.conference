import com.spring.repository.HibernateSpeakerRepositoryImpl;
import com.spring.repository.SpeakerRepository;
import com.spring.service.SpeakerService;
import com.spring.service.SpeakerServiceImpl;
import com.spring.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import java.util.Calendar;

@Configuration
@ComponentScan({"com.spring"})
public class AppConfig {
    @Bean
    public CalendarFactory calendarFactory(){
        CalendarFactory calendarFactory= new CalendarFactory();
//        So, We can manipulate some things of the calendar object instance inside the Factory. ✅
        calendarFactory.addDays(2);
        return calendarFactory;
    }

    @Bean
    public Calendar calendar() throws Exception{
//        We are actually wrapping a calendar instance in a factory
        return calendarFactory().getObject();
    }
}
