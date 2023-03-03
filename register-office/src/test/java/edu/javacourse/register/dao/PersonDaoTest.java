package edu.javacourse.register.dao;

import edu.javacourse.register.domain.Person;
import edu.javacourse.register.domain.PersonFemale;
import edu.javacourse.register.domain.PersonMale;
import edu.javacourse.register.rest.MarriageController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
class PersonDaoTest {

    @Test
    public void findPersons() {
/*        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"springContext.xml"}
        );

        PersonDao dao = context.getBean(PersonDao.class);

        //PersonDao dao = new PersonDao();
        List<Person> persons = dao.findPersons();

        persons.forEach(p -> {
            System.out.println("Name:" + p.getFirstName());
            System.out.println("Class foe sex:" + p.getClass().getName());
            System.out.println("Passports:" + p.getPassports().size());
            System.out.println("Birth:" + p.getBirthCertificate());
            if (p instanceof PersonMale) {
                System.out.println("Birth Cert:" + ((PersonMale)p).getBirthCertificates().size() );
                System.out.println("Marriage Cert:" + ((PersonMale)p).getMarriageCertificates().size() );
            } else {
                System.out.println("Birth Cert:" + ((PersonFemale)p).getBirthCertificates().size() );
                System.out.println("Marriage Cert:" + ((PersonFemale)p).getMarriageCertificates().size() );
            }
        });*/
    }
}