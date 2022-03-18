package com.larksuite.component.webview.container.impl;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.webview.container.dto.IWebContainerContract;
import com.larksuite.component.webview.container.p1169a.C25821b;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.p2905b.C57810a;
import com.ss.android.lark.widget.p2932c.C58339d;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.larksuite.component.webview.container.impl.d */
public class C25859d implements IWebContainerContract.IWebContainerView.AbstractC25825b {

    /* renamed from: a */
    public Context f63972a;

    /* renamed from: b */
    private CallbackManager f63973b;

    /* renamed from: c */
    private boolean f63974c = true;

    /* renamed from: d */
    private boolean f63975d = true;

    /* renamed from: e */
    private boolean f63976e = true;

    /* renamed from: a */
    private boolean m93558a(int i) {
        return i == 5 || i == 8;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m93562c() {
    }

    /* renamed from: b */
    private IGetDataCallback<File> m93559b() {
        return this.f63973b.wrapAndAddGetDataCallback(new IGetDataCallback<File>() {
            /* class com.larksuite.component.webview.container.impl.C25859d.C258601 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                LKUIToast.show(C25859d.this.f63972a, (int) R.string.Lark_Legacy_SaveFailTip);
            }

            /* renamed from: a */
            public void onSuccess(File file) {
                C26311p.m95268a(C25859d.this.f63972a, file.getPath());
                LKUIToast.show(C25859d.this.f63972a, (int) R.drawable.saving_pictures, (int) R.string.Lark_Legacy_SaveSuccess);
            }
        });
    }

    /* renamed from: a */
    private C58339d.C58341a m93554a() {
        C58339d.C58341a aVar = new C58339d.C58341a(UIUtils.getString(this.f63972a, R.string.Lark_Legacy_Cancel), $$Lambda$d$QASfuQ2FzMvWlvWwF_pbOwgoF_Q.INSTANCE);
        aVar.mo197573c(R.color.lkui_N300);
        return aVar;
    }

    @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25825b
    /* renamed from: a */
    public void mo91877a(boolean z) {
        this.f63976e = z;
    }

    /* renamed from: a */
    private C58339d.C58341a m93555a(String str) {
        C58339d.C58341a aVar = new C58339d.C58341a(UIUtils.getString(this.f63972a, R.string.Lark_Legacy_PersoncardLinkButton), new C58339d.AbstractC58343b(str) {
            /* class com.larksuite.component.webview.container.impl.$$Lambda$d$xNhi4bESEHmi1VQqWG7AKSEv7g4 */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public final void onMenuItemClick() {
                C25859d.this.m93561b(this.f$1);
            }
        });
        aVar.mo197573c(R.color.lkui_N300);
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m93561b(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 10000) {
            str = str.substring(0, HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
        }
        ((ClipboardManager) this.f63972a.getSystemService("clipboard")).setText(str);
        Context context = this.f63972a;
        LKUIToast.show(context, context.getResources().getString(R.string.Lark_Legacy_CopySuccess));
    }

    /* renamed from: a */
    public boolean mo91955a(WebView.HitTestResult hitTestResult) {
        if (m93558a(hitTestResult.getType())) {
            return true;
        }
        return false;
    }

    public C25859d(Context context, CallbackManager callbackManager) {
        this.f63972a = context;
        this.f63973b = callbackManager;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m93563c(Activity activity, String str) {
        C57805b.m224333d(activity, new C57805b.AbstractC57809a(str) {
            /* class com.larksuite.component.webview.container.impl.$$Lambda$d$QrrZDDy7hYCGBzKEps0cGRnpE1s */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public final void permissionGranted(boolean z) {
                C25859d.this.m93557a((C25859d) this.f$1, (String) z);
            }
        });
    }

    /* renamed from: b */
    private C58339d.C58341a m93560b(Activity activity, String str) {
        C58339d.C58341a aVar = new C58339d.C58341a(UIUtils.getString(this.f63972a, R.string.Lark_Legacy_SaveImage), new C58339d.AbstractC58343b(activity, str) {
            /* class com.larksuite.component.webview.container.impl.$$Lambda$d$KDoBkBIV64cSE95Y83z1xaMLxo */
            public final /* synthetic */ Activity f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public final void onMenuItemClick() {
                C25859d.this.m93563c(this.f$1, this.f$2);
            }
        });
        aVar.mo197573c(R.color.lkui_N300);
        return aVar;
    }

    /* renamed from: a */
    private void m93556a(Activity activity, String str) {
        ArrayList arrayList = new ArrayList();
        if (this.f63975d) {
            arrayList.add(m93560b(activity, str));
        }
        if (this.f63976e) {
            arrayList.add(m93555a(str));
        }
        arrayList.add(m93554a());
        C57810a.m224336a(this.f63972a, new C58339d.C58344c(this.f63972a, arrayList, null).mo197576a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m93557a(String str, boolean z) {
        if (z) {
            C25821b.m93347a().mo91846a(C57881t.m224651w(this.f63972a) + System.currentTimeMillis(), str, m93559b());
        }
    }

    /* renamed from: a */
    public void mo91954a(Activity activity, WebView.HitTestResult hitTestResult) {
        if (this.f63974c && m93558a(hitTestResult.getType())) {
            m93556a(activity, hitTestResult.getExtra());
        }
    }
}
