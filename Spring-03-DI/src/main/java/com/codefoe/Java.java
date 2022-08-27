package com.codefoe;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java {
    //@Autowired  // Starting spring 4.3 If only one constructor in this class then @Autowired annotation is optional
    public Java(OfficeHours officeHours){
        this.officeHours = officeHours;
    }
   // @Autowired    field injection, not recommended and soon to be deprecated
    OfficeHours officeHours;
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (20 + officeHours.getHours()));
    }
}
