package com.ss.android.lark.mail.impl.message.p2207g;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.lark.pb.email.client.v1.MailUnsubscribeResponse;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.C25707a;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;

/* renamed from: com.ss.android.lark.mail.impl.message.g.a */
public class C42936a {
    /* renamed from: a */
    public static boolean m170980a() {
        return true;
    }

    /* renamed from: a */
    public static void m170978a(final Context context) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.p2207g.C42936a.RunnableC429404 */

            public void run() {
                C25707a newGlobal = LKUIToast.newGlobal(context, (int) R.drawable.mail_ic_toast_success, C43819s.m173684a((int) R.string.Mail_Unsubscribe_Done));
                newGlobal.mo90190b(0);
                newGlobal.mo90191c();
            }
        });
    }

    /* renamed from: b */
    public static void m170981b(final Context context) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.p2207g.C42936a.RunnableC429415 */

            public void run() {
                C25707a newGlobal = LKUIToast.newGlobal(context, (int) R.drawable.mail_ic_toast_fail, C43819s.m173684a((int) R.string.Mail_Unsubscribe_Failed));
                newGlobal.mo90190b(0);
                newGlobal.mo90191c();
                C42209j.m168612a("read_unsubscribte_fail", "toast");
            }
        });
    }

    /* renamed from: a */
    private static String m170977a(MailMessage mailMessage) {
        int a = mailMessage.mo151557J().mo151969a();
        int i = R.string.Mail_Unsubscribe_DescOne;
        if (!(a == 1 || a == 2 || a != 3)) {
            i = R.string.Mail_Unsubscribe_DescTwo;
        }
        return C43819s.m173686a(i, "emailalias", mailMessage.mo151586c().mo151180d());
    }

    /* renamed from: c */
    private static void m170983c(final Context context, final MailMessage mailMessage) {
        C42176e.m168344a().mo152212a(mailMessage.mo151581b(), mailMessage.mo151627z(), false, (IGetDataCallback<MailUnsubscribeResponse>) new IGetDataCallback<MailUnsubscribeResponse>() {
            /* class com.ss.android.lark.mail.impl.message.p2207g.C42936a.C429393 */

            /* renamed from: a */
            public void onSuccess(MailUnsubscribeResponse mailUnsubscribeResponse) {
                C42187a.m168484a(mailMessage.mo151627z(), mailMessage.mo151581b(), 0, "yes");
                C42936a.m170978a(context);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("UnsubscribeHelperActivity", "executeUnsubscribe ERROR_DEBUG: " + errorResult.getDebugMsg() + " ERROR_MSG: " + errorResult.getDisplayMsg());
                C42187a.m168484a(mailMessage.mo151627z(), mailMessage.mo151581b(), 0, "no");
                C42936a.m170981b(context);
            }
        });
    }

    /* renamed from: b */
    public static void m170982b(Context context, MailMessage mailMessage) {
        Log.m165389i("UnsubscribeHelperActivity", "startUnsubscribe MESSAGEID: " + mailMessage.mo151581b() + " UNSUBSCRIBE_TYPE: " + mailMessage.mo151557J().mo151969a());
        int a = mailMessage.mo151557J().mo151969a();
        if (a == 1 || a == 2) {
            m170983c(context, mailMessage);
        } else if (a == 3) {
            m170984d(context, mailMessage);
        }
    }

    /* renamed from: d */
    private static void m170984d(Context context, MailMessage mailMessage) {
        if (mailMessage.mo151557J().mo151972b().equals("")) {
            Log.m165383e("UnsubscribeHelperActivity", "redirectToUrl Could not retrieve redirect url");
            C42187a.m168484a(mailMessage.mo151627z(), mailMessage.mo151581b(), 0, "no");
            m170981b(context);
            return;
        }
        C42187a.m168484a(mailMessage.mo151627z(), mailMessage.mo151581b(), 0, "yes");
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(mailMessage.mo151557J().mo151972b())));
    }

    /* renamed from: a */
    public static void m170979a(final Context context, final MailMessage mailMessage) {
        String a = m170977a(mailMessage);
        C25639g gVar = new C25639g(context);
        gVar.mo89248g(R.string.Mail_Unsubscribe_Name).mo89250i(R.color.text_title).mo89252k(3).mo89249h(17).mo89253l(3).mo89245d(0.3f).mo89256o(R.color.text_title).mo89242c(a).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_left);
        aVar.mo89269b(R.string.Mail_Alert_Cancel);
        aVar.mo89272e(context.getResources().getColor(R.color.text_title));
        aVar.mo89270c(17);
        aVar.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.message.p2207g.C42936a.DialogInterface$OnClickListenerC429371 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        C25639g.C25640a aVar2 = new C25639g.C25640a();
        aVar2.mo89266a(R.id.lkui_dialog_btn_right);
        aVar2.mo89269b(R.string.Mail_Unsubscribe_Name);
        aVar2.mo89272e(context.getResources().getColor(R.color.primary_pri_500));
        aVar2.mo89270c(17);
        aVar2.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.message.p2207g.C42936a.DialogInterface$OnClickListenerC429382 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                MailMessage mailMessage = mailMessage;
                if (mailMessage != null) {
                    C42936a.m170982b(context, mailMessage);
                }
            }
        });
        gVar.mo89229a(aVar).mo89229a(aVar2);
        gVar.mo89239c();
    }
}
