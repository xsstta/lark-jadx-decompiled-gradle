package com.ss.android.lark.openplatform.webapp.p2406a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.webapp.AbstractC13753a;
import com.bytedance.ee.webapp.AbstractC13794f;
import com.bytedance.ee.webapp.C13808i;
import com.bytedance.ee.webapp.v2.WebAppContainerDelegate;
import com.larksuite.component.webview.container.dto.C25838g;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.openapi.jsapi.AbstractC48762d;
import com.ss.android.lark.openplatform.p2399a.AbstractC48793a;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.openplatform.webapp.a.a */
public class C48870a implements AbstractC13794f {

    /* renamed from: a */
    public AbstractC48793a f122785a;

    /* renamed from: b */
    private Context f122786b;

    @Override // com.bytedance.ee.webapp.AbstractC13794f
    /* renamed from: b */
    public AbstractC13794f.AbstractC13796b mo50839b() {
        return new AbstractC13794f.AbstractC13796b() {
            /* class com.ss.android.lark.openplatform.webapp.p2406a.C48870a.C488711 */

            @Override // com.bytedance.ee.webapp.AbstractC13794f.AbstractC13796b
            /* renamed from: d */
            public void mo50854d() {
                C48870a.this.f122785a.auditInitSdk();
            }

            @Override // com.bytedance.ee.webapp.AbstractC13794f.AbstractC13796b
            /* renamed from: a */
            public String mo50850a() {
                return C48870a.this.f122785a.getUserId();
            }

            @Override // com.bytedance.ee.webapp.AbstractC13794f.AbstractC13796b
            /* renamed from: b */
            public String mo50852b() {
                return C48870a.this.f122785a.getTenantId();
            }

            @Override // com.bytedance.ee.webapp.AbstractC13794f.AbstractC13796b
            /* renamed from: c */
            public String mo50853c() {
                return C48870a.this.f122785a.getSession();
            }

            @Override // com.bytedance.ee.webapp.AbstractC13794f.AbstractC13796b
            /* renamed from: a */
            public void mo50851a(String str) {
                C48870a.this.f122785a.auditOpenMiniAppEvent(str);
            }
        };
    }

    @Override // com.bytedance.ee.webapp.AbstractC13794f
    /* renamed from: c */
    public AbstractC13794f.AbstractC13801g mo50841c() {
        return this.f122785a.getWebTranslateDependency();
    }

    @Override // com.bytedance.ee.webapp.AbstractC13794f
    /* renamed from: d */
    public AbstractC13794f.AbstractC13795a mo50843d() {
        return new AbstractC13794f.AbstractC13795a() {
            /* class com.ss.android.lark.openplatform.webapp.p2406a.C48870a.C488722 */

            @Override // com.bytedance.ee.webapp.AbstractC13794f.AbstractC13795a
            /* renamed from: b */
            public void mo50849b(String str) {
                C48870a.this.f122785a.completeGuide(str);
            }

            @Override // com.bytedance.ee.webapp.AbstractC13794f.AbstractC13795a
            /* renamed from: a */
            public boolean mo50848a(String str) {
                return C48870a.this.f122785a.checkToShow(str);
            }
        };
    }

    @Override // com.bytedance.ee.webapp.AbstractC13794f
    /* renamed from: e */
    public AbstractC48762d mo50844e() {
        return this.f122785a.getWebPermissionChecker();
    }

    @Override // com.bytedance.ee.webapp.AbstractC13794f
    /* renamed from: f */
    public AbstractC13794f.AbstractC13800f mo50845f() {
        return this.f122785a.getWebLeanModeDependency();
    }

    @Override // com.bytedance.ee.webapp.AbstractC13794f
    /* renamed from: g */
    public AbstractC13794f.AbstractC13798d mo50846g() {
        return this.f122785a.getTenantCertDependency();
    }

    @Override // com.bytedance.ee.webapp.AbstractC13794f
    /* renamed from: h */
    public AbstractC13794f.AbstractC13799e mo50847h() {
        return this.f122785a.getUrlIntercepterDependency();
    }

    @Override // com.bytedance.ee.webapp.AbstractC13794f
    /* renamed from: a */
    public String mo50830a() {
        return this.f122785a.getBrowserDependency().mo144948a();
    }

    @Override // com.bytedance.ee.webapp.AbstractC13794f
    /* renamed from: a */
    public void mo50834a(Fragment fragment) {
        this.f122785a.launchMainWindow(fragment);
    }

    @Override // com.bytedance.ee.webapp.AbstractC13794f
    /* renamed from: b */
    public void mo50840b(String str) {
        this.f122785a.getBrowserDependency().mo144957c(str);
    }

    @Override // com.bytedance.ee.webapp.AbstractC13794f
    /* renamed from: c */
    public C13808i mo50842c(String str) {
        return this.f122785a.getBrowserDependency().mo144956b(str);
    }

    @Override // com.bytedance.ee.webapp.AbstractC13794f
    /* renamed from: a */
    public boolean mo50838a(String str) {
        return this.f122785a.getBrowserDependency().mo144955a(str);
    }

    public C48870a(Context context, AbstractC48793a aVar) {
        this.f122786b = context;
        this.f122785a = aVar;
    }

    @Override // com.bytedance.ee.webapp.AbstractC13794f
    /* renamed from: a */
    public void mo50835a(WebAppContainerDelegate webAppContainerDelegate, String str) {
        this.f122785a.onContainerCreated(webAppContainerDelegate);
        if (!TextUtils.isEmpty(str)) {
            this.f122785a.getModule().mo170506a(str, webAppContainerDelegate);
        }
    }

    @Override // com.bytedance.ee.webapp.AbstractC13794f
    /* renamed from: a */
    public void mo50836a(String str, AbstractC13753a aVar) {
        this.f122785a.getBrowserDependency().mo144953a(str, aVar);
    }

    @Override // com.bytedance.ee.webapp.AbstractC13794f
    /* renamed from: a */
    public void mo50837a(String str, IGetDataCallback<String> iGetDataCallback) {
        this.f122785a.getBrowserDependency().mo144954a(str, iGetDataCallback);
    }

    @Override // com.bytedance.ee.webapp.AbstractC13794f
    /* renamed from: a */
    public ArrayList<C25838g> mo50831a(Activity activity, Fragment fragment, AbstractC13794f.AbstractC13797c cVar) {
        return this.f122785a.getBrowserDependency().mo144949a(activity, fragment, cVar);
    }

    @Override // com.bytedance.ee.webapp.AbstractC13794f
    /* renamed from: a */
    public void mo50832a(Activity activity, String str, String str2, String str3, String str4) {
        this.f122785a.getBrowserDependency().mo144950a(activity, "", str, str2, str3, str4);
    }

    @Override // com.bytedance.ee.webapp.AbstractC13794f
    /* renamed from: a */
    public void mo50833a(Activity activity, String str, String str2, String str3, String str4, String str5) {
        this.f122785a.getBrowserDependency().mo144950a(activity, str, str2, str3, str5, str4);
    }
}
