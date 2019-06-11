package com.redhat.incompleteunsafe;

import com.oracle.svm.core.annotate.Substitute;
import com.oracle.svm.core.annotate.TargetClass;

@TargetClass(WrapperClass.class)
@Substitute
public final class Target_com_redhat_incompleteunsafe_WrapperClass {

    @Substitute
    public static String speak() {
        return "Hello, y'all";
    }


}
