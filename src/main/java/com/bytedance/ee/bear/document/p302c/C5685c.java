package com.bytedance.ee.bear.document.p302c;

import android.content.Context;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.document.C5869m;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.larksuite.suite.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.document.c.c */
public class C5685c {

    /* renamed from: a */
    private static final int f16062a = 2131493736;

    /* renamed from: b */
    private static final Map<String, C5682a> f16063b = new LinkedHashMap();

    /* renamed from: a */
    public static Map<String, C5682a> m23052a() {
        return f16063b;
    }

    /* renamed from: a */
    public static C5682a m23051a(String str) {
        C5682a aVar = f16063b.get(str);
        if (aVar == null) {
            return new C5682a(C5869m.class, f16062a);
        }
        return aVar;
    }

    /* renamed from: a */
    public static void m23053a(String str, Class<? extends C5869m> cls) {
        m23054a(str, cls, f16062a);
    }

    /* renamed from: a */
    public static void m23054a(String str, Class<? extends C5869m> cls, int i) {
        f16063b.put(str, new C5682a(cls, i));
    }

    /* renamed from: a */
    public static View m23050a(Context context, ViewGroup viewGroup, C5682a aVar) {
        View b;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return m23055b(context, viewGroup, aVar);
        }
        synchronized (C5685c.class) {
            b = m23055b(context, viewGroup, aVar);
        }
        return b;
    }

    /* renamed from: b */
    private static View m23055b(Context context, ViewGroup viewGroup, C5682a aVar) {
        View inflate = LayoutInflater.from(new ContextThemeWrapper(context, 2131886440)).inflate(aVar.mo22708b(), viewGroup, false);
        ((BaseTitleBar) inflate.findViewById(R.id.doc_main_title)).setCustomTitleView(C5686d.m23057a(context));
        return inflate;
    }
}
