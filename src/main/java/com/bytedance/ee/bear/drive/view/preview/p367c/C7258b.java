package com.bytedance.ee.bear.drive.view.preview.p367c;

import android.content.Context;
import com.bytedance.ee.bear.drive.biz.external.C6418d;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.drive.view.preview.p364a.AbstractC7219b;
import com.bytedance.ee.bear.drive.view.preview.p364a.C7218a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.c.b */
public class C7258b {

    /* renamed from: a */
    private Context f19461a;

    /* renamed from: b */
    private AbstractC7095c f19462b;

    public C7258b(Context context, AbstractC7095c cVar) {
        this.f19461a = context;
        this.f19462b = cVar;
    }

    /* renamed from: a */
    public AbstractC7219b mo28360a(ViewOwner viewOwner, C7553d dVar, C6418d dVar2) {
        return new C7218a(viewOwner, dVar, this.f19461a, this.f19462b.mo27711a(dVar.mo29494m(), ""), dVar2);
    }
}
