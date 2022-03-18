package com.ss.android.lark.calendar.impl.framework.p1568a;

import com.ss.android.eventbus.BaseEvent;
import javax.annotation.Nullable;

/* renamed from: com.ss.android.lark.calendar.impl.framework.a.e */
public class C32488e extends BaseEvent {

    /* renamed from: a */
    public final int f83294a;
    @Nullable

    /* renamed from: b */
    public final String f83295b;
    @Nullable

    /* renamed from: c */
    public final String f83296c;

    /* renamed from: a */
    public static C32488e m124013a(String str, String str2) {
        return new C32488e(0, str, str2);
    }

    /* renamed from: b */
    public static C32488e m124014b(String str, String str2) {
        return new C32488e(1, str, str2);
    }

    /* renamed from: c */
    public static C32488e m124015c(String str, String str2) {
        return new C32488e(2, str, str2);
    }

    public C32488e(int i, @Nullable String str, @Nullable String str2) {
        this.f83294a = i;
        this.f83295b = str;
        this.f83296c = str2;
    }
}
