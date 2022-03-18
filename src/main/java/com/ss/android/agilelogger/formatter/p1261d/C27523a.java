package com.ss.android.agilelogger.formatter.p1261d;

/* renamed from: com.ss.android.agilelogger.formatter.d.a */
public class C27523a implements AbstractC27524b {

    /* renamed from: a */
    private final String f68751a = "Thread: ";

    /* renamed from: a */
    public String mo98131a(Thread thread) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Thread: ");
        stringBuffer.append(thread.getName());
        return stringBuffer.toString();
    }
}
