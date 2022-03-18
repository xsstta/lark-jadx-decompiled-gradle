package com.ss.ugc.effectplatform.util;

import bytekn.foundation.io.file.FileManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J0\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J:\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0014\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0017\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u0018"}, d2 = {"Lcom/ss/ugc/effectplatform/util/EffectCacheKeyGenerator;", "", "()V", "generateCategoryCachePattern", "", "panel", "generateCategoryEffectKey", "category", "count", "", "cursor", "sortingPosition", "generateCategoryVersionKey", "generateCategoryVersionPattern", "generateHotStickerKey", "generateInfoStickerPanelKey", "channel", "generatePanelInfoKey", "withCategoryEffect", "", "generatePanelInfoVersionKey", "generatePanelInfoVersionPattern", "generatePanelKey", "generatePanelPattern", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.util.g */
public final class EffectCacheKeyGenerator {

    /* renamed from: a */
    public static final EffectCacheKeyGenerator f165106a = new EffectCacheKeyGenerator();

    private EffectCacheKeyGenerator() {
    }

    /* renamed from: a */
    public final String mo228301a(String str) {
        return str + FileManager.f5817a.mo8712a() + "effect_version";
    }

    /* renamed from: b */
    public final String mo228305b(String str, String str2) {
        return "effectchannelinfosticker" + str2 + str;
    }

    /* renamed from: c */
    public final String mo228306c(String str, String str2) {
        return str + FileManager.f5817a.mo8712a() + "category_version" + str2;
    }

    /* renamed from: a */
    public final String mo228302a(String str, String str2) {
        return "effectchannel" + str2 + str;
    }

    /* renamed from: a */
    public final String mo228303a(String str, String str2, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(str, "panel");
        return str + FileManager.f5817a.mo8712a() + "effectchannel" + str2 + i + "_" + i2 + "_" + i3;
    }

    /* renamed from: a */
    public final String mo228304a(String str, String str2, boolean z, String str3, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(str2, "panel");
        if (z) {
            str2 = str2 + str3 + i + i2;
        }
        return str2 + FileManager.f5817a.mo8712a() + "effectchannel" + str;
    }
}
