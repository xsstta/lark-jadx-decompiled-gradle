package com.ss.lark.android.passport.biz.compat.web;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.network.C49073c;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49194j;
import com.ss.android.lark.passport.infra.widget.p2450d.C49266a;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e;
import com.ss.lark.android.passport.biz.compat.web.C64554d;
import com.ss.lark.android.passport.biz.compat.web.jsbridge.AbstractC64564a;
import com.ss.lark.android.passport.biz.compat.web.jsbridge.AbstractC64569d;
import com.ss.lark.android.passport.biz.compat.web.jsbridge.C64565b;
import com.ss.lark.android.passport.biz.compat.web.jsbridge.C64566c;
import com.ss.lark.android.passport.biz.compat.web.jsbridge.C64570e;
import com.ss.lark.android.passport.biz.compat.web.jsbridge.CopyTextHandler;
import com.ss.lark.android.passport.biz.compat.web.jsbridge.HideNavigationBackJsHandler;
import com.ss.lark.android.passport.biz.compat.web.jsbridge.LogJsHandler;
import com.ss.lark.android.passport.biz.compat.web.jsbridge.OpenUrlJsHandler;
import com.ss.lark.android.passport.biz.compat.web.jsbridge.TeaStatisticsErrorJsHandler;
import com.ss.lark.android.passport.biz.compat.web.jsbridge.TeaStatisticsJsHandler;
import java.util.ArrayList;
import java.util.List;

public class WebViewActivity extends BaseActivity implements AbstractC64547a, C64554d.AbstractC64563a, AbstractC64569d {

    /* renamed from: h */
    public C64554d f162946h;

    /* renamed from: i */
    protected boolean f162947i;

    /* renamed from: j */
    protected boolean f162948j;

    @Override // com.ss.lark.android.passport.biz.compat.web.AbstractC64547a
    /* renamed from: a */
    public void mo170967a() {
        this.f162947i = true;
    }

    @Override // com.ss.lark.android.passport.biz.compat.web.C64554d.AbstractC64563a
    /* renamed from: a */
    public boolean mo223247a(WebView webView, boolean z, int i) {
        return false;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: i */
    public boolean mo171137i() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.fragment.app.FragmentActivity
    public void onPause() {
        super.onPause();
        C49266a.m194145a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        C49266a.m194149b();
    }

    @Override // com.ss.lark.android.passport.biz.compat.web.AbstractC64547a
    /* renamed from: b */
    public void mo170969b() {
        C49194j.m193951a(false, new AbstractC49392e() {
            /* class com.ss.lark.android.passport.biz.compat.web.WebViewActivity.C645461 */

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
            /* renamed from: a */
            public void mo171341a(String str) {
                WebViewActivity.this.f162946h.mo223267a("onDeviceInfo", C49073c.m193390a(str));
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
            /* renamed from: b */
            public void mo171342b(String str) {
                WebViewActivity.this.f123052c.mo171471d("openCreateTeam-getDeviceId", str);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public void onBackPressed() {
        if (this.f162947i) {
            this.f162946h.mo223267a("onNativeWindowBack", (Object) 0);
        } else if (!this.f162946h.mo223275g()) {
            super.onBackPressed();
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.web.jsbridge.AbstractC64569d
    /* renamed from: c */
    public List<AbstractC64564a> mo170970c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C64570e(this));
        arrayList.add(new HideNavigationBackJsHandler(this));
        arrayList.add(new OpenUrlJsHandler(this));
        arrayList.add(new C64565b(this));
        arrayList.add(new CopyTextHandler(this));
        arrayList.add(new LogJsHandler());
        arrayList.add(new TeaStatisticsJsHandler());
        arrayList.add(new TeaStatisticsErrorJsHandler());
        arrayList.add(new C64566c(this));
        return arrayList;
    }

    @Override // com.ss.lark.android.passport.biz.compat.web.AbstractC64547a
    /* renamed from: a */
    public void mo223246a(boolean z) {
        this.f162946h.mo223268a(z, true);
    }

    /* renamed from: a */
    private void m253604a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("url", "");
            if (bundle.getBoolean("titlebg", true)) {
                try {
                    Uri.parse(string).getQueryParameter("lark_nav_bgcolor");
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    private Bundle m253605b(Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return extras;
        }
        return new Bundle();
    }

    @Override // com.ss.lark.android.passport.biz.compat.web.AbstractC64547a
    public void onLeftBtnClick(View view) {
        if (this.f162947i) {
            this.f162946h.mo223267a("onNativeWindowBack", (Object) 1);
        } else if (!this.f162946h.mo223275g()) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CookieSyncManager.createInstance(this);
        setContentView(R.layout.signin_sdk_activity);
        Bundle b = m253605b(getIntent());
        b.putBoolean("can_go_back", true);
        b.putBoolean("enable_progressbar", this.f162948j);
        C64554d dVar = (C64554d) Fragment.instantiate(this, C64554d.class.getName(), b);
        this.f162946h = dVar;
        dVar.mo223265a((C64554d.AbstractC64563a) this);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, this.f162946h).commit();
        m253604a(b);
        PassportLog passportLog = this.f123052c;
        passportLog.mo171465b("WebViewActivity", getClass().getSimpleName() + " onCreate");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
