package com.ss.lark.android.passport.biz.feature.company_login;

import android.app.Activity;
import android.content.DialogInterface;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.UDDialogUtils;
import com.ss.lark.android.passport.biz.C64340b;

/* renamed from: com.ss.lark.android.passport.biz.feature.company_login.a */
public class C64680a {
    /* renamed from: a */
    public static void m254114a(Activity activity, String str) {
        PassportLog a = PassportLog.f123351c.mo171474a();
        a.mo171465b("ErrorCompanyDialogUtil", "message: " + str);
        C49096b.m193610v();
        UDDialogBuilder eVar = new UDDialogBuilder(activity);
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(R.string.Lark_Login_IdP_noticetitle)).titleBold(true)).cancelable(false)).cancelOnTouchOutside(false)).message(UDDialogUtils.m193819a(str))).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Login_IdP_noticeconfirm, new DialogInterface.OnClickListener(activity) {
            /* class com.ss.lark.android.passport.biz.feature.company_login.$$Lambda$a$N9PSDKYJloVsYNHHondvr9JFJdM */
            public final /* synthetic */ Activity f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C64680a.m254113a(this.f$0, dialogInterface, i);
            }
        });
        eVar.build().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m254113a(Activity activity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        activity.finish();
        ServiceFinder.m193763r().getKaIdp().mo171893b(C64340b.m252955a().mo222860b());
        C49096b.m193611w();
    }
}
