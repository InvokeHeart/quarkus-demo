package org.stop.endpoint;

import io.quarkus.hibernate.orm.PersistenceUnitExtension;
import org.stop.repo.Student;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("stu")
@Produces(MediaType.APPLICATION_JSON)
public class StudentEndPoint {


    @GET
    @Transactional
    public Student hello() {
        Student student = new Student();
        student.setId(1);
        student.setName("jack");
        student.setClazzId("xxxxx");

        return null;
    }
}
