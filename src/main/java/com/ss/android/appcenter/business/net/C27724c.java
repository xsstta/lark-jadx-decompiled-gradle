package com.ss.android.appcenter.business.net;

import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.appcenter.business.dto.Env;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.monitor.p1269a.C27702b;
import com.ss.android.appcenter.business.p1265a.C27580h;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;

/* renamed from: com.ss.android.appcenter.business.net.c */
public class C27724c {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.business.net.c$a */
    public enum EnumC27726a {
        OPEN_APPCENTER3,
        OPEN_MOMENT,
        REPORT,
        OPEN_API_LOGIN,
        OPEN_APP_INTERFACE,
        OPEN,
        DOCS_DRIVE
    }

    /* renamed from: e */
    public static String m101386e() {
        return m101382a("https://", m101381a(EnumC27726a.OPEN), "/open-apis/chatbot/api/fetch_bot_conf_resource");
    }

    /* renamed from: f */
    public static String m101387f() {
        return m101382a("https://", m101381a(EnumC27726a.OPEN), "/open-apis/chatbot/api/GetWebhookBotInfo ");
    }

    /* renamed from: g */
    public static String m101388g() {
        return m101382a("https://", m101381a(EnumC27726a.OPEN), "/open-apis/chatbot/api/UpdateWebhookBotInfo");
    }

    /* renamed from: h */
    public static String m101389h() {
        return m101382a("https://", m101381a(EnumC27726a.OPEN), "/open-apis/chatbot/api/UpdateAppBotInfo");
    }

    /* renamed from: k */
    public static String m101392k() {
        return m101382a("https://", m101381a(EnumC27726a.REPORT), "/report/");
    }

    /* renamed from: r */
    public static String m101399r() {
        return m101382a("https://", m101381a(EnumC27726a.OPEN_APPCENTER3), "/lark/widget/api/GetWidgetContent");
    }

    /* renamed from: s */
    public static String m101400s() {
        return m101382a("https://", m101381a(EnumC27726a.OPEN_APPCENTER3), "/lark/workplace/api/SearchItemByTag");
    }

    /* renamed from: v */
    public static String m101403v() {
        return m101382a("https://", m101381a(EnumC27726a.OPEN_APPCENTER3), "/lark/workplace/api/AddCommonItem");
    }

    /* renamed from: w */
    public static String m101404w() {
        return m101382a("https://", m101381a(EnumC27726a.OPEN_APPCENTER3), "/lark/workplace/api/DeleteCommonItem");
    }

    /* renamed from: A */
    public static String m101376A() {
        String a = m101381a(EnumC27726a.OPEN_APPCENTER3);
        C28184h.m103250d("ackBizPopupsData", C27580h.m100666b(a, DomainSettings.Alias.OPEN_APPCENTER3.name()));
        return m101382a("https://", a, "/lark/workplace/api/operating/notification/ack ");
    }

    /* renamed from: B */
    public static String m101377B() {
        String a = m101381a(EnumC27726a.DOCS_DRIVE);
        C28184h.m103250d("getBizPopupsRes", C27580h.m100666b(a, DomainSettings.Alias.DOCS_DRIVE.name()));
        return m101382a("https://", a, "/space/api/box/stream/download/all/%1$s");
    }

    /* renamed from: C */
    public static String m101378C() {
        String a = m101381a(EnumC27726a.OPEN_APPCENTER3);
        C28184h.m103250d("GetOperationalConfig", C27580h.m100666b(a, DomainSettings.Alias.OPEN_APPCENTER3.name()));
        return m101382a("https://", a, "/lark/workplace/api/GetOperationalConfig");
    }

    /* renamed from: D */
    public static String m101379D() {
        String a = m101381a(EnumC27726a.OPEN_APPCENTER3);
        C28184h.m103250d("AsyncInstallApps", C27580h.m100666b(a, DomainSettings.Alias.OPEN_APPCENTER3.name()));
        return m101382a("https://", a, "/lark/workplace/api/AsyncInstallApps");
    }

    /* renamed from: a */
    public static String m101380a() {
        Env env = Env.getEnv();
        String a = m101381a(EnumC27726a.OPEN_APP_INTERFACE);
        if (env == Env.STAGING) {
            return m101382a("https://", a, "/oapi/app_interface/app/feedback/create");
        }
        return m101382a("https://", a, "/lark/app_interface/app/feedback/create");
    }

    /* renamed from: b */
    public static String m101383b() {
        Env env = Env.getEnv();
        String a = m101381a(EnumC27726a.OPEN_APP_INTERFACE);
        if (env == Env.STAGING) {
            return m101382a("https://", a, "/oapi/app_interface/app/notification_type/update");
        }
        return m101382a("https://", a, "/lark/app_interface/app/notification_type/update");
    }

