package com.ss.android.lark.helpdesk;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.suite.R;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.chat.entity.helpdesk.KbTopExtendControl;
import com.ss.android.lark.helpdesk.kbtopextend.KbTopExtendHandler;
import com.ss.android.lark.helpdesk.manis.HelpdeskIpc;
import com.ss.android.lark.helpdesk.p1949a.AbstractC38736a;
import com.ss.android.lark.log.Log;
import ee.android.framework.manis.C68183b;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.ss.android.lark.helpdesk.a */
public class C38732a {

    /* renamed from: a */
    public static volatile AbstractC38736a f99626a;

    /* renamed from: a */
    public static AbstractC38736a m152977a() {
        return f99626a;
    }

    /* renamed from: c */
    public void mo141940c() {
        KbTopExtendHandler.f99686b.mo142049g();
    }

    /* renamed from: b */
    public void mo141939b() {
        KbTopExtendHandler.f99686b.mo142048f();
    }

    public C38732a(AbstractC38736a aVar) {
        f99626a = aVar;
    }

    /* renamed from: b */
    public View mo141938b(Context context) {
        return KbTopExtendHandler.f99686b.mo142038a();
    }

    /* renamed from: a */
    public Map<String, AbstractC29186b> mo141934a(Context context) {
        return Collections.singletonMap("/client/helpdesk/open", new AbstractC29186b() {
            /* class com.ss.android.lark.helpdesk.C38732a.C387353 */

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: a */
            public boolean mo103482a() {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: d */
            public boolean mo103484d(Context context, AppLink appLink) {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: c */
            public boolean mo103483c(Context context, AppLink appLink) {
                String a = appLink.mo103435a();
                Log.m165389i("HelpdeskModule", "applink handle url: " + a);
                Uri parse = Uri.parse(a);
                String queryParameter = parse.getQueryParameter("id");
                String queryParameter2 = parse.getQueryParameter("extra");
                String queryParameter3 = parse.getQueryParameter("faqId");
                String b = C38732a.f99626a.mo141948b();
                Log.m165389i("HelpdeskModule", "applink faqId: " + queryParameter3);
                if (b == null || queryParameter == null) {
                    return true;
                }
                if (!C26252ad.m94993b(context)) {
                    HelpdeskIpc helpdeskIpc = (HelpdeskIpc) C68183b.m264839a().mo237086a(context, HelpdeskIpc.class);
                    if (helpdeskIpc == null) {
                        Log.m165383e("HelpdeskModule", "HelpdeskIpc is null");
                        return true;
                    } else if (!C38732a.f99626a.mo141947a("helpdesk.applink.faqid.disable")) {
                        helpdeskIpc.openOncallChatId(b, queryParameter, queryParameter2, queryParameter3);
                        return true;
                    } else {
                        helpdeskIpc.openOncallChatId(b, queryParameter, queryParameter2);
                        return true;
                    }
                } else if (!C38732a.f99626a.mo141947a("helpdesk.applink.faqid.disable")) {
                    C38732a.m152979a(context, b, queryParameter, queryParameter2, queryParameter3);
                    return true;
                } else {
                    C38732a.m152978a(context, b, queryParameter, queryParameter2);
                    return true;
                }
            }
        });
    }

    /* renamed from: a */
    public void mo141935a(Context context, String str) {
        KbTopExtendHandler.f99686b.mo142039a(context, str);
    }

    /* renamed from: a */
    public void mo141936a(KbTopExtendControl aVar, Context context) {
        KbTopExtendHandler.f99686b.mo142040a(aVar, context);
    }

    /* renamed from: a */
    public static void m152978a(final Context context, String str, String str2, String str3) {
        f99626a.mo141945a(str, str2, str3, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.helpdesk.C38732a.C387331 */

            /* renamed from: a */
            public void onSuccess(String str) {
                Log.m165389i("HelpdeskModule", "getOnCallChatId success");
                if (str != null && !str.isEmpty()) {
                    C38732a.f99626a.mo141944a(context, str);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("HelpdeskModule", "getOnCallChatId failed, err: " + errorResult.toString());
                LKUIToast.show(context, errorResult.getDisplayMsg(C38732a.f99626a.mo141943a().getString(R.string.Lark_Legacy_ErrorMessageTip)));
            }
        });
    }

    /* renamed from: a */
    public void mo141937a(String str, int i, int i2, String str2) {
        KbTopExtendHandler.f99686b.mo142042a(str, i, i2, str2, f99626a.mo141948b());
    }

    /* renamed from: a */
    public static void m152979a(final Context context, String str, String str2, String str3, String str4) {
        f99626a.mo141946a(str, str2, str3, str4, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.helpdesk.C38732a.C387342 */

            /* renamed from: a */
            public void onSuccess(String str) {
                Log.m165389i("HelpdeskModule", "getOnCallChatId success");
                if (str != null && !str.isEmpty()) {
                    C38732a.f99626a.mo141944a(context, str);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("HelpdeskModule", "getOnCallChatId failed, err: " + errorResult.toString());
                LKUIToast.show(context, errorResult.getDisplayMsg(C38732a.f99626a.mo141943a().getString(R.string.Lark_Legacy_ErrorMessageTip)));
            }
        });
    }
}
