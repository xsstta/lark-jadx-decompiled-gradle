package com.ss.android.agilelogger.formatter.p1260c;

import com.huawei.hms.feature.dynamic.DynamicModule;

/* renamed from: com.ss.android.agilelogger.formatter.c.a */
public class C27521a implements AbstractC27522b {
    /* renamed from: a */
    public String mo98131a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder((int) DynamicModule.f58006b);
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return null;
        }
        if (stackTraceElementArr.length == 1) {
            return "\t─ " + stackTraceElementArr[0].toString();
        }
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                sb.append("\n");
            }
            if (i != length - 1) {
                sb.append("\t├ ");
                sb.append(stackTraceElementArr[i].toString());
                sb.append("\n");
            } else {
                sb.append("\t└ ");
                sb.append(stackTraceElementArr[i].toString());
            }
        }
        return sb.toString();
    }
}
