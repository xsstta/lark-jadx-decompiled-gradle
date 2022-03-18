package com.airbnb.lottie.model;

import com.airbnb.lottie.model.content.C1845j;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.c */
public class C1834c {

    /* renamed from: a */
    private final List<C1845j> f6273a;

    /* renamed from: b */
    private final char f6274b;

    /* renamed from: c */
    private final double f6275c;

    /* renamed from: d */
    private final double f6276d;

    /* renamed from: e */
    private final String f6277e;

    /* renamed from: f */
    private final String f6278f;

    /* renamed from: a */
    public List<C1845j> mo9154a() {
        return this.f6273a;
    }

    /* renamed from: b */
    public double mo9155b() {
        return this.f6276d;
    }

    public int hashCode() {
        return m8173a(this.f6274b, this.f6278f, this.f6277e);
    }

    /* renamed from: a */
    public static int m8173a(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public C1834c(List<C1845j> list, char c, double d, double d2, String str, String str2) {
        this.f6273a = list;
        this.f6274b = c;
        this.f6275c = d;
        this.f6276d = d2;
        this.f6277e = str;
        this.f6278f = str2;
    }
}
