package com.ss.android.lark.feed.app.p1849b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.feed.app.p1849b.C37295a;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.feed.app.b.c */
public class C37306c extends C37295a {

    /* renamed from: c */
    View f95797c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.feed.app.b.c$a */
    public static class C37309a {

        /* renamed from: a */
        static C37306c f95805a = new C37306c();
    }

    private C37306c() {
    }

    /* renamed from: a */
    public static C37306c m146953a() {
        return C37309a.f95805a;
    }

    /* renamed from: b */
    public View mo137140b() {
        View view = this.f95797c;
        this.f95797c = null;
        return view;
    }

    /* renamed from: c */
    public void mo137142c() {
        for (C37295a.AbstractC37297a aVar : this.f95795b.values()) {
            aVar.mo137130a();
        }
        this.f95797c = null;
    }

    /* renamed from: a */
    public void mo137138a(Context context) {
        if (f95794a) {
            context = context.getApplicationContext();
        }
        this.f95797c = LayoutInflater.from(context).inflate(R.layout.activity_chatlist, (ViewGroup) null);
    }

    /* renamed from: b */
    public void mo137141b(final Context context) {
        if (f95794a) {
            context = context.getApplicationContext();
        }
        for (final C37295a.AbstractC37297a aVar : this.f95795b.values()) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.feed.app.p1849b.C37306c.RunnableC373071 */

                public void run() {
                    aVar.mo137131a(context);
                }
            });
        }
    }

    @Override // com.ss.android.lark.feed.app.p1849b.C37295a, com.ss.android.lark.feed.app.p1849b.AbstractC37305b
    /* renamed from: a */
    public <T extends View> T mo137128a(Class<?> cls, Context context) {
        if (f95794a) {
            context = context.getApplicationContext();
        }
        C37295a.AbstractC37297a aVar = (C37295a.AbstractC37297a) this.f95795b.get(cls);
        if (aVar == null) {
            return null;
        }
        T t = (T) aVar.mo137137c(context);
        if (aVar.mo137136c() == 0) {
            mo137139a(cls, context, (aVar.mo137134b() + 1) / 2);
        }
        return t;
    }

    /* renamed from: a */
    public void mo137139a(final Class<?> cls, final Context context, final int i) {
        CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
            /* class com.ss.android.lark.feed.app.p1849b.C37306c.RunnableC373082 */

            public void run() {
                try {
                    Log.m165389i("UIPreloader", "asyncPreloadItemView cls=" + cls.getSimpleName() + " count=" + i);
                    ((C37295a.AbstractC37297a) C37306c.this.f95795b.get(cls)).mo137132a(context, i);
                } catch (Exception e) {
                    Log.m165384e("UIPreloader", "asyncPreloadItemView error.", e);
                }
            }
        });
    }
}
