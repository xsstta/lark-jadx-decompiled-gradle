package com.ss.android.lark.mm.base.p2289a;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.mm.base.a.d */
public class C45864d<T> {

    /* renamed from: a */
    private String f115696a = "";

    /* renamed from: b */
    private List<AbstractC45860a<T>> f115697b = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void mo161182a(String str) {
        this.f115696a = str;
    }

    /* renamed from: b */
    public void mo161183b(AbstractC45860a aVar) {
        this.f115697b.remove(aVar);
    }

    /* renamed from: a */
    public void mo161179a(AbstractC45860a aVar) {
        if (!this.f115697b.contains(aVar)) {
            this.f115697b.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo161180a(T t) {
        for (AbstractC45860a<T> aVar : this.f115697b) {
            aVar.mo161173a(t);
        }
    }

    /* renamed from: a */
    public void mo161181a(T t, String str) {
        if (!TextUtils.isEmpty(str)) {
            for (AbstractC45860a<T> aVar : this.f115697b) {
                if (str.equals(this.f115696a)) {
                    aVar.mo161173a(t);
                }
            }
            return;
        }
        throw new IllegalArgumentException("setData from null");
    }
}
