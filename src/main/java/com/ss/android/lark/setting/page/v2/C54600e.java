package com.ss.android.lark.setting.page.v2;

import com.ss.android.lark.setting.export.SystemSettingComponentType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.setting.page.v2.e */
public class C54600e {

    /* renamed from: a */
    static SystemSettingComponentType[] f134925a = {SystemSettingComponentType.DIVIDER, SystemSettingComponentType.ACCOUNT, SystemSettingComponentType.LANGUAGE, SystemSettingComponentType.DIVIDER, SystemSettingComponentType.NOTIFICATION, SystemSettingComponentType.PRIVACY, SystemSettingComponentType.CALENDAR, SystemSettingComponentType.MAIL, SystemSettingComponentType.VIDEO_CHAT, SystemSettingComponentType.TODO, SystemSettingComponentType.MOMENTS, SystemSettingComponentType.GENERAL, SystemSettingComponentType.DIVIDER, SystemSettingComponentType.INTERNAL, SystemSettingComponentType.ABOUT, SystemSettingComponentType.DIVIDER, SystemSettingComponentType.NEW_LOGOUT, SystemSettingComponentType.DIVIDER, SystemSettingComponentType.APP_VERSION};

    /* renamed from: a */
    static List<String> m211803a() {
        ArrayList arrayList = new ArrayList();
        for (SystemSettingComponentType systemSettingComponentType : f134925a) {
            arrayList.add(systemSettingComponentType.getValue());
        }
        return arrayList;
    }
}
