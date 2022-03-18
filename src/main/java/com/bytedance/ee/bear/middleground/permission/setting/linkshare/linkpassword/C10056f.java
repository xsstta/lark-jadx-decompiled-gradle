package com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13614b;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import java.net.URI;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.f */
public class C10056f extends BasePresenter<C10045a.AbstractC10046a, C10045a.AbstractC10048b, C10045a.AbstractC10048b.AbstractC10049a> {

    /* renamed from: a */
    public C10045a.AbstractC10046a.AbstractC10047a f27159a = new C10045a.AbstractC10046a.AbstractC10047a() {
        /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10056f.C100571 */

        @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a.AbstractC10046a.AbstractC10047a
        /* renamed from: a */
        public void mo38387a(boolean z, String str) {
            ((C10045a.AbstractC10048b) C10056f.this.getView()).mo38391b();
            ((C10045a.AbstractC10048b) C10056f.this.getView()).mo38390a(z, str);
        }

        @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a.AbstractC10046a.AbstractC10047a
        /* renamed from: a */
        public void mo38386a(Throwable th, boolean z, String str) {
            ((C10045a.AbstractC10048b) C10056f.this.getView()).mo38391b();
            ((C10045a.AbstractC10048b) C10056f.this.getView()).mo38390a(z, str);
            if (C5203d.m21235a(th, 10040)) {
                Toast.showFailureText(C10056f.this.f27160b, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
            } else {
                Toast.showFailureText(C10056f.this.f27160b, C10056f.this.f27160b.getString(R.string.Doc_Facade_OperateFailed), 0);
            }
        }
    };

    /* renamed from: b */
    public Context f27160b;

    /* renamed from: c */
    private String f27161c;

    /* renamed from: d */
    private String f27162d;

    /* renamed from: e */
    private int f27163e;

    /* renamed from: f */
    private String f27164f;

    /* renamed from: g */
    private String f27165g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10045a.AbstractC10048b.AbstractC10049a createViewDelegate() {
        return new C10045a.AbstractC10048b.AbstractC10049a() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10056f.C100582 */

            @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a.AbstractC10048b.AbstractC10049a
            /* renamed from: a */
            public void mo38392a() {
                ((C10045a.AbstractC10048b) C10056f.this.getView()).mo38388a();
                ((C10045a.AbstractC10046a) C10056f.this.getModel()).mo38385c(new C10045a.AbstractC10046a.AbstractC10047a() {
                    /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10056f.C100582.C100591 */

                    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a.AbstractC10046a.AbstractC10047a
                    /* renamed from: a */
                    public void mo38387a(boolean z, String str) {
                        C10056f.this.f27159a.mo38387a(z, str);
                        Toast.showSuccessText(C10056f.this.f27160b, C10056f.this.f27160b.getString(R.string.Doc_Share_ChangePasswordSuccess), 0);
                    }

                    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a.AbstractC10046a.AbstractC10047a
                    /* renamed from: a */
                    public void mo38386a(Throwable th, boolean z, String str) {
                        C10056f.this.f27159a.mo38386a(th, z, str);
                    }
                });
                C10056f.this.mo38405a("change_password");
                PermissionAnalyticV2.m39695p();
            }

            @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a.AbstractC10048b.AbstractC10049a
            /* renamed from: a */
            public void mo38393a(Context context) {
                C10056f.this.mo38404a(context);
                C10056f.this.mo38405a("copy");
                PermissionAnalyticV2.m39696q();
            }

            @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a.AbstractC10048b.AbstractC10049a
            /* renamed from: a */
            public void mo38394a(boolean z) {
                ((C10045a.AbstractC10048b) C10056f.this.getView()).mo38388a();
                if (z) {
                    ((C10045a.AbstractC10046a) C10056f.this.getModel()).mo38381a(C10056f.this.f27159a);
                    C10056f.this.mo38405a("add_password");
                } else {
                    ((C10045a.AbstractC10046a) C10056f.this.getModel()).mo38383b(C10056f.this.f27159a);
                }
                PermissionAnalyticV2.m39660c(z);
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((C10045a.AbstractC10048b) getView()).mo38390a(((C10045a.AbstractC10046a) getModel()).mo38384b(), ((C10045a.AbstractC10046a) getModel()).mo38380a());
    }

    /* renamed from: a */
    public void mo38405a(String str) {
        PermissionAnalytic.m39407a(this.f27162d, this.f27163e, this.f27164f, str, this.f27165g);
    }

    /* renamed from: b */
    private String m41842b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            URI uri = new URI(str);
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (Exception unused) {
            C13479a.m54758a("LinkSharePasswordPresenter", "getUrlWithoutParameter fail");
            return str;
        }
    }

    /* renamed from: b */
    private boolean m41843b(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("link", m41842b(this.f27161c));
        hashMap.put("password", ((C10045a.AbstractC10046a) getModel()).mo38380a());
        try {
            C13614b.m55259a(context, C10539a.m43640a(context, R.string.Doc_Facade_LinkAndPasswordText, hashMap));
            return true;
        } catch (Exception e) {
            C13479a.m54761a("LinkSharePasswordPresenter", e);
            return false;
        }
    }

    /* renamed from: a */
    public void mo38404a(Context context) {
        if (m41843b(context)) {
            Toast.showSuccessText(context, context.getString(R.string.Doc_Facade_CopyLinkSuccessfully), 0);
            return;
        }
        C13479a.m54758a("LinkSharePasswordPresenter", "copyLinkWithPassword failed");
        Toast.showFailureText(context, context.getString(R.string.Doc_Facade_CopyLinkFailed), 0);
    }

    /* renamed from: a */
    public void mo38406a(boolean z) {
        ((C10045a.AbstractC10048b) getView()).mo38389a(z);
        if (!z) {
            ((C10045a.AbstractC10046a) getModel()).mo38382a(false, "");
        }
        ((C10045a.AbstractC10048b) getView()).mo38390a(((C10045a.AbstractC10046a) getModel()).mo38384b(), ((C10045a.AbstractC10046a) getModel()).mo38380a());
    }

    /* renamed from: a */
    public void mo38407a(boolean z, String str) {
        ((C10045a.AbstractC10046a) getModel()).mo38382a(z, str);
    }

    public C10056f(Context context, C10060g gVar, C10055e eVar, String str, String str2, int i, String str3, String str4) {
        super(eVar, gVar);
        this.f27161c = str;
        this.f27162d = str2;
        this.f27163e = i;
        this.f27164f = str3;
        this.f27165g = str4;
        this.f27160b = context;
    }

    /* renamed from: a */
    public static C10056f m41841a(View view, String str, String str2, int i, String str3, boolean z, String str4, boolean z2, String str5, IUpdatePasswordStateToPermSetInfo cVar, boolean z3) {
        boolean z4;
        Context context = view.getContext();
        if (i == C8275a.f22370c.mo32555b()) {
            z4 = true;
        } else {
            z4 = false;
        }
        C10056f fVar = new C10056f(view.getContext(), new C10060g(context, view, z2, z4), new C10055e(str2, i, z, str4, cVar, z3), str, str2, i, str3, str5);
        fVar.create();
        return fVar;
    }
}
