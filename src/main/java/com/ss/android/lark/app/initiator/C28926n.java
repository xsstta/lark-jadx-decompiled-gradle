package com.ss.android.lark.app.initiator;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.webkit.WebView;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.C36420d;
import com.ss.android.lark.C36888e;
import com.ss.android.lark.app.taskv2.central.InitFeatureGatingTask;
import com.ss.android.lark.app.taskv2.central.InitLogTask;
import com.ss.android.lark.base.C29517a;
import com.ss.android.lark.integrator.p1999b.C39125b;

/* renamed from: com.ss.android.lark.app.initiator.n */
public class C28926n implements AbstractC28914d {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m106028a() {
        return "";
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: a */
    public void mo102660a(Configuration configuration) {
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: b */
    public void mo102661b(Context context) {
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: b */
    public void mo102662b(Configuration configuration) {
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: d */
    public void mo102664d(Context context) {
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: a */
    public void mo102659a(Context context) {
        new InitLogTask().mo43817a(context);
        new InitFeatureGatingTask().mo43817a(context);
        C36888e.m145599a(context, $$Lambda$n$pWmTdOGP6131EvEOaFdYqW8hE.INSTANCE, new C36420d(1));
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: c */
    public void mo102663c(Context context) {
        C39125b.m154428a(context);
        C29517a.m108725a(new C29517a.AbstractC29519b() {
            /* class com.ss.android.lark.app.initiator.C28926n.C289271 */

            @Override // com.ss.android.lark.base.C29517a.AbstractC29519b
            /* renamed from: a */
            public void mo102665a(Activity activity, int i) {
                if (RomUtils.m94934a(activity, activity.getWindow())) {
                    StatusBarUtil.setColorNoTranslucent(activity, i);
                }
            }

            @Override // com.ss.android.lark.base.C29517a.AbstractC29519b
            /* renamed from: b */
            public void mo102666b(Activity activity, int i) {
                if (RomUtils.m94941b(activity, activity.getWindow())) {
                    StatusBarUtil.setColorNoTranslucent(activity, i);
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(C26252ad.m94992a(context));
        }
    }
}
