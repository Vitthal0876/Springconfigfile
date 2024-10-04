package in.sp.resorces;

import in.sp.beans.Studetnt;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public Studetnt stdId(){
        Studetnt std=  new Studetnt();
        std.setName("name" + "vitthal");
        std.setEmail("vitthal@gmail.com");
        std.setRollno(1);
        return std;

    }

}
