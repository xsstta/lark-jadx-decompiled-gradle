package com.ss.android.lark.chat.entity.timetip;

public class PushChatTimeTipNotify {

    /* renamed from: a */
    private int f87948a;

    /* renamed from: b */
    private String f87949b;

    /* renamed from: c */
    private String f87950c;

    public @interface TimeTipStatus {
    }

    /* renamed from: b */
    public static int m131907b(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return -1;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public int mo126049a() {
        return this.f87948a;
    }

    /* renamed from: b */
    public String mo126052b() {
        return this.f87949b;
    }

    /* renamed from: a */
    public void mo126050a(int i) {
        this.f87948a = i;
    }

    /* renamed from: b */
    public void mo126053b(String str) {
        this.f87950c = str;
    }

    /* renamed from: a */
    public void mo126051a(String str) {
        this.f87949b = str;
    }
}
