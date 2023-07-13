package org.sonu;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Mediatek implements MobileProcessor {
    @Override
    public void cpu() {
        System.out.println("2nd cpu");

    }
}
