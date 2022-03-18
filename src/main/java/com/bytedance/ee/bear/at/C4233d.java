package com.bytedance.ee.bear.at;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.atfinder.AbstractC4271f;
import com.bytedance.ee.bear.bean.C4519b;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.bear.widget.AtFinderView;

/* renamed from: com.bytedance.ee.bear.at.d */
public class C4233d {

    /* renamed from: a */
    public FragmentActivity f12752a;

    /* renamed from: b */
    public int f12753b;

    /* renamed from: c */
    public String f12754c;

    /* renamed from: d */
    public String f12755d;

    /* renamed from: e */
    public String f12756e;

    /* renamed from: f */
    public C4519b f12757f;

    /* renamed from: g */
    public View f12758g;

    /* renamed from: h */
    public int f12759h;

    /* renamed from: i */
    public int f12760i;

    /* renamed from: j */
    public boolean f12761j;

    /* renamed from: k */
    public int f12762k;

    /* renamed from: l */
    public AtFinderView f12763l;

    /* renamed from: m */
    public AbstractC4271f f12764m;

    /* renamed from: a */
    public C4233d mo16652a(int i) {
        this.f12759h = i;
        return this;
    }

    /* renamed from: b */
    public C4233d mo16656b(int i) {
        this.f12760i = i;
        return this;
    }

    /* renamed from: a */
    public C4233d mo16653a(View view) {
        this.f12758g = view;
        return this;
    }

    /* renamed from: a */
    public C4233d mo16654a(AbstractC4271f fVar) {
        this.f12764m = fVar;
        return this;
    }

    /* renamed from: a */
    public C4233d mo16655a(AtFinderView atFinderView) {
        this.f12763l = atFinderView;
        this.f12762k = 1;
        return this;
    }

    public C4233d(FragmentActivity fragmentActivity, C4519b bVar, C8275a aVar, String str, String str2, String str3) {
        this(fragmentActivity, bVar, C10599b.m43898a(aVar), str, str2, str3);
    }

    public C4233d(FragmentActivity fragmentActivity, C4519b bVar, int i, String str, String str2, String str3) {
        this.f12761j = true;
        this.f12752a = fragmentActivity;
        this.f12753b = i;
        this.f12757f = bVar;
        this.f12754c = str;
        this.f12755d = str2;
        this.f12756e = str3;
        C10599b.m43901a();
    }
}
