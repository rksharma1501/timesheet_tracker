package hackathon_timesheet.com.controller;


import hackathon_timesheet.com.entities.Timesheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class TimesheetController {


    @Autowired
    private Timesheet timesheet;  // these changes from github main branch
    

// make change in this line


    //who the hell are you tell me this

    @PostMapping
    public Timesheet submit(){
        return timesheet;
    }
}
 // this change i amke in line 19 by b4