package com.ss.android.lark.util.share_preference;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.C36888e;
import com.ss.android.lark.p2909v.C57896c;
import com.ss.android.lark.p2909v.C57898e;
import com.ss.android.lark.secure.AesCbcWithIntegrityUtils;
import com.ss.android.lark.secure.C54052a;
import com.ss.android.lark.sp.AbstractC54924a;
import com.ss.android.lark.sp.AbstractSharedPreferences;
import com.ss.android.lark.sp.C54930c;
import com.ss.android.lark.utils.C57852m;
import java.security.GeneralSecurityException;

public class UserSP extends AbstractSharedPreferences {
    private static volatile UserSP instance = null;
    private static AbstractC57743a sUserIdGetter = new AbstractC57743a() {
        /* class com.ss.android.lark.util.share_preference.UserSP.C577421 */
    };
    private String mSpName;

    /* renamed from: com.ss.android.lark.util.share_preference.UserSP$a */
    public interface AbstractC57743a {
    }

    @Override // com.ss.android.lark.sp.AbstractSharedPreferences
    public String getSpName() {
        return this.mSpName;
    }

    private UserSP() {
        setBaseSharedPreferences(createBaseSharedPreference());
    }

    private AbstractC54924a createBaseSharedPreference() {
        return createBaseSharedPreference(getSpNameSuffix());
    }

    public static synchronized void resetInstance() {
        synchronized (UserSP.class) {
            instance = new UserSP();
        }
    }

    public static synchronized UserSP getInstance() {
        UserSP userSP;
        synchronized (UserSP.class) {
            if (instance == null) {
                instance = new UserSP();
            }
            userSP = instance;
        }
        return userSP;
    }

    public String getSpNameSuffix() {
        String userId = C36888e.m145600b().getUserId();
        if (TextUtils.isEmpty(userId)) {
            return "unlogin";
        }
        return userId;
    }

    public static void init(AbstractC57743a aVar) {
        sUserIdGetter = aVar;
    }

    private UserSP(String str) {
        setBaseSharedPreferences(createBaseSharedPreference(str));
    }

    public static synchronized UserSP getUserSPById(String str) {
        synchronized (UserSP.class) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return new UserSP(str);
        }
    }

    private AbstractC54924a createBaseSharedPreference(String str) {
        AesCbcWithIntegrityUtils.C54051b bVar;
        C57898e eVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Context a = C36888e.m145598a();
        C57896c cVar = new C57896c(a);
        String a2 = cVar.mo196235a(str);
        if (!C57852m.m224554a(a)) {
            try {
                bVar = C54052a.m209781a().mo185049b();
            } catch (GeneralSecurityException e) {
                e.printStackTrace();
                bVar = null;
            }
            eVar = new C57898e(a, bVar, null, a2);
        }
        return C54930c.m213002a(a, str, 4, eVar, cVar);
    }
}
