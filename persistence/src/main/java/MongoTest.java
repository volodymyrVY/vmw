import com.softserveinc.ita.jexercises.common.entity.mongo.CommonAttribute;
import com.softserveinc.ita.jexercises.common.entity.mongo.Trailer;
import com.softserveinc.ita.jexercises.persistence.dao.mongo.impl.TrailerDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by volodymyr on 12/16/15.
 */
public class MongoTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("persistence-context.xml");

        TrailerDaoImpl trailerDao = applicationContext.getBean(TrailerDaoImpl.class);

        Trailer trailer=new Trailer();
        trailer.setAxis("axis");
        CommonAttribute commonAttribute = new CommonAttribute();
        commonAttribute.setColor("red");
        commonAttribute.setDescription("hello mongo");
        trailer.setCommonAttribute(commonAttribute);



        System.out.println( trailerDao.save(trailer));

    }
}
