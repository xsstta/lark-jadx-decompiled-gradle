package com.ss.android.lark.platform.browser;

import com.ss.android.lark.browser.impl.translate.entity.C29953a;
import com.ss.android.lark.browser.impl.translate.entity.TranslateLanguage;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableLanguageInfo;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableTranslateSettingConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.platform.browser.a */
public class C51789a {
    /* renamed from: a */
    public static TranslateLanguage m200783a(ParcelableLanguageInfo parcelableLanguageInfo) {
        return new TranslateLanguage(parcelableLanguageInfo.mo185704a(), parcelableLanguageInfo.mo185706b());
    }

    /* renamed from: a */
    public static ParcelableLanguageInfo m200785a(TranslateLanguage translateLanguage) {
        return new ParcelableLanguageInfo(translateLanguage.getCode(), translateLanguage.getName());
    }

    /* renamed from: a */
    public static C29953a m200784a(ParcelableTranslateSettingConfig parcelableTranslateSettingConfig) {
        C29953a aVar = new C29953a();
        aVar.mo107866a(m200783a(parcelableTranslateSettingConfig.mo185715a()));
        aVar.mo107870b(m200783a(parcelableTranslateSettingConfig.mo185719b()));
        aVar.mo107871b(parcelableTranslateSettingConfig.mo185726e());
        aVar.mo107873c(parcelableTranslateSettingConfig.mo185727f());
        aVar.mo107868a(parcelableTranslateSettingConfig.mo185724d());
        aVar.mo107867a(parcelableTranslateSettingConfig.mo185722c());
        return aVar;
    }

    /* renamed from: a */
    public static List<TranslateLanguage> m200786a(List<ParcelableLanguageInfo> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (ParcelableLanguageInfo parcelableLanguageInfo : list) {
            arrayList.add(m200783a(parcelableLanguageInfo));
        }
        return arrayList;
    }
}