    /* renamed from: c */
    public static String m101384c() {
        Env env = Env.getEnv();
        String a = m101381a(EnumC27726a.OPEN);
        if (env == Env.STAGING) {
            return m101382a("https://", a, "/open-apis/chatbot/api/SetBotAddConf");
        }
        return m101382a("https://", a, "/open-apis/chatbot/api/SetBotAddConf");
    }

    /* renamed from: d */
    public static String m101385d() {
        Env env = Env.getEnv();
        String a = m101381a(EnumC27726a.OPEN);
        if (env == Env.STAGING) {
            return m101382a("https://", a, "/open-apis/chatbot/api/DeleteBotResource");
        }
        return m101382a("https://", a, "/open-apis/chatbot/api/DeleteBotResource");
    }

    /* renamed from: i */
    public static String m101390i() {
        Env env = Env.getEnv();
        String a = m101381a(EnumC27726a.OPEN_APP_INTERFACE);
        if (env == Env.STAGING) {
            return m101382a("https://", a, "/oapi/app_interface/api/AddUserToScope");
        }
        return m101382a("https://", a, "/lark/app_interface/api/AddUserToScope");
    }

    /* renamed from: j */
    public static String m101391j() {
        Env env = Env.getEnv();
        String a = m101381a(EnumC27726a.OPEN_APP_INTERFACE);
        if (env == Env.STAGING) {
            return m101382a("https://", a, "/oapi/app_interface/app/info/get");
        }
        return m101382a("https://", a, "/lark/app_interface/app/info/get");
    }

    /* renamed from: l */
    public static String m101393l() {
        String a = m101381a(EnumC27726a.OPEN_APPCENTER3);
        C28184h.m103250d("GetTemplateWorkplaceHome", C27580h.m100666b(a, DomainSettings.Alias.OPEN_APPCENTER3.name()));
        return m101382a("https://", a, "/lark/workplace/api/GetTemplateWorkplaceHome");
    }

    /* renamed from: m */
    public static String m101394m() {
        String a = m101381a(EnumC27726a.OPEN_APPCENTER3);
        C28184h.m103250d("GetAvailableTemplates", C27580h.m100666b(a, DomainSettings.Alias.OPEN_APPCENTER3.name()));
        return m101382a("https://", a, "/lark/workplace/api/GetAvailableTemplates");
    }

    /* renamed from: n */
    public static String m101395n() {
        String a = m101381a(EnumC27726a.OPEN_APPCENTER3);
        C28184h.m103250d("GetWorkplaceHome", C27580h.m100666b(a, DomainSettings.Alias.OPEN_APPCENTER3.name()));
        return m101382a("https://", a, "/lark/workplace/api/GetWorkplaceHome");
    }

    /* renamed from: o */
    public static String m101396o() {
        String a = m101381a(EnumC27726a.OPEN_APPCENTER3);
        C28184h.m103250d("GetWorkplaceSetting", C27580h.m100666b(a, DomainSettings.Alias.OPEN_APPCENTER3.name()));
        return m101382a("https://", a, "/lark/workplace/api/GetWorkplaceFrontSetting");
    }

    /* renamed from: p */
    public static String m101397p() {
        String a = m101381a(EnumC27726a.OPEN_APPCENTER3);
        C28184h.m103250d("GetUserItems", C27580h.m100666b(a, DomainSettings.Alias.OPEN_APPCENTER3.name()));
        return m101382a("https://", a, "/lark/workplace/api/GetUserItems");
    }

    /* renamed from: q */
    public static String m101398q() {
        String a = m101381a(EnumC27726a.OPEN_APPCENTER3);
        C28184h.m103250d("UpdateCommonItem", C27580h.m100666b(a, DomainSettings.Alias.OPEN_APPCENTER3.name()));
        return m101382a("https://", a, "/lark/workplace/api/UpdateCommonItem");
    }

    /* renamed from: t */
    public static String m101401t() {
        String a = m101381a(EnumC27726a.OPEN_APPCENTER3);
        C28184h.m103250d("GetTagsAndRecent", C27580h.m100666b(a, DomainSettings.Alias.OPEN_APPCENTER3.name()));
        return m101382a("https://", a, "/lark/workplace/api/GetTagsAndRecentItems");
    }

    /* renamed from: u */
    public static String m101402u() {
        String a = m101381a(EnumC27726a.OPEN_APPCENTER3);
        C28184h.m103250d("GetAppBadgeSettings", C27580h.m100666b(a, DomainSettings.Alias.OPEN_APPCENTER3.name()));
        return m101382a("https://", a, "/lark/app_badge/api/PullAppBadgeSetting");
    }

