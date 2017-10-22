package com.sv.sample.jaxrs.sample1;

import org.springframework.stereotype.Component;

/**
 * Created by shaiverm on 22-Oct-2017
 */
@Component("demoUser")
public class DemoUserResource implements DemoUser {

    @Override
    public User getUser () {
        User user = new User();
        user.setName("Just for demo");
        user.setAge(33);
        return user;
    }
}
