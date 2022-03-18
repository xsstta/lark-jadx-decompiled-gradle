package com.bytedance.ee.bear.p398i;

import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.i.i */
public class C7838i implements Cloneable {

    /* renamed from: a */
    public int f21154a;

    /* renamed from: b */
    public int f21155b;

    /* renamed from: c */
    public final String f21156c;

    /* renamed from: d */
    public String f21157d;

    /* renamed from: a */
    public C7838i clone() {
        try {
            return (C7838i) super.clone();
        } catch (CloneNotSupportedException e) {
            C13479a.m54759a("Link", "clone Links failed", e);
            return null;
        }
    }

    public C7838i(int i, int i2, String str) {
        String str2;
        this.f21154a = i;
        this.f21155b = i2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.f21156c = str2;
        if (str2.startsWith("https://") || str2.startsWith("http://") || str2.startsWith("ftp://") || str2.startsWith("data:") || str2.startsWith("mailto:")) {
            this.f21157d = str;
            return;
        }
        this.f21157d = "http://" + str;
    }
}
