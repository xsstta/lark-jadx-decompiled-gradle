package com.bytedance.notification;

/* renamed from: com.bytedance.notification.c */
public class C20229c {

    /* renamed from: a */
    public static final int f49502a = NotificationStyle.NORMAL.styleIndex;

    /* renamed from: b */
    public static final int f49503b = NotificationStyle.SMALL_PICTURE.styleIndex;

    /* renamed from: c */
    private static volatile C20229c f49504c;

    /* renamed from: d */
    private String f49505d;

    /* renamed from: e */
    private int f49506e;

    /* renamed from: f */
    private int f49507f = -1;

    /* renamed from: b */
    public String mo68471b() {
        return this.f49505d;
    }

    /* renamed from: c */
    public int mo68472c() {
        return this.f49506e;
    }

    /* renamed from: d */
    public int mo68473d() {
        return this.f49507f;
    }

    private C20229c() {
    }

    /* renamed from: a */
    public static C20229c m73869a() {
        if (f49504c == null) {
            synchronized (C20229c.class) {
                if (f49504c == null) {
                    f49504c = new C20229c();
                }
            }
        }
        return f49504c;
    }
}
