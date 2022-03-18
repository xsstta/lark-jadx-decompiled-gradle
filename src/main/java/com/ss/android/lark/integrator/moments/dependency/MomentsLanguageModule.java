package com.ss.android.lark.integrator.moments.dependency;

import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.moments.dependency.idependency.ILanguageModuleDependency;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/integrator/moments/dependency/MomentsLanguageModule;", "Lcom/ss/android/lark/moments/dependency/idependency/ILanguageModuleDependency;", "()V", "getLocaleLanguage", "", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.moments.a.k */
public final class MomentsLanguageModule implements ILanguageModuleDependency {
    @Override // com.ss.android.lark.moments.dependency.idependency.ILanguageModuleDependency
    /* renamed from: a */
    public String mo144716a() {
        Object api = ApiUtils.getApi(ICoreApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(ICoreApi::class.java)");
        Locale languageSetting = ((ICoreApi) api).getLanguageSetting();
        Intrinsics.checkExpressionValueIsNotNull(languageSetting, "ApiUtils.getApi(ICoreApi…ass.java).languageSetting");
        String language = languageSetting.getLanguage();
        Intrinsics.checkExpressionValueIsNotNull(language, "ApiUtils.getApi(ICoreApi….languageSetting.language");
        return language;
    }
}
