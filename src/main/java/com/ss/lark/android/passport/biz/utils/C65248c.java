package com.ss.lark.android.passport.biz.utils;

import android.text.TextUtils;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.larksuite.framework.http.p1191f.C26005c;
import com.larksuite.framework.http.response.C26014a;
import com.ss.android.lark.passport.infra.constants.C49112a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.SessionInfo;
import com.ss.android.lark.utils.LarkContext;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.utils.c */
public class C65248c {

    /* renamed from: a */
    private static final PassportLog f164314a = PassportLog.f123351c.mo171474a();

    /* renamed from: a */
    public static void m256137a() {
        try {
            ServiceFinder.m193752g().getLarkHttpClient().mo92415a(LarkContext.getApplication());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m256138a(String str, List<? extends SessionInfo> list) {
        AbstractC25990b larkHttpClient = ServiceFinder.m193752g().getLarkHttpClient();
        String str2 = C49112a.f123325a;
        String format = String.format(str2, "https://" + ServiceFinder.m193751f().getApiHost());
        String a = C26005c.m94126a(format);
        C26014a.C26015a aVar = new C26014a.C26015a();
        aVar.mo92517c(a).mo92518d("/").mo92514b().mo92512a(253402300799999L).mo92513a("session").mo92515b(str);
        PassportLog passportLog = f164314a;
        passportLog.mo171465b("HttpCookieUtil", "save cookie domain = " + a + " name = session");
        C26014a d = aVar.mo92519d();
        ArrayList arrayList = new ArrayList();
        arrayList.add(d);
        for (SessionInfo sessionInfo : list) {
            if (!TextUtils.isEmpty(sessionInfo.getHostUrl())) {
                C26014a.C26015a aVar2 = new C26014a.C26015a();
                aVar2.mo92517c(sessionInfo.getHostUrl()).mo92518d("/").mo92514b().mo92512a(253402300799999L).mo92513a(sessionInfo.getSessionName()).mo92515b(sessionInfo.getSession());
                PassportLog passportLog2 = f164314a;
                passportLog2.mo171465b("HttpCookieUtil", "save cross boundary cookie domain = " + sessionInfo.getHostUrl() + " name = " + sessionInfo.getSessionName());
                arrayList.add(aVar2.mo92519d());
            }
        }
        larkHttpClient.mo92416a(format, arrayList);
    }
}
