package com.ss.android.lark.contact.impl.setting.mvp;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.impl.setting.service.entity.C36070f;
import com.ss.android.lark.contact.impl.setting.service.entity.WayToFindMeSettingItem;
import com.ss.android.lark.contact.impl.setting.widget.C36075b;
import com.ss.android.lark.contact.impl.setting.widget.C36076c;
import com.ss.android.lark.ui.p2892a.C57582a;

/* renamed from: com.ss.android.lark.contact.impl.setting.mvp.d */
public class C36026d {
    /* renamed from: a */
    public static C36076c m141243a(Context context, C36070f fVar) {
        String str;
        String str2;
        C36076c cVar = new C36076c();
        if (fVar == null) {
            return cVar;
        }
        for (WayToFindMeSettingItem wayToFindMeSettingItem : fVar.mo132627a()) {
            if (wayToFindMeSettingItem.mo132608e()) {
                StringBuilder sb = new StringBuilder();
                if (wayToFindMeSettingItem.mo132604a() == WayToFindMeSettingItem.FindMeType.MOBILE) {
                    if (fVar.mo132628b()) {
                        str2 = C57582a.m223604a(context, (int) R.string.Lark_PrivacySettings_ContactMobileNumber);
                    } else {
                        str2 = C57582a.m223604a(context, (int) R.string.Lark_PrivacySettings_MobileNumber);
                    }
                    sb.append(str2);
                } else if (wayToFindMeSettingItem.mo132604a() == WayToFindMeSettingItem.FindMeType.EMAIL) {
                    if (fVar.mo132628b()) {
                        str = C57582a.m223604a(context, (int) R.string.Lark_PrivacySettings_ContactEmailAddress);
                    } else {
                        str = C57582a.m223604a(context, (int) R.string.Lark_PrivacySettings_EmailAddress);
                    }
                    sb.append(str);
                } else {
                    sb.append("");
                }
                cVar.mo132648a(new C36075b(wayToFindMeSettingItem.mo132606c(), sb.toString(), wayToFindMeSettingItem.mo132605b(), wayToFindMeSettingItem.mo132607d(), wayToFindMeSettingItem.mo132604a(), wayToFindMeSettingItem.mo132609f()));
            }
        }
        return cVar;
    }
}
