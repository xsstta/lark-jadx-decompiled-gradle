package com.bytedance.geckox.p761c;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/* renamed from: com.bytedance.geckox.c.b */
public class C14217b {

    /* renamed from: a */
    private static C14217b f37393a = new C14217b();

    /* renamed from: b */
    private Gson f37394b = m57432c();

    /* renamed from: a */
    public static C14217b m57431a() {
        return f37393a;
    }

    /* renamed from: b */
    public Gson mo52132b() {
        return this.f37394b;
    }

    private C14217b() {
    }

    /* renamed from: c */
    private static Gson m57432c() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Boolean.class, new C14215a());
        gsonBuilder.registerTypeAdapter(Boolean.TYPE, new C14215a());
        return gsonBuilder.create();
    }
}