    /* renamed from: x */
    public static String m101405x() {
        String a = m101381a(EnumC27726a.OPEN_APPCENTER3);
        C28184h.m103250d("GetWorkplaceSubTagItemInfo", C27580h.m100666b(a, DomainSettings.Alias.OPEN_APPCENTER3.name()));
        return m101382a("https://", a, "/lark/workplace/api/GetWorkplaceSubTagItemInfo");
    }

    /* renamed from: y */
    public static String m101406y() {
        String a = m101381a(EnumC27726a.OPEN_APPCENTER3);
        C28184h.m103250d("AfterClickItemProcess", C27580h.m100666b(a, DomainSettings.Alias.OPEN_APPCENTER3.name()));
        return m101382a("https://", a, "/lark/workplace/api/AfterClickItemProcess");
    }

    /* renamed from: z */
    public static String m101407z() {
        String a = m101381a(EnumC27726a.OPEN_APPCENTER3);
        C28184h.m103250d("getBizPopupsData", C27580h.m100666b(a, DomainSettings.Alias.OPEN_APPCENTER3.name()));
        return m101382a("https://", a, "/lark/workplace/api/operating/notifications");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.business.net.c$1 */
    public static /* synthetic */ class C277251 {

        /* renamed from: a */
        static final /* synthetic */ int[] f69292a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.appcenter.business.net.c$a[] r0 = com.ss.android.appcenter.business.net.C27724c.EnumC27726a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.appcenter.business.net.C27724c.C277251.f69292a = r0
                com.ss.android.appcenter.business.net.c$a r1 = com.ss.android.appcenter.business.net.C27724c.EnumC27726a.OPEN_APPCENTER3     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.appcenter.business.net.C27724c.C277251.f69292a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.appcenter.business.net.c$a r1 = com.ss.android.appcenter.business.net.C27724c.EnumC27726a.OPEN_MOMENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.appcenter.business.net.C27724c.C277251.f69292a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.appcenter.business.net.c$a r1 = com.ss.android.appcenter.business.net.C27724c.EnumC27726a.REPORT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.appcenter.business.net.C27724c.C277251.f69292a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.appcenter.business.net.c$a r1 = com.ss.android.appcenter.business.net.C27724c.EnumC27726a.OPEN_API_LOGIN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.appcenter.business.net.C27724c.C277251.f69292a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.appcenter.business.net.c$a r1 = com.ss.android.appcenter.business.net.C27724c.EnumC27726a.OPEN_APP_INTERFACE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.appcenter.business.net.C27724c.C277251.f69292a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.appcenter.business.net.c$a r1 = com.ss.android.appcenter.business.net.C27724c.EnumC27726a.OPEN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.ss.android.appcenter.business.net.C27724c.C277251.f69292a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.ss.android.appcenter.business.net.c$a r1 = com.ss.android.appcenter.business.net.C27724c.EnumC27726a.DOCS_DRIVE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.appcenter.business.net.C27724c.C277251.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static String m101381a(EnumC27726a aVar) {
        String str;
        switch (C277251.f69292a[aVar.ordinal()]) {
            case 1:
                str = C27548m.m100547m().mo98216a().mo98153a(DomainSettings.Alias.OPEN_APPCENTER3);
                break;
            case 2:
                str = C27548m.m100547m().mo98216a().mo98153a(DomainSettings.Alias.OPEN_MOMENT);
                break;
            case 3:
                str = C27548m.m100547m().mo98216a().mo98153a(DomainSettings.Alias.SUITE_REPORT);
                break;
            case 4:
                str = C27548m.m100547m().mo98216a().mo98153a(DomainSettings.Alias.OPEN_API_LOGIN);
                break;
            case 5:
                str = C27548m.m100547m().mo98216a().mo98153a(DomainSettings.Alias.OPEN_APP_INTERFACE);
                break;
            case 6:
                str = C27548m.m100547m().mo98216a().mo98153a(DomainSettings.Alias.OPEN);
                break;
            case 7:
                str = C27548m.m100547m().mo98216a().mo98153a(DomainSettings.Alias.DOCS_DRIVE);
                break;
            default:
                str = null;
                break;
        }
        C28184h.m103250d("AppCenter_Common", "path appcenter getDomain " + aVar + " result: " + str);
        if (str == null) {
            C27700a.m101232a("appcenter_get_rust_dynamic_host_error").setMonitorCode(C27702b.ao).addCategoryValue("domain", aVar).flush();
        }
        return str;
    }

    /* renamed from: a */
    private static String m101382a(String str, String str2, String str3) {
        return str + str2 + str3;
    }
}
