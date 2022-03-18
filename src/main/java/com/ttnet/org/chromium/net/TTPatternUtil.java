package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.util.regex.Pattern;

@JNINamespace("net")
public class TTPatternUtil {
    public static boolean isPatternStringValid(String str) {
        try {
            Pattern.compile(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
