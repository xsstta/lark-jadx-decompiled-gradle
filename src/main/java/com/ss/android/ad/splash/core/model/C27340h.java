package com.ss.android.ad.splash.core.model;

import android.text.TextUtils;
import com.ss.android.ad.splash.utils.C27476f;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ad.splash.core.model.h */
public class C27340h {

    /* renamed from: a */
    private List<C27331b> f68228a;

    /* renamed from: b */
    private List<C27331b> f68229b;

    /* renamed from: c */
    private Map<String, C27331b> f68230c;

    /* renamed from: d */
    private List<C27331b> f68231d;

    /* renamed from: e */
    private boolean f68232e;

    /* renamed from: a */
    public List<C27331b> mo97543a() {
        return this.f68228a;
    }

    /* renamed from: b */
    public Map<String, C27331b> mo97547b() {
        return this.f68230c;
    }

    /* renamed from: d */
    public List<C27331b> mo97551d() {
        return this.f68229b;
    }

    /* renamed from: e */
    public List<C27331b> mo97553e() {
        return this.f68231d;
    }

    /* renamed from: c */
    public boolean mo97550c() {
        return this.f68232e;
    }

    /* renamed from: c */
    public void mo97549c(List<C27331b> list) {
        this.f68231d = list;
    }

    /* renamed from: a */
    public void mo97544a(List<C27331b> list) {
        this.f68228a = list;
    }

    /* renamed from: b */
    public void mo97548b(List<C27331b> list) {
        this.f68229b = list;
    }

    /* renamed from: a */
    public void mo97545a(Map<String, C27331b> map) {
        this.f68230c = map;
    }

    /* renamed from: a */
    public void mo97546a(boolean z) {
        this.f68232e = z;
    }

    /* renamed from: d */
    public boolean mo97552d(List<C27331b> list) {
        if (C27476f.m100323b(list)) {
            return !TextUtils.isEmpty(list.get(0).mo97501o());
        }
        return false;
    }
}
