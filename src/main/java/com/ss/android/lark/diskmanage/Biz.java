package com.ss.android.lark.diskmanage;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/diskmanage/Biz;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DEFAULT", "RUST", "MESSENGER", "PASSPORT", "CALENDAR", "DOCS", "VC", "MIN_APP", "MAIL", "disk-manage_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum Biz {
    DEFAULT("default"),
    RUST("rust"),
    MESSENGER("messenger"),
    PASSPORT("passport"),
    CALENDAR("calendar"),
    DOCS("docs"),
    VC("vc"),
    MIN_APP("min_app"),
    MAIL("mail");
    
    private final String value;

    public final String getValue() {
        return this.value;
    }

    private Biz(String str) {
        this.value = str;
    }
}
