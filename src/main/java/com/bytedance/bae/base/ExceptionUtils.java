package com.bytedance.bae.base;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionUtils {
    public static String stackTrace(Throwable th) {
        th.printStackTrace(new PrintWriter(new StringWriter()));
        return th.toString();
    }
}
