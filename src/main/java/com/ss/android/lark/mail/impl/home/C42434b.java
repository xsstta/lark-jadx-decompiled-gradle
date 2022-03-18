package com.ss.android.lark.mail.impl.home;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.StorageLimitNotify;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.suite.R;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.settings.appconfig.MailCapacityLimitConfig;
import com.ss.android.lark.mail.impl.utils.C43771m;

/* renamed from: com.ss.android.lark.mail.impl.home.b */
public class C42434b {
    /* renamed from: a */
    public static boolean m169442a(Context context) {
        StorageLimitNotify b = C43350d.m172098a().mo155021M().mo5927b();
        if (b == null || !b.enable.booleanValue() || b.limit.intValue() != 100) {
            return false;
        }
        if (b.isAdmin.booleanValue()) {
            C43771m.m173503a(context, (int) R.string.Mail_Billing_FullUpgradePlan, (int) R.string.Mail_Billing_Later, (int) R.color.text_title, (int) R.string.Mail_Billing_ContactServiceConsultant, (int) R.color.primary_pri_500, (DialogInterface.OnClickListener) null, new DialogInterface.OnClickListener(context) {
                /* class com.ss.android.lark.mail.impl.home.$$Lambda$b$9dHapgnmJqdDnl1JOgWVAZ3C5X4 */
                public final /* synthetic */ Context f$0;

                {
                    this.f$0 = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C42434b.m169441a(this.f$0, dialogInterface, i);
                }
            }).mo89239c();
            return true;
        }
        C43771m.m173504a(context, R.string.Mail_Billing_StorageFullServiceSuspendContactAdmin, R.string.Mail_Billing_GotIt, R.color.text_title, null).mo89239c();
        return true;
    }

    /* renamed from: a */
    public static void m169439a(Context context, DialogInterface.OnClickListener onClickListener) {
        C43771m.m173503a(context, (int) R.string.Mail_ThreadList_MarkAllAsReadAlert, (int) R.string.Mail_Alert_Cancel, (int) R.color.text_title, (int) R.string.Mail_Alert_OK, (int) R.color.primary_pri_500, (DialogInterface.OnClickListener) null, onClickListener).mo89239c();
    }

    /* renamed from: b */
    public static void m169443b(Context context, DialogInterface.OnClickListener onClickListener) {
        C43771m.m173503a(context, (int) R.string.Mail_Alert_DeleteDraftConfirmation, (int) R.string.Mail_Alert_Cancel, (int) R.color.text_title, (int) R.string.Mail_Alert_Discard, (int) R.color.primary_pri_500, (DialogInterface.OnClickListener) null, onClickListener).mo89239c();
    }

    /* renamed from: c */
    public static void m169444c(Context context, DialogInterface.OnClickListener onClickListener) {
        C43771m.m173503a(context, (int) R.string.Mail_ThreadAction_DeleteForeverConfirm, (int) R.string.Mail_Alert_Cancel, (int) R.color.text_title, (int) R.string.Mail_CustomLabels_Remove, (int) R.color.function_danger_500, (DialogInterface.OnClickListener) null, onClickListener).mo89239c();
    }

    /* renamed from: d */
    public static void m169445d(Context context, DialogInterface.OnClickListener onClickListener) {
        C43771m.m173503a(context, (int) R.string.Mail_SendLater_CancelScheduledAlert, (int) R.string.Mail_SendLater_AlertBack, (int) R.color.text_title, (int) R.string.Mail_SendLater_AlertCancelAll, (int) R.color.function_danger_500, (DialogInterface.OnClickListener) null, onClickListener).mo89239c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m169441a(Context context, DialogInterface dialogInterface, int i) {
        SettingManager.getInstance().get(MailCapacityLimitConfig.class, new IGetDataCallback<MailCapacityLimitConfig>(context) {
            /* class com.ss.android.lark.mail.impl.home.C42434b.C424351 */

            /* renamed from: a */
            String f108037a;

            /* renamed from: b */
            final /* synthetic */ Context f108038b;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C42699a.m170291j(this.f108038b, this.f108037a);
            }

            /* renamed from: a */
            public void onSuccess(MailCapacityLimitConfig mailCapacityLimitConfig) {
                String str = mailCapacityLimitConfig.f110280a;
                if (TextUtils.isEmpty(str)) {
                    str = this.f108037a;
                }
                C42699a.m170291j(this.f108038b, str);
            }

            {
                String str;
                this.f108038b = r1;
                if (C26284k.m95186b(r1)) {
                    str = "https://applink.feishu.cn/client/helpdesk/open?id=6934871265543159828&extra=%7B%22channel%22%3A14%2C%22created_at%22%3A1617246713%2C%22human_service%22%3Atrue%2C%22scenario_id%22%3A6937491551345967123%2C%22signature%22%3A%229df9ed53d1cd7fd62be8055f37ab2f8b8cf71583%22%7D";
                } else {
                    str = "https://applink.feishu.cn/client/helpdesk/open?id=6626260912531570952&extra=%7B%22channel%22%3A14%2C%22created_at%22%3A1616898084%2C%22human_service%22%3Atrue%2C%22scenario_id%22%3A6888204905589325826%2C%22signature%22%3A%2278b0c5156b727a66d02c9b689ea0785d1a865bb5%22%7D";
                }
                this.f108037a = str;
            }
        });
    }

    /* renamed from: a */
    public static void m169440a(Context context, DialogInterface.OnClickListener onClickListener, int i) {
        C43771m.m173503a(context, i, (int) R.string.Mail_ThreadList_EmptyCancel, (int) R.color.text_title, (int) R.string.Mail_ThreadList_EmptyConfirm, (int) R.color.function_danger_500, (DialogInterface.OnClickListener) null, onClickListener).mo89239c();
    }
}
