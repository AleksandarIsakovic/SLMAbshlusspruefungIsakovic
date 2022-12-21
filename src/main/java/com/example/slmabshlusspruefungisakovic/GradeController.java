package com.example.slmabshlusspruefungisakovic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeController {

    @GetMapping("/grade")
    public int getGrade(@RequestParam int percentage){
       if(percentage >=88){
           return 1;
       } else if (percentage >= 75) {
           return 2;
       } else if (percentage >= 63) {
           return 3;
       } else if (percentage>= 50) {
           return 4;
       }else{
       return 5;
       }


    }



}
