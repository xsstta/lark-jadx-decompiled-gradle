package com.ss.lark.android.passport.biz.widget;

import android.app.Activity;
import android.content.DialogInterface;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49148ac;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.lark.android.passport.biz.widget.C65297d;

/* renamed from: com.ss.lark.android.passport.biz.widget.d */
public class C65297d {
    /* renamed from: b */
    public void mo224650b(final User user, final PassportLog passportLog) {
        ServiceFinder.m193752g().getLastTopActivity(new IGetDataCallback<Activity>() {
            /* class com.ss.lark.android.passport.biz.widget.C65297d.C652992 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                passportLog.mo171471d("ShowExcludeDialog", "getTopActivity onError");
            }

            /* renamed from: a */
            public void onSuccess(Activity activity) {
                String str;
                if (user.tenant == null) {
                    str = "";
                } else {
                    str = user.tenant.name;
                }
                ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(activity).titleBold(true)).message(C49154ag.m193831a(activity, (int) R.string.Lark_Passport_MultipleAccount_ManualLogoutPopup, "TenantName", str, passportLog))).addActionButton(R.id.ud_dialog_btn_primary, activity.getString(R.string.Lark_Passport_MultipleAccount_ManualLogoutPopup_GotButton), new DialogInterface.OnClickListener() {
                    /* class com.ss.lark.android.passport.biz.widget.$$Lambda$d$2$_NIgmiJCQ54854h6ZiZ_QaPTR8 */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C65297d.C652992.m256224a(PassportLog.this, dialogInterface, i);
                    }
                })).show();
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m256224a(PassportLog passportLog, DialogInterface dialogInterface, int i) {
                passportLog.mo171465b("ShowExcludeDialog", "showExcludeLoginDialog, Exclude login cancel");
                dialogInterface.dismiss();
            }
        });
    }

    /* renamed from: a */
    public void mo224649a(final User user, final PassportLog passportLog) {
        passportLog.mo171465b("ShowExcludeDialog", "ForegroundUser is exclude login");
        if (user == null) {
            passportLog.mo171471d("ShowExcludeDialog", "foregroundUser is null");
        } else {
            C49148ac.m193807a(new Runnable() {
                /* class com.ss.lark.android.passport.biz.widget.C65297d.RunnableC652981 */

                public void run() {
                    C65297d.this.mo224650b(user, passportLog);
                }
            }, 100);
        }
    }

    /* renamed from: c */
    public void mo224651c(final User user, final PassportLog passportLog) {
        if (user == null) {
            passportLog.mo171471d("ShowExcludeDialog", "switchExcludeLoginDialog, foregroundUser is null");
        } else {
            ServiceFinder.m193752g().getLastTopActivity(new IGetDataCallback<Activity>() {
                /* class com.ss.lark.android.passport.biz.widget.C65297d.C653003 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    passportLog.mo171471d("ShowExcludeDialog", "getTopActivity onError");
                }

                /* renamed from: a */
                public void onSuccess(Activity activity) {
                    String str;
                    if (user.tenant == null) {
                        str = "";
                    } else {
                        str = user.tenant.name;
                    }
                    ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(activity).titleBold(true)).message(C49154ag.m193831a(activity, (int) R.string.Lark_Passport_MultipleAccount_JoinAutoLogoutPopup, "TenantName", str, passportLog))).addActionButton(R.id.ud_dialog_btn_primary, activity.getString(R.string.Lark_Passport_MultipleAccount_JoinAutoLogoutPopupButton), new DialogInterface.OnClickListener() {
                        /* class com.ss.lark.android.passport.biz.widget.$$Lambda$d$3$HxPh1eJDCr_WxoUU92btChP1ezQ */

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C65297d.C653003.m256226a(PassportLog.this, dialogInterface, i);
                        }
                    })).show();
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m256226a(PassportLog passportLog, DialogInterface dialogInterface, int i) {
                    passportLog.mo171465b("ShowExcludeDialog", "switchExcludeLoginDialog, Exclude login cancel");
                    dialogInterface.dismiss();
                }
            });
        }
    }
}
