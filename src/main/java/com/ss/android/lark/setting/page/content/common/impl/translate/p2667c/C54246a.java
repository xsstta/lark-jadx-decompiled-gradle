package com.ss.android.lark.setting.page.content.common.impl.translate.p2667c;

import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dependency.ISettingDependency;
import java.util.Map;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.c.a */
public class C54246a {
    /* renamed from: a */
    public static String m210655a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        ISettingDependency.ILanguageDependency d = C54115c.m210080a().mo178289d();
        if (d.mo178344c()) {
            return map.get("zh_cn");
        }
        if (d.mo178345d()) {
            return map.get("ja_jp");
        }
        return map.get("en_us");
    }
}
