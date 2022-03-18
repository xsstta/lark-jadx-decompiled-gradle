package com.ss.android.lark.notification.env;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class NotificationEnv {

    /* renamed from: a */
    boolean f121960a;

    /* renamed from: b */
    boolean f121961b;

    /* renamed from: c */
    boolean f121962c;

    /* renamed from: d */
    boolean f121963d;

    /* renamed from: e */
    boolean f121964e = true;

    /* renamed from: f */
    int f121965f;

    @Retention(RetentionPolicy.SOURCE)
    public @interface INNER_SETTING {
    }

    /* renamed from: a */
    public int mo169537a() {
        return this.f121965f;
    }

    public NotificationEnv() {
    }

    /* renamed from: b */
    private String m191172b() {
        int i = this.f121965f;
        if (i == 0) {
            return "Open,";
        }
        if (i == 1) {
            return "Closed,";
        }
        if (i == 2) {
            return "Buzz,";
        }
        if (i != 3) {
            return "Unknown,";
        }
        return "Buzz and Mention,";
    }

    public String toString() {
        return "NotificationEnv {systemEnable=" + this.f121960a + ", closeByPCLogin=" + this.f121961b + ", closeAtNotice=" + this.f121962c + ", isInZenMode=" + this.f121963d + ", showNotificationDetail=" + this.f121964e + ", innerSetting=" + m191172b() + '}';
    }

    public NotificationEnv(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        this.f121960a = z;
        this.f121961b = z2;
        this.f121962c = z3;
        this.f121963d = z4;
        this.f121964e = z5;
        this.f121965f = i;
    }
}
