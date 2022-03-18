package com.bytedance.ee.bear.p522q.p523a;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.util.deviceinfo.C13653a;

/* renamed from: com.bytedance.ee.bear.q.a.g */
public class C10552g extends AbstractC10550f.AbstractC10551a {

    /* renamed from: a */
    private static final SparseArray<AbstractC10550f.AbstractC10551a> f28327a = new SparseArray<>();

    /* renamed from: b */
    private static final SparseArray<AbstractC10550f> f28328b = new SparseArray<>();

    /* renamed from: h */
    private static int m43727h(Activity activity) {
        return activity.hashCode();
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10550f.AbstractC10551a
    /* renamed from: a */
    public AbstractC10550f mo17215a(Activity activity) {
        return new KeyboardHeightProviderImpl(activity);
    }

    /* renamed from: e */
    public static void m43724e(Activity activity) {
        f28328b.remove(m43727h(activity));
    }

    /* renamed from: f */
    public static void m43725f(Activity activity) {
        f28327a.remove(m43727h(activity));
    }

    /* renamed from: d */
    static AbstractC10550f m43723d(Activity activity) {
        AbstractC10550f fVar = f28328b.get(m43727h(activity));
        if (fVar == null) {
            fVar = m43726g(activity);
            m43720a(activity, fVar);
        }
        if (C13653a.m55399c(activity)) {
            m43722b(activity, fVar);
        }
        return fVar;
    }

    /* renamed from: g */
    private static AbstractC10550f m43726g(Activity activity) {
        AbstractC10550f.AbstractC10551a aVar = f28327a.get(m43727h(activity));
        if (aVar == null) {
            aVar = new C10552g();
        }
        return aVar.mo17215a(activity);
    }

    /* renamed from: a */
    public static void m43720a(Activity activity, AbstractC10550f fVar) {
        f28328b.put(m43727h(activity), fVar);
    }

    /* renamed from: b */
    public static void m43721b(Activity activity, AbstractC10550f.AbstractC10551a aVar) {
        f28327a.put(m43727h(activity), aVar);
    }

    /* renamed from: b */
    private static void m43722b(Activity activity, AbstractC10550f fVar) {
        View a;
        if (fVar instanceof KeyboardHeightProviderImpl) {
            KeyboardHeightProviderImpl hVar = (KeyboardHeightProviderImpl) fVar;
            if (!hVar.mo39927b().isShowing() && (a = hVar.mo39921a()) != null && a.isAttachedToWindow()) {
                hVar.mo39931e();
            }
        }
    }
}
