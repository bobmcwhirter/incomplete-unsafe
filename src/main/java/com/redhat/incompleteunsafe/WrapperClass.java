package com.redhat.incompleteunsafe;

import org.jboss.modules.Module;

public class WrapperClass {

    static {
        try {
            Module.getStartTime();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static String speak() {
        return "Hello, world.";
    }

}
