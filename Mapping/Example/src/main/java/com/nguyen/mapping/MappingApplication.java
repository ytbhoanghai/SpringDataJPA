package com.nguyen.mapping;

import com.nguyen.mapping.entity.*;
import com.nguyen.mapping.entity.customID.ProjectGuestID;
import com.nguyen.mapping.repository.EmploymentRepository;
import com.nguyen.mapping.repository.ProjectGuestRepository;
import com.nguyen.mapping.repository.ProjectRepository;
import com.nguyen.mapping.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class MappingApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(MappingApplication.class, args);

        Employment employment = new Employment(
                "Nguyễn Văn A",
                new Account("root","123"));

        EmploymentService employmentService = context.getBean(EmploymentService.class);
        DepartmentService departmentService = context.getBean(DepartmentService.class);
        ProjectService projectService = context.getBean(ProjectService.class);
        ProjectGuestService projectGuestService = context.getBean(ProjectGuestService.class);
        GuestService guestService = context.getBean(GuestService.class);

//        System.out.println("Saved: " + employmentService.saveEmployment(employment));

//        Employment employment1 = employmentService.findById(2);
//        employment1.setDepartment(departmentService.findByName("IT"));
//        employmentService.saveEmployment(employment1);
//        System.out.println(employment1);

//        List<Employment> employments = employmentService.findByDepartment_Id(1);
//        employments.forEach(System.out::println);

//        Project project = ProjectService.findById(1);
//        List<Employment> employments = employmentService.findByProjects(project);
//        employments.forEach(System.out::println);

//        Employment employment1 = employmentService.findById(2);
//        List<Project> projects = ProjectService.findByEmployments(employment1);
//        projects.forEach(System.out::println);

//        Project project = ProjectService.findById(1);
//        List<Guest> guests = projectGuestService.findByProject(project);
//        guests.forEach(System.out::println);

//        Project project = ProjectService.findById(1);
//        Guest guest = guestService.findById(1);
//        ProjectGuest projectGuest =
//                projectGuestService.findByID(ProjectGuestID.createID(project, guest));
//        System.out.println(projectGuest);

//        Project project = projectService.findById(2);
//        Guest guest = guestService.findById(1);
//        ProjectGuest projectGuest = new ProjectGuest(
//                ProjectGuestID.createID(project, guest), project, guest, new Date());
//        System.out.println("Saved: " + projectGuestService.saveProjectGuest(projectGuest));

    }

}
