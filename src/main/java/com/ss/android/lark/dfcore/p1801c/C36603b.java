package com.ss.android.lark.dfcore.p1801c;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.morpheus.C20207c;
import com.bytedance.morpheus.core.AbstractC20209b;
import com.bytedance.morpheus.core.C20208a;
import com.bytedance.morpheus.p856a.C20195a;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.dfcore.task.DynamicFeatureTask;

/* renamed from: com.ss.android.lark.dfcore.c.b */
public class C36603b extends AbstractC36602a {

    /* renamed from: d */
    private AbstractC20209b f94178d = new AbstractC20209b() {
        /* class com.ss.android.lark.dfcore.p1801c.C36603b.C366041 */

        @Override // com.bytedance.morpheus.core.AbstractC20209b
        /* renamed from: a */
        public void mo68394a(C20208a aVar) {
            C36603b.this.mo135030b(aVar);
        }
    };

    @Override // com.ss.android.lark.dfcore.p1801c.AbstractC36602a
    /* renamed from: c */
    public void mo135028c() {
        C20207c.m73747a(this.f94178d);
    }

    @Override // com.ss.android.lark.dfcore.p1801c.AbstractC36602a
    /* renamed from: d */
    public void mo135029d() {
        C20207c.m73752b(this.f94178d);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m144418c(C20208a aVar) {
        mo135024a(aVar);
    }

    public C36603b(DynamicFeatureTask dynamicFeatureTask) {
        super(dynamicFeatureTask);
    }

    @Override // com.ss.android.lark.dfcore.p1801c.AbstractC36602a
    /* renamed from: a */
    public boolean mo135026a(Activity activity) {
        if (this.f94177c == null || activity == null || activity.isFinishing() || this.f94176b == null) {
            return false;
        }
        try {
            return C20195a.m73713a(this.f94176b, activity, 8);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public void mo135030b(C20208a aVar) {
        if (this.f94177c != null && TextUtils.equals(this.f94177c.mo135050b(), aVar.mo68382b())) {
            CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable(aVar) {
                /* class com.ss.android.lark.dfcore.p1801c.$$Lambda$b$jyoIeTgVg5iP89eADBshDr6sE */
                public final /* synthetic */ C20208a f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C36603b.this.m144418c(this.f$1);
                }
            });
        }
    }
}
