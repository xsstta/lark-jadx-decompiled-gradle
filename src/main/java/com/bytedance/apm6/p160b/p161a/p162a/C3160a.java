package com.bytedance.apm6.p160b.p161a.p162a;

import android.text.TextUtils;
import com.bytedance.apm6.util.C3356f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.apm6.b.a.a.a */
public class C3160a {

    /* renamed from: a */
    private long f10112a;

    /* renamed from: b */
    private List<String> f10113b;

    /* renamed from: c */
    private List<String> f10114c;

    /* renamed from: d */
    private List<String> f10115d;

    /* renamed from: e */
    private boolean f10116e = true;

    /* renamed from: f */
    private boolean f10117f = true;

    /* renamed from: g */
    private long f10118g;

    /* renamed from: h */
    private int f10119h;

    /* renamed from: i */
    private int f10120i;

    /* renamed from: a */
    public List<String> mo13114a() {
        return this.f10113b;
    }

    /* renamed from: b */
    public List<String> mo13120b() {
        return this.f10115d;
    }

    /* renamed from: c */
    public List<String> mo13125c() {
        return this.f10114c;
    }

    /* renamed from: d */
    public boolean mo13126d() {
        return this.f10116e;
    }

    /* renamed from: e */
    public long mo13127e() {
        return this.f10112a;
    }

    /* renamed from: f */
    public long mo13128f() {
        return this.f10118g;
    }

    /* renamed from: g */
    public int mo13129g() {
        return this.f10119h;
    }

    /* renamed from: h */
    public int mo13130h() {
        return this.f10120i;
    }

    public String toString() {
        return "SlardarHandlerConfig{onceReportMaxSizeBytes=" + this.f10112a + ", reportUrlList=" + this.f10113b + ", exceptionUrl=" + this.f10114c + ", traceReportUrl=" + this.f10115d + ", isEncrypt=" + this.f10116e + ", isUploadInternalExcetpion=" + this.f10117f + ", reportInterval=" + this.f10118g + ", maxSizeMB=" + this.f10119h + ", keepDays=" + this.f10120i + '}';
    }

    /* renamed from: a */
    public void mo13115a(int i) {
        this.f10119h = i;
    }

    /* renamed from: b */
    public void mo13121b(int i) {
        this.f10120i = i;
    }

    /* renamed from: a */
    public void mo13116a(long j) {
        this.f10112a = j;
    }

    /* renamed from: b */
    public void mo13122b(long j) {
        this.f10118g = j;
    }

    /* renamed from: a */
    public void mo13117a(String str) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            this.f10114c = arrayList;
            arrayList.add(str);
        }
    }

    /* renamed from: b */
    public void mo13123b(String str) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            this.f10115d = arrayList;
            arrayList.add(str);
        }
    }

    /* renamed from: a */
    public void mo13118a(List<String> list) {
        if (!C3356f.m13964a(list)) {
            this.f10113b = list;
        }
    }

    /* renamed from: b */
    public void mo13124b(boolean z) {
        this.f10117f = z;
    }

    /* renamed from: a */
    public void mo13119a(boolean z) {
        this.f10116e = z;
    }
}
