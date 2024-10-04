import in.sp.beans.Studetnt;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.sp.resorces.SpringConfigFile;

public class Main {


    public static void main(String[] args) {


        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Studetnt std= (Studetnt) context.getBean("stdId");
        std.display();

    }
}