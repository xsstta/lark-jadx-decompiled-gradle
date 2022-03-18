package com.ss.android.lark.main.app.widgets.desktop.avatar;

import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.widgets.desktop.avatar.C44434a;
import com.ss.android.lark.main.interfaces.AbstractC44505h;
import com.ss.android.lark.main.p2231a.AbstractC44136a;

/* renamed from: com.ss.android.lark.main.app.widgets.desktop.avatar.b */
public class C44439b extends BaseModel implements C44434a.AbstractC44435a {

    /* renamed from: a */
    public C44434a.AbstractC44435a.AbstractC44436a f112762a;

    /* renamed from: b */
    AbstractC44505h f112763b = new AbstractC44505h() {
        /* class com.ss.android.lark.main.app.widgets.desktop.avatar.C44439b.C444401 */

        @Override // com.ss.android.lark.main.interfaces.AbstractC44505h
        /* renamed from: a */
        public void mo157423a(final boolean z) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.main.app.widgets.desktop.avatar.C44439b.C444401.RunnableC444411 */

                public void run() {
                    C44439b.this.mo157834a(z);
                }
            });
        }
    };

    /* renamed from: c */
    AbstractC44136a.AbstractC44173y.AbstractC44174a f112764c = new AbstractC44136a.AbstractC44173y.AbstractC44174a() {
        /* class com.ss.android.lark.main.app.widgets.desktop.avatar.C44439b.C444422 */

        @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44173y.AbstractC44174a
        /* renamed from: b */
        public void mo157138b(boolean z) {
        }

        @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44173y.AbstractC44174a
        /* renamed from: a */
        public void mo157137a(boolean z) {
            if (C44439b.this.f112762a == null) {
                return;
            }
            if (z) {
                C44439b.this.f112762a.mo157833b();
            } else {
                C44439b.this.f112762a.mo157831a();
            }
        }
    };

    /* renamed from: d */
    private AbstractC44136a.AbstractC44173y f112765d;

    /* renamed from: e */
    private AbstractC44136a.AbstractC44169v f112766e;

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f112765d.mo133430b(this.f112764c);
        this.f112766e.mo133392a(this.f112763b);
        super.destroy();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f112765d = C44134a.m174959a().mo133190J();
        this.f112766e = C44134a.m174959a().mo133189I();
        if (this.f112765d.mo133429a()) {
            this.f112762a.mo157833b();
        } else {
            this.f112762a.mo157831a();
        }
        mo157834a(this.f112766e.mo133393a());
        this.f112766e.mo133392a(this.f112763b);
        this.f112765d.mo133428a(this.f112764c);
    }

    @Override // com.ss.android.lark.main.app.widgets.desktop.avatar.C44434a.AbstractC44435a
    /* renamed from: a */
    public void mo157830a(C44434a.AbstractC44435a.AbstractC44436a aVar) {
        this.f112762a = aVar;
    }

    /* renamed from: a */
    public void mo157834a(boolean z) {
        C44434a.AbstractC44435a.AbstractC44436a aVar = this.f112762a;
        if (aVar != null) {
            aVar.mo157832a(z);
        }
    }
}
