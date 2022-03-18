package com.ss.android.lark.mail.impl.p2171h.p2172a;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.utils.C43767j;

/* renamed from: com.ss.android.lark.mail.impl.h.a.j */
public class C42209j {
    /* renamed from: a */
    public static void m168610a(String str) {
        Log.m165389i("InteractiveErrorMonitor", "reportError: " + str);
        C41816b.m166115a().mo150114D().mo150182b("email_apm_user_interactive_error", C43767j.m173489a().mo155933a("event", str).mo155934a());
    }

    /* renamed from: a */
    public static void m168612a(String str, String str2) {
        Log.m165388i("InteractiveErrorMonitor 11 event:" + str);
        C41816b.m166115a().mo150114D().mo150182b("email_apm_user_interactive_error", C43767j.m173489a().mo155933a("event", str).mo155931a("error_code", 40001).mo155933a("tips_type", str2).mo155931a("user_cause", 0).mo155934a());
    }

    /* renamed from: a */
    public static void m168613a(String str, String str2, String str3) {
        Log.m165388i("InteractiveErrorMonitor 22 event:" + str);
        C41816b.m166115a().mo150114D().mo150182b("email_apm_user_interactive_error", C43767j.m173489a().mo155933a("event", str).mo155931a("error_code", 40001).mo155933a("tips_type", str2).mo155933a("scene", str3).mo155931a("user_cause", 0).mo155934a());
    }

    /* renamed from: a */
    public static void m168611a(String str, int i, String str2, String str3, String str4, int i2) {
        Log.m165388i("InteractiveErrorMonitor 33 event:" + str);
        C41816b.m166115a().mo150114D().mo150182b("email_apm_user_interactive_error", C43767j.m173489a().mo155933a("event", str).mo155931a("error_code", i).mo155933a("tips_type", str2).mo155933a("scene", str3).mo155933a("error_message", str4).mo155931a("user_cause", i2).mo155934a());
    }
}
