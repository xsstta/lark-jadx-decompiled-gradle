package com.ss.android.lark.passport.infra.util;

import android.content.Context;
import com.samskivert.mustache.C27035d;
import com.ss.android.lark.passport.infra.log.PassportLog;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.passport.infra.util.af */
public class C49153af {
    /* renamed from: a */
    public static String m193827a(String str, String str2, String str3, PassportLog passportLog) {
        if (!(str2 == null || str3 == null)) {
            HashMap hashMap = new HashMap(1);
            hashMap.put(str2, str3);
            try {
                return C27035d.m98270a().mo96184a(false).mo96186a(str).mo96212a(hashMap);
            } catch (Exception e) {
                passportLog.mo171462a("UIHelper", "mustacheFormat3", e);
            }
        }
        return str;
    }

    /* renamed from: a */
    public static String m193826a(Context context, String str, String str2, String str3, PassportLog passportLog) {
        if (!(str2 == null || str3 == null)) {
            HashMap hashMap = new HashMap(1);
            hashMap.put(str2, str3);
            try {
                return C27035d.m98270a().mo96184a(false).mo96186a(str).mo96212a(hashMap);
            } catch (Exception e) {
                passportLog.mo171462a("UIHelper", "mustacheFormat1", e);
            }
        }
        return str;
    }
}
