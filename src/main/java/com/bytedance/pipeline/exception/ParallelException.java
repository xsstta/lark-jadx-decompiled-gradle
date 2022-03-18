package com.bytedance.pipeline.exception;

import java.util.ArrayList;
import java.util.List;

public class ParallelException extends Exception {
    private List<Throwable> throwable;

    public List<Throwable> getThrowable() {
        return this.throwable;
    }

    public ParallelException(List<Throwable> list) {
        this.throwable = list;
        if (!(list == null || list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (Throwable th : list) {
                fill(th, arrayList);
            }
            setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]));
        }
    }

    private void fill(Throwable th, List<StackTraceElement> list) {
        if (th != null) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            for (int i = 0; i < length; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                if (i == 0) {
                    String message = th.getMessage();
                    StringBuilder sb = new StringBuilder();
                    sb.append("\b\b\b\nCaused by:");
                    if (message == null) {
                        message = "";
                    }
                    sb.append(message);
                    sb.append("\n\t");
                    sb.append(stackTraceElement.getClassName());
                    list.add(new StackTraceElement(sb.toString(), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber()));
                } else {
                    list.add(stackTraceElement);
                }
            }
            fill(th.getCause(), list);
        }
    }
}
