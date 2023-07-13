package org.sonu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

    @Autowired
    @Qualifier("s")
    private MobileProcessor mobileProcessor;

    public void call() {
        System.out.println("samsung calling..");
        mobileProcessor.cpu();
    }


}
