package com.ss.android.lark.mail.impl.message.framework;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2171h.p2177e.C42351b;
import com.ss.android.lark.mail.impl.p2171h.p2177e.C42352c;
import com.ss.android.lark.mail.impl.utils.C43767j;
import com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar;

/* renamed from: com.ss.android.lark.mail.impl.message.framework.a */
public abstract class AbstractC42924a {

    /* renamed from: a */
    protected Context f109327a;

    /* renamed from: b */
    protected RelativeLayout f109328b;

    /* renamed from: c */
    public OperationTitleBar f109329c;

    /* renamed from: d */
    protected View f109330d;

    /* renamed from: e */
    protected String f109331e;

    /* renamed from: a */
    public void mo154003a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo154006b(Bundle bundle, Context context);

    /* renamed from: d */
    public void mo154008d() {
    }

    /* renamed from: e */
    public void mo154009e() {
    }

    /* renamed from: b */
    public RelativeLayout mo154005b() {
        return this.f109328b;
    }

    /* renamed from: f */
    public String mo154010f() {
        return C42187a.C42190b.f107399b;
    }

    /* renamed from: c */
    public void mo154007c() {
        ((C42351b) C42344d.m169091a(C42351b.class, this.f109327a)).mo152473j();
        ((C42352c) C42344d.m169091a(C42352c.class, this.f109327a)).mo152473j();
        mo154008d();
        mo154009e();
    }

    /* renamed from: a */
    public void mo154004a(Bundle bundle, Context context) {
        Log.m165389i("BaseMessageListContainer", "testFirstFrame BaseMessageListContainer onCreate");
        this.f109327a = context;
        if (bundle == null) {
            C41816b.m166115a().mo150114D().mo150182b("email_page_intent_error", C43767j.m173489a().mo155933a("pageName", mo154010f()).mo155933a("error", "extras null").mo155934a());
            mo154007c();
            return;
        }
        mo154006b(bundle, context);
        mo154003a();
    }
}
