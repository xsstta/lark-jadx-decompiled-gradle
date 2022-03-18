package com.bytedance.platform.horae.p874a.p877c;

import android.app.Application;
import android.util.Log;
import com.bytedance.platform.horae.p874a.p877c.p878a.AbstractC20358b;
import com.bytedance.platform.horae.p874a.p877c.p878a.C20360d;
import com.bytedance.platform.horae.p874a.p877c.p878a.C20362e;
import com.bytedance.platform.horae.p874a.p877c.p878a.View$OnAttachStateChangeListenerC20359c;

/* renamed from: com.bytedance.platform.horae.a.c.a */
public class C20356a implements AbstractC20358b {
    /* renamed from: a */
    public void mo68670a(Application application) {
        new C20360d(this).mo68689a();
        new C20362e(this).mo68692a();
        new View$OnAttachStateChangeListenerC20359c(application, this).mo68672a();
    }

    @Override // com.bytedance.platform.horae.p874a.p877c.p878a.AbstractC20358b
    /* renamed from: a */
    public void mo68671a(String str) {
        if (!"main".equals(Thread.currentThread().getName())) {
            Log.e("HookCenter", "chanel is " + str + Log.getStackTraceString(new RuntimeException()));
            return;
        }
        Log.d("HookCenter", str + " trigger is coming!");
        RunnableC20365d.m74187b().mo68695a();
    }
}
