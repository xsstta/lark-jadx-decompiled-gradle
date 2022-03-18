package com.ss.android.lark.openplatform.webapp.tab;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.openplatform.OpenPlatformModule;
import java.util.Locale;

/* renamed from: com.ss.android.lark.openplatform.webapp.tab.a */
public class C48880a {
    /* renamed from: a */
    public static String m192567a(Context context, TabAppInfo tabAppInfo) {
        if (tabAppInfo == null) {
            return context.getString(R.string.Lark_Legacy_WebApp);
        }
        Locale languageSetting = OpenPlatformModule.m192198d().getLanguageSetting();
        String str = "";
        if (!(languageSetting == null || tabAppInfo.getName() == null)) {
            String lowerCase = languageSetting.getLanguage().toLowerCase();
            lowerCase.hashCode();
            char c = 65535;
            switch (lowerCase.hashCode()) {
                case 3241:
                    if (lowerCase.equals("en")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3383:
                    if (lowerCase.equals("ja")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3886:
                    if (lowerCase.equals("zh")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str = tabAppInfo.getName().getUs();
                    break;
                case 1:
                    str = tabAppInfo.getName().getJp();
                    break;
                case 2:
                    str = tabAppInfo.getName().getCn();
                    break;
            }
        }
        if (TextUtils.isEmpty(str) && tabAppInfo.getName() != null) {
            str = tabAppInfo.getName().getUs();
        }
        if (TextUtils.isEmpty(str) && tabAppInfo.getName() != null) {
            str = tabAppInfo.getName().getCn();
        }
        if (TextUtils.isEmpty(str)) {
            return context.getString(R.string.Lark_Legacy_WebApp);
        }
        return str;
    }
}
