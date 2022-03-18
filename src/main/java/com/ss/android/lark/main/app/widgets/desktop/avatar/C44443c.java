package com.ss.android.lark.main.app.widgets.desktop.avatar;

import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.main.app.widgets.desktop.avatar.C44434a;

/* renamed from: com.ss.android.lark.main.app.widgets.desktop.avatar.c */
public class C44443c extends BasePresenter<C44434a.AbstractC44435a, C44434a.AbstractC44437b, C44434a.AbstractC44437b.AbstractC44438a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C44434a.AbstractC44437b.AbstractC44438a createViewDelegate() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C44434a.AbstractC44435a.AbstractC44436a mo157838b() {
        return new C44445a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.main.app.widgets.desktop.avatar.c$a */
    public class C44445a implements C44434a.AbstractC44435a.AbstractC44436a {
        @Override // com.ss.android.lark.main.app.widgets.desktop.avatar.C44434a.AbstractC44435a.AbstractC44436a
        /* renamed from: a */
        public void mo157831a() {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.main.app.widgets.desktop.avatar.C44443c.C44445a.RunnableC444461 */

                public void run() {
                    C44434a.AbstractC44437b bVar = (C44434a.AbstractC44437b) C44443c.this.getView();
                    if (bVar != null) {
                        bVar.mo157828a(false);
                    }
                }
            });
        }

        @Override // com.ss.android.lark.main.app.widgets.desktop.avatar.C44434a.AbstractC44435a.AbstractC44436a
        /* renamed from: b */
        public void mo157833b() {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.main.app.widgets.desktop.avatar.C44443c.C44445a.RunnableC444472 */

                public void run() {
                    C44434a.AbstractC44437b bVar = (C44434a.AbstractC44437b) C44443c.this.getView();
                    if (bVar != null) {
                        bVar.mo157828a(true);
                    }
                }
            });
        }

        private C44445a() {
        }

        @Override // com.ss.android.lark.main.app.widgets.desktop.avatar.C44434a.AbstractC44435a.AbstractC44436a
        /* renamed from: a */
        public void mo157832a(final boolean z) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.main.app.widgets.desktop.avatar.C44443c.C44445a.RunnableC444483 */

                public void run() {
                    C44434a.AbstractC44437b bVar = (C44434a.AbstractC44437b) C44443c.this.getView();
                    if (bVar != null) {
                        bVar.mo157829b(z);
                    }
                }
            });
        }
    }

    public C44443c(C44434a.AbstractC44437b bVar, C44434a.AbstractC44435a aVar) {
        super(aVar, bVar);
        aVar.mo157830a(mo157838b());
    }

    /* renamed from: a */
    public void mo157837a(String str, String str2) {
        ((C44434a.AbstractC44437b) getView()).mo157827a(str, str2);
    }
}
