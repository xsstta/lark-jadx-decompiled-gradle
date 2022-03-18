package com.ss.android.lark.mail.impl.home.p2178a;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Pair;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43340b;
import com.ss.android.lark.mail.impl.utils.C43771m;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.mail.impl.home.a.c */
public class C42365c {

    /* renamed from: a */
    private String f107843a;

    /* renamed from: b */
    private Pair<Long, DialogC25637f> f107844b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.home.a.c$a */
    public static class C42367a {

        /* renamed from: a */
        static final C42365c f107848a = new C42365c();
    }

    private C42365c() {
    }

    /* renamed from: a */
    public static final C42365c m169155a() {
        return C42367a.f107848a;
    }

    /* renamed from: a */
    public DialogC25637f mo152525a(Context context, String str, C42093e eVar, final boolean z, long j, final DialogInterface.OnClickListener onClickListener) {
        String str2;
        Pair<Long, DialogC25637f> pair = this.f107844b;
        if (pair == null || j >= ((Long) pair.first).longValue() || !TextUtils.equals(this.f107843a, str)) {
            if (this.f107844b != null) {
                Log.m165389i("AccountListDialogHelper", "SharedAccountChangeDialog | hide the showing dialog");
                ((DialogC25637f) this.f107844b.second).dismiss();
            }
            if (z) {
                HashMap hashMap = new HashMap();
                hashMap.put("Name", eVar.mo151853d());
                hashMap.put("emailAddress", eVar.mo151855e());
                str2 = C43819s.m173687a((int) R.string.Mail_SharedEmail_SharedEmailNotificationCardDesc, hashMap);
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("Name", eVar.mo151853d());
                hashMap2.put("emailAddress", eVar.mo151855e());
                str2 = UIHelper.mustacheFormat((int) R.string.Mail_SharedEmail_PermissionRecycledDesc, hashMap2);
            }
            DialogC25637f c = C43771m.m173504a(context, R.string.Mail_SharedEmail_PermissionRecycledDesc, R.string.Mail_Alert_OK, R.color.primary_pri_500, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.home.p2178a.C42365c.DialogInterface$OnClickListenerC423661 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    if (z) {
                        ((AbstractC43340b) Watchers.m167205a(AbstractC43340b.class)).mo152807f();
                    }
                    DialogInterface.OnClickListener onClickListener = onClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(dialogInterface, i);
                    }
                }
            }).mo89237b(UIHelper.getString(R.string.Mail_SharedEmail_SharedEmailNotificationCardTitle)).mo89242c(str2).mo89246d(false).mo89239c();
            this.f107843a = str;
            this.f107844b = new Pair<>(Long.valueOf(j), c);
            return c;
        }
        Log.m165389i("AccountListDialogHelper", "SharedAccountChangeDialog | ignore the execute with the smaller priority");
        return null;
    }
}
