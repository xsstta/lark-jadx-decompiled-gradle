package com.bytedance.ee.bear.list.p426d;

import android.content.Context;
import android.widget.ImageView;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.service.C10917c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.d.g */
public class C8263g {

    /* renamed from: a */
    protected Context f22294a;

    /* renamed from: b */
    protected Document f22295b;

    /* renamed from: c */
    protected String f22296c;

    /* renamed from: d */
    protected AbstractC8266j f22297d;

    /* renamed from: e */
    protected boolean f22298e;

    /* renamed from: f */
    protected ImageView f22299f;

    /* renamed from: g */
    protected C10917c f22300g;

    /* renamed from: h */
    protected boolean f22301h;

    /* renamed from: a */
    public void mo32361a() {
        this.f22299f.setTag(R.id.thumbnail_tag, "");
        mo32362b().mo32360a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC8266j mo32362b() {
        if (C8275a.f22370c.mo32555b() == this.f22295b.mo32483t()) {
            this.f22297d = new C8265i(this.f22294a, this.f22295b, this.f22296c, this.f22299f);
        } else if (C8275a.f22375h.mo32555b() == this.f22295b.mo32483t()) {
            this.f22297d = new C8264h(this.f22300g, this.f22294a, this.f22295b, this.f22296c, this.f22298e, this.f22299f);
        } else if (C8275a.f22377j.mo32555b() == this.f22295b.mo32483t()) {
            this.f22297d = new C8267k(this.f22294a, this.f22295b, this.f22296c, this.f22299f);
        } else {
            this.f22297d = new C8262f(this.f22294a, this.f22295b, this.f22296c, this.f22299f, this.f22301h);
        }
        return this.f22297d;
    }

    public C8263g(C10917c cVar, Context context, Document document, String str, boolean z, ImageView imageView) {
        this(cVar, context, document, str, z, imageView, C4211a.m17514a().mo16536a("spacekit.mobile.docs_diy_icon", false));
    }

    public C8263g(C10917c cVar, Context context, Document document, String str, boolean z, ImageView imageView, boolean z2) {
        this.f22300g = cVar;
        this.f22294a = context;
        this.f22295b = document;
        this.f22296c = str;
        this.f22298e = z;
        this.f22299f = imageView;
        this.f22301h = z2;
    }
}
