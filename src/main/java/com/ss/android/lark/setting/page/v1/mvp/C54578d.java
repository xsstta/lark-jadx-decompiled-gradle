package com.ss.android.lark.setting.page.v1.mvp;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a;

/* renamed from: com.ss.android.lark.setting.page.v1.mvp.d */
public class C54578d extends BasePresenter<AbstractC54566a.AbstractC54567a, AbstractC54566a.AbstractC54569b, AbstractC54566a.AbstractC54569b.AbstractC54570a> {

    /* renamed from: a */
    private final Context f134891a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC54566a.AbstractC54569b.AbstractC54570a createViewDelegate() {
        return new C54582b();
    }

    /* renamed from: b */
    public void mo186477b() {
        m211746f();
        mo186478c();
    }

    /* renamed from: c */
    public void mo186478c() {
        m211745e();
        m211744d();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m211745e();
        m211744d();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.page.v1.mvp.d$b */
    public class C54582b implements AbstractC54566a.AbstractC54569b.AbstractC54570a {
        @Override // com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a.AbstractC54569b.AbstractC54570a
        /* renamed from: a */
        public void mo186470a() {
            ((AbstractC54566a.AbstractC54567a) C54578d.this.getModel()).mo186466b();
            ((AbstractC54566a.AbstractC54569b) C54578d.this.getView()).mo186436d();
        }

        private C54582b() {
        }

        @Override // com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a.AbstractC54569b.AbstractC54570a
        /* renamed from: a */
        public void mo186471a(final Context context) {
            ((AbstractC54566a.AbstractC54567a) C54578d.this.getModel()).mo186467b(context, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.setting.page.v1.mvp.C54578d.C54582b.C545831 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    ((AbstractC54566a.AbstractC54569b) C54578d.this.getView()).mo186438f();
                    C54578d.this.mo186476a(context);
                }
            }));
        }
    }

    /* renamed from: d */
    private void m211744d() {
        ((AbstractC54566a.AbstractC54569b) getView()).mo186430a(((AbstractC54566a.AbstractC54567a) getModel()).mo186462a());
    }

    /* renamed from: e */
    private void m211745e() {
        ((AbstractC54566a.AbstractC54569b) getView()).mo186434b(((AbstractC54566a.AbstractC54567a) getModel()).mo186468c());
    }

    /* renamed from: f */
    private void m211746f() {
        boolean a = ((AbstractC54566a.AbstractC54567a) getModel()).mo186465a(this.f134891a);
        ((AbstractC54566a.AbstractC54569b) getView()).mo186432a(a);
        if (DesktopUtil.m144301a(this.f134891a) && !a) {
            ((AbstractC54566a.AbstractC54569b) getView()).mo186437e();
        }
    }

    /* renamed from: com.ss.android.lark.setting.page.v1.mvp.d$a */
    private class C54580a implements AbstractC54566a.AbstractC54567a.AbstractC54568a {
        private C54580a() {
        }

        @Override // com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a.AbstractC54567a.AbstractC54568a
        /* renamed from: a */
        public void mo186469a(final boolean z) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.setting.page.v1.mvp.C54578d.C54580a.RunnableC545811 */

                public void run() {
                    ((AbstractC54566a.AbstractC54569b) C54578d.this.getView()).mo186434b(z);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo186476a(Context context) {
        ((AbstractC54566a.AbstractC54567a) getModel()).mo186463a(context, new UIGetDataCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.setting.page.v1.mvp.C54578d.C545791 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC54566a.AbstractC54569b) C54578d.this.getView()).mo186435c();
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                ((AbstractC54566a.AbstractC54569b) C54578d.this.getView()).mo186433b();
                ((AbstractC54566a.AbstractC54569b) C54578d.this.getView()).mo186428a();
            }
        }));
    }

    public C54578d(Context context, AbstractC54566a.AbstractC54567a aVar, AbstractC54566a.AbstractC54569b bVar) {
        super(aVar, bVar);
        this.f134891a = context;
        ((AbstractC54566a.AbstractC54567a) getModel()).mo186464a(new C54580a());
    }
}
