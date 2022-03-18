package com.bytedance.ee.bear.drive.view.preview.loadingview;

import android.content.Context;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.drive.mimetype.C7094b;
import com.bytedance.ee.bear.drive.mimetype.C7096d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.log.C13479a;
import java.lang.reflect.Constructor;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.loadingview.c */
public class C7404c {

    /* renamed from: a */
    private AbstractC7095c f19908a;

    /* renamed from: b */
    private boolean f19909b;

    public C7404c(AbstractC7095c cVar, boolean z) {
        this.f19908a = cVar;
        this.f19909b = z;
    }

    /* renamed from: a */
    public AbstractC7403b mo28904a(Context context, C7553d dVar) {
        C7094b a = this.f19908a.mo27711a(dVar.mo29494m(), "");
        if (this.f19909b) {
            return new C7402a(context, dVar, a);
        }
        Class b = C7096d.m28346b(a.mo27729d());
        if (b != null) {
            try {
                Constructor declaredConstructor = b.getDeclaredConstructor(Context.class, C7553d.class, C7094b.class);
                declaredConstructor.setAccessible(true);
                return (AbstractC7403b) declaredConstructor.newInstance(context, dVar, a);
            } catch (Exception e) {
                C13479a.m54761a("LoadingViewManager", e);
                return new NotSupportLoadingView(context, dVar, a);
            }
        } else {
            C13479a.m54758a("LoadingViewManager", "MimeTypeProvider get class is null");
            return new NotSupportLoadingView(context, dVar, a);
        }
    }
}
