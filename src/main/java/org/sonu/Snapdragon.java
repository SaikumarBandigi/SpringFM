package org.sonu;

import org.springframework.stereotype.Component;

@Component("s")
public class Snapdragon implements MobileProcessor {
    @Override
    public void cpu() {
        System.out.println("1st cpu");
    }


}
