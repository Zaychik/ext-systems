package edu.javacourse.student.rest;

import edu.javacourse.student.service.StudentService;
import edu.javacourse.student.view.StudentRequest;
import edu.javacourse.student.view.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;



import java.io.IOException;
import java.io.InputStream;
import java.util.List;


@RestController
@RequestMapping(path = "/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<StudentResponse> getStudentInfo(@RequestBody StudentRequest request) {
        return studentService.getStudentInfo(request);
    }

    @GetMapping(path = "/check")
    public String checkAdmin() {
        return "Rest Service is working";
    }

    @GetMapping(path = "/params/{checkId}")
    public String checkParams(@PathVariable("checkId") Long checkId,
                              @RequestParam("comment") String comment) {
        return checkId + ":" +comment;
    }


    @PostMapping(path = "/photo", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadPhoto(@RequestParam("comment") String comment) {
        return ":" +comment;
    }
}
