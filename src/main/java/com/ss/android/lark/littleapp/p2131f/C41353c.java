package com.ss.android.lark.littleapp.p2131f;

import android.text.TextUtils;
import com.ss.android.lark.littleapp.C41354g;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import java.util.Locale;

/* renamed from: com.ss.android.lark.littleapp.f.c */
public class C41353c {
    /* renamed from: a */
    public static String m163937a(TabAppInfo tabAppInfo) {
        return m163938a(tabAppInfo, "");
    }

    /* renamed from: a */
    public static String m163938a(TabAppInfo tabAppInfo, String str) {
        if (tabAppInfo == null) {
            return str;
        }
        Locale languageSetting = C41354g.m163939a().getLanguageSetting();
        String str2 = "";
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
                    str2 = tabAppInfo.getName().getUs();
                    break;
                case 1:
                    str2 = tabAppInfo.getName().getJp();
                    break;
                case 2:
                    str2 = tabAppInfo.getName().getCn();
                    break;
            }
        }
        if (TextUtils.isEmpty(str2) && tabAppInfo.getName() != null) {
            str2 = tabAppInfo.getName().getUs();
        }
        if (TextUtils.isEmpty(str2) && tabAppInfo.getName() != null) {
            str2 = tabAppInfo.getName().getCn();
        }
        return TextUtils.isEmpty(str2) ? str : str2;
    }
}
