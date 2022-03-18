package com.ss.android.lark.integrator.helpdesk;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.helpdesk.C38732a;
import com.ss.android.lark.helpdesk.p1949a.AbstractC38736a;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import java.util.Locale;

/* renamed from: com.ss.android.lark.integrator.helpdesk.a */
public class C39421a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.helpdesk.a$a */
    public static class C39423a {

        /* renamed from: a */
        public static final AbstractC38736a f100775a = C39421a.m155662a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C38732a m155663a() {
        return new C38732a(C39423a.f100775a);
    }

    /* renamed from: a */
    public static AbstractC38736a m155662a(final Context context) {
        final ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        return new AbstractC38736a() {
            /* class com.ss.android.lark.integrator.helpdesk.C39421a.C394221 */

            @Override // com.ss.android.lark.helpdesk.p1949a.AbstractC38736a
            /* renamed from: a */
            public Context mo141943a() {
                return context;
            }

            @Override // com.ss.android.lark.helpdesk.p1949a.AbstractC38736a
            /* renamed from: c */
            public Locale mo141950c() {
                return iCoreApi.getLanguageSetting();
            }

            @Override // com.ss.android.lark.helpdesk.p1949a.AbstractC38736a
            /* renamed from: b */
            public String mo141948b() {
                return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
            }

            @Override // com.ss.android.lark.helpdesk.p1949a.AbstractC38736a
            /* renamed from: a */
            public boolean mo141947a(String str) {
                return C37239a.m146648b().mo136951a(str);
            }

            @Override // com.ss.android.lark.helpdesk.p1949a.AbstractC38736a
            /* renamed from: b */
            public void mo141949b(Context context, String str) {
                iCoreApi.openUrl(context, str);
            }

            @Override // com.ss.android.lark.helpdesk.p1949a.AbstractC38736a
            /* renamed from: a */
            public void mo141944a(Context context, String str) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).openChat(context, ChatBundle.m109259a().mo105927a(str).mo105933c("router_activity").mo105923a(ChatBundle.SourceType.PROFILE).mo105929a());
            }

            @Override // com.ss.android.lark.helpdesk.p1949a.AbstractC38736a
            /* renamed from: a */
            public void mo141945a(String str, String str2, String str3, IGetDataCallback<String> iGetDataCallback) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).getOnCallChatId(str, str2, str3, iGetDataCallback);
            }

            @Override // com.ss.android.lark.helpdesk.p1949a.AbstractC38736a
            /* renamed from: a */
            public void mo141946a(String str, String str2, String str3, String str4, IGetDataCallback<String> iGetDataCallback) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).getOnCallChatId(str, str2, str3, str4, iGetDataCallback);
            }
        };
    }
}
