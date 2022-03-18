package com.ss.android.lark.security.account;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49402q;
import com.ss.android.lark.security.verify.VerifySecurityPasswordActivity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.security.account.a */
public class C54058a {

    /* renamed from: a */
    private Map<String, AbstractC49402q> f133859a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.security.account.a$a */
    public static final class C54060a {

        /* renamed from: a */
        public static final C54058a f133860a = new C54058a();
    }

    /* renamed from: a */
    public static C54058a m209797a() {
        return C54060a.f133860a;
    }

    private C54058a() {
        this.f133859a = new HashMap();
    }

    /* renamed from: a */
    public void mo185062a(Activity activity, String str, String str2) {
        AbstractC49402q qVar;
        if (activity != null && this.f133859a.containsKey(str2) && (qVar = this.f133859a.get(str2)) != null) {
            qVar.handleResult(activity, str);
            this.f133859a.remove(str2);
        }
    }

    /* renamed from: a */
    public void mo185063a(Context context, String str, String str2, AbstractC49402q qVar) {
        if (qVar != null) {
            this.f133859a.put(str2, qVar);
        }
        VerifySecurityPasswordActivity.m209860a(context, str, str2);
    }
}
