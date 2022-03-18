package com.ss.android.lark.mail.impl.view.p2225a;

import android.app.Activity;
import android.content.Context;
import com.larksuite.component.ui.p1153e.C25655d;
import com.larksuite.component.universe_design.loading.UDLoadingDrawable;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.component.universe_design.toast.UDToastImpl;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;

/* renamed from: com.ss.android.lark.mail.impl.view.a.a */
public class C43909a {

    /* renamed from: e */
    private static int f111395e;

    /* renamed from: a */
    private final String f111396a = "LoadingToast";

    /* renamed from: b */
    private Context f111397b;

    /* renamed from: c */
    private final long f111398c = 2147483647L;

    /* renamed from: d */
    private UDToastImpl f111399d;

    /* renamed from: c */
    private void m174023c() {
        m174025e();
    }

    /* renamed from: b */
    public boolean mo156328b() {
        UDToastImpl dVar = this.f111399d;
        if (dVar != null) {
            return dVar.mo91668c();
        }
        return false;
    }

    /* renamed from: a */
    public void mo156326a() {
        Log.m165389i("LoadingToast", "dismiss");
        if (this.f111399d != null && m174024d()) {
            this.f111399d.cancel();
            this.f111399d = null;
        }
    }

    /* renamed from: d */
    private boolean m174024d() {
        Context context = this.f111397b;
        if (context == null || !(context instanceof Activity)) {
            return true;
        }
        if (!((Activity) context).isDestroyed() && !((Activity) this.f111397b).isFinishing()) {
            return true;
        }
        Log.m165383e("LoadingToast", "checkAvailability, activity not available");
        return false;
    }

    /* renamed from: e */
    private void m174025e() {
        if (f111395e == 0) {
            Context b = C41816b.m166115a().mo150132b();
            int b2 = ((int) (((double) C25655d.m91902a(b).mo89314b()) * 0.191904047976012d)) - C25655d.m91903b(b);
            f111395e = b2;
            if (b2 <= 0) {
                f111395e = this.f111397b.getResources().getDimensionPixelSize(R.dimen.mail_bottom_hint_margin);
            }
        }
    }

    public C43909a(Context context) {
        this.f111397b = context;
        m174023c();
    }

    /* renamed from: a */
    public void mo156327a(String str) {
        Log.m165389i("LoadingToast", "show");
        if (m174024d()) {
            UDToastImpl j = UDToast.build(this.f111397b).mo91643a(str).mo91641a(new UDLoadingDrawable(this.f111397b)).mo91640a(2147483647L).mo91638a(81, 0, f111395e).mo91655j();
            this.f111399d = j;
            MailToast.m173699a(j);
        }
    }
}
