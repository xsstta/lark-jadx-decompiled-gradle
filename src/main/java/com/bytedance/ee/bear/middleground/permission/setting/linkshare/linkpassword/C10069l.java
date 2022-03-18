package com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10050b;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.RequestPasswordView;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.C11824c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.l */
public class C10069l implements C10050b.AbstractC10053b {

    /* renamed from: a */
    private C10050b.AbstractC10053b.AbstractC10054a f27206a;

    /* renamed from: b */
    private C11824c f27207b;

    /* renamed from: c */
    private RequestPasswordView f27208c;

    /* renamed from: d */
    private Context f27209d;

    /* renamed from: e */
    private View f27210e;

    /* renamed from: f */
    private boolean f27211f;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10050b.AbstractC10053b
    /* renamed from: b */
    public void mo38399b() {
        C11824c cVar = this.f27207b;
        if (cVar != null) {
            cVar.mo45303c();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10050b.AbstractC10053b
    /* renamed from: a */
    public void mo38398a() {
        C11824c cVar = this.f27207b;
        if (cVar != null) {
            cVar.mo45304d();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10050b.AbstractC10053b
    /* renamed from: c */
    public void mo38400c() {
        this.f27208c.mo38369a(R.string.Doc_Permission_PasswordError);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f27207b = new C11824c(this.f27209d);
        BaseTitleBar baseTitleBar = (BaseTitleBar) this.f27210e.findViewById(R.id.request_password_title);
        if (this.f27211f) {
            baseTitleBar.setLeftClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$l$7HQC8ny86DIVCfqrlsUBFwx51r0 */

                public final void onClick(View view) {
                    C10069l.this.m41892a((C10069l) view);
                }
            });
        } else {
            baseTitleBar.setLeftIconVisibility(false);
        }
        RequestPasswordView requestPasswordView = (RequestPasswordView) this.f27210e.findViewById(R.id.request_password_container);
        this.f27208c = requestPasswordView;
        requestPasswordView.setEditTextHint(R.string.Doc_Permission_PleaseEnterPassowrd);
        this.f27208c.setTips(R.string.Doc_Permission_PleaseEnterPasswordAccess);
        this.f27208c.setOnInputPasswordListener(new RequestPasswordView.AbstractC10044a() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$l$oou7pQRrzkDRZDENg76PcDpmghg */

            @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.RequestPasswordView.AbstractC10044a
            public final void onActionDone(String str) {
                C10069l.this.m41893a((C10069l) str);
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(C10050b.AbstractC10053b.AbstractC10054a aVar) {
        this.f27206a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m41893a(String str) {
        this.f27206a.mo38402a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m41892a(View view) {
        if (C10548d.m43704c(this.f27210e)) {
            this.f27208c.mo38368a();
            C10548d.m43697a(this.f27208c);
            return;
        }
        this.f27206a.mo38401a();
    }

    public C10069l(Context context, View view, boolean z) {
        this.f27209d = context;
        this.f27210e = view;
        this.f27211f = z;
    }
}
