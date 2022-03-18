package com.bytedance.ug.sdk.share.impl.p928j;

import android.app.Activity;
import java.util.LinkedList;

/* renamed from: com.bytedance.ug.sdk.share.impl.j.b */
public final class C20851b {

    /* renamed from: a */
    public static LinkedList<Activity> f51031a = new LinkedList<>();

    /* renamed from: a */
    public static Activity m75907a() {
        if (f51031a.isEmpty()) {
            return null;
        }
        return f51031a.getLast();
    }
}
