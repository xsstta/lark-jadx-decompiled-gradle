package com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword;

import android.content.Context;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10050b;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.k */
public class C10065k extends BasePresenter<C10050b.AbstractC10051a, C10050b.AbstractC10053b, C10050b.AbstractC10053b.AbstractC10054a> {

    /* renamed from: a */
    public Context f27201a;

    /* renamed from: b */
    public AbstractC10068a f27202b;

    /* renamed from: c */
    private boolean f27203c;

    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.k$a */
    public interface AbstractC10068a {
        /* renamed from: g */
        void mo38411g();

        /* renamed from: h */
        void mo38412h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10050b.AbstractC10053b.AbstractC10054a createViewDelegate() {
        return new C10050b.AbstractC10053b.AbstractC10054a() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10065k.C100661 */

            @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10050b.AbstractC10053b.AbstractC10054a
            /* renamed from: a */
            public void mo38401a() {
                C10065k.this.f27202b.mo38411g();
            }

            @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10050b.AbstractC10053b.AbstractC10054a
            /* renamed from: a */
            public void mo38402a(String str) {
                C10065k.this.mo38415a(str);
            }
        };
    }

    /* renamed from: a */
    public void mo38415a(String str) {
        ((C10050b.AbstractC10053b) getView()).mo38398a();
        ((C10050b.AbstractC10051a) getModel()).mo38395a(str, this.f27203c, new C10050b.AbstractC10051a.AbstractC10052a() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10065k.C100672 */

            @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10050b.AbstractC10051a.AbstractC10052a
            /* renamed from: a */
            public void mo38396a() {
                ((C10050b.AbstractC10053b) C10065k.this.getView()).mo38399b();
                C10065k.this.f27202b.mo38412h();
            }

            @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10050b.AbstractC10051a.AbstractC10052a
            /* renamed from: a */
            public void mo38397a(Throwable th) {
                ((C10050b.AbstractC10053b) C10065k.this.getView()).mo38399b();
                if (C5203d.m21235a(th, 10017)) {
                    ((C10050b.AbstractC10053b) C10065k.this.getView()).mo38400c();
                } else if (C5203d.m21235a(th, 10018)) {
                    Toast.showFailureText(C10065k.this.f27201a, C10065k.this.f27201a.getString(R.string.Doc_Permission_PasswordErrorLimitTips), 0);
                } else {
                    Toast.showFailureText(C10065k.this.f27201a, C10065k.this.f27201a.getString(R.string.Doc_Doc_NetException), 0);
                }
            }
        });
    }

    public C10065k(Context context, C10050b.AbstractC10051a aVar, C10050b.AbstractC10053b bVar, AbstractC10068a aVar2, boolean z) {
        super(aVar, bVar);
        this.f27201a = context;
        this.f27202b = aVar2;
        this.f27203c = z;
    }
}
