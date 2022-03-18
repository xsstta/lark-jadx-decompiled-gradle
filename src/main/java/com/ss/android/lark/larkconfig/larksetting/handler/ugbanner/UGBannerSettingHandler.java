package com.ss.android.lark.larkconfig.larksetting.handler.ugbanner;

import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/larkconfig/larksetting/handler/ugbanner/UGBannerSettingHandler;", "Lcom/ss/android/lark/larkconfig/export/handler/AbstractBaseSettingHandler$UserSPCachedSettingHandler;", "()V", "SETTINGS_KEY", "", "SP_KEY", "ugBannerConfig", "Lcom/ss/android/lark/larkconfig/larksetting/handler/ugbanner/UGBannerConfig;", "getSPKey", "getSettingKey", "getTag", "getUGBannerConfig", "larksetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.ugbanner.a */
public final class UGBannerSettingHandler extends AbstractBaseSettingHandler.UserSPCachedSettingHandler {

    /* renamed from: a */
    public static final UGBannerSettingHandler f104990a;

    /* renamed from: c */
    private static UGBannerConfig f104991c;

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "ug_banner_config";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: b */
    public String mo107773b() {
        return "sp_ug_banner_config";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "UGBannerSettingHandler";
    }

    private UGBannerSettingHandler() {
    }

    /* renamed from: d */
    public final UGBannerConfig mo136183d() {
        return f104991c;
    }

    static {
        UGBannerSettingHandler aVar = new UGBannerSettingHandler();
        f104990a = aVar;
        aVar.mo148402a(aVar.mo148412j().mo148421a(C412141.INSTANCE).mo148428e(C412152.INSTANCE));
    }
}
